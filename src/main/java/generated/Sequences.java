/**
 * This class is generated by jOOQ
 */
package generated;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.system_sequence_3a951321_96fd_4bfc_9fa3_050b18ff97ba</code>
	 */
	public static final Sequence<Long> SYSTEM_SEQUENCE_3A951321_96FD_4BFC_9FA3_050B18FF97BA = new SequenceImpl<Long>("system_sequence_3a951321_96fd_4bfc_9fa3_050b18ff97ba", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence <code>public.system_sequence_d5a5c54f_d34a_45f3_b52e_90548f33139e</code>
	 */
	public static final Sequence<Long> SYSTEM_SEQUENCE_D5A5C54F_D34A_45F3_B52E_90548F33139E = new SequenceImpl<Long>("system_sequence_d5a5c54f_d34a_45f3_b52e_90548f33139e", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);
}
