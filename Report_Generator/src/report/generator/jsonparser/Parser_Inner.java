package report.generator.jsonparser;

import java.io.*;
import java.util.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Parser_Inner {
		
	public static void main(String[] args) throws InterruptedException {
		try {
			
			//Reading json file
			JsonObject jsonObject = JsonParser.parseReader(new FileReader("C:\\Users\\jyoth\\Documents\\SE_Project\\report_generator\\Report_Generator\\src\\report\\generator\\jsonparser\\elements.json"))
					.getAsJsonObject();
			
			//Initializing list to store values associated with a single key.
			List<Object> inner_elements = null;
			
			//Initializing map to map values associated with a single key.
			HashMap<String, List<Object>> jsonMap = new HashMap<>();
			
			String str = "";
			boolean bool = false;
			JsonArray array = null;
			
			
			JsonObject data = (JsonObject) jsonObject.get("data");
			JsonObject item = (JsonObject) data.get("item");
			JsonObject bug_type = (JsonObject) item.get("bug_type");
			
			
			//storing values for dangerous_enum_conversion_value
			JsonObject dangerous_enum_conversion_value= (JsonObject) bug_type.get("dangerous_enum_conversion");

			inner_elements = new ArrayList<>();

			for(String key : dangerous_enum_conversion_value.keySet()) {
				if(dangerous_enum_conversion_value.get(key).isJsonPrimitive()) {
					if(dangerous_enum_conversion_value.get(key).getAsJsonPrimitive().isString()) {
						str = dangerous_enum_conversion_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = dangerous_enum_conversion_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = dangerous_enum_conversion_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("dangerous{\\_}enum{\\_}conversion", inner_elements);
			

			//storing values for constant_state_variable_value
			JsonObject constant_state_variable_value = (JsonObject) bug_type.get("constant_state_variable");
			
			inner_elements = new ArrayList<>();

			for(String key : constant_state_variable_value.keySet()) {
				if(constant_state_variable_value.get(key).isJsonPrimitive()) {
					if(constant_state_variable_value.get(key).getAsJsonPrimitive().isString()) {
						str = constant_state_variable_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = constant_state_variable_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = constant_state_variable_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("constant{\\_}state{\\_}variable", inner_elements);
			
			
			
			//storing values for arbitrary_from_in_transferFrom
			JsonObject arbitrary_from_in_transferFrom_value = (JsonObject) bug_type.get("arbitrary_from_in_transferFrom");
			
			inner_elements = new ArrayList<>();

			for(String key : arbitrary_from_in_transferFrom_value.keySet()) {
				if(arbitrary_from_in_transferFrom_value.get(key).isJsonPrimitive()) {
					if(arbitrary_from_in_transferFrom_value.get(key).getAsJsonPrimitive().isString()) {
						str = arbitrary_from_in_transferFrom_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = arbitrary_from_in_transferFrom_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = arbitrary_from_in_transferFrom_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("arbitrary{\\_}from{\\_}in{\\_}transferFrom", inner_elements);
			
			
			
			//storing values for del_structure_containing_mapping
			JsonObject del_structure_containing_mapping_value = (JsonObject) bug_type.get("del_structure_containing_mapping");
			
			inner_elements = new ArrayList<>();

			for(String key : del_structure_containing_mapping_value.keySet()) {
				if(del_structure_containing_mapping_value.get(key).isJsonPrimitive()) {
					if(del_structure_containing_mapping_value.get(key).getAsJsonPrimitive().isString()) {
						str = del_structure_containing_mapping_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = del_structure_containing_mapping_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = del_structure_containing_mapping_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			
			jsonMap.put("del{\\_}structure{\\_}containing{\\_}mapping", inner_elements);
			
			
			//storing values for erc20_event_not_indexed
			JsonObject erc20_event_not_indexed_value = (JsonObject) bug_type.get("erc20_event_not_indexed");
			
			inner_elements = new ArrayList<>();
			
			for(String key : erc20_event_not_indexed_value.keySet()) {
				if(erc20_event_not_indexed_value.get(key).isJsonPrimitive()) {
					if(erc20_event_not_indexed_value.get(key).getAsJsonPrimitive().isString()) {
						str = erc20_event_not_indexed_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = erc20_event_not_indexed_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = erc20_event_not_indexed_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			
			jsonMap.put("erc20{\\_}event{\\_}not{\\_}indexed", inner_elements);
			
			
			//storing values for use_after_delete
			JsonObject use_after_delete_value = (JsonObject) bug_type.get("use_after_delete");
			
			inner_elements = new ArrayList<>();
			
			for(String key : use_after_delete_value.keySet()) {
				if(use_after_delete_value.get(key).isJsonPrimitive()) {
					if(use_after_delete_value.get(key).getAsJsonPrimitive().isString()) {
						str = use_after_delete_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = use_after_delete_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = use_after_delete_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			
			jsonMap.put("use{\\_}after{\\_}delete", inner_elements);
			
			
			//storing values for call_without_data
			JsonObject call_without_data_value = (JsonObject) bug_type.get("call_without_data");
			
			inner_elements = new ArrayList<>();
			
			for(String key : call_without_data_value.keySet()) {
				if(call_without_data_value.get(key).isJsonPrimitive()) {
					if(call_without_data_value.get(key).getAsJsonPrimitive().isString()) {
						str = call_without_data_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = call_without_data_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = call_without_data_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			
			jsonMap.put("call{\\_}without{\\_}data", inner_elements);
			
			
			//storing values for visibility
			JsonObject visibility_value = (JsonObject) bug_type.get("visibility");
			
			inner_elements = new ArrayList<>();
			
			for(String key : visibility_value.keySet()) {
				if(visibility_value.get(key).isJsonPrimitive()) {
					if(visibility_value.get(key).getAsJsonPrimitive().isString()) {
						str = visibility_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = visibility_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = visibility_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			
			jsonMap.put("visibility", inner_elements);
			
			
			JsonObject incorrect_shift_in_assembly_value = (JsonObject) bug_type.get("incorrect_shift_in_assembly");
			
			//storing values for incorrect_shift_in_assembly
			inner_elements = new ArrayList<>();
			
			for(String key : incorrect_shift_in_assembly_value.keySet()) {
				if(incorrect_shift_in_assembly_value.get(key).isJsonPrimitive()) {
					if(incorrect_shift_in_assembly_value.get(key).getAsJsonPrimitive().isString()) {
						str = incorrect_shift_in_assembly_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = incorrect_shift_in_assembly_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = incorrect_shift_in_assembly_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			
			jsonMap.put("incorrect{\\_}shift{\\_}in{\\_}assembly", inner_elements);
			
			
			//storing values for short_addresses
			JsonObject short_addresses_value = (JsonObject) bug_type.get("short_addresses");

			inner_elements = new ArrayList<>();
			
			for(String key : short_addresses_value.keySet()) {
				if(short_addresses_value.get(key).isJsonPrimitive()) {
					if(short_addresses_value.get(key).getAsJsonPrimitive().isString()) {
						str = short_addresses_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = short_addresses_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = short_addresses_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("short{\\_}addresses", inner_elements);
			
			
			//storing values for incorrect_modifier
			JsonObject incorrect_modifier_value = (JsonObject) bug_type.get("incorrect_modifier");
			
			inner_elements = new ArrayList<>();
			
			for(String key : incorrect_modifier_value.keySet()) {
				if(incorrect_modifier_value.get(key).isJsonPrimitive()) {
					if(incorrect_modifier_value.get(key).getAsJsonPrimitive().isString()) {
						str = incorrect_modifier_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = incorrect_modifier_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = incorrect_modifier_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("incorrect{\\_}modifier", inner_elements);
			
			
			//storing values for wrong_signature
			JsonObject wrong_signature_value = (JsonObject) bug_type.get("wrong_signature");
			
			inner_elements = new ArrayList<>();
			
			for(String key : wrong_signature_value.keySet()) {
				if(wrong_signature_value.get(key).isJsonPrimitive()) {
					if(wrong_signature_value.get(key).getAsJsonPrimitive().isString()) {
						str = wrong_signature_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = wrong_signature_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = wrong_signature_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("wrong{\\_}signature", inner_elements);
			
			
			//storing values for function_declared_return_but_no_return
			JsonObject function_declared_return_but_no_return_value = (JsonObject) bug_type.get("function_declared_return_but_no_return");
			
			inner_elements = new ArrayList<>();
			
			for(String key : function_declared_return_but_no_return_value.keySet()) {
				if(function_declared_return_but_no_return_value.get(key).isJsonPrimitive()) {
					if(function_declared_return_but_no_return_value.get(key).getAsJsonPrimitive().isString()) {
						str = function_declared_return_but_no_return_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = function_declared_return_but_no_return_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = function_declared_return_but_no_return_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("function{\\_}declared{\\_}return{\\_}but{\\_}no{\\_}return", inner_elements);
			
			
			//storing values for storage_ABIEncoderV2_array
			JsonObject storage_ABIEncoderV2_array_value = (JsonObject) bug_type.get("storage_ABIEncoderV2_array");
			
			inner_elements = new ArrayList<>();
			
			for(String key : storage_ABIEncoderV2_array_value.keySet()) {
				if(storage_ABIEncoderV2_array_value.get(key).isJsonPrimitive()) {
					if(storage_ABIEncoderV2_array_value.get(key).getAsJsonPrimitive().isString()) {
						str = storage_ABIEncoderV2_array_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = storage_ABIEncoderV2_array_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = storage_ABIEncoderV2_array_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("storage{\\_}ABIEncoderV2{\\_}array", inner_elements);
			
			
			//storing values for deprecated_standards
			JsonObject deprecated_standards_value = (JsonObject) bug_type.get("deprecated_standards");
			
			inner_elements = new ArrayList<>();
			
			for(String key : deprecated_standards_value.keySet()) {
				if(deprecated_standards_value.get(key).isJsonPrimitive()) {
					if(deprecated_standards_value.get(key).getAsJsonPrimitive().isString()) {
						str = deprecated_standards_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = deprecated_standards_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = deprecated_standards_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("deprecated{\\_}standards", inner_elements);
			
			
			//storing values for unused_state_variables
			JsonObject unused_state_variables_value = (JsonObject) bug_type.get("unused_state_variables");
			
			inner_elements = new ArrayList<>();
			
			for(String key : unused_state_variables_value.keySet()) {
				if(unused_state_variables_value.get(key).isJsonPrimitive()) {
					if(unused_state_variables_value.get(key).getAsJsonPrimitive().isString()) {
						str = unused_state_variables_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = unused_state_variables_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = unused_state_variables_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("unused{\\_}state{\\_}variables", inner_elements);
			
			
			//storing values for ignore
			JsonObject ignore_value = (JsonObject) bug_type.get("ignore");
			
			inner_elements = new ArrayList<>();
			
			for(String key : ignore_value.keySet()) {
				if(ignore_value.get(key).isJsonPrimitive()) {
					if(ignore_value.get(key).getAsJsonPrimitive().isString()) {
						str = ignore_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = ignore_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = ignore_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("ignore", inner_elements);
			
			
			//storing values for array_length_manipulation
			JsonObject array_length_manipulation_value = (JsonObject) bug_type.get("array_length_manipulation");
			
			inner_elements = new ArrayList<>();
			
			for(String key : array_length_manipulation_value.keySet()) {
				if(array_length_manipulation_value.get(key).isJsonPrimitive()) {
					if(array_length_manipulation_value.get(key).getAsJsonPrimitive().isString()) {
						str = array_length_manipulation_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = array_length_manipulation_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = array_length_manipulation_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("array{\\_}length{\\_}manipulation", inner_elements);
			
			
			//storing values for storage_signed_integer_array
			JsonObject storage_signed_integer_array_value = (JsonObject) bug_type.get("storage_signed_integer_array");
			
			inner_elements = new ArrayList<>();
			
			for(String key : storage_signed_integer_array_value.keySet()) {
				if(storage_signed_integer_array_value.get(key).isJsonPrimitive()) {
					if(storage_signed_integer_array_value.get(key).getAsJsonPrimitive().isString()) {
						str = storage_signed_integer_array_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = storage_signed_integer_array_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = storage_signed_integer_array_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("storage{\\_}signed{\\_}integer{\\_}array", inner_elements);
			
			
			//storing values for dead_code
			JsonObject dead_code_value = (JsonObject) bug_type.get("dead_code");
			
			inner_elements = new ArrayList<>();
			
			for(String key : dead_code_value.keySet()) {
				if(dead_code_value.get(key).isJsonPrimitive()) {
					if(dead_code_value.get(key).getAsJsonPrimitive().isString()) {
						str = dead_code_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = dead_code_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = dead_code_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("dead{\\_}code", inner_elements);
			
			
			//storing values for multiple_constructor_schemes
			JsonObject multiple_constructor_schemes_value = (JsonObject) bug_type.get("multiple_constructor_schemes");
			
			inner_elements = new ArrayList<>();
			
			for(String key : multiple_constructor_schemes_value.keySet()) {
				if(multiple_constructor_schemes_value.get(key).isJsonPrimitive()) {
					if(multiple_constructor_schemes_value.get(key).getAsJsonPrimitive().isString()) {
						str = multiple_constructor_schemes_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = multiple_constructor_schemes_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = multiple_constructor_schemes_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("multiple{\\_}constructor{\\_}schemes", inner_elements);
			
			
			//storing values for unchecked_calls
			JsonObject unchecked_calls_value = (JsonObject) bug_type.get("unchecked_calls");
			
			inner_elements = new ArrayList<>();
			
			for(String key : unchecked_calls_value.keySet()) {
				if(unchecked_calls_value.get(key).isJsonPrimitive()) {
					if(unchecked_calls_value.get(key).getAsJsonPrimitive().isString()) {
						str = unchecked_calls_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = unchecked_calls_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = unchecked_calls_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("unchecked{\\_}calls", inner_elements);
			
			
			//storing values for uninitialized_func_pointer
			JsonObject uninitialized_func_pointer_value = (JsonObject) bug_type.get("uninitialized_func_pointer");
			
			inner_elements = new ArrayList<>();
			
			for(String key : uninitialized_func_pointer_value.keySet()) {
				if(uninitialized_func_pointer_value.get(key).isJsonPrimitive()) {
					if(uninitialized_func_pointer_value.get(key).getAsJsonPrimitive().isString()) {
						str = uninitialized_func_pointer_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = uninitialized_func_pointer_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = uninitialized_func_pointer_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("uninitialized{\\_}func{\\_}pointer", inner_elements);
			
			
			//storing values for incorrect_using_balance_and_msg.value
			JsonObject incorrect_using_balance_and_msg_value = (JsonObject) bug_type.get("incorrect_using_balance_and_msg.value");
			
			inner_elements = new ArrayList<>();
			
			for(String key : incorrect_using_balance_and_msg_value.keySet()) {
				if(incorrect_using_balance_and_msg_value.get(key).isJsonPrimitive()) {
					if(incorrect_using_balance_and_msg_value.get(key).getAsJsonPrimitive().isString()) {
						str = incorrect_using_balance_and_msg_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = incorrect_using_balance_and_msg_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = incorrect_using_balance_and_msg_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("incorrect{\\_}using{\\_}balance{\\_}and{\\_}msg{\\_}value", inner_elements);
			
			
			//storing values for blockhash_current
			JsonObject blockhash_current_value = (JsonObject) bug_type.get("blockhash_current");
			
			inner_elements = new ArrayList<>();
			
			for(String key : blockhash_current_value.keySet()) {
				if(blockhash_current_value.get(key).isJsonPrimitive()) {
					if(blockhash_current_value.get(key).getAsJsonPrimitive().isString()) {
						str = blockhash_current_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = blockhash_current_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = blockhash_current_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("blockhash{\\_}current", inner_elements);
			
			
			//storing values for strict_balance_equality
			JsonObject strict_balance_equality_value = (JsonObject) bug_type.get("strict_balance_equality");
			
			inner_elements = new ArrayList<>();
			
			for(String key : strict_balance_equality_value.keySet()) {
				if(strict_balance_equality_value.get(key).isJsonPrimitive()) {
					if(strict_balance_equality_value.get(key).getAsJsonPrimitive().isString()) {
						str = strict_balance_equality_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = strict_balance_equality_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = strict_balance_equality_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("strict{\\_}balance{\\_}equality", inner_elements);
			
			
			//storing values for redundant_code
			JsonObject redundant_code_value = (JsonObject) bug_type.get("redundant_code");
			
			inner_elements = new ArrayList<>();
			
			for(String key : redundant_code_value.keySet()) {
				if(redundant_code_value.get(key).isJsonPrimitive()) {
					if(redundant_code_value.get(key).getAsJsonPrimitive().isString()) {
						str = redundant_code_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = redundant_code_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = redundant_code_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("redundant{\\_}code", inner_elements);
			
			
			//storing values for uninitialized_state_variable
			JsonObject uninitialized_state_variable_value = (JsonObject) bug_type.get("uninitialized_state_variable");
			
			inner_elements = new ArrayList<>();
			
			for(String key : uninitialized_state_variable_value.keySet()) {
				if(uninitialized_state_variable_value.get(key).isJsonPrimitive()) {
					if(uninitialized_state_variable_value.get(key).getAsJsonPrimitive().isString()) {
						str = uninitialized_state_variable_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = uninitialized_state_variable_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = uninitialized_state_variable_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("uninitialized{\\_}state{\\_}variable", inner_elements);
			
			
			//storing values for using_send
			JsonObject using_send_value = (JsonObject) bug_type.get("using_send");
			
			inner_elements = new ArrayList<>();
			
			for(String key : using_send_value.keySet()) {
				if(using_send_value.get(key).isJsonPrimitive()) {
					if(using_send_value.get(key).getAsJsonPrimitive().isString()) {
						str = using_send_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = using_send_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = using_send_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("using{\\_}send", inner_elements);
			
			
			//storing values for costly_ops_in_loop
			JsonObject costly_ops_in_loop_value = (JsonObject) bug_type.get("costly_ops_in_loop");
			
			inner_elements = new ArrayList<>();
			
			for(String key : costly_ops_in_loop_value.keySet()) {
				if(costly_ops_in_loop_value.get(key).isJsonPrimitive()) {
					if(costly_ops_in_loop_value.get(key).getAsJsonPrimitive().isString()) {
						str = costly_ops_in_loop_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = costly_ops_in_loop_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = costly_ops_in_loop_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("costly{\\_}ops{\\_}in{\\_}loop", inner_elements);
			
			
			//storing values for byte_array_instead_bytes
			JsonObject byte_array_instead_bytes_value = (JsonObject) bug_type.get("byte_array_instead_bytes");
			
			inner_elements = new ArrayList<>();
			
			for(String key : byte_array_instead_bytes_value.keySet()) {
				if(byte_array_instead_bytes_value.get(key).isJsonPrimitive()) {
					if(byte_array_instead_bytes_value.get(key).getAsJsonPrimitive().isString()) {
						str = byte_array_instead_bytes_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = byte_array_instead_bytes_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = byte_array_instead_bytes_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("byte{\\_}array{\\_}instead{\\_}bytes", inner_elements);
			
			
			//storing values for func_modifying_storage_array_by_value
			JsonObject func_modifying_storage_array_by_value = (JsonObject) bug_type.get("func_modifying_storage_array_by_value");
			
			inner_elements = new ArrayList<>();
			
			for(String key : func_modifying_storage_array_by_value.keySet()) {
				if(func_modifying_storage_array_by_value.get(key).isJsonPrimitive()) {
					if(func_modifying_storage_array_by_value.get(key).getAsJsonPrimitive().isString()) {
						str = func_modifying_storage_array_by_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = func_modifying_storage_array_by_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = func_modifying_storage_array_by_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("func{\\_}modifying{\\_}storage{\\_}array{\\_}by{\\_}value", inner_elements);
			
			
			//storing values for divide_before_multiply
			JsonObject divide_before_multiply_value = (JsonObject) bug_type.get("divide_before_multiply");
			
			inner_elements = new ArrayList<>();
			
			for(String key : divide_before_multiply_value.keySet()) {
				if(divide_before_multiply_value.get(key).isJsonPrimitive()) {
					if(divide_before_multiply_value.get(key).getAsJsonPrimitive().isString()) {
						str = divide_before_multiply_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = divide_before_multiply_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = divide_before_multiply_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("divide{\\_}before{\\_}multiply", inner_elements);
			
			
			//storing values for builtin_symbol_shadowing
			JsonObject builtin_symbol_shadowing_value = (JsonObject) bug_type.get("builtin_symbol_shadowing");
			
			inner_elements = new ArrayList<>();
			
			for(String key : builtin_symbol_shadowing_value.keySet()) {
				if(builtin_symbol_shadowing_value.get(key).isJsonPrimitive()) {
					if(builtin_symbol_shadowing_value.get(key).getAsJsonPrimitive().isString()) {
						str = builtin_symbol_shadowing_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = builtin_symbol_shadowing_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = builtin_symbol_shadowing_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("builtin{\\_}symbol{\\_}shadowing", inner_elements);
			
			
			//storing values for modifier_like_Sol_keyword
			JsonObject modifier_like_Sol_keyword_value = (JsonObject) bug_type.get("modifier_like_Sol_keyword");
			
			inner_elements = new ArrayList<>();
			
			for(String key : modifier_like_Sol_keyword_value.keySet()) {
				if(modifier_like_Sol_keyword_value.get(key).isJsonPrimitive()) {
					if(modifier_like_Sol_keyword_value.get(key).getAsJsonPrimitive().isString()) {
						str = modifier_like_Sol_keyword_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = modifier_like_Sol_keyword_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = modifier_like_Sol_keyword_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("modifier{\\_}like{\\_}Sol{\\_}keyword", inner_elements);
			
			
			//storing values for msg.value_equals_zero
			JsonObject msg_value_equals_zero = (JsonObject) bug_type.get("msg.value_equals_zero");
			
			inner_elements = new ArrayList<>();
			
			for(String key : msg_value_equals_zero.keySet()) {
				if(msg_value_equals_zero.get(key).isJsonPrimitive()) {
					if(msg_value_equals_zero.get(key).getAsJsonPrimitive().isString()) {
						str = msg_value_equals_zero.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = msg_value_equals_zero.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = msg_value_equals_zero.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("msg.value{\\_}equals{\\_}zero", inner_elements);
			
			
			//storing values for uninitialized_local_variable_value
			JsonObject uninitialized_local_variable_value = (JsonObject) bug_type.get("uninitialized_local_variable");
			
			inner_elements = new ArrayList<>();
			
			for(String key : uninitialized_local_variable_value.keySet()) {
				if(uninitialized_local_variable_value.get(key).isJsonPrimitive()) {
					if(uninitialized_local_variable_value.get(key).getAsJsonPrimitive().isString()) {
						str = uninitialized_local_variable_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = uninitialized_local_variable_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = uninitialized_local_variable_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("uninitialized{\\_}local{\\_}variable", inner_elements);
			
			
			//storing values for race_condition
			JsonObject race_condition_value = (JsonObject) bug_type.get("race_condition");
			
			inner_elements = new ArrayList<>();
			
			for(String key : race_condition_value.keySet()) {
				if(race_condition_value.get(key).isJsonPrimitive()) {
					if(race_condition_value.get(key).getAsJsonPrimitive().isString()) {
						str = race_condition_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = race_condition_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = race_condition_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("race{\\_}condition", inner_elements);
			
			
			//storing values for state_variable_shadowing
			JsonObject state_variable_shadowing_value = (JsonObject) bug_type.get("state_variable_shadowing");
			
			inner_elements = new ArrayList<>();
			
			for(String key : state_variable_shadowing_value.keySet()) {
				if(state_variable_shadowing_value.get(key).isJsonPrimitive()) {
					if(state_variable_shadowing_value.get(key).getAsJsonPrimitive().isString()) {
						str = state_variable_shadowing_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = state_variable_shadowing_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = state_variable_shadowing_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("state{\\_}variable{\\_}shadowing", inner_elements);
			
			
			//storing values for useless_compare
			JsonObject useless_compare_value = (JsonObject) bug_type.get("useless_compare");
			
			inner_elements = new ArrayList<>();
			
			for(String key : useless_compare_value.keySet()) {
				if(useless_compare_value.get(key).isJsonPrimitive()) {
					if(useless_compare_value.get(key).getAsJsonPrimitive().isString()) {
						str = useless_compare_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = useless_compare_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = useless_compare_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("useless{\\_}compare", inner_elements);
			
			
			//storing values for arithmetic
			JsonObject arithmetic_value = (JsonObject) bug_type.get("arithmetic");
			
			inner_elements = new ArrayList<>();
			
			for(String key : arithmetic_value.keySet()) {
				if(arithmetic_value.get(key).isJsonPrimitive()) {
					if(arithmetic_value.get(key).getAsJsonPrimitive().isString()) {
						str = arithmetic_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = arithmetic_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = arithmetic_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("arithmetic", inner_elements);
			
			
			//storing values for access_control
			JsonObject access_control_value = (JsonObject) bug_type.get("access_control");
			
			inner_elements = new ArrayList<>();
			
			for(String key : access_control_value.keySet()) {
				if(access_control_value.get(key).isJsonPrimitive()) {
					if(access_control_value.get(key).getAsJsonPrimitive().isString()) {
						str = access_control_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = access_control_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = access_control_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("access{\\_}control", inner_elements);
			
			
			//storing values for uninitialized_storage_pointer
			JsonObject uninitialized_storage_pointer_value = (JsonObject) bug_type.get("uninitialized_storage_pointer");
			
			inner_elements = new ArrayList<>();
			
			for(String key : uninitialized_storage_pointer_value.keySet()) {
				if(uninitialized_storage_pointer_value.get(key).isJsonPrimitive()) {
					if(uninitialized_storage_pointer_value.get(key).getAsJsonPrimitive().isString()) {
						str = uninitialized_storage_pointer_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = uninitialized_storage_pointer_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = uninitialized_storage_pointer_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("uninitialized{\\_}storage{\\_}pointer", inner_elements);
			
			
			//storing values for address_hardcoded
			JsonObject address_hardcoded_value = (JsonObject) bug_type.get("address_hardcoded");
			
			inner_elements = new ArrayList<>();
			
			for(String key : address_hardcoded_value.keySet()) {
				if(address_hardcoded_value.get(key).isJsonPrimitive()) {
					if(address_hardcoded_value.get(key).getAsJsonPrimitive().isString()) {
						str = address_hardcoded_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = address_hardcoded_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = address_hardcoded_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("address{\\_}hardcoded", inner_elements);
			
			
			//storing values for benign_reentrancy
			JsonObject benign_reentrancy_value = (JsonObject) bug_type.get("benign_reentrancy");
			
			inner_elements = new ArrayList<>();
			
			for(String key : benign_reentrancy_value.keySet()) {
				if(benign_reentrancy_value.get(key).isJsonPrimitive()) {
					if(benign_reentrancy_value.get(key).getAsJsonPrimitive().isString()) {
						str = benign_reentrancy_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = benign_reentrancy_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = benign_reentrancy_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("benign{\\_}reentrancy", inner_elements);
			
			
			//storing values for incorrect_ERC721_interface
			JsonObject incorrect_ERC721_interface_value = (JsonObject) bug_type.get("incorrect_ERC721_interface");
			
			inner_elements = new ArrayList<>();
			
			for(String key : incorrect_ERC721_interface_value.keySet()) {
				if(incorrect_ERC721_interface_value.get(key).isJsonPrimitive()) {
					if(incorrect_ERC721_interface_value.get(key).getAsJsonPrimitive().isString()) {
						str = incorrect_ERC721_interface_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = incorrect_ERC721_interface_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = incorrect_ERC721_interface_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("incorrect{\\_}ERC721{\\_}interface", inner_elements);
			
			
			//storing values for msg.value_in_loop
			JsonObject msg_value_in_loop = (JsonObject) bug_type.get("msg.value_in_loop");
			
			inner_elements = new ArrayList<>();
			
			for(String key : msg_value_in_loop.keySet()) {
				if(msg_value_in_loop.get(key).isJsonPrimitive()) {
					if(msg_value_in_loop.get(key).getAsJsonPrimitive().isString()) {
						str = msg_value_in_loop.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = msg_value_in_loop.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = msg_value_in_loop.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("msg.value{\\_}in{\\_}loop", inner_elements);
			
			
			//storing values for time_manipulation
			JsonObject time_manipulation_value = (JsonObject) bug_type.get("time_manipulation");
			
			inner_elements = new ArrayList<>();
			
			for(String key : time_manipulation_value.keySet()) {
				if(time_manipulation_value.get(key).isJsonPrimitive()) {
					if(time_manipulation_value.get(key).getAsJsonPrimitive().isString()) {
						str = time_manipulation_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = time_manipulation_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = time_manipulation_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("time{\\_}manipulation", inner_elements);
			
			
			//storing values for overpowered_role
			JsonObject overpowered_role_value = (JsonObject) bug_type.get("overpowered_role");
			
			inner_elements = new ArrayList<>();
			
			for(String key : overpowered_role_value.keySet()) {
				if(overpowered_role_value.get(key).isJsonPrimitive()) {
					if(overpowered_role_value.get(key).getAsJsonPrimitive().isString()) {
						str = overpowered_role_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = overpowered_role_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = overpowered_role_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("overpowered{\\_}role", inner_elements);
			
			
			//storing values for should_be_pure
			JsonObject should_be_pure_value = (JsonObject) bug_type.get("should_be_pure");
			
			inner_elements = new ArrayList<>();
			
			for(String key : should_be_pure_value.keySet()) {
				if(should_be_pure_value.get(key).isJsonPrimitive()) {
					if(should_be_pure_value.get(key).getAsJsonPrimitive().isString()) {
						str = should_be_pure_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = should_be_pure_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = should_be_pure_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("should{\\_}be{\\_}pure", inner_elements);
			
			
			//storing values for controlled_lowlevel_call
			JsonObject controlled_lowlevel_call_value = (JsonObject) bug_type.get("controlled_lowlevel_call");
			
			inner_elements = new ArrayList<>();
			
			for(String key : controlled_lowlevel_call_value.keySet()) {
				if(controlled_lowlevel_call_value.get(key).isJsonPrimitive()) {
					if(controlled_lowlevel_call_value.get(key).getAsJsonPrimitive().isString()) {
						str = controlled_lowlevel_call_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = controlled_lowlevel_call_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = controlled_lowlevel_call_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("controlled{\\_}lowlevel{\\_}call", inner_elements);
			
			
			//storing values for pre-declare_usage_of_local
			JsonObject pre_declare_usage_of_local_value = (JsonObject) bug_type.get("pre-declare_usage_of_local");
			
			inner_elements = new ArrayList<>();
			
			for(String key : pre_declare_usage_of_local_value.keySet()) {
				if(pre_declare_usage_of_local_value.get(key).isJsonPrimitive()) {
					if(pre_declare_usage_of_local_value.get(key).getAsJsonPrimitive().isString()) {
						str = pre_declare_usage_of_local_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = pre_declare_usage_of_local_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = pre_declare_usage_of_local_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("pre{\\_}declare{\\_}usage{\\_}of{\\_}local", inner_elements);
			
			
			//storing values for reentrancy
			JsonObject reentrancy_value = (JsonObject) bug_type.get("reentrancy");
			
			inner_elements = new ArrayList<>();
			
			for(String key : reentrancy_value.keySet()) {
				if(reentrancy_value.get(key).isJsonPrimitive()) {
					if(reentrancy_value.get(key).getAsJsonPrimitive().isString()) {
						str = reentrancy_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = reentrancy_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = reentrancy_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("reentrancy", inner_elements);
			
			
			//storing values for do_while_continue
			JsonObject do_while_continue_value = (JsonObject) bug_type.get("do_while_continue");
			
			inner_elements = new ArrayList<>();
			
			for(String key : do_while_continue_value.keySet()) {
				if(do_while_continue_value.get(key).isJsonPrimitive()) {
					if(do_while_continue_value.get(key).getAsJsonPrimitive().isString()) {
						str = do_while_continue_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = do_while_continue_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = do_while_continue_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("do{\\_}while{\\_}continue", inner_elements);
			
			
			//storing values for payable_func_using_delegatecall_in_loop
			JsonObject payable_func_using_delegatecall_in_loop_value = (JsonObject) bug_type.get("payable_func_using_delegatecall_in_loop");
			
			inner_elements = new ArrayList<>();
			
			for(String key : payable_func_using_delegatecall_in_loop_value.keySet()) {
				if(payable_func_using_delegatecall_in_loop_value.get(key).isJsonPrimitive()) {
					if(payable_func_using_delegatecall_in_loop_value.get(key).getAsJsonPrimitive().isString()) {
						str = payable_func_using_delegatecall_in_loop_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = payable_func_using_delegatecall_in_loop_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = payable_func_using_delegatecall_in_loop_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("payable{\\_}func{\\_}using{\\_}delegatecall{\\_}in{\\_}loop", inner_elements);
			
			
			//storing values for right_to_left_char
			JsonObject right_to_left_char_value = (JsonObject) bug_type.get("right_to_left_char");
			
			inner_elements = new ArrayList<>();
			
			for(String key : right_to_left_char_value.keySet()) {
				if(right_to_left_char_value.get(key).isJsonPrimitive()) {
					if(right_to_left_char_value.get(key).getAsJsonPrimitive().isString()) {
						str = right_to_left_char_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = right_to_left_char_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = right_to_left_char_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("right{\\_}to{\\_}left{\\_}char", inner_elements);
			
			
			//storing values for assert_state_change
			JsonObject assert_state_change_value = (JsonObject) bug_type.get("assert_state_change");
			
			inner_elements = new ArrayList<>();
			
			for(String key : assert_state_change_value.keySet()) {
				if(assert_state_change_value.get(key).isJsonPrimitive()) {
					if(assert_state_change_value.get(key).getAsJsonPrimitive().isString()) {
						str = assert_state_change_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = assert_state_change_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = assert_state_change_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("assert{\\_}state{\\_}change", inner_elements);
			
			
			//storing values for locked_money
			JsonObject locked_money_value = (JsonObject) bug_type.get("locked_money");
			
			inner_elements = new ArrayList<>();
			
			for(String key : locked_money_value.keySet()) {
				if(locked_money_value.get(key).isJsonPrimitive()) {
					if(locked_money_value.get(key).getAsJsonPrimitive().isString()) {
						str = locked_money_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = locked_money_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = locked_money_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("locked{\\_}money", inner_elements);
			
			
			//storing values for pausable_modifier_absence
			JsonObject pausable_modifier_absence_value = (JsonObject) bug_type.get("pausable_modifier_absence");
			
			inner_elements = new ArrayList<>();
			
			for(String key : pausable_modifier_absence_value.keySet()) {
				if(pausable_modifier_absence_value.get(key).isJsonPrimitive()) {
					if(pausable_modifier_absence_value.get(key).getAsJsonPrimitive().isString()) {
						str = pausable_modifier_absence_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = pausable_modifier_absence_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = pausable_modifier_absence_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("pausable{\\_}modifier{\\_}absence", inner_elements);
			
			
			//storing values for extra_gas_in_loops
			JsonObject extra_gas_in_loops_value = (JsonObject) bug_type.get("extra_gas_in_loops");
			
			inner_elements = new ArrayList<>();
			
			for(String key : extra_gas_in_loops_value.keySet()) {
				if(extra_gas_in_loops_value.get(key).isJsonPrimitive()) {
					if(extra_gas_in_loops_value.get(key).getAsJsonPrimitive().isString()) {
						str = extra_gas_in_loops_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = extra_gas_in_loops_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = extra_gas_in_loops_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("extra{\\_}gas{\\_}in{\\_}loops", inner_elements);
			
			
			//storing values for incorrect_ERC20_interface
			JsonObject incorrect_ERC20_interface_value = (JsonObject) bug_type.get("incorrect_ERC20_interface");
			
			inner_elements = new ArrayList<>();
			
			for(String key : incorrect_ERC20_interface_value.keySet()) {
				if(incorrect_ERC20_interface_value.get(key).isJsonPrimitive()) {
					if(incorrect_ERC20_interface_value.get(key).getAsJsonPrimitive().isString()) {
						str = incorrect_ERC20_interface_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = incorrect_ERC20_interface_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = incorrect_ERC20_interface_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("incorrect{\\_}ERC20{\\_}interface", inner_elements);
			
			
			//storing values for denial_of_service
			JsonObject denial_of_service_value = (JsonObject) bug_type.get("denial_of_service");
			
			inner_elements = new ArrayList<>();
			
			for(String key : denial_of_service_value.keySet()) {
				if(denial_of_service_value.get(key).isJsonPrimitive()) {
					if(denial_of_service_value.get(key).getAsJsonPrimitive().isString()) {
						str = denial_of_service_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = denial_of_service_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = denial_of_service_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("denial{\\_}of{\\_}service", inner_elements);
			
			
			//storing values for unused_function_should_be_external
			JsonObject unused_function_should_be_external_value = (JsonObject) bug_type.get("unused_function_should_be_external");
			
			inner_elements = new ArrayList<>();
			
			for(String key : unused_function_should_be_external_value.keySet()) {
				if(unused_function_should_be_external_value.get(key).isJsonPrimitive()) {
					if(unused_function_should_be_external_value.get(key).getAsJsonPrimitive().isString()) {
						str = unused_function_should_be_external_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = unused_function_should_be_external_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = unused_function_should_be_external_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("unused{\\_}function{\\_}should{\\_}be{\\_}external", inner_elements);
			
			
			//storing values for unused_retval
			JsonObject unused_retval_value = (JsonObject) bug_type.get("unused_retval");
			
			inner_elements = new ArrayList<>();
			
			for(String key : unused_retval_value.keySet()) {
				if(unused_retval_value.get(key).isJsonPrimitive()) {
					if(unused_retval_value.get(key).getAsJsonPrimitive().isString()) {
						str = unused_retval_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = unused_retval_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = unused_retval_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}
			
			jsonMap.put("unused{\\_}retval", inner_elements);
			
			
			//storing values for local_variable_shadowing
			JsonObject local_variable_shadowing_value = (JsonObject) bug_type.get("local_variable_shadowing");
			
			inner_elements = new ArrayList<>();
			
			for(String key : local_variable_shadowing_value.keySet()) {
				if(local_variable_shadowing_value.get(key).isJsonPrimitive()) {
					if(local_variable_shadowing_value.get(key).getAsJsonPrimitive().isString()) {
						str = local_variable_shadowing_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = local_variable_shadowing_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = local_variable_shadowing_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("local{\\_}variable{\\_}shadowing", inner_elements);
			
			
			//storing values for reused_base_constructors
			JsonObject reused_base_constructors_value = (JsonObject) bug_type.get("reused_base_constructors");
			
			inner_elements = new ArrayList<>();
			
			for(String key : reused_base_constructors_value.keySet()) {
				if(reused_base_constructors_value.get(key).isJsonPrimitive()) {
					if(reused_base_constructors_value.get(key).getAsJsonPrimitive().isString()) {
						str = reused_base_constructors_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = reused_base_constructors_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = reused_base_constructors_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("reused{\\_}base{\\_}constructors", inner_elements);
			
			
			//storing values for should_be_view
			JsonObject should_be_view_value = (JsonObject) bug_type.get("should_be_view");
			
			inner_elements = new ArrayList<>();
			
			for(String key : should_be_view_value.keySet()) {
				if(should_be_view_value.get(key).isJsonPrimitive()) {
					if(should_be_view_value.get(key).getAsJsonPrimitive().isString()) {
						str = should_be_view_value.get(key).getAsString();
						inner_elements.add(str);
					} else {
						bool = should_be_view_value.get(key).getAsBoolean();
						inner_elements.add(bool);
					}
				} else {
					array = should_be_view_value.get(key).getAsJsonArray();
					inner_elements.add(array);
				}
		
			}

			jsonMap.put("should{\\_}be{\\_}view", inner_elements);
			

			 //Coding the latex template.
		     String latex = "\\documentclass{article} \r\n";
		        latex += "\\usepackage[utf8]{inputenc} \r\n";
		        latex += "\\usepackage{ffcode} \r\n";
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
		 
		    //Creating the TEX file
			File myObj = new File("json_data.tex");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      
		      FileWriter myWriter = new FileWriter(myObj);

		      
		      
		      
		  	for(String key : jsonMap.keySet())
			{

				List<Object> inner = new ArrayList<>();
				inner = jsonMap.get(key);
				
				//Mapping keys and values from hashmap to the TEX file.
				 latex += "\\subsection{" + key + "} \r\n";
			        latex += "\\textbf{SWC{\\textunderscore }ID:} " + inner.get(5) + "\r\n";
			        latex += "\r\n";
			        latex += "\\textbf{Description}:" + inner.get(1) + "\r\n";
			        latex += "\r\n";
			        latex += "\\textbf{Example:} \r\n";
			        latex += "\\begin{ffcode} \r\n";
			        latex += "\r\n";
			        latex += inner.get(2);
			        latex += "\r\n";
			        latex += "\\end{ffcode} \r\n";
			        latex += "\\} \r\n";
			        latex += "\r\n";
			        latex += "\\} \r\n";
			        latex += "\r\n";
			        latex += "\\textbf{DASP} : " + inner.get(0) + "\r\n";
			        latex += "\r\n";
			        latex += "\\textbf{Found}: " + inner.get(3) +  "\r\n";
			        latex += "\r\n";
			        latex += "\\textbf{Reported by checker}: \r\n";
			        latex += "\\begin{ffcode} \r\n";
			        latex += "\r\n";
			        latex += inner.get(4);
			        latex += "\r\n";
			        latex += "\\end{ffcode} \r\n";
			}
		  	
		  	latex += "\\end{document}";
		  	
		  	//Writing the final latex template to the file created.
		  	myWriter.write(latex);
		  	System.out.println("Successfully wrote to the file.");
		  	
		  	//The file object is closed after it finishes writing.
		    myWriter.close();
		   
		  	/*Reading from the initially created TEX file to parse special characters
		    which will be written to a newly created TEX File. The process will be repeated
		    each time we parse a set of special characters i.e if we parse the file for one character,
		    a new fiel A is created, if we parse the file for another character, 
		    another file B is created etc*/
		    
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
		    	 fw2.write(br2.readLine().replace("\\\\textunderscore", "|\\textunderscore|") + "\n");
		     }
		     
		     fw2.close();
		     br2.close();
		     fr2.close();
		     
		     Reader fr3 = new FileReader(tex2);
		     BufferedReader br3 = new BufferedReader(fr3);
		     File tex3 = new File("latex_rev2.tex");
		 	 FileWriter fw3 = new FileWriter(tex3);
		     
		     while(br3.ready()) {
		    	 fw3.write(br3.readLine().replace("^", "|\\textsuperscript| ") + "\n");
		     }
		     
		     fw3.close();
		     br3.close();
		     fr3.close();
		     
		     Reader fr4 = new FileReader(tex3);
		     BufferedReader br4 = new BufferedReader(fr4);
		     File tex4 = new File("latex_rev3.tex");
		 	 FileWriter fw4 = new FileWriter(tex4);
		     
		     while(br4.ready()) {
		    	 fw4.write(br4.readLine().replace("-", "|\\textendash| ") + "\n");
		     }
		     
		     fw4.close();
		     br4.close();
		     fr4.close();
		     
		     Reader fr5 = new FileReader(tex4);
		     BufferedReader br5 = new BufferedReader(fr5);
		     File tex5 = new File("latex_rev4.tex");
		 	 FileWriter fw5 = new FileWriter(tex5);
		     
		     while(br5.ready()) {
		    	 fw5.write(br5.readLine().replace("&", "|\\&| ") + "\n");
		     }
		     
		     fw5.close();
		     br5.close();
		     fr5.close();
		     

		     Reader fr6 = new FileReader(tex5);
		     BufferedReader br6 = new BufferedReader(fr6);
		     File tex6 = new File("latex_rev5.tex");
		 	 FileWriter fw6 = new FileWriter(tex6);
		     
		     while(br6.ready()) {
		    	 fw6.write(br6.readLine().replace("\\textunderscore", "|\\textunderscore|") + "\n");
		     }
		   
		     fw6.close();
		     br6.close();
		     fr6.close();
		     
		     Reader fr7 = new FileReader(tex6);
		     BufferedReader br7 = new BufferedReader(fr7);
		     File tex7 = new File("latex_rev6.tex");
		 	 FileWriter fw7= new FileWriter(tex7);
		     
		     while(br7.ready()) {
		    	 fw7.write(br7.readLine().replace("||\\textunderscore||", "|\\textunderscore|") + "\n");
		     }
		   
		     fw7.close();
		     br7.close();
		     fr7.close();
		     
		     
		     //Final output file which will be compiled by latex compiler.
		     Reader fr8 = new FileReader(tex7);
		     BufferedReader br8 = new BufferedReader(fr8);
		     File tex8 = new File("latex_rev7.tex");
		 	 FileWriter fw8= new FileWriter(tex8);
		     
		     while(br8.ready()) {
		    	 fw8.write(br8.readLine().replace("{|\\textunderscore| }", "{\\textunderscore}") + "\n");
		     }
		   
		     fw8.close();
		     br8.close();
		     fr8.close();


		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
