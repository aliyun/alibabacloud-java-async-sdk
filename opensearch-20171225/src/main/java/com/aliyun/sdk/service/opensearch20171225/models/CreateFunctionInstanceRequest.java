// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateFunctionInstanceRequest</p>
 */
public class CreateFunctionInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createParameters")
    private java.util.List < CreateParameters> createParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cron")
    private String cron;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("functionType")
    private String functionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("usageParameters")
    private java.util.List < UsageParameters> usageParameters;

    private CreateFunctionInstanceRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.functionName = builder.functionName;
        this.createParameters = builder.createParameters;
        this.cron = builder.cron;
        this.description = builder.description;
        this.functionType = builder.functionType;
        this.instanceName = builder.instanceName;
        this.modelType = builder.modelType;
        this.usageParameters = builder.usageParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFunctionInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return createParameters
     */
    public java.util.List < CreateParameters> getCreateParameters() {
        return this.createParameters;
    }

    /**
     * @return cron
     */
    public String getCron() {
        return this.cron;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return usageParameters
     */
    public java.util.List < UsageParameters> getUsageParameters() {
        return this.usageParameters;
    }

    public static final class Builder extends Request.Builder<CreateFunctionInstanceRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private java.util.List < CreateParameters> createParameters; 
        private String cron; 
        private String description; 
        private String functionType; 
        private String instanceName; 
        private String modelType; 
        private java.util.List < UsageParameters> usageParameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateFunctionInstanceRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.functionName = request.functionName;
            this.createParameters = request.createParameters;
            this.cron = request.cron;
            this.description = request.description;
            this.functionType = request.functionType;
            this.instanceName = request.instanceName;
            this.modelType = request.modelType;
            this.usageParameters = request.usageParameters;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The feature name. Valid values:
         * <p>
         * 
         * *   ctr: CTR model.
         * *   pop: popularity model.
         * *   category: category model.
         * *   hot: hotword model.
         * *   hint: hint model.
         * *   suggest: drop-down suggestion model.
         * *   analyzer: tokenization model.
         * *   termweight: term weight model.
         * *   synonym: synonym model.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The parameters used to create the instance.
         */
        public Builder createParameters(java.util.List < CreateParameters> createParameters) {
            this.putBodyParameter("createParameters", createParameters);
            this.createParameters = createParameters;
            return this;
        }

        /**
         * The CRON expression used to schedule periodic training, in the format of Minutes Hours DayofMonth Month DayofWeek. The default value is empty, which specifies that no periodic training is performed. A value of 0 for DayofWeek specifies Sunday.
         */
        public Builder cron(String cron) {
            this.putBodyParameter("cron", cron);
            this.cron = cron;
            return this;
        }

        /**
         * The description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The feature type.
         * <p>
         * 
         * *   Default value: PAAS. Training is required before you can use the feature.
         */
        public Builder functionType(String functionType) {
            this.putBodyParameter("functionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * The instance name. The name must be 1 to 30 characters in length and can contain letters, digits, and underscores (\_). The name is case-sensitive and must start with a letter.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The model type. The value varies based on the model.
         * <p>
         * 
         * *   Click-through rate (CTR) model: tf_checkpoint
         * *   Popularity model: pop
         * *   Category model: offline_inference
         * *   Hotword model: offline_inference
         * *   Hint model: offline_inference
         * *   Hotword model for real-time top searches: near_realtime
         * *   Personalized hint model: near_realtime
         * *   Drop-down suggestion model: offline_inference
         * *   Tokenization model: text
         * *   Term weight model: tf_checkpoint
         * *   Synonym model: offline_inference
         */
        public Builder modelType(String modelType) {
            this.putBodyParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * The parameters used to use the instance.
         */
        public Builder usageParameters(java.util.List < UsageParameters> usageParameters) {
            this.putBodyParameter("usageParameters", usageParameters);
            this.usageParameters = usageParameters;
            return this;
        }

        @Override
        public CreateFunctionInstanceRequest build() {
            return new CreateFunctionInstanceRequest(this);
        } 

    } 

    public static class CreateParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private CreateParameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The parameter name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The parameter value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CreateParameters build() {
                return new CreateParameters(this);
            } 

        } 

    }
    public static class UsageParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private UsageParameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The parameter name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The parameter value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UsageParameters build() {
                return new UsageParameters(this);
            } 

        } 

    }
}
