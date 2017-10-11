package it.itspiemonte.pietro.findingbalto;

/**
 * Created by Pietro on 11/10/2017.
 */
import android.provider.BaseColumns;

public final class BaltoContract {

    private BaltoContract() {}

    public static final class UtenteEntry implements BaseColumns {

        public final static String TABLE_UTENTE = "Utente";

        public final static String ID_UTENTE = BaseColumns._ID;

        public final static String NOME_UTENTE = "nomeUtente";

        public final static String COGNOME_UTENTE = "cognomeUtente";

        public final static String PASSWORD = "password";

        public final static String INDIRIZZO = "indirizzo";

        public final static String NUMERO_TELEFONO = "numeroTelefono";

        public final static String E_MAIL = "mail";
    }

    public static final class AnimaleEntry implements BaseColumns {

        public final static String TABLE_ANIMALE = "Animale";

        public final static String ID_ANIMALE = BaseColumns._ID;

        public final static String NOME_ANIMALE = "nomeAnimale";

        public final static String SPECIE = "specieAnimale";

        public final static String SESSO = "sesso";
        public final static int SCONOSCIUTO = 0;
        public final static int MASCHIO = 1;
        public final static int FEMMINA = 2;

        public final static String PESO = "peso";

        public final static String COLORE = "colore";

        public final static String RAZZA = "razza";

       // public final static String PADRONE = ID_UTENTE;

    }

    }

