// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link UpdateServiceInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceInstanceSpecRequest</p>
 */
public class UpdateServiceInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableUserPrometheus")
    private Boolean enableUserPrometheus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationName")
    private String operationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PredefinedParametersName")
    private String predefinedParametersName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    private UpdateServiceInstanceSpecRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
    public java.util.Map<String, ?> getParameters() {
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
        private String clientToken; 
        private Boolean enableUserPrometheus; 
        private String operationName; 
        private java.util.Map<String, ?> parameters; 
        private String predefinedParametersName; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceInstanceSpecRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.enableUserPrometheus = request.enableUserPrometheus;
            this.operationName = request.operationName;
            this.parameters = request.parameters;
            this.predefinedParametersName = request.predefinedParametersName;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>10CM943JP0EN9D51H</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enable Prometheus on the customer side. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableUserPrometheus(Boolean enableUserPrometheus) {
            this.putQueryParameter("EnableUserPrometheus", enableUserPrometheus);
            this.enableUserPrometheus = enableUserPrometheus;
            return this;
        }

        /**
         * <p>The name of the configuration update operation.</p>
         * 
         * <strong>example:</strong>
         * <p>package modify</p>
         */
        public Builder operationName(String operationName) {
            this.putQueryParameter("OperationName", operationName);
            this.operationName = operationName;
            return this;
        }

        /**
         * <p>The configuration parameters of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EcsInstanceParameter&quot;:&quot;4vCPU 8GiB&quot;,&quot;ZoneId&quot;:&quot;cn-heyuan-a&quot;,&quot;SystemDiskSize&quot;:50,&quot;DataDiskSize&quot;:150,&quot;InternetMaxBandwidthOut&quot;:2,&quot;RegionId&quot;:&quot;cn-heyuan&quot;}</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The name of the specification package.</p>
         * 
         * <strong>example:</strong>
         * <p>package one</p>
         */
        public Builder predefinedParametersName(String predefinedParametersName) {
            this.putQueryParameter("PredefinedParametersName", predefinedParametersName);
            this.predefinedParametersName = predefinedParametersName;
            return this;
        }

        /**
         * <p>The service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>si-0e6fca6a51a54420****</p>
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
