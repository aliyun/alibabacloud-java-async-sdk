// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link RemoveVpcAccessRequest} extends {@link RequestModel}
 *
 * <p>RemoveVpcAccessRequest</p>
 */
public class RemoveVpcAccessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedBatchWork")
    private Boolean needBatchWork;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private RemoveVpcAccessRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.needBatchWork = builder.needBatchWork;
        this.port = builder.port;
        this.securityToken = builder.securityToken;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveVpcAccessRequest create() {
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<RemoveVpcAccessRequest, Builder> {
        private String instanceId; 
        private Boolean needBatchWork; 
        private Integer port; 
        private String securityToken; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveVpcAccessRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.needBatchWork = request.needBatchWork;
            this.port = request.port;
            this.securityToken = request.securityToken;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The ID of an ECS or SLB instance in the VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6bzcg1pr4oh5jjmxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether batch work is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needBatchWork(Boolean needBatchWork) {
            this.putQueryParameter("NeedBatchWork", needBatchWork);
            this.needBatchWork = needBatchWork;
            return this;
        }

        /**
         * <p>The port number that corresponds to the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
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
         * <p>The ID of the VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf657qec7lx42paw3qxxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public RemoveVpcAccessRequest build() {
            return new RemoveVpcAccessRequest(this);
        } 

    } 

}
