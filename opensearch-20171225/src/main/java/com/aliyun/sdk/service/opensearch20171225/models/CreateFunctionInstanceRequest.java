// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateFunctionInstanceRequest</p>
 */
public class CreateFunctionInstanceRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Body
    @NameInMap("createParameters")
    private java.util.List < CreateParameters> createParameters;

    @Body
    @NameInMap("cron")
    private String cron;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("functionType")
    private String functionType;

    @Body
    @NameInMap("instanceName")
    private String instanceName;

    @Body
    @NameInMap("modelType")
    @Validation(required = true)
    private String modelType;

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

    public static final class Builder extends Request.Builder<CreateFunctionInstanceRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private java.util.List < CreateParameters> createParameters; 
        private String cron; 
        private String description; 
        private String functionType; 
        private String instanceName; 
        private String modelType; 

        private Builder() {
            super();
        } 

        private Builder(CreateFunctionInstanceRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.functionName = response.functionName;
            this.createParameters = response.createParameters;
            this.cron = response.cron;
            this.description = response.description;
            this.functionType = response.functionType;
            this.instanceName = response.instanceName;
            this.modelType = response.modelType;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * 实例的参数列表
         */
        public Builder createParameters(java.util.List < CreateParameters> createParameters) {
            this.putBodyParameter("createParameters", createParameters);
            this.createParameters = createParameters;
            return this;
        }

        /**
         * Cron表达式
         */
        public Builder cron(String cron) {
            this.putBodyParameter("cron", cron);
            this.cron = cron;
            return this;
        }

        /**
         * 实例描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 功能类型
         */
        public Builder functionType(String functionType) {
            this.putBodyParameter("functionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * 实例名称
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * 模型类型
         */
        public Builder modelType(String modelType) {
            this.putBodyParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        @Override
        public CreateFunctionInstanceRequest build() {
            return new CreateFunctionInstanceRequest(this);
        } 

    } 

    public static class CreateParameters extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("value")
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
             * 参数名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 参数值
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
}
