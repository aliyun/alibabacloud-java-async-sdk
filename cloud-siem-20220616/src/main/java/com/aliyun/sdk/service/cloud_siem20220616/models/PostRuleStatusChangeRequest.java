// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link PostRuleStatusChangeRequest} extends {@link RequestModel}
 *
 * <p>PostRuleStatusChangeRequest</p>
 */
public class PostRuleStatusChangeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InUse")
    private Boolean inUse;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    private PostRuleStatusChangeRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.inUse = builder.inUse;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostRuleStatusChangeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return inUse
     */
    public Boolean getInUse() {
        return this.inUse;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<PostRuleStatusChangeRequest, Builder> {
        private String ids; 
        private Boolean inUse; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(PostRuleStatusChangeRequest request) {
            super(request);
            this.ids = request.ids;
            this.inUse = request.inUse;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>The rule IDs. The value is a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[123,345]</p>
         */
        public Builder ids(String ids) {
            this.putBodyParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder inUse(Boolean inUse) {
            this.putBodyParameter("InUse", inUse);
            this.inUse = inUse;
            return this;
        }

        /**
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions in China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the account that you switch from the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The type of the view. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account</li>
         * <li>1: the global account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li>predefine</li>
         * <li>customize</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customize</p>
         */
        public Builder ruleType(String ruleType) {
            this.putBodyParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public PostRuleStatusChangeRequest build() {
            return new PostRuleStatusChangeRequest(this);
        } 

    } 

}
