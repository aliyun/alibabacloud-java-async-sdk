// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVpcAccessAndAbolishApisRequest} extends {@link RequestModel}
 *
 * <p>RemoveVpcAccessAndAbolishApisRequest</p>
 */
public class RemoveVpcAccessAndAbolishApisRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NeedBatchWork")
    private Boolean needBatchWork;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private Integer port;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private RemoveVpcAccessAndAbolishApisRequest(Builder builder) {
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

    public static RemoveVpcAccessAndAbolishApisRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveVpcAccessAndAbolishApisRequest, Builder> {
        private String instanceId; 
        private Boolean needBatchWork; 
        private Integer port; 
        private String securityToken; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveVpcAccessAndAbolishApisRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.needBatchWork = request.needBatchWork;
            this.port = request.port;
            this.securityToken = request.securityToken;
            this.vpcId = request.vpcId;
        } 

        /**
         * The ID of the ECS or SLB instance in the VPC.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether batch work is required.
         */
        public Builder needBatchWork(Boolean needBatchWork) {
            this.putQueryParameter("NeedBatchWork", needBatchWork);
            this.needBatchWork = needBatchWork;
            return this;
        }

        /**
         * The service port.
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
         * The ID of the VPC to be operated.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public RemoveVpcAccessAndAbolishApisRequest build() {
            return new RemoveVpcAccessAndAbolishApisRequest(this);
        } 

    } 

}
