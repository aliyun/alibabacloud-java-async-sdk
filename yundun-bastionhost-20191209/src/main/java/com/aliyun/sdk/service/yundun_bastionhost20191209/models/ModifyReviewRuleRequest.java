// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ModifyReviewRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyReviewRuleRequest</p>
 */
public class ModifyReviewRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReviewRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    private Integer scopeType;

    private ModifyReviewRuleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.reviewRuleId = builder.reviewRuleId;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReviewRuleRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reviewRuleId
     */
    public Long getReviewRuleId() {
        return this.reviewRuleId;
    }

    /**
     * @return scopeType
     */
    public Integer getScopeType() {
        return this.scopeType;
    }

    public static final class Builder extends Request.Builder<ModifyReviewRuleRequest, Builder> {
        private String description; 
        private String instanceId; 
        private String name; 
        private String regionId; 
        private Long reviewRuleId; 
        private Integer scopeType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReviewRuleRequest request) {
            super(request);
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.regionId = request.regionId;
            this.reviewRuleId = request.reviewRuleId;
            this.scopeType = request.scopeType;
        } 

        /**
         * <p>The new description of the audit policy. The description can be up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The instance ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the instance ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-wwo36qbv601</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new name of the audit policy. The name must be 1 to 128 characters in length. It cannot start with a special character and can contain only the following special characters: periods (.), underscores (_), hyphens (-), backslashes (\), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID of the Bastionhost instance. </p>
         * <blockquote>
         * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
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
         * <p>The ID of the audit policy.</p>
         * <blockquote>
         * <p>You can invoke the ListReviewRules operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reviewRuleId(Long reviewRuleId) {
            this.putQueryParameter("ReviewRuleId", reviewRuleId);
            this.reviewRuleId = reviewRuleId;
            return this;
        }

        /**
         * <p>The type of the asset scope rule for auditable assets. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: All projects.</p>
         * </li>
         * <li><p><strong>2</strong>: Specified projects.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scopeType(Integer scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        @Override
        public ModifyReviewRuleRequest build() {
            return new ModifyReviewRuleRequest(this);
        } 

    } 

}
