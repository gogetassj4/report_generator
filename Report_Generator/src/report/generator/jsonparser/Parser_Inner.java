package report.generator.jsonparser;

import java.io.*;
import java.util.*;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Parser_Inner {
		
	public static void main(String[] args) throws InterruptedException {
		try {
			JsonObject jsonObject = JsonParser.parseReader(new FileReader("C:\\Users\\jyoth\\Documents\\SE_Project\\report_generator\\Report_Generator\\src\\report\\generator\\jsonparser\\elements.json"))
					.getAsJsonObject();
			
			List<Object> inner_elements = null;
			HashMap<String, List<Object>> jsonMap = new HashMap<>();
			
			
			JsonObject data = (JsonObject) jsonObject.get("data");
			JsonObject item = (JsonObject) data.get("item");
			JsonObject bug_type = (JsonObject) item.get("bug_type");
			
			JsonObject dangerous_enum_conversion_value= (JsonObject) bug_type.get("dangerous_enum_conversion");
			String dasp_decv = (String)dangerous_enum_conversion_value.get("dasp").getAsString();
			String description_decv = (String)dangerous_enum_conversion_value.get("description").getAsString();
			String example_decv = (String)dangerous_enum_conversion_value.get("example").getAsString();
			boolean found_decv = (boolean) dangerous_enum_conversion_value.get("found").getAsBoolean();
			
			//storing values for dangerous_enum_conversion_value
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_decv);
			inner_elements.add(description_decv);
			inner_elements.add(example_decv);
			inner_elements.add(found_decv);
			
			jsonMap.put("dangerous\\_enum\\_conversion", inner_elements);
			
			JsonObject constant_state_variable_value = (JsonObject) bug_type.get("constant_state_variable");
			String dasp_csvv = (String) constant_state_variable_value.get("dasp").getAsString();
			String description_csvv = (String) constant_state_variable_value.get("description").getAsString();
			String example_csvv = (String) constant_state_variable_value.get("example").getAsString();
			boolean found_csvv = (boolean) constant_state_variable_value.get("found").getAsBoolean();
			
			//storing values for constant_state_variable_value
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_csvv);
			inner_elements.add(description_csvv);
			inner_elements.add(example_csvv);
			inner_elements.add(found_csvv);
			
			jsonMap.put("constant\\_state\\_variable", inner_elements);
			
			JsonObject arbitrary_from_in_transferFrom_value = (JsonObject) bug_type.get("arbitrary_from_in_transferFrom");
			String dasp_afit = (String) arbitrary_from_in_transferFrom_value.get("dasp").getAsString();
			String description_afit = (String) arbitrary_from_in_transferFrom_value.get("description").getAsString();
			String example_afit = (String) arbitrary_from_in_transferFrom_value.get("example").getAsString();
			boolean found_afit = (boolean) arbitrary_from_in_transferFrom_value.get("found").getAsBoolean();
			
			//storing values for arbitrary_from_in_transferFrom
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_afit);
			inner_elements.add(description_afit);
			inner_elements.add(example_afit);
			inner_elements.add(found_afit);
			
			jsonMap.put("arbitrary\\_from\\_in\\_transferFrom", inner_elements);
			
			JsonObject del_structure_containing_mapping_value = (JsonObject) bug_type.get("del_structure_containing_mapping");
			String dasp_dscmv = (String) del_structure_containing_mapping_value.get("dasp").getAsString();
			String description_dscmv = (String) del_structure_containing_mapping_value.get("description").getAsString();
			String example_dscmv = (String) del_structure_containing_mapping_value.get("example").getAsString();
			boolean found_dscmv = (boolean) del_structure_containing_mapping_value.get("found").getAsBoolean();
			
			//storing values for del_structure_containing_mapping
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_dscmv);
			inner_elements.add(description_dscmv);
			inner_elements.add(example_dscmv);
			inner_elements.add(found_dscmv);
			
			jsonMap.put("del\\_structure\\_containing\\_mapping", inner_elements);
			
			
			JsonObject erc20_event_not_indexed_value = (JsonObject) bug_type.get("erc20_event_not_indexed");
			String dasp_eeniv = (String) erc20_event_not_indexed_value.get("dasp").getAsString();
			String description_eeniv = (String) erc20_event_not_indexed_value.get("description").getAsString();
			String example_eeniv = (String) erc20_event_not_indexed_value.get("example").getAsString();
			boolean found_eeniv = (boolean) erc20_event_not_indexed_value.get("found").getAsBoolean();
			
			//storing values for erc20_event_not_indexed
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_eeniv);
			inner_elements.add(description_eeniv);
			inner_elements.add(example_eeniv);
			inner_elements.add(found_eeniv);
			
			jsonMap.put("erc20\\_event\\_not\\_indexed", inner_elements);
			
			
			JsonObject use_after_delete_value = (JsonObject) bug_type.get("use_after_delete");
			String dasp_uadv = (String) use_after_delete_value.get("dasp").getAsString();
			String description_uadv = (String) use_after_delete_value.get("description").getAsString();
			String example_uadv = (String) use_after_delete_value.get("example").getAsString();
			boolean found_uadv = (boolean) use_after_delete_value.get("found").getAsBoolean();
			
			//storing values for use_after_delete
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_uadv);
			inner_elements.add(description_uadv);
			inner_elements.add(example_uadv);
			inner_elements.add(found_uadv);
			
			jsonMap.put("use\\_after\\_delete", inner_elements);
			
			JsonObject call_without_data_value = (JsonObject) bug_type.get("call_without_data");
			String dasp_cwdv = (String) call_without_data_value.get("dasp").getAsString();
			String description_cwdv = (String) call_without_data_value.get("description").getAsString();
			String example_cwdv = (String) call_without_data_value.get("example").getAsString();
			boolean found_cwdv = (boolean) call_without_data_value.get("found").getAsBoolean();
			
			//storing values for call_without_data
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_cwdv);
			inner_elements.add(description_cwdv);
			inner_elements.add(example_cwdv);
			inner_elements.add(found_cwdv);
			
			jsonMap.put("call\\_without\\_data", inner_elements);
			
			JsonObject visibility_value = (JsonObject) bug_type.get("visibility");
			String dasp_vv = (String) visibility_value.get("dasp").getAsString();
			String description_vv = (String) visibility_value.get("description").getAsString();
			String example_vv = (String) visibility_value.get("example").getAsString();
			boolean found_vv = (boolean) visibility_value.get("found").getAsBoolean();
			
			//storing values for visibility
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_vv);
			inner_elements.add(description_vv);
			inner_elements.add(example_vv);
			inner_elements.add(found_vv);
			
			jsonMap.put("visibility", inner_elements);
			
			
			JsonObject incorrect_shift_in_assembly_value = (JsonObject) bug_type.get("incorrect_shift_in_assembly");
			String dasp_isiav = (String) incorrect_shift_in_assembly_value.get("dasp").getAsString();
			String description_isiav = (String) incorrect_shift_in_assembly_value.get("description").getAsString();
			String example_isiav = (String) incorrect_shift_in_assembly_value.get("example").getAsString();
			boolean found_isiav = (boolean) incorrect_shift_in_assembly_value.get("found").getAsBoolean();
			
			
			//storing values for incorrect_shift_in_assembly
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_isiav);
			inner_elements.add(description_isiav);
			inner_elements.add(example_isiav);
			inner_elements.add(found_isiav);
			
			jsonMap.put("incorrect\\_shift\\_in\\_assembly", inner_elements);
			
			
			JsonObject short_addresses_value = (JsonObject) bug_type.get("short_addresses");
			String dasp_sav = (String) short_addresses_value.get("dasp").getAsString();
			String description_sav = (String) short_addresses_value.get("description").getAsString();
			String example_sav = (String) short_addresses_value.get("example").getAsString();
			boolean found_sav = (boolean) short_addresses_value.get("found").getAsBoolean();
			
			//storing values for short_addresses
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_sav);
			inner_elements.add(description_sav);
			inner_elements.add(example_sav);
			inner_elements.add(found_sav);
			
			jsonMap.put("short\\_addresses", inner_elements);
			
			JsonObject incorrect_modifier_value = (JsonObject) bug_type.get("incorrect_modifier");
			String dasp_imv = (String) incorrect_modifier_value.get("dasp").getAsString();
			String description_imv = (String) incorrect_modifier_value.get("description").getAsString();
			String example_imv = (String) incorrect_modifier_value.get("example").getAsString();
			boolean found_imv = (boolean) incorrect_modifier_value.get("found").getAsBoolean();
			

			//storing values for incorrect_modifier
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_imv);
			inner_elements.add(description_imv);
			inner_elements.add(example_imv);
			inner_elements.add(found_imv);
			
			jsonMap.put("incorrect\\_modifier", inner_elements);
			
			JsonObject wrong_signature_value = (JsonObject) bug_type.get("wrong_signature");
			String dasp_wsv = (String) wrong_signature_value.get("dasp").getAsString();
			String description_wsv = (String) wrong_signature_value.get("description").getAsString();
			String example_wsv = (String) wrong_signature_value.get("example").getAsString();
			boolean found_wsv = (boolean) wrong_signature_value.get("found").getAsBoolean();
			
			//storing values for wrong_signature
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_wsv);
			inner_elements.add(description_wsv);
			inner_elements.add(example_wsv);
			inner_elements.add(found_wsv);
			
			jsonMap.put("wrong\\_signature", inner_elements);
			
			JsonObject function_declared_return_but_no_return_value = (JsonObject) bug_type.get("function_declared_return_but_no_return");
			String dasp_fdrbnrv = (String) function_declared_return_but_no_return_value.get("dasp").getAsString();
			String description_fdrbnrv = (String) function_declared_return_but_no_return_value.get("description").getAsString();
			String example_fdrbnrv = (String) function_declared_return_but_no_return_value.get("example").getAsString();
			boolean found_fdrbnrv = (boolean) function_declared_return_but_no_return_value.get("found").getAsBoolean();
			
			
			//storing values for function_declared_return_but_no_return
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_fdrbnrv);
			inner_elements.add(description_fdrbnrv);
			inner_elements.add(example_fdrbnrv);
			inner_elements.add(found_fdrbnrv);
			
			jsonMap.put("function\\_declared\\_return\\_but\\_no\\_return", inner_elements);
			
			JsonObject storage_ABIEncoderV2_array_value = (JsonObject) bug_type.get("storage_ABIEncoderV2_array");
			String dasp_saav = (String) storage_ABIEncoderV2_array_value.get("dasp").getAsString();
			String description_saav = (String) storage_ABIEncoderV2_array_value.get("description").getAsString();
			String example_saav = (String) storage_ABIEncoderV2_array_value.get("example").getAsString();
			boolean found_saav = (boolean) storage_ABIEncoderV2_array_value.get("found").getAsBoolean();
			
			//storing values for storage_ABIEncoderV2_array
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_saav);
			inner_elements.add(description_saav);
			inner_elements.add(example_saav);
			inner_elements.add(found_saav);
			
			jsonMap.put("storage\\_ABIEncoderV2\\_array", inner_elements);
			
			JsonObject deprecated_standards_value = (JsonObject) bug_type.get("deprecated_standards");
			String dasp_dsv = (String) deprecated_standards_value.get("dasp").getAsString();
			String description_dsv = (String) deprecated_standards_value.get("description").getAsString();
			String example_dsv = (String) deprecated_standards_value.get("example").getAsString();
			boolean found_dsv = (boolean) deprecated_standards_value.get("found").getAsBoolean();
			
			//storing values for deprecated_standards
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_dsv);
			inner_elements.add(description_dsv);
			inner_elements.add(example_dsv);
			inner_elements.add(found_dsv);
			
			jsonMap.put("deprecated\\_standards", inner_elements);
			
			JsonObject unused_state_variables_value = (JsonObject) bug_type.get("unused_state_variables");
			String dasp_usvv = (String) unused_state_variables_value.get("dasp").getAsString();
			String description_usvv = (String) unused_state_variables_value.get("description").getAsString();
			String example_usvv = (String) unused_state_variables_value.get("example").getAsString();
			boolean found_usvv = (boolean) unused_state_variables_value.get("found").getAsBoolean();
			
			
			//storing values for unused_state_variables
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_usvv);
			inner_elements.add(description_usvv);
			inner_elements.add(example_usvv);
			inner_elements.add(found_usvv);
			
			jsonMap.put("unused\\_state\\_variables", inner_elements);
			
			JsonObject ignore_value = (JsonObject) bug_type.get("ignore");
			String dasp_iv = (String) ignore_value.get("dasp").getAsString();
			String description_iv = (String) ignore_value.get("description").getAsString();
			String example_iv = (String) ignore_value.get("example").getAsString();
			boolean found_iv = (boolean) ignore_value.get("found").getAsBoolean();
			
			//storing values for ignore
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_iv);
			inner_elements.add(description_iv);
			inner_elements.add(example_iv);
			inner_elements.add(found_iv);
			
			jsonMap.put("ignore", inner_elements);
			
			JsonObject array_length_manipulation_value = (JsonObject) bug_type.get("array_length_manipulation");
			String dasp_almv = (String) array_length_manipulation_value.get("dasp").getAsString();
			String description_almv = (String) array_length_manipulation_value.get("description").getAsString();
			String example_almv = (String) array_length_manipulation_value.get("example").getAsString();
			boolean found_almv = (boolean) array_length_manipulation_value.get("found").getAsBoolean();
			

			//storing values for array_length_manipulation
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_almv);
			inner_elements.add(description_almv);
			inner_elements.add(example_almv);
			inner_elements.add(found_almv);
			
			jsonMap.put("array\\_length\\_manipulation", inner_elements);
			
			JsonObject storage_signed_integer_array_value = (JsonObject) bug_type.get("storage_signed_integer_array");
			String dasp_ssiav = (String) storage_signed_integer_array_value.get("dasp").getAsString();
			String description_ssiav = (String) storage_signed_integer_array_value.get("description").getAsString();
			String example_ssiav = (String) storage_signed_integer_array_value.get("example").getAsString();
			boolean found_ssiav = (boolean) storage_signed_integer_array_value.get("found").getAsBoolean();
			
			//storing values for storage_signed_integer_array
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_ssiav);
			inner_elements.add(description_ssiav);
			inner_elements.add(example_ssiav);
			inner_elements.add(found_ssiav);
			
			jsonMap.put("storage\\_signed\\_integer\\_array", inner_elements);
			
			JsonObject dead_code_value = (JsonObject) bug_type.get("dead_code");
			String dasp_dcv = (String) dead_code_value.get("dasp").getAsString();
			String description_dcv = (String) dead_code_value.get("description").getAsString();
			String example_dcv = (String) dead_code_value.get("example").getAsString();
			boolean found_dcv = (boolean) dead_code_value.get("found").getAsBoolean();

			//storing values for dead_code
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_dcv);
			inner_elements.add(description_dcv);
			inner_elements.add(example_dcv);
			inner_elements.add(found_dcv);
			
			jsonMap.put("dead\\_code", inner_elements);
			
			JsonObject multiple_constructor_schemes_value = (JsonObject) bug_type.get("multiple_constructor_schemes");
			String dasp_mcsv = (String) multiple_constructor_schemes_value.get("dasp").getAsString();
			String description_mcsv = (String) multiple_constructor_schemes_value.get("description").getAsString();
			String example_mcsv = (String) multiple_constructor_schemes_value.get("example").getAsString();
			boolean found_mcsv = (boolean) multiple_constructor_schemes_value.get("found").getAsBoolean();
			
			//storing values for multiple_constructor_schemes
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_mcsv);
			inner_elements.add(description_mcsv);
			inner_elements.add(example_mcsv);
			inner_elements.add(found_mcsv);
			
			jsonMap.put("multiple\\_constructor\\_schemes", inner_elements);
			
			JsonObject unchecked_calls_value = (JsonObject) bug_type.get("unchecked_calls");
			String dasp_ucv = (String) unchecked_calls_value.get("dasp").getAsString();
			String description_ucv = (String) unchecked_calls_value.get("description").getAsString();
			String example_ucv = (String) unchecked_calls_value.get("example").getAsString();
			boolean found_ucv = (boolean) unchecked_calls_value.get("found").getAsBoolean();
			
			//storing values for unchecked_calls
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_ucv);
			inner_elements.add(description_ucv);
			inner_elements.add(example_ucv);
			inner_elements.add(found_ucv);
			
			jsonMap.put("unchecked\\_calls", inner_elements);
			
			JsonObject uninitialized_func_pointer_value = (JsonObject) bug_type.get("uninitialized_func_pointer");
			String dasp_ufpv = (String) uninitialized_func_pointer_value.get("dasp").getAsString();
			String description_ufpv = (String) uninitialized_func_pointer_value.get("description").getAsString();
			String example_ufpv = (String) uninitialized_func_pointer_value.get("example").getAsString();
			boolean found_ufpv = (boolean) uninitialized_func_pointer_value.get("found").getAsBoolean();
			
			//storing values for uninitialized_func_pointer
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_ufpv);
			inner_elements.add(description_ufpv);
			inner_elements.add(example_ufpv);
			inner_elements.add(found_ufpv);
			
			jsonMap.put("uninitialized\\_func\\_pointer", inner_elements);
			
			
			JsonObject incorrect_using_balance_and_msg_value = (JsonObject) bug_type.get("incorrect_using_balance_and_msg.value");
			String dasp_iubamv = (String) incorrect_using_balance_and_msg_value.get("dasp").getAsString();
			String description_iubamv = (String) incorrect_using_balance_and_msg_value.get("description").getAsString();
			String example_iubamv = (String) incorrect_using_balance_and_msg_value.get("example").getAsString();
			boolean found_iubamv = (boolean) incorrect_using_balance_and_msg_value.get("found").getAsBoolean();
			
			
			//storing values for incorrect_using_balance_and_msg.value
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_iubamv);
			inner_elements.add(description_iubamv);
			inner_elements.add(example_iubamv);
			inner_elements.add(found_iubamv);
			
			jsonMap.put("uninitialized\\_func\\_pointer", inner_elements);
			
			JsonObject blockhash_current_value = (JsonObject) bug_type.get("blockhash_current");
			String dasp_bcv = (String) blockhash_current_value.get("dasp").getAsString();
			String description_bcv = (String) blockhash_current_value.get("description").getAsString();
			String example_bcv = (String) blockhash_current_value.get("example").getAsString();
			boolean found_bcv = (boolean) blockhash_current_value.get("found").getAsBoolean();
			
			//storing values for blockhash_current
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_bcv);
			inner_elements.add(description_bcv);
			inner_elements.add(example_bcv);
			inner_elements.add(found_bcv);
			
			jsonMap.put("blockhash\\_current", inner_elements);
			
			JsonObject strict_balance_equality_value = (JsonObject) bug_type.get("strict_balance_equality");
			String dasp_sbev = (String) strict_balance_equality_value.get("dasp").getAsString();
			String description_sbev = (String) strict_balance_equality_value.get("description").getAsString();
			String example_sbev = (String) strict_balance_equality_value.get("example").getAsString();
			boolean found_sbev = (boolean) strict_balance_equality_value.get("found").getAsBoolean();
			
			//storing values for strict_balance_equality
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_sbev);
			inner_elements.add(description_sbev);
			inner_elements.add(example_sbev);
			inner_elements.add(found_sbev);
			
			jsonMap.put("strict\\_balance\\_equality", inner_elements);
			
			JsonObject redundant_code_value = (JsonObject) bug_type.get("redundant_code");
			String dasp_rcv = (String) redundant_code_value.get("dasp").getAsString();
			String description_rcv = (String) redundant_code_value.get("description").getAsString();
			String example_rcv = (String) redundant_code_value.get("example").getAsString();
			boolean found_rcv = (boolean) redundant_code_value.get("found").getAsBoolean();
			
			//storing values for redundant_code
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_rcv);
			inner_elements.add(description_rcv);
			inner_elements.add(example_rcv);
			inner_elements.add(found_rcv);
			
			jsonMap.put("redundant\\_code", inner_elements);
			
			JsonObject uninitialized_state_variable_value = (JsonObject) bug_type.get("uninitialized_state_variable");
			String dasp_usvv2 = (String) uninitialized_state_variable_value.get("dasp").getAsString();
			String description_usvv2 = (String) uninitialized_state_variable_value.get("description").getAsString();
			String example_usvv2 = (String) uninitialized_state_variable_value.get("example").getAsString();
			boolean found_usvv2 = (boolean) uninitialized_state_variable_value.get("found").getAsBoolean();
			
			
			//storing values for uninitialized_state_variable
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_usvv2);
			inner_elements.add(description_usvv2);
			inner_elements.add(example_usvv2);
			inner_elements.add(found_usvv2);
			
			jsonMap.put("uninitialized\\_state\\_variable", inner_elements);
			
			JsonObject using_send_value = (JsonObject) bug_type.get("using_send");
			String dasp_usv = (String) using_send_value.get("dasp").getAsString();
			String description_usv = (String) using_send_value.get("description").getAsString();
			String example_usv = (String) using_send_value.get("example").getAsString();
			boolean found_usv = (boolean) using_send_value.get("found").getAsBoolean();
			
			//storing values for using_send
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_usv);
			inner_elements.add(description_usv);
			inner_elements.add(example_usv);
			inner_elements.add(found_usv);
			
			jsonMap.put("using\\_send", inner_elements);
			
			JsonObject costly_ops_in_loop_value = (JsonObject) bug_type.get("costly_ops_in_loop");
			String dasp_coilv = (String) costly_ops_in_loop_value.get("dasp").getAsString();
			String description_coilv = (String) costly_ops_in_loop_value.get("description").getAsString();
			String example_coilv = (String) costly_ops_in_loop_value.get("example").getAsString();
			boolean found_coilv = (boolean) costly_ops_in_loop_value.get("found").getAsBoolean();
			
			//storing values for costly_ops_in_loop
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_coilv);
			inner_elements.add(description_coilv);
			inner_elements.add(example_coilv);
			inner_elements.add(found_coilv);
			
			jsonMap.put("costly\\_ops\\_in\\_loop", inner_elements);
			
			
			JsonObject byte_array_instead_bytes_value = (JsonObject) bug_type.get("byte_array_instead_bytes");
			String dasp_baibv = (String) byte_array_instead_bytes_value.get("dasp").getAsString();
			String description_baibv = (String) byte_array_instead_bytes_value.get("description").getAsString();
			String example_baibv = (String) byte_array_instead_bytes_value.get("example").getAsString();
			boolean found_baibv = (boolean) byte_array_instead_bytes_value.get("found").getAsBoolean();
			
			//storing values for byte_array_instead_bytes
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_baibv);
			inner_elements.add(description_baibv);
			inner_elements.add(example_baibv);
			inner_elements.add(found_baibv);
			
			jsonMap.put("byte\\_array\\_instead\\_bytes", inner_elements);
			
			
			JsonObject func_modifying_storage_array_by_value = (JsonObject) bug_type.get("func_modifying_storage_array_by_value");
			String dasp_fmsabv = (String) func_modifying_storage_array_by_value.get("dasp").getAsString();
			String description_fmsabv = (String) func_modifying_storage_array_by_value.get("description").getAsString();
			String example_fmsabv = (String) func_modifying_storage_array_by_value.get("example").getAsString();
			boolean found_fmsabv = (boolean) func_modifying_storage_array_by_value.get("found").getAsBoolean();
			
			//storing values for func_modifying_storage_array_by_value
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_fmsabv);
			inner_elements.add(description_fmsabv);
			inner_elements.add(example_fmsabv);
			inner_elements.add(found_fmsabv);
			
			jsonMap.put("func\\_modifying\\_storage\\_array\\_by\\_value", inner_elements);
			
			JsonObject divide_before_multiply_value = (JsonObject) bug_type.get("divide_before_multiply");
			String dasp_dbmv = (String) divide_before_multiply_value.get("dasp").getAsString();
			String description_dbmv = (String) divide_before_multiply_value.get("description").getAsString();
			String example_dbmv = (String) divide_before_multiply_value.get("example").getAsString();
			boolean found_dbmv = (boolean) divide_before_multiply_value.get("found").getAsBoolean();
			
			//storing values for divide_before_multiply
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_dbmv);
			inner_elements.add(description_dbmv);
			inner_elements.add(example_dbmv);
			inner_elements.add(found_dbmv);
			
			jsonMap.put("divide\\_before\\_multiply", inner_elements);
			
			JsonObject builtin_symbol_shadowing_value = (JsonObject) bug_type.get("builtin_symbol_shadowing");
			String dasp_bssv = (String) builtin_symbol_shadowing_value.get("dasp").getAsString();
			String description_bssv = (String) builtin_symbol_shadowing_value.get("description").getAsString();
			String example_bssv = (String) builtin_symbol_shadowing_value.get("example").getAsString();
			boolean found_bssv = (boolean) builtin_symbol_shadowing_value.get("found").getAsBoolean();
			
			//storing values for builtin_symbol_shadowing
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_bssv);
			inner_elements.add(description_bssv);
			inner_elements.add(example_bssv);
			inner_elements.add(found_bssv);
			
			jsonMap.put("builtin\\_symbol\\_shadowing", inner_elements);
			
			JsonObject modifier_like_Sol_keyword_value = (JsonObject) bug_type.get("modifier_like_Sol_keyword");
			String dasp_mlskv = (String) modifier_like_Sol_keyword_value.get("dasp").getAsString();
			String description_mlskv = (String) modifier_like_Sol_keyword_value.get("description").getAsString();
			String example_mlskv = (String) modifier_like_Sol_keyword_value.get("example").getAsString();
			boolean found_mlskv = (boolean) modifier_like_Sol_keyword_value.get("found").getAsBoolean();
			
			//storing values for modifier_like_Sol_keyword
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_mlskv);
			inner_elements.add(description_mlskv);
			inner_elements.add(example_mlskv);
			inner_elements.add(found_mlskv);
			
			jsonMap.put("modifier\\_like\\_Sol\\_keyword", inner_elements);
			
			JsonObject msg_value_equals_zero = (JsonObject) bug_type.get("msg.value_equals_zero");
			String dasp_mvez = (String) msg_value_equals_zero.get("dasp").getAsString();
			String description_mvez = (String) msg_value_equals_zero.get("description").getAsString();
			String example_mvez = (String) msg_value_equals_zero.get("example").getAsString();
			boolean found_mvez = (boolean) msg_value_equals_zero.get("found").getAsBoolean();
			
			//storing values for msg.value_equals_zero
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_mvez);
			inner_elements.add(description_mvez);
			inner_elements.add(example_mvez);
			inner_elements.add(found_mvez);
			
			jsonMap.put("msg.value\\_equals\\_zero", inner_elements);
			
			JsonObject uninitialized_local_variable_value = (JsonObject) bug_type.get("uninitialized_local_variable");
			String dasp_ulvv = (String) uninitialized_local_variable_value.get("dasp").getAsString();
			String description_ulvv = (String) uninitialized_local_variable_value.get("description").getAsString();
			String example_ulvv = (String) uninitialized_local_variable_value.get("example").getAsString();
			boolean found_ulvv = (boolean) uninitialized_local_variable_value.get("found").getAsBoolean();
			
			//storing values for uninitialized_local_variable_value
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_ulvv);
			inner_elements.add(description_ulvv);
			inner_elements.add(example_ulvv);
			inner_elements.add(found_ulvv);
			
			jsonMap.put("uninitialized\\_local\\_variable", inner_elements);
			
			JsonObject race_condition_value = (JsonObject) bug_type.get("race_condition");
			String dasp_rcv2 = (String) race_condition_value.get("dasp").getAsString();
			String description_rcv2 = (String) race_condition_value.get("description").getAsString();
			String example_rcv2 = (String) race_condition_value.get("example").getAsString();
			boolean found_rcv2 = (boolean) race_condition_value.get("found").getAsBoolean();
			
			//storing values for race_condition
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_rcv2);
			inner_elements.add(description_rcv2);
			inner_elements.add(example_rcv2);
			inner_elements.add(found_rcv2);
			
			jsonMap.put("race\\_condition", inner_elements);
			
			JsonObject state_variable_shadowing_value = (JsonObject) bug_type.get("state_variable_shadowing");
			String dasp_svsv = (String) state_variable_shadowing_value.get("dasp").getAsString();
			String description_svsv = (String) state_variable_shadowing_value.get("description").getAsString();
			String example_svsv = (String) state_variable_shadowing_value.get("example").getAsString();
			boolean found_svsv = (boolean) state_variable_shadowing_value.get("found").getAsBoolean();
			
			//storing values for state_variable_shadowing
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_svsv);
			inner_elements.add(description_svsv);
			inner_elements.add(example_svsv);
			inner_elements.add(found_svsv);
			
			jsonMap.put("state\\_variable\\_shadowing", inner_elements);
			
			JsonObject useless_compare_value = (JsonObject) bug_type.get("useless_compare");
			String dasp_ucv2 = (String) useless_compare_value.get("dasp").getAsString();
			String description_ucv2 = (String) useless_compare_value.get("description").getAsString();
			String example_ucv2 = (String) useless_compare_value.get("example").getAsString();
			boolean found_ucv2 = (boolean) useless_compare_value.get("found").getAsBoolean();
			
			//storing values for useless_compare
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_ucv2);
			inner_elements.add(description_ucv2);
			inner_elements.add(example_ucv2);
			inner_elements.add(found_ucv2);
			
			jsonMap.put("useless\\_compare", inner_elements);
			
			JsonObject arithmetic_value = (JsonObject) bug_type.get("arithmetic");
			String dasp_av = (String) arithmetic_value.get("dasp").getAsString();
			String description_av = (String) arithmetic_value.get("description").getAsString();
			String example_av = (String) arithmetic_value.get("example").getAsString();
			boolean found_av = (boolean) arithmetic_value.get("found").getAsBoolean();
			
			//storing values for arithmetic
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_av);
			inner_elements.add(description_av);
			inner_elements.add(example_av);
			inner_elements.add(found_av);
			
			jsonMap.put("arithmetic", inner_elements);
			
			JsonObject access_control_value = (JsonObject) bug_type.get("access_control");
			String dasp_acv = (String) access_control_value.get("dasp").getAsString();
			String description_acv = (String) access_control_value.get("description").getAsString();
			String example_acv = (String) access_control_value.get("example").getAsString();
			boolean found_acv = (boolean) access_control_value.get("found").getAsBoolean();
			

			//storing values for access_control
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_acv);
			inner_elements.add(description_acv);
			inner_elements.add(example_acv);
			inner_elements.add(found_acv);
			
			jsonMap.put("access\\_control", inner_elements);
			
			JsonObject uninitialized_storage_pointer_value = (JsonObject) bug_type.get("uninitialized_storage_pointer");
			String dasp_uspv = (String) uninitialized_storage_pointer_value.get("dasp").getAsString();
			String description_uspv = (String) uninitialized_storage_pointer_value.get("description").getAsString();
			String example_uspv = (String) uninitialized_storage_pointer_value.get("example").getAsString();
			boolean found_uspv = (boolean) uninitialized_storage_pointer_value.get("found").getAsBoolean();
			
			//storing values for uninitialized_storage_pointer
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_uspv);
			inner_elements.add(description_uspv);
			inner_elements.add(example_uspv);
			inner_elements.add(found_uspv);
			
			jsonMap.put("uninitialized\\_storage\\_pointer", inner_elements);
			
			JsonObject address_hardcoded_value = (JsonObject) bug_type.get("address_hardcoded");
			String dasp_ahv = (String) address_hardcoded_value.get("dasp").getAsString();
			String description_ahv = (String) address_hardcoded_value.get("description").getAsString();
			String example_ahv = (String) address_hardcoded_value.get("example").getAsString();
			boolean found_ahv = (boolean) address_hardcoded_value.get("found").getAsBoolean();
			
			//storing values for address_hardcoded
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_ahv);
			inner_elements.add(description_ahv);
			inner_elements.add(example_ahv);
			inner_elements.add(found_ahv);
			
			jsonMap.put("address\\_hardcoded", inner_elements);
			
			JsonObject benign_reentrancy_value = (JsonObject) bug_type.get("benign_reentrancy");
			String dasp_brv = (String) benign_reentrancy_value.get("dasp").getAsString();
			String description_brv = (String) benign_reentrancy_value.get("description").getAsString();
			String example_brv = (String) benign_reentrancy_value.get("example").getAsString();
			boolean found_brv = (boolean) benign_reentrancy_value.get("found").getAsBoolean();
			
			//storing values for benign_reentrancy
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_brv);
			inner_elements.add(description_brv);
			inner_elements.add(example_brv);
			inner_elements.add(found_brv);
			
			jsonMap.put("benign\\_reentrancy", inner_elements);
			
			JsonObject incorrect_ERC721_interface_value = (JsonObject) bug_type.get("incorrect_ERC721_interface");
			String dasp_ieiv = (String) incorrect_ERC721_interface_value.get("dasp").getAsString();
			String description_ieiv = (String) incorrect_ERC721_interface_value.get("description").getAsString();
			String example_ieiv = (String) incorrect_ERC721_interface_value.get("example").getAsString();
			boolean found_ieiv = (boolean) incorrect_ERC721_interface_value.get("found").getAsBoolean();
			
			//storing values for incorrect_ERC721_interface
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_ieiv);
			inner_elements.add(description_ieiv);
			inner_elements.add(example_ieiv);
			inner_elements.add(found_ieiv);
			
			jsonMap.put("incorrect\\_ERC721\\_interface", inner_elements);
			
			JsonObject msg_value_in_loop = (JsonObject) bug_type.get("msg.value_in_loop");
			String dasp_mvil = (String) msg_value_in_loop.get("dasp").getAsString();
			String description_mvil = (String) msg_value_in_loop.get("description").getAsString();
			String example_mvil = (String) msg_value_in_loop.get("example").getAsString();
			boolean found_mvil = (boolean) msg_value_in_loop.get("found").getAsBoolean();
			
			
			//storing values for msg.value_in_loop
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_mvil);
			inner_elements.add(description_mvil);
			inner_elements.add(example_mvil);
			inner_elements.add(found_mvil);
			
			jsonMap.put("msg.value\\_in\\_loop", inner_elements);
			
			JsonObject time_manipulation_value = (JsonObject) bug_type.get("time_manipulation");
			String dasp_tmv = (String) time_manipulation_value.get("dasp").getAsString();
			String description_tmv = (String) time_manipulation_value.get("description").getAsString();
			String example_tmv = (String) time_manipulation_value.get("example").getAsString();
			boolean found_tmv = (boolean) time_manipulation_value.get("found").getAsBoolean();
			
			
			//storing values for time_manipulation
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_tmv);
			inner_elements.add(description_tmv);
			inner_elements.add(example_tmv);
			inner_elements.add(found_tmv);
			
			jsonMap.put("time\\_manipulation", inner_elements);
			
			JsonObject overpowered_role_value = (JsonObject) bug_type.get("overpowered_role");
			String dasp_orv = (String) overpowered_role_value.get("dasp").getAsString();
			String description_orv = (String) overpowered_role_value.get("description").getAsString();
			String example_orv = (String) overpowered_role_value.get("example").getAsString();
			boolean found_orv = (boolean) overpowered_role_value.get("found").getAsBoolean();
			
			//storing values for overpowered_role
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_orv);
			inner_elements.add(description_orv);
			inner_elements.add(example_orv);
			inner_elements.add(found_orv);
			
			jsonMap.put("overpowered\\_role", inner_elements);
			
			JsonObject should_be_pure_value = (JsonObject) bug_type.get("should_be_pure");
			String dasp_sbpv = (String) should_be_pure_value.get("dasp").getAsString();
			String description_sbpv = (String) should_be_pure_value.get("description").getAsString();
			String example_sbpv = (String) should_be_pure_value.get("example").getAsString();
			boolean found_sbpv = (boolean) should_be_pure_value.get("found").getAsBoolean();
			
			//storing values for should_be_pure
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_sbpv);
			inner_elements.add(description_sbpv);
			inner_elements.add(example_sbpv);
			inner_elements.add(found_sbpv);
			
			jsonMap.put("should\\_be\\_pure", inner_elements);
			
			JsonObject controlled_lowlevel_call_value = (JsonObject) bug_type.get("controlled_lowlevel_call");
			String dasp_clcv = (String) controlled_lowlevel_call_value.get("dasp").getAsString();
			String description_clcv = (String) controlled_lowlevel_call_value.get("description").getAsString();
			String example_clcv = (String) controlled_lowlevel_call_value.get("example").getAsString();
			boolean found_clcv = (boolean) controlled_lowlevel_call_value.get("found").getAsBoolean();
			
			//storing values for controlled_lowlevel_call
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_clcv);
			inner_elements.add(description_clcv);
			inner_elements.add(example_clcv);
			inner_elements.add(found_clcv);
			
			jsonMap.put("controlled\\_lowlevel\\_call", inner_elements);
			
			JsonObject pre_declare_usage_of_local_value = (JsonObject) bug_type.get("pre-declare_usage_of_local");
			String dasp_pduolv = (String) pre_declare_usage_of_local_value.get("dasp").getAsString();
			String description_pduolv = (String) pre_declare_usage_of_local_value.get("description").getAsString();
			String example_pduolv = (String) pre_declare_usage_of_local_value.get("example").getAsString();
			boolean found_pduolv = (boolean) pre_declare_usage_of_local_value.get("found").getAsBoolean();
			
			
			//storing values for pre-declare_usage_of_local
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_pduolv);
			inner_elements.add(description_pduolv);
			inner_elements.add(example_pduolv);
			inner_elements.add(found_pduolv);
			
			jsonMap.put("pre-declare\\_usage\\_of\\_local", inner_elements);
			
			JsonObject reentrancy_value = (JsonObject) bug_type.get("reentrancy");
			String dasp_rv = (String) reentrancy_value.get("dasp").getAsString();
			String description_rv = (String) reentrancy_value.get("description").getAsString();
			String example_rv = (String) reentrancy_value.get("example").getAsString();
			boolean found_rv = (boolean) reentrancy_value.get("found").getAsBoolean();
			
			//storing values for reentrancy
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_rv);
			inner_elements.add(description_rv);
			inner_elements.add(example_rv);
			inner_elements.add(found_rv);
			
			jsonMap.put("reentrancy", inner_elements);
			
			JsonObject do_while_continue_value = (JsonObject) bug_type.get("do_while_continue");
			String dasp_dwcv = (String) do_while_continue_value.get("dasp").getAsString();
			String description_dwcv = (String) do_while_continue_value.get("description").getAsString();
			String example_dwcv = (String) do_while_continue_value.get("example").getAsString();
			boolean found_dwcv = (boolean) do_while_continue_value.get("found").getAsBoolean();
			
			//storing values for do_while_continue
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_dwcv);
			inner_elements.add(description_dwcv);
			inner_elements.add(example_dwcv);
			inner_elements.add(found_dwcv);
			
			jsonMap.put("do\\_while\\_continue", inner_elements);
			
			JsonObject payable_func_using_delegatecall_in_loop_value = (JsonObject) bug_type.get("payable_func_using_delegatecall_in_loop");
			String dasp_pfudilv = (String) payable_func_using_delegatecall_in_loop_value.get("dasp").getAsString();
			String description_pfudilv = (String) payable_func_using_delegatecall_in_loop_value.get("description").getAsString();
			String example_pfudilv = (String) payable_func_using_delegatecall_in_loop_value.get("example").getAsString();
			boolean found_pfudilv = (boolean) payable_func_using_delegatecall_in_loop_value.get("found").getAsBoolean();
			
			//storing values for payable_func_using_delegatecall_in_loop
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_pfudilv);
			inner_elements.add(description_pfudilv);
			inner_elements.add(example_pfudilv);
			inner_elements.add(found_pfudilv);
			
			jsonMap.put("payable\\_func\\_using\\_delegatecall\\_in\\_loop", inner_elements);
			
			JsonObject right_to_left_char_value = (JsonObject) bug_type.get("right_to_left_char");
			String dasp_rtlcv = (String) right_to_left_char_value.get("dasp").getAsString();
			String description_rtlcv = (String) right_to_left_char_value.get("description").getAsString();
			String example_rtlcv = (String) right_to_left_char_value.get("example").getAsString();
			boolean found_rtlcv = (boolean) right_to_left_char_value.get("found").getAsBoolean();
			
			//storing values for right_to_left_char
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_rtlcv);
			inner_elements.add(description_rtlcv);
			inner_elements.add(example_rtlcv);
			inner_elements.add(found_rtlcv);
			
			jsonMap.put("right\\_to\\_left\\_char", inner_elements);
			
			JsonObject assert_state_change_value = (JsonObject) bug_type.get("assert_state_change");
			String dasp_ascv = (String) assert_state_change_value.get("dasp").getAsString();
			String description_ascv = (String) assert_state_change_value.get("description").getAsString();
			String example_ascv = (String) assert_state_change_value.get("example").getAsString();
			boolean found_ascv = (boolean) assert_state_change_value.get("found").getAsBoolean();
			
			//storing values for assert_state_change
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_ascv);
			inner_elements.add(description_ascv);
			inner_elements.add(example_ascv);
			inner_elements.add(found_ascv);
			
			jsonMap.put("assert\\_state\\_change", inner_elements);
			
			JsonObject locked_money_value = (JsonObject) bug_type.get("locked_money");
			String dasp_lmv = (String) locked_money_value.get("dasp").getAsString();
			String description_lmv = (String) locked_money_value.get("description").getAsString();
			String example_lmv = (String) locked_money_value.get("example").getAsString();
			boolean found_lmv = (boolean) locked_money_value.get("found").getAsBoolean();
			
			//storing values for locked_money
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_lmv);
			inner_elements.add(description_lmv);
			inner_elements.add(example_lmv);
			inner_elements.add(found_lmv);
			
			jsonMap.put("locked\\_money", inner_elements);
			
			JsonObject pausable_modifier_absence_value = (JsonObject) bug_type.get("pausable_modifier_absence");
			String dasp_pmav = (String) pausable_modifier_absence_value.get("dasp").getAsString();
			String description_pmav = (String) pausable_modifier_absence_value.get("description").getAsString();
			String example_pmav = (String) pausable_modifier_absence_value.get("example").getAsString();
			boolean found_pmav = (boolean) pausable_modifier_absence_value.get("found").getAsBoolean();
			
			//storing values for pausable_modifier_absence
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_pmav);
			inner_elements.add(description_pmav);
			inner_elements.add(example_pmav);
			inner_elements.add(found_pmav);
			
			jsonMap.put("pausable\\_modifier\\_absence", inner_elements);
			
			JsonObject extra_gas_in_loops_value = (JsonObject) bug_type.get("extra_gas_in_loops");
			String dasp_egilv = (String) extra_gas_in_loops_value.get("dasp").getAsString();
			String description_egilv = (String) extra_gas_in_loops_value.get("description").getAsString();
			String example_egilv = (String) extra_gas_in_loops_value.get("example").getAsString();
			boolean found_egilv = (boolean) extra_gas_in_loops_value.get("found").getAsBoolean();
			
			//storing values for extra_gas_in_loops
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_egilv);
			inner_elements.add(description_egilv);
			inner_elements.add(example_egilv);
			inner_elements.add(found_egilv);
			
			jsonMap.put("extra\\_gas\\_in\\_loops", inner_elements);
			
			JsonObject incorrect_ERC20_interface_value = (JsonObject) bug_type.get("incorrect_ERC20_interface");
			String dasp_ieiv2 = (String) incorrect_ERC20_interface_value.get("dasp").getAsString();
			String description_ieiv2 = (String) incorrect_ERC20_interface_value.get("description").getAsString();
			String example_ieiv2 = (String) incorrect_ERC20_interface_value.get("example").getAsString();
			boolean found_ieiv2 = (boolean) incorrect_ERC20_interface_value.get("found").getAsBoolean();
			
			//storing values for incorrect_ERC20_interface
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_ieiv2);
			inner_elements.add(description_ieiv2);
			inner_elements.add(example_ieiv2);
			inner_elements.add(found_ieiv2);
			
			jsonMap.put("incorrect\\_ERC20\\_interface", inner_elements);
			
			JsonObject denial_of_service_value = (JsonObject) bug_type.get("denial_of_service");
			String dasp_dosv = (String) denial_of_service_value.get("dasp").getAsString();
			String description_dosv = (String) denial_of_service_value.get("description").getAsString();
			String example_dosv = (String) denial_of_service_value.get("example").getAsString();
			boolean found_dosv = (boolean) denial_of_service_value.get("found").getAsBoolean();
			
			//storing values for denial_of_service
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_dosv);
			inner_elements.add(description_dosv);
			inner_elements.add(example_dosv);
			inner_elements.add(found_dosv);
			
			jsonMap.put("denial\\_of\\_service", inner_elements);
			
			JsonObject unused_function_should_be_external_value = (JsonObject) bug_type.get("unused_function_should_be_external");
			String dasp_ufsbev = (String) unused_function_should_be_external_value.get("dasp").getAsString();
			String description_ufsbev = (String) unused_function_should_be_external_value.get("description").getAsString();
			String example_ufsbev = (String) unused_function_should_be_external_value.get("example").getAsString();
			boolean found_ufsbev = (boolean) unused_function_should_be_external_value.get("found").getAsBoolean();
			

			//storing values for unused_function_should_be_external
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_ufsbev);
			inner_elements.add(description_ufsbev);
			inner_elements.add(example_ufsbev);
			inner_elements.add(found_ufsbev);
			
			jsonMap.put("unused\\_function\\_should\\_be\\_external", inner_elements);
			
			JsonObject unused_retval_value = (JsonObject) bug_type.get("unused_retval");
			String dasp_urv = (String) unused_retval_value.get("dasp").getAsString();
			String description_urv = (String) unused_retval_value.get("description").getAsString();
			String example_urv = (String) unused_retval_value.get("example").getAsString();
			boolean found_urv = (boolean) unused_retval_value.get("found").getAsBoolean();
			
			//storing values for unused_retval
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_urv);
			inner_elements.add(description_urv);
			inner_elements.add(example_urv);
			inner_elements.add(found_urv);
			
			jsonMap.put("unused\\_retval", inner_elements);
			
			JsonObject local_variable_shadowing_value = (JsonObject) bug_type.get("local_variable_shadowing");
			String dasp_lvsv = (String) local_variable_shadowing_value.get("dasp").getAsString();
			String description_lvsv = (String) local_variable_shadowing_value.get("description").getAsString();
			String example_lvsv = (String) local_variable_shadowing_value.get("example").getAsString();
			boolean found_lvsv = (boolean) local_variable_shadowing_value.get("found").getAsBoolean();
			
			//storing values for local_variable_shadowing
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_lvsv);
			inner_elements.add(description_lvsv);
			inner_elements.add(example_lvsv);
			inner_elements.add(found_lvsv);
			
			jsonMap.put("local\\_variable\\_shadowing", inner_elements);
			
			JsonObject reused_base_constructors_value = (JsonObject) bug_type.get("reused_base_constructors");
			String dasp_rbcv = (String) reused_base_constructors_value.get("dasp").getAsString();
			String description_rbcv = (String) reused_base_constructors_value.get("description").getAsString();
			String example_rbcv = (String) reused_base_constructors_value.get("example").getAsString();
			boolean found_rbcv = (boolean) reused_base_constructors_value.get("found").getAsBoolean();
			
			//storing values for reused_base_constructors
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_rbcv);
			inner_elements.add(description_rbcv);
			inner_elements.add(example_rbcv);
			inner_elements.add(found_rbcv);
			
			jsonMap.put("reused\\_base\\_constructors", inner_elements);
			
			
			JsonObject should_be_view_value = (JsonObject) bug_type.get("should_be_view");
			String dasp_sbvv = (String) should_be_view_value.get("dasp").getAsString();
			String description_sbvv = (String) should_be_view_value.get("description").getAsString();
			String example_sbvv = (String) should_be_view_value.get("example").getAsString();
			boolean found_sbvv = (boolean) should_be_view_value.get("found").getAsBoolean();
			
			
			//storing values for should_be_view
			inner_elements = new ArrayList<>();
			inner_elements.add(dasp_sbvv);
			inner_elements.add(description_sbvv);
			inner_elements.add(example_sbvv);
			inner_elements.add(found_sbvv);
			
			jsonMap.put("should\\_be\\_view", inner_elements);
			
			
			
			
			//System.out.print(jsonMap);
			
			  
		    
		     String latex = "\\documentclass{article} \r\n";
		        latex += "\\usepackage[utf8]{inputenc} \r\n";
		        latex += "\r\n";
		        latex += "\\title{Metasecurelabs analysis report}\r\n";
		        latex += "\\author{metasecurelabs.io }\r\n";
		        latex += "\\date{\\today} \r\n";
		        latex += "\r\n";
		        latex += "\\begin{document} \r\n";
		        latex += "\r\n";
		        latex += "\\maketitle \r\n";
		        latex += "\r\n";
		        latex += "\\section{Introduction} \r\n";
		       /* latex += "\\subsection{dangerous \_enum \_conversion} \r\n";
		        latex += "\\textbf{SWC \_ ID:} \r\n";
		        latex += "\r\n";
		        latex += "\\textbf{Description}: out-of-range enum conversion may occur(solc 0.4.5  \r\n";
		        latex += "\r\n";
		        latex += "\\textbf{Example:} \r\n";
		        latex += "\r\n";
		        latex += "\\emph {pragma solidity 0.4.2;} \r\n";
		        latex += "\r\n";
		        latex += " \\emph{ contract Test}{ \r\n";
		        latex += "\r\n";
		        latex += " \\emph{ enum E{a}} \r\n";
		        latex += "\r\n";
		        latex += " \\emph{ function bug(unit a) public returns (E)} { \r\n";
		        latex += "\r\n";
		        latex += "\\emph    {return E(a);} \r\n";
		        latex += "\r\n";
		        latex += "\\} \r\n";
		        latex += "\r\n";
		        latex += "\\} \r\n";
		        latex += "\r\n";
		        latex += "\textbf{DASP} : Unknown Unknowns \r\n";
		        latex += "\r\n";
		        latex += "\textbf{Found}: false \r\n";
		        latex += "\r\n";
		        latex += "\\end{document}";*/
			

			
			
		
			
			File myObj = new File("json_data.tex");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      
		      FileWriter myWriter = new FileWriter(myObj);
		      //myWriter.write(latex);
		      //myWriter.write(latex);)
		      
		      
		      
		  	for(String key : jsonMap.keySet())
			{
		  		/*myWriter.write("Key: "+key+"\n");
		  		myWriter.write("");*/
				List<Object> inner = new ArrayList<>();
				inner = jsonMap.get(key);
				
				 latex += "\\subsection{" + key + "} \r\n";
			        latex += "\\textbf{SWC \\textunderscore ID:} \r\n";
			        latex += "\r\n";
			        latex += "\\textbf{Description}:" + inner.get(1) + "\r\n";
			        latex += "\r\n";
			        latex += "\\textbf{Example:} \r\n";
			        latex += "\\begin{verbatim}";
			        latex += "\r\n";
			        latex += inner.get(2);
			        latex += "\r\n";
			        latex += "\\end{verbatim}";
			        latex += "\\} \r\n";
			        latex += "\r\n";
			        latex += "\\} \r\n";
			        latex += "\r\n";
			        latex += "\\textbf{DASP} : " + inner.get(0) + "\r\n";
			        latex += "\r\n";
			        latex += "\\textbf{Found}: " + inner.get(3) +  "\r\n";
			        latex += "\r\n";
			       
				
				
				
				
				
				/*myWriter.write("dasp: "+ inner.get(0)+"\n");
				myWriter.write("");
				myWriter.write("description: "+ inner.get(1)+"\n");
				myWriter.write("");
				myWriter.write("example: "+ inner.get(2)+"\n");
				myWriter.write("");
				myWriter.write("found: "+ inner.get(3)+"\n");
				myWriter.write("\n");
				myWriter.write("\n");*/
				
				
			}
		  	latex += "\\end{document}";
		  	myWriter.write(latex);
		  	System.out.println("Successfully wrote to the file.");
		    myWriter.close();
		   
		    
		  	//Scanner in = new Scanner(myObj);
		  	
		  	Reader fr = new FileReader(myObj);
		  	 File tex = new File("latex.tex");
		  	 FileWriter fw = new FileWriter(tex);
		    BufferedReader br = new BufferedReader(fr);

		     while(br.ready()) {
		    	 fw.write(br.readLine().replace("_", "\\textunderscore ") + "\n");
		     }
		     
		  
		  
		     fw.close();
		     br.close();
		     fr.close();

		     Reader fr2 = new FileReader(tex);
		     BufferedReader br2 = new BufferedReader(fr2);
		     File tex2 = new File("latex_rev.tex");
		 	 FileWriter fw2 = new FileWriter(tex2);
		     
		     while(br2.ready()) {
		    	 fw2.write(br2.readLine().replace("\\\\textunderscore", "\\textunderscore") + "\n");
		     }
		     
		     fw2.close();
		     br2.close();
		     fr2.close();
		     
		     Reader fr3 = new FileReader(tex2);
		     BufferedReader br3 = new BufferedReader(fr3);
		     File tex3 = new File("latex_rev2.tex");
		 	 FileWriter fw3 = new FileWriter(tex3);
		     
		     while(br3.ready()) {
		    	 fw3.write(br3.readLine().replace("^", "\\textsuperscript") + "\n");
		     }
		     
		     fw3.close();
		     br3.close();
		     fr3.close();
		     
		     Reader fr4 = new FileReader(tex3);
		     BufferedReader br4 = new BufferedReader(fr4);
		     File tex4 = new File("latex_rev3.tex");
		 	 FileWriter fw4 = new FileWriter(tex4);
		     
		     while(br4.ready()) {
		    	 fw4.write(br4.readLine().replace("-", "\\textendash ") + "\n");
		     }
		     
		     fw4.close();
		     br4.close();
		     fr4.close();
		     
		     Reader fr5 = new FileReader(tex4);
		     BufferedReader br5 = new BufferedReader(fr5);
		     File tex5 = new File("latex_rev4.tex");
		 	 FileWriter fw5 = new FileWriter(tex5);
		     
		     while(br5.ready()) {
		    	 fw5.write(br5.readLine().replace("&", "\\& ") + "\n");
		     }
		     
		     fw5.close();
		     br5.close();
		     fr5.close();


			
			
			
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
