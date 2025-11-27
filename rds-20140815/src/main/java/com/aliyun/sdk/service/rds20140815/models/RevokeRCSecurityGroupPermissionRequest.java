// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link RevokeRCSecurityGroupPermissionRequest} extends {@link RequestModel}
 *
 * <p>RevokeRCSecurityGroupPermissionRequest</p>
 */
public class RevokeRCSecurityGroupPermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupRuleIdList")
    private java.util.List<String> securityGroupRuleIdList;

    private RevokeRCSecurityGroupPermissionRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.regionId = builder.regionId;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupRuleIdList = builder.securityGroupRuleIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeRCSecurityGroupPermissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupRuleIdList
     */
    public java.util.List<String> getSecurityGroupRuleIdList() {
        return this.securityGroupRuleIdList;
    }

    public static final class Builder extends Request.Builder<RevokeRCSecurityGroupPermissionRequest, Builder> {
        private String direction; 
        private String regionId; 
        private String securityGroupId; 
        private java.util.List<String> securityGroupRuleIdList; 

        private Builder() {
            super();
        } 

        private Builder(RevokeRCSecurityGroupPermissionRequest request) {
            super(request);
            this.direction = request.direction;
            this.regionId = request.regionId;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupRuleIdList = request.securityGroupRuleIdList;
        } 

        /**
         * <p>The direction of the security group rules that you want to delete. Valid values:</p>
         * <ul>
         * <li><strong>ingress</strong>: inbound security group rules.</li>
         * <li><strong>egress</strong>: outbound security group rules.</li>
         * </ul>
         * <blockquote>
         * <p> You can specify security group rules only in the same direction in a request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze27hs990o2hn9****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The IDs of the security group rules that you want to delete.</p>
         */
        public Builder securityGroupRuleIdList(java.util.List<String> securityGroupRuleIdList) {
            String securityGroupRuleIdListShrink = shrink(securityGroupRuleIdList, "SecurityGroupRuleIdList", "json");
            this.putQueryParameter("SecurityGroupRuleIdList", securityGroupRuleIdListShrink);
            this.securityGroupRuleIdList = securityGroupRuleIdList;
            return this;
        }

        @Override
        public RevokeRCSecurityGroupPermissionRequest build() {
            return new RevokeRCSecurityGroupPermissionRequest(this);
        } 

    } 

}
