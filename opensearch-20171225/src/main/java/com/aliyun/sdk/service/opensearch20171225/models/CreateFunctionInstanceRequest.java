// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
    private java.util.List<CreateParameters> createParameters;

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
    private java.util.List<UsageParameters> usageParameters;

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
    public java.util.List<CreateParameters> getCreateParameters() {
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
    public java.util.List<UsageParameters> getUsageParameters() {
        return this.usageParameters;
    }

    public static final class Builder extends Request.Builder<CreateFunctionInstanceRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private java.util.List<CreateParameters> createParameters; 
        private String cron; 
        private String description; 
        private String functionType; 
        private String instanceName; 
        private String modelType; 
        private java.util.List<UsageParameters> usageParameters; 

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
         * <p>The name of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_app_group_name</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>The feature name. Valid values:</p>
         * <ul>
         * <li>ctr: CTR model.</li>
         * <li>pop: popularity model.</li>
         * <li>category: category model.</li>
         * <li>hot: hotword model.</li>
         * <li>hint: hint model.</li>
         * <li>suggest: drop-down suggestion model.</li>
         * <li>analyzer: tokenization model.</li>
         * <li>termweight: term weight model.</li>
         * <li>synonym: synonym model.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ctr</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The parameters used to create the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[   { &quot;name&quot;: &quot;param1&quot;, &quot;value&quot;: &quot;val1&quot;   } ]</p>
         */
        public Builder createParameters(java.util.List<CreateParameters> createParameters) {
            this.putBodyParameter("createParameters", createParameters);
            this.createParameters = createParameters;
            return this;
        }

        /**
         * <p>The CRON expression used to schedule periodic training, in the format of Minutes Hours DayofMonth Month DayofWeek. The default value is empty, which specifies that no periodic training is performed. A value of 0 for DayofWeek specifies Sunday.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 ? * 0,1,2,3,4,5,6</p>
         */
        public Builder cron(String cron) {
            this.putBodyParameter("cron", cron);
            this.cron = cron;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test instance</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The feature type.</p>
         * <ul>
         * <li>Default value: PAAS. Training is required before you can use the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAAS</p>
         */
        public Builder functionType(String functionType) {
            this.putBodyParameter("functionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * <p>The instance name. The name must be 1 to 30 characters in length and can contain letters, digits, and underscores (_). The name is case-sensitive and must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ctr_test</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The model type. The value varies based on the model.</p>
         * <ul>
         * <li>Click-through rate (CTR) model: tf_checkpoint</li>
         * <li>Popularity model: pop</li>
         * <li>Category model: offline_inference</li>
         * <li>Hotword model: offline_inference</li>
         * <li>Hint model: offline_inference</li>
         * <li>Hotword model for real-time top searches: near_realtime</li>
         * <li>Personalized hint model: near_realtime</li>
         * <li>Drop-down suggestion model: offline_inference</li>
         * <li>Tokenization model: text</li>
         * <li>Term weight model: tf_checkpoint</li>
         * <li>Synonym model: offline_inference</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tf_checkpoint</p>
         */
        public Builder modelType(String modelType) {
            this.putBodyParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>The parameters used to use the instance.</p>
         */
        public Builder usageParameters(java.util.List<UsageParameters> usageParameters) {
            this.putBodyParameter("usageParameters", usageParameters);
            this.usageParameters = usageParameters;
            return this;
        }

        @Override
        public CreateFunctionInstanceRequest build() {
            return new CreateFunctionInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFunctionInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateFunctionInstanceRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(CreateParameters model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>title_field</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>title</p>
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
    /**
     * 
     * {@link CreateFunctionInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateFunctionInstanceRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(UsageParameters model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>allow_dict_id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
