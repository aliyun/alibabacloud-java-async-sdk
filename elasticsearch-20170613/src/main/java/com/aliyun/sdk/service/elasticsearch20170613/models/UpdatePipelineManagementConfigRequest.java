// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > endpoints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pipelineIds")
    private java.util.List < String > pipelineIds;

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
    public java.util.List < String > getEndpoints() {
        return this.endpoints;
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
    public java.util.List < String > getPipelineIds() {
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
        private java.util.List < String > endpoints; 
        private String password; 
        private java.util.List < String > pipelineIds; 
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
            this.password = request.password;
            this.pipelineIds = request.pipelineIds;
            this.pipelineManagementType = request.pipelineManagementType;
            this.userName = request.userName;
            this.clientToken = request.clientToken;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * endpoints.
         */
        public Builder endpoints(java.util.List < String > endpoints) {
            this.putBodyParameter("endpoints", endpoints);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * password.
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * pipelineIds.
         */
        public Builder pipelineIds(java.util.List < String > pipelineIds) {
            this.putBodyParameter("pipelineIds", pipelineIds);
            this.pipelineIds = pipelineIds;
            return this;
        }

        /**
         * pipelineManagementType.
         */
        public Builder pipelineManagementType(String pipelineManagementType) {
            this.putBodyParameter("pipelineManagementType", pipelineManagementType);
            this.pipelineManagementType = pipelineManagementType;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("userName", userName);
            this.userName = userName;
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

        @Override
        public UpdatePipelineManagementConfigRequest build() {
            return new UpdatePipelineManagementConfigRequest(this);
        } 

    } 

}
