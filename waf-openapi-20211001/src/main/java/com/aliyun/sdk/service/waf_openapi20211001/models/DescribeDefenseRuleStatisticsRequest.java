// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDefenseRuleStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefenseRuleStatisticsRequest</p>
 */
public class DescribeDefenseRuleStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FourthKey")
    private String fourthKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryKey")
    private String secondaryKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdKey")
    private String thirdKey;

    private DescribeDefenseRuleStatisticsRequest(Builder builder) {
        super(builder);
        this.fourthKey = builder.fourthKey;
        this.instanceId = builder.instanceId;
        this.primaryKey = builder.primaryKey;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.secondaryKey = builder.secondaryKey;
        this.templateId = builder.templateId;
        this.thirdKey = builder.thirdKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseRuleStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fourthKey
     */
    public String getFourthKey() {
        return this.fourthKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return primaryKey
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return secondaryKey
     */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return thirdKey
     */
    public String getThirdKey() {
        return this.thirdKey;
    }

    public static final class Builder extends Request.Builder<DescribeDefenseRuleStatisticsRequest, Builder> {
        private String fourthKey; 
        private String instanceId; 
        private String primaryKey; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String secondaryKey; 
        private Long templateId; 
        private String thirdKey; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDefenseRuleStatisticsRequest request) {
            super(request);
            this.fourthKey = request.fourthKey;
            this.instanceId = request.instanceId;
            this.primaryKey = request.primaryKey;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.secondaryKey = request.secondaryKey;
            this.templateId = request.templateId;
            this.thirdKey = request.thirdKey;
        } 

        /**
         * <p>The quaternary query condition. The value cannot be the same as the primary, secondary, or tertiary query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>riskLevel</p>
         */
        public Builder fourthKey(String fourthKey) {
            this.putQueryParameter("FourthKey", fourthKey);
            this.fourthKey = fourthKey;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_elasticity-cn-0xldbqt****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The primary query condition.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scene</p>
         */
        public Builder primaryKey(String primaryKey) {
            this.putQueryParameter("PrimaryKey", primaryKey);
            this.primaryKey = primaryKey;
            return this;
        }

        /**
         * <p>The region where the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
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
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The secondary query condition. The value cannot be the same as the primary query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>action</p>
         */
        public Builder secondaryKey(String secondaryKey) {
            this.putQueryParameter("SecondaryKey", secondaryKey);
            this.secondaryKey = secondaryKey;
            return this;
        }

        /**
         * <p>The ID of the protection template to query.</p>
         * <blockquote>
         * <p>This operation supports querying protection templates under the new Bot Management (<strong>bot_manager</strong>) and new Web Core Protection (<strong>waf_base</strong>) scenarios. You can call <a href="https://help.aliyun.com/document_detail/2712643.html">DescribeDefenseTemplates</a> to query the protection scenario (DefenseScene) of a protection template.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>239136</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The tertiary query condition. The value cannot be the same as the primary or secondary query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>status</p>
         */
        public Builder thirdKey(String thirdKey) {
            this.putQueryParameter("ThirdKey", thirdKey);
            this.thirdKey = thirdKey;
            return this;
        }

        @Override
        public DescribeDefenseRuleStatisticsRequest build() {
            return new DescribeDefenseRuleStatisticsRequest(this);
        } 

    } 

}
