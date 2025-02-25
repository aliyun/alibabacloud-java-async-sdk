// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryInstanceSpec4ModifyRequest} extends {@link RequestModel}
 *
 * <p>QueryInstanceSpec4ModifyRequest</p>
 */
public class QueryInstanceSpec4ModifyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MethodName")
    private String methodName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    private QueryInstanceSpec4ModifyRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.instanceId = builder.instanceId;
        this.methodName = builder.methodName;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstanceSpec4ModifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return methodName
     */
    public String getMethodName() {
        return this.methodName;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<QueryInstanceSpec4ModifyRequest, Builder> {
        private String applicationId; 
        private String instanceId; 
        private String methodName; 
        private java.util.Map < String, ? > parameters; 

        private Builder() {
            super();
        } 

        private Builder(QueryInstanceSpec4ModifyRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.instanceId = request.instanceId;
            this.methodName = request.methodName;
            this.parameters = request.parameters;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BE68D71ZY5YYIU9R</p>
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf66k9143r2ch*****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MethodName.
         */
        public Builder methodName(String methodName) {
            this.putBodyParameter("MethodName", methodName);
            this.methodName = methodName;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putBodyParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        @Override
        public QueryInstanceSpec4ModifyRequest build() {
            return new QueryInstanceSpec4ModifyRequest(this);
        } 

    } 

}
