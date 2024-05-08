// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcAccessAndUpdateApisRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcAccessAndUpdateApisRequest</p>
 */
public class ModifyVpcAccessAndUpdateApisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedBatchWork")
    private Boolean needBatchWork;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Refresh")
    private Boolean refresh;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcTargetHostName")
    private String vpcTargetHostName;

    private ModifyVpcAccessAndUpdateApisRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.needBatchWork = builder.needBatchWork;
        this.port = builder.port;
        this.refresh = builder.refresh;
        this.securityToken = builder.securityToken;
        this.token = builder.token;
        this.vpcId = builder.vpcId;
        this.vpcTargetHostName = builder.vpcTargetHostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcAccessAndUpdateApisRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return needBatchWork
     */
    public Boolean getNeedBatchWork() {
        return this.needBatchWork;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return refresh
     */
    public Boolean getRefresh() {
        return this.refresh;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcTargetHostName
     */
    public String getVpcTargetHostName() {
        return this.vpcTargetHostName;
    }

    public static final class Builder extends Request.Builder<ModifyVpcAccessAndUpdateApisRequest, Builder> {
        private String instanceId; 
        private String name; 
        private Boolean needBatchWork; 
        private Integer port; 
        private Boolean refresh; 
        private String securityToken; 
        private String token; 
        private String vpcId; 
        private String vpcTargetHostName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcAccessAndUpdateApisRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.needBatchWork = request.needBatchWork;
            this.port = request.port;
            this.refresh = request.refresh;
            this.securityToken = request.securityToken;
            this.token = request.token;
            this.vpcId = request.vpcId;
            this.vpcTargetHostName = request.vpcTargetHostName;
        } 

        /**
         * The ID of the new instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the VPC authorization.
         * <p>
         * 
         * > 
         * 
         * *   The name of a VPC authorization cannot be changed. You cannot use this parameter to change the name of a VPC authorization.
         * 
         * *   You must set this parameter to the name of the current VPC authorization.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Specifies whether to update the associated API.
         * <p>
         * 
         * **
         * 
         * **Warning:** If you want to update the VPC authorization of a published API, you must set this parameter to true. Otherwise, the update will not be synchronized to the backend service of the API.
         */
        public Builder needBatchWork(Boolean needBatchWork) {
            this.putQueryParameter("NeedBatchWork", needBatchWork);
            this.needBatchWork = needBatchWork;
            return this;
        }

        /**
         * The new port number.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * Specifies whether to update the VPC authorization.
         * <p>
         * 
         * > 
         * 
         * *   If the ID of the instance in your VPC is changed but the IP address of the instance remains unchanged, you can set this parameter to true to update the VPC authorization.
         */
        public Builder refresh(Boolean refresh) {
            this.putQueryParameter("Refresh", refresh);
            this.refresh = refresh;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The token of the request.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * The ID of the new VPC.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The hostname of the backend service.
         */
        public Builder vpcTargetHostName(String vpcTargetHostName) {
            this.putQueryParameter("VpcTargetHostName", vpcTargetHostName);
            this.vpcTargetHostName = vpcTargetHostName;
            return this;
        }

        @Override
        public ModifyVpcAccessAndUpdateApisRequest build() {
            return new ModifyVpcAccessAndUpdateApisRequest(this);
        } 

    } 

}
