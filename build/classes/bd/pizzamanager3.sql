PGDMP     3                     y           pizzamanager    10.16    10.16 t    ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            ?           1262    25217    pizzamanager    DATABASE     ?   CREATE DATABASE pizzamanager WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Mexico.1252' LC_CTYPE = 'Spanish_Mexico.1252';
    DROP DATABASE pizzamanager;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            ?           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            ?           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            ?            1259    25449    gastos    TABLE     ?   CREATE TABLE public.gastos (
    gas_id integer NOT NULL,
    gas_desc character varying,
    gas_importe double precision,
    gas_hora time without time zone,
    gas_fecha date
);
    DROP TABLE public.gastos;
       public         postgres    false    3            ?            1259    25447    Gastos_gas_id_seq    SEQUENCE     ?   ALTER TABLE public.gastos ALTER COLUMN gas_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."Gastos_gas_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    226    3            ?            1259    25437    apertura    TABLE     ?   CREATE TABLE public.apertura (
    "APE_ID" integer NOT NULL,
    "USU_ID" integer,
    "MONTO" double precision,
    ape_hora time without time zone
);
    DROP TABLE public.apertura;
       public         postgres    false    3            ?            1259    25435    apertuta_APE_ID_seq    SEQUENCE     ?   ALTER TABLE public.apertura ALTER COLUMN "APE_ID" ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."apertuta_APE_ID_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    3    224            ?            1259    25220    caja    TABLE     ?   CREATE TABLE public.caja (
    caj_id integer NOT NULL,
    caj_actual money,
    caj_abono money,
    caj_cargo money,
    caj_fecha date
);
    DROP TABLE public.caja;
       public         postgres    false    3            ?            1259    25218    caja_caj_id_seq    SEQUENCE     ?   ALTER TABLE public.caja ALTER COLUMN caj_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.caja_caj_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    197    3            ?            1259    25225 	   categoria    TABLE     d   CREATE TABLE public.categoria (
    cat_id "char" NOT NULL,
    cat_nombre character varying(30)
);
    DROP TABLE public.categoria;
       public         postgres    false    3            ?            1259    25232    clientes    TABLE     ?   CREATE TABLE public.clientes (
    cli_id integer NOT NULL,
    cli_nombre character varying(40),
    cli_apellido character varying(40),
    cli_celular character varying(10),
    cli_direccion text,
    cli_fav bit(1)
);
    DROP TABLE public.clientes;
       public         postgres    false    3            ?            1259    25230    clientes_cli_id_seq    SEQUENCE     ?   ALTER TABLE public.clientes ALTER COLUMN cli_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.clientes_cli_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    200    3            ?            1259    25457    corte    TABLE     ?   CREATE TABLE public.corte (
    tipo character varying(50),
    "desc" character varying(100),
    importe integer,
    hora time without time zone
);
    DROP TABLE public.corte;
       public         postgres    false    3            ?            1259    25478    cortesDeCaja    TABLE     ?   CREATE TABLE public."cortesDeCaja" (
    cc_id integer NOT NULL,
    usu_id integer,
    cc_inicial integer,
    cc_contado integer,
    cc_calculado integer,
    cc_diferencia integer,
    cc_hora time without time zone,
    cc_fecha date
);
 "   DROP TABLE public."cortesDeCaja";
       public         postgres    false    3            ?            1259    25476    cortesDeCaja_cc_id_seq    SEQUENCE     ?   ALTER TABLE public."cortesDeCaja" ALTER COLUMN cc_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."cortesDeCaja_cc_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    229    3            ?            1259    25242 
   descuentos    TABLE     ?   CREATE TABLE public.descuentos (
    des_id integer NOT NULL,
    des_descuentos character varying(100),
    des_cantidad smallint
);
    DROP TABLE public.descuentos;
       public         postgres    false    3            ?            1259    25240    descuentos_des_id_seq    SEQUENCE     ?   ALTER TABLE public.descuentos ALTER COLUMN des_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.descuentos_des_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    3    202            ?            1259    25247    detalleventa    TABLE     z   CREATE TABLE public.detalleventa (
    pro_id integer NOT NULL,
    ven_id integer NOT NULL,
    det_cantidad smallint
);
     DROP TABLE public.detalleventa;
       public         postgres    false    3            ?            1259    25254    entradasalida    TABLE     ?   CREATE TABLE public.entradasalida (
    id_registro integer NOT NULL,
    usu_id integer,
    es_tipo character(1),
    es_fecha date,
    es_hora time with time zone
);
 !   DROP TABLE public.entradasalida;
       public         postgres    false    3            ?            1259    25252    entradasalida_id_registro_seq    SEQUENCE     ?   ALTER TABLE public.entradasalida ALTER COLUMN id_registro ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.entradasalida_id_registro_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    205    3            ?            1259    25261    historialventas    TABLE     ?   CREATE TABLE public.historialventas (
    his_id integer NOT NULL,
    his_fecha date,
    ven_id integer,
    his_importe double precision
);
 #   DROP TABLE public.historialventas;
       public         postgres    false    3            ?            1259    25259    historialventas_his_id_seq    SEQUENCE     ?   ALTER TABLE public.historialventas ALTER COLUMN his_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.historialventas_his_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    207    3            ?            1259    25494    horasTrabajadas    TABLE     ?   CREATE TABLE public."horasTrabajadas" (
    id_ht integer NOT NULL,
    usu_id integer,
    ht_fecha date,
    ht_cantidad smallint
);
 %   DROP TABLE public."horasTrabajadas";
       public         postgres    false    3            ?            1259    25492    horasTrabajadas_id_ht_seq    SEQUENCE     ?   ALTER TABLE public."horasTrabajadas" ALTER COLUMN id_ht ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."horasTrabajadas_id_ht_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    231    3            ?            1259    25266    ingredientes    TABLE     ?   CREATE TABLE public.ingredientes (
    ing_id integer NOT NULL,
    ing_nombre character varying(30),
    ing_unit character varying(5)
);
     DROP TABLE public.ingredientes;
       public         postgres    false    3            ?            1259    25410    ingredientes_ing_id_seq    SEQUENCE     ?   ALTER TABLE public.ingredientes ALTER COLUMN ing_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.ingredientes_ing_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    3    208            ?            1259    25276 
   inventario    TABLE     ?   CREATE TABLE public.inventario (
    inv_id integer NOT NULL,
    inv_nombre character varying(40),
    inv_cantidad smallint,
    inv_um character varying
);
    DROP TABLE public.inventario;
       public         postgres    false    3            ?            1259    25274    inventario_inv_id_seq    SEQUENCE     ?   ALTER TABLE public.inventario ALTER COLUMN inv_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.inventario_inv_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    3    210            ?            1259    25283    pedido    TABLE     ?   CREATE TABLE public.pedido (
    ped_id integer NOT NULL,
    cli_id integer,
    ped_importe money,
    ped_estado "char",
    ven_id integer,
    usu_id integer
);
    DROP TABLE public.pedido;
       public         postgres    false    3            ?            1259    25281    pedido_ped_id_seq    SEQUENCE     ?   ALTER TABLE public.pedido ALTER COLUMN ped_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.pedido_ped_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    212    3            ?            1259    25290 	   productos    TABLE     ?   CREATE TABLE public.productos (
    pro_id integer NOT NULL,
    pro_nombre character varying(30),
    pro_descripcion character varying(100),
    pro_precio numeric,
    cat_id "char"
);
    DROP TABLE public.productos;
       public         postgres    false    3            ?            1259    25288    productos_pro_id_seq    SEQUENCE     ?   ALTER TABLE public.productos ALTER COLUMN pro_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.productos_pro_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    214    3            ?            1259    25300    promociones    TABLE     ?   CREATE TABLE public.promociones (
    prom_id integer NOT NULL,
    prom_promocion character varying(100),
    prom_cantidad smallint
);
    DROP TABLE public.promociones;
       public         postgres    false    3            ?            1259    25298    promociones_prom_id_seq    SEQUENCE     ?   ALTER TABLE public.promociones ALTER COLUMN prom_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.promociones_prom_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    216    3            ?            1259    25305    recetas    TABLE     u   CREATE TABLE public.recetas (
    pro_id integer NOT NULL,
    ing_id integer NOT NULL,
    rec_cantidad smallint
);
    DROP TABLE public.recetas;
       public         postgres    false    3            ?            1259    25312    usuarios    TABLE     ?   CREATE TABLE public.usuarios (
    usu_id integer NOT NULL,
    usu_nombre character varying(20),
    usu_apellido character varying(30),
    usu_pass character varying(100),
    usu_rol "char"
);
    DROP TABLE public.usuarios;
       public         postgres    false    3            ?            1259    25310    usuarios_usu_id_seq    SEQUENCE     ?   ALTER TABLE public.usuarios ALTER COLUMN usu_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.usuarios_usu_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    3    219            ?            1259    25319    ventas    TABLE     V  CREATE TABLE public.ventas (
    ven_id integer NOT NULL,
    ven_importe money,
    ven_descripcion character varying(100),
    ven_num_produc smallint,
    prom_id integer,
    desc_id integer,
    usu_id integer,
    cli_id integer,
    ven_cash_in money,
    ven_cash_out money,
    ven_hora time without time zone,
    ven_fecha date
);
    DROP TABLE public.ventas;
       public         postgres    false    3            ?            1259    25317    ventas_ven_id_seq    SEQUENCE     ?   ALTER TABLE public.ventas ALTER COLUMN ven_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.ventas_ven_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    3    221            ?          0    25437    apertura 
   TABLE DATA               I   COPY public.apertura ("APE_ID", "USU_ID", "MONTO", ape_hora) FROM stdin;
    public       postgres    false    224   Ȇ       ?          0    25220    caja 
   TABLE DATA               S   COPY public.caja (caj_id, caj_actual, caj_abono, caj_cargo, caj_fecha) FROM stdin;
    public       postgres    false    197   ??       ?          0    25225 	   categoria 
   TABLE DATA               7   COPY public.categoria (cat_id, cat_nombre) FROM stdin;
    public       postgres    false    198   ?       ?          0    25232    clientes 
   TABLE DATA               i   COPY public.clientes (cli_id, cli_nombre, cli_apellido, cli_celular, cli_direccion, cli_fav) FROM stdin;
    public       postgres    false    200   D?       ?          0    25457    corte 
   TABLE DATA               <   COPY public.corte (tipo, "desc", importe, hora) FROM stdin;
    public       postgres    false    227   ??       ?          0    25478    cortesDeCaja 
   TABLE DATA                  COPY public."cortesDeCaja" (cc_id, usu_id, cc_inicial, cc_contado, cc_calculado, cc_diferencia, cc_hora, cc_fecha) FROM stdin;
    public       postgres    false    229   )?       ?          0    25242 
   descuentos 
   TABLE DATA               J   COPY public.descuentos (des_id, des_descuentos, des_cantidad) FROM stdin;
    public       postgres    false    202   ??       ?          0    25247    detalleventa 
   TABLE DATA               D   COPY public.detalleventa (pro_id, ven_id, det_cantidad) FROM stdin;
    public       postgres    false    203   ??       ?          0    25254    entradasalida 
   TABLE DATA               X   COPY public.entradasalida (id_registro, usu_id, es_tipo, es_fecha, es_hora) FROM stdin;
    public       postgres    false    205   ̈       ?          0    25449    gastos 
   TABLE DATA               T   COPY public.gastos (gas_id, gas_desc, gas_importe, gas_hora, gas_fecha) FROM stdin;
    public       postgres    false    226   0?       ?          0    25261    historialventas 
   TABLE DATA               Q   COPY public.historialventas (his_id, his_fecha, ven_id, his_importe) FROM stdin;
    public       postgres    false    207   ??       ?          0    25494    horasTrabajadas 
   TABLE DATA               Q   COPY public."horasTrabajadas" (id_ht, usu_id, ht_fecha, ht_cantidad) FROM stdin;
    public       postgres    false    231   ??       ?          0    25266    ingredientes 
   TABLE DATA               D   COPY public.ingredientes (ing_id, ing_nombre, ing_unit) FROM stdin;
    public       postgres    false    208   $?       ?          0    25276 
   inventario 
   TABLE DATA               N   COPY public.inventario (inv_id, inv_nombre, inv_cantidad, inv_um) FROM stdin;
    public       postgres    false    210   M?       ?          0    25283    pedido 
   TABLE DATA               Y   COPY public.pedido (ped_id, cli_id, ped_importe, ped_estado, ven_id, usu_id) FROM stdin;
    public       postgres    false    212   ??       ?          0    25290 	   productos 
   TABLE DATA               \   COPY public.productos (pro_id, pro_nombre, pro_descripcion, pro_precio, cat_id) FROM stdin;
    public       postgres    false    214   ??       ?          0    25300    promociones 
   TABLE DATA               M   COPY public.promociones (prom_id, prom_promocion, prom_cantidad) FROM stdin;
    public       postgres    false    216   ??       ?          0    25305    recetas 
   TABLE DATA               ?   COPY public.recetas (pro_id, ing_id, rec_cantidad) FROM stdin;
    public       postgres    false    217   ы       ?          0    25312    usuarios 
   TABLE DATA               W   COPY public.usuarios (usu_id, usu_nombre, usu_apellido, usu_pass, usu_rol) FROM stdin;
    public       postgres    false    219   ??       ?          0    25319    ventas 
   TABLE DATA               ?   COPY public.ventas (ven_id, ven_importe, ven_descripcion, ven_num_produc, prom_id, desc_id, usu_id, cli_id, ven_cash_in, ven_cash_out, ven_hora, ven_fecha) FROM stdin;
    public       postgres    false    221   a?       ?           0    0    Gastos_gas_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public."Gastos_gas_id_seq"', 3, true);
            public       postgres    false    225            ?           0    0    apertuta_APE_ID_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public."apertuta_APE_ID_seq"', 26, true);
            public       postgres    false    223            ?           0    0    caja_caj_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.caja_caj_id_seq', 1, false);
            public       postgres    false    196            ?           0    0    clientes_cli_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.clientes_cli_id_seq', 3, true);
            public       postgres    false    199            ?           0    0    cortesDeCaja_cc_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public."cortesDeCaja_cc_id_seq"', 4, true);
            public       postgres    false    228            ?           0    0    descuentos_des_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.descuentos_des_id_seq', 1, true);
            public       postgres    false    201            ?           0    0    entradasalida_id_registro_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.entradasalida_id_registro_seq', 15, true);
            public       postgres    false    204            ?           0    0    historialventas_his_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.historialventas_his_id_seq', 1, false);
            public       postgres    false    206            ?           0    0    horasTrabajadas_id_ht_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public."horasTrabajadas_id_ht_seq"', 15, true);
            public       postgres    false    230            ?           0    0    ingredientes_ing_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.ingredientes_ing_id_seq', 9, true);
            public       postgres    false    222            ?           0    0    inventario_inv_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.inventario_inv_id_seq', 3, true);
            public       postgres    false    209            ?           0    0    pedido_ped_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.pedido_ped_id_seq', 1, false);
            public       postgres    false    211            ?           0    0    productos_pro_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.productos_pro_id_seq', 24, true);
            public       postgres    false    213            ?           0    0    promociones_prom_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.promociones_prom_id_seq', 1, true);
            public       postgres    false    215            ?           0    0    usuarios_usu_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.usuarios_usu_id_seq', 7, true);
            public       postgres    false    218            ?           0    0    ventas_ven_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.ventas_ven_id_seq', 13, true);
            public       postgres    false    220            ?
           2606    25456    gastos Gastos_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.gastos
    ADD CONSTRAINT "Gastos_pkey" PRIMARY KEY (gas_id);
 >   ALTER TABLE ONLY public.gastos DROP CONSTRAINT "Gastos_pkey";
       public         postgres    false    226            ?
           2606    25441    apertura apertuta_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.apertura
    ADD CONSTRAINT apertuta_pkey PRIMARY KEY ("APE_ID");
 @   ALTER TABLE ONLY public.apertura DROP CONSTRAINT apertuta_pkey;
       public         postgres    false    224            ?
           2606    25224    caja caja_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.caja
    ADD CONSTRAINT caja_pkey PRIMARY KEY (caj_id);
 8   ALTER TABLE ONLY public.caja DROP CONSTRAINT caja_pkey;
       public         postgres    false    197            ?
           2606    25229    categoria categoria_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.categoria
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (cat_id);
 B   ALTER TABLE ONLY public.categoria DROP CONSTRAINT categoria_pkey;
       public         postgres    false    198            ?
           2606    25239    clientes clientes_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_pkey PRIMARY KEY (cli_id);
 @   ALTER TABLE ONLY public.clientes DROP CONSTRAINT clientes_pkey;
       public         postgres    false    200            ?
           2606    25482    cortesDeCaja cortesDeCaja_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public."cortesDeCaja"
    ADD CONSTRAINT "cortesDeCaja_pkey" PRIMARY KEY (cc_id);
 L   ALTER TABLE ONLY public."cortesDeCaja" DROP CONSTRAINT "cortesDeCaja_pkey";
       public         postgres    false    229            ?
           2606    25246    descuentos descuentos_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.descuentos
    ADD CONSTRAINT descuentos_pkey PRIMARY KEY (des_id);
 D   ALTER TABLE ONLY public.descuentos DROP CONSTRAINT descuentos_pkey;
       public         postgres    false    202            ?
           2606    25251    detalleventa detalleventa_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.detalleventa
    ADD CONSTRAINT detalleventa_pkey PRIMARY KEY (pro_id, ven_id);
 H   ALTER TABLE ONLY public.detalleventa DROP CONSTRAINT detalleventa_pkey;
       public         postgres    false    203    203            ?
           2606    25258     entradasalida entradasalida_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public.entradasalida
    ADD CONSTRAINT entradasalida_pkey PRIMARY KEY (id_registro);
 J   ALTER TABLE ONLY public.entradasalida DROP CONSTRAINT entradasalida_pkey;
       public         postgres    false    205            ?
           2606    25265 $   historialventas historialventas_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.historialventas
    ADD CONSTRAINT historialventas_pkey PRIMARY KEY (his_id);
 N   ALTER TABLE ONLY public.historialventas DROP CONSTRAINT historialventas_pkey;
       public         postgres    false    207                       2606    25498 $   horasTrabajadas horasTrabajadas_pkey 
   CONSTRAINT     i   ALTER TABLE ONLY public."horasTrabajadas"
    ADD CONSTRAINT "horasTrabajadas_pkey" PRIMARY KEY (id_ht);
 R   ALTER TABLE ONLY public."horasTrabajadas" DROP CONSTRAINT "horasTrabajadas_pkey";
       public         postgres    false    231            ?
           2606    25400    ingredientes ingredientes_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.ingredientes
    ADD CONSTRAINT ingredientes_pkey PRIMARY KEY (ing_id);
 H   ALTER TABLE ONLY public.ingredientes DROP CONSTRAINT ingredientes_pkey;
       public         postgres    false    208            ?
           2606    25280    inventario inventario_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.inventario
    ADD CONSTRAINT inventario_pkey PRIMARY KEY (inv_id);
 D   ALTER TABLE ONLY public.inventario DROP CONSTRAINT inventario_pkey;
       public         postgres    false    210            ?
           2606    25287    pedido pedido_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_pkey PRIMARY KEY (ped_id);
 <   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_pkey;
       public         postgres    false    212            ?
           2606    25297    productos productos_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.productos
    ADD CONSTRAINT productos_pkey PRIMARY KEY (pro_id);
 B   ALTER TABLE ONLY public.productos DROP CONSTRAINT productos_pkey;
       public         postgres    false    214            ?
           2606    25304    promociones promociones_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.promociones
    ADD CONSTRAINT promociones_pkey PRIMARY KEY (prom_id);
 F   ALTER TABLE ONLY public.promociones DROP CONSTRAINT promociones_pkey;
       public         postgres    false    216            ?
           2606    25309    recetas recetas_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.recetas
    ADD CONSTRAINT recetas_pkey PRIMARY KEY (pro_id, ing_id);
 >   ALTER TABLE ONLY public.recetas DROP CONSTRAINT recetas_pkey;
       public         postgres    false    217    217            ?
           2606    25316    usuarios usuarios_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (usu_id);
 @   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuarios_pkey;
       public         postgres    false    219            ?
           2606    25323    ventas ventas_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.ventas
    ADD CONSTRAINT ventas_pkey PRIMARY KEY (ven_id);
 <   ALTER TABLE ONLY public.ventas DROP CONSTRAINT ventas_pkey;
       public         postgres    false    221            ?           2618    25475    ventas ventasAlHistorial    RULE     N   CREATE RULE "ventasAlHistorial" AS
    ON INSERT TO public.ventas DO NOTHING;
 0   DROP RULE "ventasAlHistorial" ON public.ventas;
       public       postgres    false    221    221    221                       2606    25442    apertura FK_APERTURA_CLINETES    FK CONSTRAINT     ?   ALTER TABLE ONLY public.apertura
    ADD CONSTRAINT "FK_APERTURA_CLINETES" FOREIGN KEY ("USU_ID") REFERENCES public.usuarios(usu_id);
 I   ALTER TABLE ONLY public.apertura DROP CONSTRAINT "FK_APERTURA_CLINETES";
       public       postgres    false    2807    224    219                       2606    25324 %   detalleventa detalleventa_pro_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.detalleventa
    ADD CONSTRAINT detalleventa_pro_id_fkey FOREIGN KEY (pro_id) REFERENCES public.productos(pro_id) NOT VALID;
 O   ALTER TABLE ONLY public.detalleventa DROP CONSTRAINT detalleventa_pro_id_fkey;
       public       postgres    false    203    214    2801                       2606    25329 %   detalleventa detalleventa_ven_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.detalleventa
    ADD CONSTRAINT detalleventa_ven_id_fkey FOREIGN KEY (ven_id) REFERENCES public.ventas(ven_id) NOT VALID;
 O   ALTER TABLE ONLY public.detalleventa DROP CONSTRAINT detalleventa_ven_id_fkey;
       public       postgres    false    203    221    2809                       2606    25334 '   entradasalida entradasalida_usu_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.entradasalida
    ADD CONSTRAINT entradasalida_usu_id_fkey FOREIGN KEY (usu_id) REFERENCES public.usuarios(usu_id) NOT VALID;
 Q   ALTER TABLE ONLY public.entradasalida DROP CONSTRAINT entradasalida_usu_id_fkey;
       public       postgres    false    205    219    2807                       2606    25499     horasTrabajadas fk_horasTrab_Usu    FK CONSTRAINT     ?   ALTER TABLE ONLY public."horasTrabajadas"
    ADD CONSTRAINT "fk_horasTrab_Usu" FOREIGN KEY (usu_id) REFERENCES public.usuarios(usu_id);
 N   ALTER TABLE ONLY public."horasTrabajadas" DROP CONSTRAINT "fk_horasTrab_Usu";
       public       postgres    false    231    2807    219                       2606    25339 +   historialventas historialventas_ven_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.historialventas
    ADD CONSTRAINT historialventas_ven_id_fkey FOREIGN KEY (ven_id) REFERENCES public.ventas(ven_id) NOT VALID;
 U   ALTER TABLE ONLY public.historialventas DROP CONSTRAINT historialventas_ven_id_fkey;
       public       postgres    false    221    207    2809                       2606    25349    pedido pedido_cli_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_cli_id_fkey FOREIGN KEY (cli_id) REFERENCES public.clientes(cli_id) NOT VALID;
 C   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_cli_id_fkey;
       public       postgres    false    212    200    2785                       2606    25354    pedido pedido_usu_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_usu_id_fkey FOREIGN KEY (usu_id) REFERENCES public.usuarios(usu_id) NOT VALID;
 C   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_usu_id_fkey;
       public       postgres    false    212    219    2807                       2606    25359    pedido pedido_ven_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_ven_id_fkey FOREIGN KEY (ven_id) REFERENCES public.ventas(ven_id) NOT VALID;
 C   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_ven_id_fkey;
       public       postgres    false    212    221    2809            	           2606    25364    productos productos_cat_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.productos
    ADD CONSTRAINT productos_cat_id_fkey FOREIGN KEY (cat_id) REFERENCES public.categoria(cat_id) NOT VALID;
 I   ALTER TABLE ONLY public.productos DROP CONSTRAINT productos_cat_id_fkey;
       public       postgres    false    214    198    2783                       2606    25401    recetas recetas_ing_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.recetas
    ADD CONSTRAINT recetas_ing_id_fkey FOREIGN KEY (ing_id) REFERENCES public.ingredientes(ing_id) NOT VALID;
 E   ALTER TABLE ONLY public.recetas DROP CONSTRAINT recetas_ing_id_fkey;
       public       postgres    false    2795    208    217            
           2606    25374    recetas recetas_pro_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.recetas
    ADD CONSTRAINT recetas_pro_id_fkey FOREIGN KEY (pro_id) REFERENCES public.productos(pro_id) NOT VALID;
 E   ALTER TABLE ONLY public.recetas DROP CONSTRAINT recetas_pro_id_fkey;
       public       postgres    false    217    214    2801                       2606    25379    ventas ventas_cli_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.ventas
    ADD CONSTRAINT ventas_cli_id_fkey FOREIGN KEY (cli_id) REFERENCES public.clientes(cli_id) NOT VALID;
 C   ALTER TABLE ONLY public.ventas DROP CONSTRAINT ventas_cli_id_fkey;
       public       postgres    false    221    200    2785                       2606    25384    ventas ventas_desc_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.ventas
    ADD CONSTRAINT ventas_desc_id_fkey FOREIGN KEY (desc_id) REFERENCES public.descuentos(des_id) NOT VALID;
 D   ALTER TABLE ONLY public.ventas DROP CONSTRAINT ventas_desc_id_fkey;
       public       postgres    false    221    202    2787                       2606    25389    ventas ventas_prom_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.ventas
    ADD CONSTRAINT ventas_prom_id_fkey FOREIGN KEY (prom_id) REFERENCES public.promociones(prom_id) NOT VALID;
 D   ALTER TABLE ONLY public.ventas DROP CONSTRAINT ventas_prom_id_fkey;
       public       postgres    false    2803    216    221                       2606    25394    ventas ventas_usu_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.ventas
    ADD CONSTRAINT ventas_usu_id_fkey FOREIGN KEY (usu_id) REFERENCES public.usuarios(usu_id) NOT VALID;
 C   ALTER TABLE ONLY public.ventas DROP CONSTRAINT ventas_usu_id_fkey;
       public       postgres    false    219    2807    221            ?       x?32?4?4200?44?22?2??????? 1[?      ?      x?????? ? ?      ?      x?+?Ȭ?J?J?tJM?LI,?????? U?Y      ?   _   x?3???L/M?Q?t?KO???464442615?L,K??LIT?M??L?????2??,*?K??ɯJ?+5240064?t,S?K,??I-V ??Jc???? ???      ?   f   x?sO,.??N?I??L?H,洰?42?20?26?rK??VqpZX?p????$rdVU%*????e?4X?aW`1h??%W? ?u!?      ?   R   x?U̱?0C?Z?%?????,??q?
????????#!N???b?l֡?????EC???Q?^j?E+?d????????V      ?      x?3?44Pb?=... $?      ?      x?????? ? ?      ?   T   x?e?A
?0D??x?5Q??mN??C???????=?XPVil?dĘ?9???pU{H?????{?f???g??vW?V_?"z D      ?   Y   x?M?!?PP={????B?u?5?H$??1}?????:/?????8V
??86*???HB*???oa??9a]9?zh??>"???      ?      x?????? ? ?      ?   ^   x?Uϱ?0D?vq?A??.???T??	}7ǰ???0)??7?gC2?L-???a5l?Z??|U???8??"XN?u??B????\??p?'?      ?      x?3?LLN?,I??)?????? ,$F      ?   +   x?3??H,??K?4?,M)?2?LLN?,I?44??)?????? ???      ?      x?????? ? ?      ?   ?   x?u?AN?0E??S?(vSh֕*UT???K%ˎ@?V?????!H?,?????O?3J?m ??ް???s?r`C??T?@{/4<?c?Ѱ?w?e???J-;GX]$??}N:a??득?%<??i?u]"v?Ӭ?}?nfɜ(?,????)?-?#?͒?C???[???l|???????vZ?`?
v?????B??????ec{?#?wmt/??	?o?\եb
??ݯO?QU?:?WB?o???      ?      x?3?4?0?42?????? ?7      ?      x?????? ? ?      ?   c   x?%?1@@F???S8??ЩU????$kVvQ8?E?????J??? 6?(""??j0Z??G??$?<????CX=????Y=?bpr?3W*眈h?W      ?   ]   x?34?T???30?Ȭ?JTH-H-????4???!C T140 )Q14Q??V?V?F?FF??f??\??pU?d 5?????ٜ=... ???     