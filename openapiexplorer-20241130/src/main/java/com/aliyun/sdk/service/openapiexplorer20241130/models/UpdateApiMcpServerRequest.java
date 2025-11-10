// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateApiMcpServerRequest} extends {@link RequestModel}
 *
 * <p>UpdateApiMcpServerRequest</p>
 */
public class UpdateApiMcpServerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("additionalApiDescriptions")
    private java.util.List<AdditionalApiDescriptions> additionalApiDescriptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apis")
    private java.util.List<Apis> apis;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assumeRoleExtraPolicy")
    private String assumeRoleExtraPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assumeRoleName")
    private String assumeRoleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAssumeRole")
    private Boolean enableAssumeRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instructions")
    private String instructions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("oauthClientId")
    private String oauthClientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompts")
    private java.util.List<Prompts> prompts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("systemTools")
    private java.util.List<String> systemTools;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformTools")
    private java.util.List<TerraformTools> terraformTools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private UpdateApiMcpServerRequest(Builder builder) {
        super(builder);
        this.additionalApiDescriptions = builder.additionalApiDescriptions;
        this.apis = builder.apis;
        this.assumeRoleExtraPolicy = builder.assumeRoleExtraPolicy;
        this.assumeRoleName = builder.assumeRoleName;
        this.description = builder.description;
        this.enableAssumeRole = builder.enableAssumeRole;
        this.instructions = builder.instructions;
        this.language = builder.language;
        this.oauthClientId = builder.oauthClientId;
        this.prompts = builder.prompts;
        this.systemTools = builder.systemTools;
        this.terraformTools = builder.terraformTools;
        this.clientToken = builder.clientToken;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiMcpServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalApiDescriptions
     */
    public java.util.List<AdditionalApiDescriptions> getAdditionalApiDescriptions() {
        return this.additionalApiDescriptions;
    }

    /**
     * @return apis
     */
    public java.util.List<Apis> getApis() {
        return this.apis;
    }

    /**
     * @return assumeRoleExtraPolicy
     */
    public String getAssumeRoleExtraPolicy() {
        return this.assumeRoleExtraPolicy;
    }

    /**
     * @return assumeRoleName
     */
    public String getAssumeRoleName() {
        return this.assumeRoleName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableAssumeRole
     */
    public Boolean getEnableAssumeRole() {
        return this.enableAssumeRole;
    }

    /**
     * @return instructions
     */
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return oauthClientId
     */
    public String getOauthClientId() {
        return this.oauthClientId;
    }

    /**
     * @return prompts
     */
    public java.util.List<Prompts> getPrompts() {
        return this.prompts;
    }

    /**
     * @return systemTools
     */
    public java.util.List<String> getSystemTools() {
        return this.systemTools;
    }

    /**
     * @return terraformTools
     */
    public java.util.List<TerraformTools> getTerraformTools() {
        return this.terraformTools;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateApiMcpServerRequest, Builder> {
        private java.util.List<AdditionalApiDescriptions> additionalApiDescriptions; 
        private java.util.List<Apis> apis; 
        private String assumeRoleExtraPolicy; 
        private String assumeRoleName; 
        private String description; 
        private Boolean enableAssumeRole; 
        private String instructions; 
        private String language; 
        private String oauthClientId; 
        private java.util.List<Prompts> prompts; 
        private java.util.List<String> systemTools; 
        private java.util.List<TerraformTools> terraformTools; 
        private String clientToken; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApiMcpServerRequest request) {
            super(request);
            this.additionalApiDescriptions = request.additionalApiDescriptions;
            this.apis = request.apis;
            this.assumeRoleExtraPolicy = request.assumeRoleExtraPolicy;
            this.assumeRoleName = request.assumeRoleName;
            this.description = request.description;
            this.enableAssumeRole = request.enableAssumeRole;
            this.instructions = request.instructions;
            this.language = request.language;
            this.oauthClientId = request.oauthClientId;
            this.prompts = request.prompts;
            this.systemTools = request.systemTools;
            this.terraformTools = request.terraformTools;
            this.clientToken = request.clientToken;
            this.id = request.id;
        } 

        /**
         * additionalApiDescriptions.
         */
        public Builder additionalApiDescriptions(java.util.List<AdditionalApiDescriptions> additionalApiDescriptions) {
            this.putBodyParameter("additionalApiDescriptions", additionalApiDescriptions);
            this.additionalApiDescriptions = additionalApiDescriptions;
            return this;
        }

        /**
         * apis.
         */
        public Builder apis(java.util.List<Apis> apis) {
            this.putBodyParameter("apis", apis);
            this.apis = apis;
            return this;
        }

        /**
         * assumeRoleExtraPolicy.
         */
        public Builder assumeRoleExtraPolicy(String assumeRoleExtraPolicy) {
            this.putBodyParameter("assumeRoleExtraPolicy", assumeRoleExtraPolicy);
            this.assumeRoleExtraPolicy = assumeRoleExtraPolicy;
            return this;
        }

        /**
         * assumeRoleName.
         */
        public Builder assumeRoleName(String assumeRoleName) {
            this.putBodyParameter("assumeRoleName", assumeRoleName);
            this.assumeRoleName = assumeRoleName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * enableAssumeRole.
         */
        public Builder enableAssumeRole(Boolean enableAssumeRole) {
            this.putBodyParameter("enableAssumeRole", enableAssumeRole);
            this.enableAssumeRole = enableAssumeRole;
            return this;
        }

        /**
         * instructions.
         */
        public Builder instructions(String instructions) {
            this.putBodyParameter("instructions", instructions);
            this.instructions = instructions;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.putBodyParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * oauthClientId.
         */
        public Builder oauthClientId(String oauthClientId) {
            this.putBodyParameter("oauthClientId", oauthClientId);
            this.oauthClientId = oauthClientId;
            return this;
        }

        /**
         * prompts.
         */
        public Builder prompts(java.util.List<Prompts> prompts) {
            this.putBodyParameter("prompts", prompts);
            this.prompts = prompts;
            return this;
        }

        /**
         * systemTools.
         */
        public Builder systemTools(java.util.List<String> systemTools) {
            this.putBodyParameter("systemTools", systemTools);
            this.systemTools = systemTools;
            return this;
        }

        /**
         * terraformTools.
         */
        public Builder terraformTools(java.util.List<TerraformTools> terraformTools) {
            this.putBodyParameter("terraformTools", terraformTools);
            this.terraformTools = terraformTools;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v6ZZ7ftCzEILW***</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateApiMcpServerRequest build() {
            return new UpdateApiMcpServerRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApiMcpServerRequest} extends {@link TeaModel}
     *
     * <p>UpdateApiMcpServerRequest</p>
     */
    public static class ConstParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private ConstParameters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConstParameters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private Object value; 

            private Builder() {
            } 

            private Builder(ConstParameters model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public ConstParameters build() {
                return new ConstParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApiMcpServerRequest} extends {@link TeaModel}
     *
     * <p>UpdateApiMcpServerRequest</p>
     */
    public static class AdditionalApiDescriptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("apiOverrideJson")
        private String apiOverrideJson;

        @com.aliyun.core.annotation.NameInMap("apiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("constParameters")
        private java.util.List<ConstParameters> constParameters;

        @com.aliyun.core.annotation.NameInMap("enableOutputSchema")
        private Boolean enableOutputSchema;

        @com.aliyun.core.annotation.NameInMap("executeCliCommand")
        private Boolean executeCliCommand;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        private AdditionalApiDescriptions(Builder builder) {
            this.apiName = builder.apiName;
            this.apiOverrideJson = builder.apiOverrideJson;
            this.apiVersion = builder.apiVersion;
            this.constParameters = builder.constParameters;
            this.enableOutputSchema = builder.enableOutputSchema;
            this.executeCliCommand = builder.executeCliCommand;
            this.product = builder.product;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalApiDescriptions create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiOverrideJson
         */
        public String getApiOverrideJson() {
            return this.apiOverrideJson;
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return constParameters
         */
        public java.util.List<ConstParameters> getConstParameters() {
            return this.constParameters;
        }

        /**
         * @return enableOutputSchema
         */
        public Boolean getEnableOutputSchema() {
            return this.enableOutputSchema;
        }

        /**
         * @return executeCliCommand
         */
        public Boolean getExecuteCliCommand() {
            return this.executeCliCommand;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        public static final class Builder {
            private String apiName; 
            private String apiOverrideJson; 
            private String apiVersion; 
            private java.util.List<ConstParameters> constParameters; 
            private Boolean enableOutputSchema; 
            private Boolean executeCliCommand; 
            private String product; 

            private Builder() {
            } 

            private Builder(AdditionalApiDescriptions model) {
                this.apiName = model.apiName;
                this.apiOverrideJson = model.apiOverrideJson;
                this.apiVersion = model.apiVersion;
                this.constParameters = model.constParameters;
                this.enableOutputSchema = model.enableOutputSchema;
                this.executeCliCommand = model.executeCliCommand;
                this.product = model.product;
            } 

            /**
             * apiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * apiOverrideJson.
             */
            public Builder apiOverrideJson(String apiOverrideJson) {
                this.apiOverrideJson = apiOverrideJson;
                return this;
            }

            /**
             * apiVersion.
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * constParameters.
             */
            public Builder constParameters(java.util.List<ConstParameters> constParameters) {
                this.constParameters = constParameters;
                return this;
            }

            /**
             * enableOutputSchema.
             */
            public Builder enableOutputSchema(Boolean enableOutputSchema) {
                this.enableOutputSchema = enableOutputSchema;
                return this;
            }

            /**
             * executeCliCommand.
             */
            public Builder executeCliCommand(Boolean executeCliCommand) {
                this.executeCliCommand = executeCliCommand;
                return this;
            }

            /**
             * product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            public AdditionalApiDescriptions build() {
                return new AdditionalApiDescriptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApiMcpServerRequest} extends {@link TeaModel}
     *
     * <p>UpdateApiMcpServerRequest</p>
     */
    public static class Apis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("selectors")
        private java.util.List<String> selectors;

        private Apis(Builder builder) {
            this.apiVersion = builder.apiVersion;
            this.product = builder.product;
            this.selectors = builder.selectors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apis create() {
            return builder().build();
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return selectors
         */
        public java.util.List<String> getSelectors() {
            return this.selectors;
        }

        public static final class Builder {
            private String apiVersion; 
            private String product; 
            private java.util.List<String> selectors; 

            private Builder() {
            } 

            private Builder(Apis model) {
                this.apiVersion = model.apiVersion;
                this.product = model.product;
                this.selectors = model.selectors;
            } 

            /**
             * apiVersion.
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * selectors.
             */
            public Builder selectors(java.util.List<String> selectors) {
                this.selectors = selectors;
                return this;
            }

            public Apis build() {
                return new Apis(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApiMcpServerRequest} extends {@link TeaModel}
     *
     * <p>UpdateApiMcpServerRequest</p>
     */
    public static class Arguments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        private Arguments(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arguments create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private Boolean required; 

            private Builder() {
            } 

            private Builder(Arguments model) {
                this.description = model.description;
                this.name = model.name;
                this.required = model.required;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public Arguments build() {
                return new Arguments(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApiMcpServerRequest} extends {@link TeaModel}
     *
     * <p>UpdateApiMcpServerRequest</p>
     */
    public static class Prompts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arguments")
        private java.util.List<Arguments> arguments;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Prompts(Builder builder) {
            this.arguments = builder.arguments;
            this.content = builder.content;
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prompts create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public java.util.List<Arguments> getArguments() {
            return this.arguments;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Arguments> arguments; 
            private String content; 
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(Prompts model) {
                this.arguments = model.arguments;
                this.content = model.content;
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * arguments.
             */
            public Builder arguments(java.util.List<Arguments> arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Prompts build() {
                return new Prompts(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApiMcpServerRequest} extends {@link TeaModel}
     *
     * <p>UpdateApiMcpServerRequest</p>
     */
    public static class TerraformTools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("async")
        private Boolean async;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("destroyPolicy")
        private String destroyPolicy;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private TerraformTools(Builder builder) {
            this.async = builder.async;
            this.code = builder.code;
            this.description = builder.description;
            this.destroyPolicy = builder.destroyPolicy;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerraformTools create() {
            return builder().build();
        }

        /**
         * @return async
         */
        public Boolean getAsync() {
            return this.async;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destroyPolicy
         */
        public String getDestroyPolicy() {
            return this.destroyPolicy;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean async; 
            private String code; 
            private String description; 
            private String destroyPolicy; 
            private String name; 

            private Builder() {
            } 

            private Builder(TerraformTools model) {
                this.async = model.async;
                this.code = model.code;
                this.description = model.description;
                this.destroyPolicy = model.destroyPolicy;
                this.name = model.name;
            } 

            /**
             * async.
             */
            public Builder async(Boolean async) {
                this.async = async;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * destroyPolicy.
             */
            public Builder destroyPolicy(String destroyPolicy) {
                this.destroyPolicy = destroyPolicy;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TerraformTools build() {
                return new TerraformTools(this);
            } 

        } 

    }
}
