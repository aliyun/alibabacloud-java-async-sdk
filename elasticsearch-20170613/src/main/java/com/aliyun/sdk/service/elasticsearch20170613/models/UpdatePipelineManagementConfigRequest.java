// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpdatePipelineManagementConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdatePipelineManagementConfigRequest</p>
 */
public class UpdatePipelineManagementConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endpoints")
    private java.util.List<String> endpoints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("esInstanceId")
    private String esInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pipelineIds")
    private java.util.List<String> pipelineIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pipelineManagementType")
    private String pipelineManagementType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdatePipelineManagementConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endpoints = builder.endpoints;
        this.esInstanceId = builder.esInstanceId;
        this.password = builder.password;
        this.pipelineIds = builder.pipelineIds;
        this.pipelineManagementType = builder.pipelineManagementType;
        this.userName = builder.userName;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePipelineManagementConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return endpoints
     */
    public java.util.List<String> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return esInstanceId
     */
    public String getEsInstanceId() {
        return this.esInstanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return pipelineIds
     */
    public java.util.List<String> getPipelineIds() {
        return this.pipelineIds;
    }

    /**
     * @return pipelineManagementType
     */
    public String getPipelineManagementType() {
        return this.pipelineManagementType;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdatePipelineManagementConfigRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> endpoints; 
        private String esInstanceId; 
        private String password; 
        private java.util.List<String> pipelineIds; 
        private String pipelineManagementType; 
        private String userName; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePipelineManagementConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endpoints = request.endpoints;
            this.esInstanceId = request.esInstanceId;
            this.password = request.password;
            this.pipelineIds = request.pipelineIds;
            this.pipelineManagementType = request.pipelineManagementType;
            this.userName = request.userName;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The Logstash instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-oew1qbgl****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of access addresses of the Elasticsearch instance where Kibana resides after Kibana pipeline management is enabled.</p>
         */
        public Builder endpoints(java.util.List<String> endpoints) {
            this.putBodyParameter("endpoints", endpoints);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * esInstanceId.
         */
        public Builder esInstanceId(String esInstanceId) {
            this.putBodyParameter("esInstanceId", esInstanceId);
            this.esInstanceId = esInstanceId;
            return this;
        }

        /**
         * <p>The password for logging on to Kibana.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The list of pipelines managed by Kibana.</p>
         */
        public Builder pipelineIds(java.util.List<String> pipelineIds) {
            this.putBodyParameter("pipelineIds", pipelineIds);
            this.pipelineIds = pipelineIds;
            return this;
        }

        /**
         * <p>The pipeline management method. Valid values:</p>
         * <ul>
         * <li>ES: Kibana pipeline management.</li>
         * <li>MULTIPLE_PIPELINE: configuration file management.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ES</p>
         */
        public Builder pipelineManagementType(String pipelineManagementType) {
            this.putBodyParameter("pipelineManagementType", pipelineManagementType);
            this.pipelineManagementType = pipelineManagementType;
            return this;
        }

        /**
         * <p>The username for logging on to Kibana.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("userName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>A unique token used to ensure idempotency of the request. The client generates this value. It must be unique across different requests and cannot exceed 64 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdatePipelineManagementConfigRequest build() {
            return new UpdatePipelineManagementConfigRequest(this);
        } 

    } 

}
