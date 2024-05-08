// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceInstanceSpecRequest</p>
 */
public class UpdateServiceInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableUserPrometheus")
    private Boolean enableUserPrometheus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationName")
    private String operationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PredefinedParametersName")
    private String predefinedParametersName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    private UpdateServiceInstanceSpecRequest(Builder builder) {
        super(builder);
        this.enableUserPrometheus = builder.enableUserPrometheus;
        this.operationName = builder.operationName;
        this.parameters = builder.parameters;
        this.predefinedParametersName = builder.predefinedParametersName;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceInstanceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableUserPrometheus
     */
    public Boolean getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    /**
     * @return operationName
     */
    public String getOperationName() {
        return this.operationName;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return predefinedParametersName
     */
    public String getPredefinedParametersName() {
        return this.predefinedParametersName;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<UpdateServiceInstanceSpecRequest, Builder> {
        private Boolean enableUserPrometheus; 
        private String operationName; 
        private java.util.Map < String, ? > parameters; 
        private String predefinedParametersName; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceInstanceSpecRequest request) {
            super(request);
            this.enableUserPrometheus = request.enableUserPrometheus;
            this.operationName = request.operationName;
            this.parameters = request.parameters;
            this.predefinedParametersName = request.predefinedParametersName;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * EnableUserPrometheus.
         */
        public Builder enableUserPrometheus(Boolean enableUserPrometheus) {
            this.putQueryParameter("EnableUserPrometheus", enableUserPrometheus);
            this.enableUserPrometheus = enableUserPrometheus;
            return this;
        }

        /**
         * OperationName.
         */
        public Builder operationName(String operationName) {
            this.putQueryParameter("OperationName", operationName);
            this.operationName = operationName;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * PredefinedParametersName.
         */
        public Builder predefinedParametersName(String predefinedParametersName) {
            this.putQueryParameter("PredefinedParametersName", predefinedParametersName);
            this.predefinedParametersName = predefinedParametersName;
            return this;
        }

        /**
         * ServiceInstanceId.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public UpdateServiceInstanceSpecRequest build() {
            return new UpdateServiceInstanceSpecRequest(this);
        } 

    } 

}
