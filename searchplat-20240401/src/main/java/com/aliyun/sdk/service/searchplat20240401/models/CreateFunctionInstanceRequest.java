// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createParameters")
    private java.util.List<CreateParameters> createParameters;

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

    private CreateFunctionInstanceRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.functionName = builder.functionName;
        this.createParameters = builder.createParameters;
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
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
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
        private String workspaceName; 
        private String functionName; 
        private java.util.List<CreateParameters> createParameters; 
        private String description; 
        private String functionType; 
        private String instanceName; 
        private String modelType; 

        private Builder() {
            super();
        } 

        private Builder(CreateFunctionInstanceRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.functionName = request.functionName;
            this.createParameters = request.createParameters;
            this.description = request.description;
            this.functionType = request.functionType;
            this.instanceName = request.instanceName;
            this.modelType = request.modelType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myWorkspace</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nl2sql</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>实例的参数列表</p>
         */
        public Builder createParameters(java.util.List<CreateParameters> createParameters) {
            this.putBodyParameter("createParameters", createParameters);
            this.createParameters = createParameters;
            return this;
        }

        /**
         * <p>实例描述</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>功能类型</p>
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
         * <p>实例名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>模型类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ops-query-analyze-nl2sql-001</p>
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
             * <p>参数名称</p>
             * 
             * <strong>example:</strong>
             * <p>config</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>参数值</p>
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
