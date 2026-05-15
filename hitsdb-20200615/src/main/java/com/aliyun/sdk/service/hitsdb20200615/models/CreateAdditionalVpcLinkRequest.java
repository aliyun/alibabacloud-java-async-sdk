// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link CreateAdditionalVpcLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateAdditionalVpcLinkRequest</p>
 */
public class CreateAdditionalVpcLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalAliBid")
    private String additionalAliBid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalAliUid")
    private String additionalAliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalVpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String additionalVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalVswitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String additionalVswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private CreateAdditionalVpcLinkRequest(Builder builder) {
        super(builder);
        this.additionalAliBid = builder.additionalAliBid;
        this.additionalAliUid = builder.additionalAliUid;
        this.additionalVpcId = builder.additionalVpcId;
        this.additionalVswitchId = builder.additionalVswitchId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAdditionalVpcLinkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalAliBid
     */
    public String getAdditionalAliBid() {
        return this.additionalAliBid;
    }

    /**
     * @return additionalAliUid
     */
    public String getAdditionalAliUid() {
        return this.additionalAliUid;
    }

    /**
     * @return additionalVpcId
     */
    public String getAdditionalVpcId() {
        return this.additionalVpcId;
    }

    /**
     * @return additionalVswitchId
     */
    public String getAdditionalVswitchId() {
        return this.additionalVswitchId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CreateAdditionalVpcLinkRequest, Builder> {
        private String additionalAliBid; 
        private String additionalAliUid; 
        private String additionalVpcId; 
        private String additionalVswitchId; 
        private String instanceId; 
        private String regionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateAdditionalVpcLinkRequest request) {
            super(request);
            this.additionalAliBid = request.additionalAliBid;
            this.additionalAliUid = request.additionalAliUid;
            this.additionalVpcId = request.additionalVpcId;
            this.additionalVswitchId = request.additionalVswitchId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.securityToken = request.securityToken;
        } 

        /**
         * AdditionalAliBid.
         */
        public Builder additionalAliBid(String additionalAliBid) {
            this.putQueryParameter("AdditionalAliBid", additionalAliBid);
            this.additionalAliBid = additionalAliBid;
            return this;
        }

        /**
         * AdditionalAliUid.
         */
        public Builder additionalAliUid(String additionalAliUid) {
            this.putQueryParameter("AdditionalAliUid", additionalAliUid);
            this.additionalAliUid = additionalAliUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder additionalVpcId(String additionalVpcId) {
            this.putQueryParameter("AdditionalVpcId", additionalVpcId);
            this.additionalVpcId = additionalVpcId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder additionalVswitchId(String additionalVswitchId) {
            this.putQueryParameter("AdditionalVswitchId", additionalVswitchId);
            this.additionalVswitchId = additionalVswitchId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public CreateAdditionalVpcLinkRequest build() {
            return new CreateAdditionalVpcLinkRequest(this);
        } 

    } 

}
