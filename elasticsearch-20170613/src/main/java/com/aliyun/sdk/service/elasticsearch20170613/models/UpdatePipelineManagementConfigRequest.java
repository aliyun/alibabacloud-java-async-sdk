// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePipelineManagementConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdatePipelineManagementConfigRequest</p>
 */
public class UpdatePipelineManagementConfigRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("endpoints")
    private java.util.List < String > endpoints;

    @Body
    @NameInMap("password")
    private String password;

    @Body
    @NameInMap("pipelineIds")
    private java.util.List < String > pipelineIds;

    @Body
    @NameInMap("pipelineManagementType")
    private String pipelineManagementType;

    @Body
    @NameInMap("userName")
    private String userName;

    @Query
    @NameInMap("clientToken")
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
         * ls-cn-oew1qbgl\*\*\*\*
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 开启Kibana管理管道后，Kibana所在Elasticsearch实例的访问地址列表。
         */
        public Builder endpoints(java.util.List < String > endpoints) {
            this.putBodyParameter("endpoints", endpoints);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * Kibana的密码。管理方式为ES设置
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * Kibana管理的管道列表。管理方式为ES设置
         */
        public Builder pipelineIds(java.util.List < String > pipelineIds) {
            this.putBodyParameter("pipelineIds", pipelineIds);
            this.pipelineIds = pipelineIds;
            return this;
        }

        /**
         * 管道管理方式
         */
        public Builder pipelineManagementType(String pipelineManagementType) {
            this.putBodyParameter("pipelineManagementType", pipelineManagementType);
            this.pipelineManagementType = pipelineManagementType;
            return this;
        }

        /**
         * Kibana的用户名。管理方式为ES设置
         */
        public Builder userName(String userName) {
            this.putBodyParameter("userName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * 5A2CFF0E-5718-45B5-9D4D-70B3FF\*\*\*\*
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
