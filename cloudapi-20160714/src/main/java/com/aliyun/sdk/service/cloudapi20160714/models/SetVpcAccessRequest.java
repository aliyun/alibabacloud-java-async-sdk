// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetVpcAccessRequest} extends {@link RequestModel}
 *
 * <p>SetVpcAccessRequest</p>
 */
public class SetVpcAccessRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

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

    @Query
    @NameInMap("VpcTargetHostName")
    private String vpcTargetHostName;

    private SetVpcAccessRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.port = builder.port;
        this.securityToken = builder.securityToken;
        this.vpcId = builder.vpcId;
        this.vpcTargetHostName = builder.vpcTargetHostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetVpcAccessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    /**
     * @return vpcTargetHostName
     */
    public String getVpcTargetHostName() {
        return this.vpcTargetHostName;
    }

    public static final class Builder extends Request.Builder<SetVpcAccessRequest, Builder> {
        private String description; 
        private String instanceId; 
        private String name; 
        private Integer port; 
        private String securityToken; 
        private String vpcId; 
        private String vpcTargetHostName; 

        private Builder() {
            super();
        } 

        private Builder(SetVpcAccessRequest request) {
            super(request);
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.port = request.port;
            this.securityToken = request.securityToken;
            this.vpcId = request.vpcId;
            this.vpcTargetHostName = request.vpcTargetHostName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Port.
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VpcTargetHostName.
         */
        public Builder vpcTargetHostName(String vpcTargetHostName) {
            this.putQueryParameter("VpcTargetHostName", vpcTargetHostName);
            this.vpcTargetHostName = vpcTargetHostName;
            return this;
        }

        @Override
        public SetVpcAccessRequest build() {
            return new SetVpcAccessRequest(this);
        } 

    } 

}
