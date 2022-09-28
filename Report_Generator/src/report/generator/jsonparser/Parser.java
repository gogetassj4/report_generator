package report.generator.jsonparser;

import java.io.*;
import java.util.*;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Parser {
		
	public static void main(String[] args) {
		try {
			JsonObject jsonObject = JsonParser.parseReader(new FileReader("C:\\Users\\jyoth\\Documents\\SE_Project\\report_generator\\Report_Generator\\src\\report\\generator\\jsonparser\\elements.json"))
					.getAsJsonObject();
			
			HashMap<String, Object> jsonMap = new HashMap<>();
			
			JsonObject data = (JsonObject) jsonObject.get("data");
			JsonObject item = (JsonObject) data.get("item");
			JsonObject bug_type = (JsonObject) item.get("bug_type");
			
			JsonObject dangerous_enum_conversion_value = (JsonObject) bug_type.get("dangerous_enum_conversion");
			JsonObject constant_state_variable_value = (JsonObject) bug_type.get("constant_state_variable");
			JsonObject arbitrary_from_in_transferFrom_value = (JsonObject) bug_type.get("arbitrary_from_in_transferFrom");
			JsonObject del_structure_containing_mapping_value = (JsonObject) bug_type.get("del_structure_containing_mapping");
			JsonObject erc20_event_not_indexed_value = (JsonObject) bug_type.get("erc20_event_not_indexed");
			JsonObject use_after_delete_value = (JsonObject) bug_type.get("use_after_delete");
			JsonObject call_without_data_value = (JsonObject) bug_type.get("call_without_data");
			JsonObject visibility_value = (JsonObject) bug_type.get("visibility");
			JsonObject incorrect_shift_in_assembly_value = (JsonObject) bug_type.get("incorrect_shift_in_assembly");
			JsonObject short_addresses_value = (JsonObject) bug_type.get("short_addresses");
			JsonObject incorrect_modifier_value = (JsonObject) bug_type.get("incorrect_modifier");
			JsonObject wrong_signature_value = (JsonObject) bug_type.get("wrong_signature");
			JsonObject function_declared_return_but_no_return_value = (JsonObject) bug_type.get("function_declared_return_but_no_return");
			JsonObject storage_ABIEncoderV2_array_value = (JsonObject) bug_type.get("storage_ABIEncoderV2_array");
			JsonObject deprecated_standards_value = (JsonObject) bug_type.get("deprecated_standards");
			JsonObject unused_state_variables_value = (JsonObject) bug_type.get("unused_state_variables");
			JsonObject ignore_value = (JsonObject) bug_type.get("ignore");
			JsonObject array_length_manipulation_value = (JsonObject) bug_type.get("array_length_manipulation");
			JsonObject storage_signed_integer_array_value = (JsonObject) bug_type.get("storage_signed_integer_array");
			JsonObject dead_code_value = (JsonObject) bug_type.get("dead_code");
			JsonObject multiple_constructor_schemes_value = (JsonObject) bug_type.get("multiple_constructor_schemes");
			JsonObject unchecked_calls_value = (JsonObject) bug_type.get("unchecked_calls");
			JsonObject uninitialized_func_pointer_value = (JsonObject) bug_type.get("uninitialized_func_pointer");
			JsonObject incorrect_using_balance_and_msg_value = (JsonObject) bug_type.get("incorrect_using_balance_and_msg.value");
			JsonObject blockhash_current_value = (JsonObject) bug_type.get("blockhash_current");
			JsonObject strict_balance_equality_value = (JsonObject) bug_type.get("strict_balance_equality");
			JsonObject redundant_code_value = (JsonObject) bug_type.get("redundant_code");
			JsonObject uninitialized_state_variable_value = (JsonObject) bug_type.get("uninitialized_state_variable");
			JsonObject using_send_value = (JsonObject) bug_type.get("using_send");
			JsonObject costly_ops_in_loop_value = (JsonObject) bug_type.get("costly_ops_in_loop");
			JsonObject byte_array_instead_bytes_value = (JsonObject) bug_type.get("byte_array_instead_bytes");
			JsonObject func_modifying_storage_array_by_value = (JsonObject) bug_type.get("func_modifying_storage_array_by_value");
			JsonObject divide_before_multiply_value = (JsonObject) bug_type.get("divide_before_multiply");
			JsonObject builtin_symbol_shadowing_value = (JsonObject) bug_type.get("builtin_symbol_shadowing");
			JsonObject modifier_like_Sol_keyword_value = (JsonObject) bug_type.get("modifier_like_Sol_keyword");
			JsonObject msg_value_equals_zero = (JsonObject) bug_type.get("msg.value_equals_zero");
			JsonObject uninitialized_local_variable_value = (JsonObject) bug_type.get("uninitialized_local_variable");
			JsonObject race_condition_value = (JsonObject) bug_type.get("race_condition");
			JsonObject state_variable_shadowing_value = (JsonObject) bug_type.get("state_variable_shadowing");
			JsonObject useless_compare_value = (JsonObject) bug_type.get("useless_compare");
			JsonObject arithmetic_value = (JsonObject) bug_type.get("arithmetic");
			JsonObject access_control_value = (JsonObject) bug_type.get("access_control");
			JsonObject uninitialized_storage_pointer_value = (JsonObject) bug_type.get("uninitialized_storage_pointer");
			JsonObject address_hardcoded_value = (JsonObject) bug_type.get("address_hardcoded");
			JsonObject benign_reentrancy_value = (JsonObject) bug_type.get("benign_reentrancy");
			JsonObject incorrect_ERC721_interface_value = (JsonObject) bug_type.get("incorrect_ERC721_interface");
			JsonObject msg_value_in_loop = (JsonObject) bug_type.get("msg.value_in_loop");
			JsonObject time_manipulation_value = (JsonObject) bug_type.get("time_manipulation");
			JsonObject overpowered_role_value = (JsonObject) bug_type.get("overpowered_role");
			JsonObject should_be_pure_value = (JsonObject) bug_type.get("should_be_pure");
			JsonObject controlled_lowlevel_call_value = (JsonObject) bug_type.get("controlled_lowlevel_call");
			JsonObject pre_declare_usage_of_local_value = (JsonObject) bug_type.get("pre-declare_usage_of_local");
			JsonObject reentrancy_value = (JsonObject) bug_type.get("reentrancy");
			JsonObject do_while_continue_value = (JsonObject) bug_type.get("do_while_continue");
			JsonObject payable_func_using_delegatecall_in_loop_value = (JsonObject) bug_type.get("payable_func_using_delegatecall_in_loop");
			JsonObject right_to_left_char_value = (JsonObject) bug_type.get("right_to_left_char");
			JsonObject assert_state_change_value = (JsonObject) bug_type.get("assert_state_change");
			JsonObject locked_money_value = (JsonObject) bug_type.get("locked_money");
			JsonObject pausable_modifier_absence_value = (JsonObject) bug_type.get("pausable_modifier_absence");
			JsonObject extra_gas_in_loops_value = (JsonObject) bug_type.get("extra_gas_in_loops");
			JsonObject incorrect_ERC20_interface_value = (JsonObject) bug_type.get("incorrect_ERC20_interface");
			JsonObject denial_of_service_value = (JsonObject) bug_type.get("denial_of_service");
			JsonObject unused_function_should_be_external_value = (JsonObject) bug_type.get("unused_function_should_be_external");
			JsonObject unused_retval_value = (JsonObject) bug_type.get("unused_retval");
			JsonObject local_variable_shadowing_value = (JsonObject) bug_type.get("local_variable_shadowing");
			JsonObject reused_base_constructors_value = (JsonObject) bug_type.get("reused_base_constructors");
			JsonObject should_be_view_value = (JsonObject) bug_type.get("should_be_view");
			
			
			
			
			jsonMap.put("dangerous_enum_conversion", dangerous_enum_conversion_value);
			jsonMap.put("constant_state_variable", constant_state_variable_value);
			jsonMap.put("arbitrary_from_in_transferFrom", arbitrary_from_in_transferFrom_value);
			jsonMap.put("del_structure_containing_mapping", del_structure_containing_mapping_value);
			jsonMap.put("erc20_event_not_indexed", erc20_event_not_indexed_value);
			jsonMap.put("use_after_delete", use_after_delete_value);
			jsonMap.put("call_without_data", call_without_data_value);
			jsonMap.put("visibility", visibility_value);
			jsonMap.put("incorrect_shift_in_assembly", incorrect_shift_in_assembly_value);
			jsonMap.put("short_addresses", short_addresses_value);
			jsonMap.put("incorrect_modifier", incorrect_modifier_value);
			jsonMap.put("wrong_signature", wrong_signature_value);
			jsonMap.put("function_declared_return_but_no_return", function_declared_return_but_no_return_value);
			jsonMap.put("storage_ABIEncoderV2_array", storage_ABIEncoderV2_array_value);
			jsonMap.put("deprecated_standards", deprecated_standards_value);
			jsonMap.put("unused_state_variables", unused_state_variables_value);
			jsonMap.put("ignore", ignore_value);
			jsonMap.put("array_length_manipulation", array_length_manipulation_value);
			jsonMap.put("storage_signed_integer_array", storage_signed_integer_array_value);
			jsonMap.put("dead_code", dead_code_value);
			jsonMap.put("multiple_constructor_schemes", multiple_constructor_schemes_value);
			jsonMap.put("unchecked_calls", unchecked_calls_value);
			jsonMap.put("uninitialized_func_pointer_value", uninitialized_func_pointer_value);
			jsonMap.put("incorrect_using_balance_and_msg.value", incorrect_using_balance_and_msg_value);
			jsonMap.put("blockhash_current", blockhash_current_value);
			jsonMap.put("strict_balance_equality", strict_balance_equality_value);
			jsonMap.put("redundant_code", redundant_code_value);
			jsonMap.put("uninitialized_state_variable", uninitialized_state_variable_value);
			jsonMap.put("using_send", using_send_value);
			jsonMap.put("costly_ops_in_loop", costly_ops_in_loop_value);
			jsonMap.put("byte_array_instead_bytes", byte_array_instead_bytes_value);
			jsonMap.put("func_modifying_storage_array_by_value", func_modifying_storage_array_by_value);
			jsonMap.put("divide_before_multiply", divide_before_multiply_value);
			jsonMap.put("builtin_symbol_shadowing", builtin_symbol_shadowing_value);
			jsonMap.put("modifier_like_Sol_keyword", modifier_like_Sol_keyword_value);
			jsonMap.put("msg.value_equals_zero", msg_value_equals_zero);
			jsonMap.put("uninitialized_local_variable", uninitialized_local_variable_value);
			jsonMap.put("race_condition", race_condition_value);
			jsonMap.put("state_variable_shadowing", state_variable_shadowing_value);
			jsonMap.put("useless_compare", useless_compare_value);
			jsonMap.put("arithmetic", arithmetic_value);
			jsonMap.put("access_control", access_control_value);
			jsonMap.put("uninitialized_storage_pointer", uninitialized_storage_pointer_value);
			jsonMap.put("address_hardcoded", address_hardcoded_value);
			jsonMap.put("benign_reentrancy", benign_reentrancy_value);
			jsonMap.put("incorrect_ERC721_interface", incorrect_ERC721_interface_value);
			jsonMap.put("msg.value_in_loop", msg_value_in_loop);
			jsonMap.put("time_manipulation", time_manipulation_value);
			jsonMap.put("overpowered_role", overpowered_role_value);
			jsonMap.put("should_be_pure", should_be_pure_value);
			jsonMap.put("controlled_lowlevel_call", controlled_lowlevel_call_value);
			jsonMap.put("pre-declare_usage_of_local_value", pre_declare_usage_of_local_value);
			jsonMap.put("reentrancy", reentrancy_value);
			jsonMap.put("do_while_continue", do_while_continue_value);
			jsonMap.put("payable_func_using_delegatecall_in_loop", payable_func_using_delegatecall_in_loop_value);
			jsonMap.put("right_to_left_char", right_to_left_char_value);
			jsonMap.put("assert_state_change", assert_state_change_value);
			jsonMap.put("locked_money", locked_money_value);
			jsonMap.put("pausable_modifier_absence", pausable_modifier_absence_value);
			jsonMap.put("extra_gas_in_loops", extra_gas_in_loops_value);
			jsonMap.put("incorrect_ERC20_interface", incorrect_ERC20_interface_value);
			jsonMap.put("denial_of_service", denial_of_service_value);
			jsonMap.put("unused_function_should_be_external", unused_function_should_be_external_value);
			jsonMap.put("unused_retval", unused_retval_value);
			jsonMap.put("local_variable_shadowing", local_variable_shadowing_value);
			jsonMap.put("reused_base_constructors", reused_base_constructors_value);
			jsonMap.put("should_be_view", should_be_view_value);
			
			
			
			System.out.print(jsonMap);
			
			
			
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
