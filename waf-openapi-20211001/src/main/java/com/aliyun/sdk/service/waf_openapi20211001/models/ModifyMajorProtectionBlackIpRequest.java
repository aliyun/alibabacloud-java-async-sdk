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
 * {@link ModifyMajorProtectionBlackIpRequest} extends {@link RequestModel}
 *
 * <p>ModifyMajorProtectionBlackIpRequest</p>
 */
public class ModifyMajorProtectionBlackIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expiredTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    private ModifyMajorProtectionBlackIpRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.expiredTime = builder.expiredTime;
        this.instanceId = builder.instanceId;
        this.ipList = builder.ipList;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.ruleId = builder.ruleId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMajorProtectionBlackIpRequest create() {
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
     * @return expiredTime
     */
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipList
     */
    public String getIpList() {
        return this.ipList;
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
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ModifyMajorProtectionBlackIpRequest, Builder> {
        private String description; 
        private Long expiredTime; 
        private String instanceId; 
        private String ipList; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Long ruleId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMajorProtectionBlackIpRequest request) {
            super(request);
            this.description = request.description;
            this.expiredTime = request.expiredTime;
            this.instanceId = request.instanceId;
            this.ipList = request.ipList;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.ruleId = request.ruleId;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Protection for major events</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The expiration timestamp. Unit: seconds.</p>
         * <blockquote>
         * <p>A value of <strong>0</strong> indicates that the rule permanently takes effect.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1662603328</p>
         */
        public Builder expiredTime(Long expiredTime) {
            this.putQueryParameter("ExpiredTime", expiredTime);
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_cdnsdf3****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IP blacklist to be added. You can specify custom IP addresses or CIDR blocks for the IP blacklist. Both IPv4 and IPv6 addresses are supported. Separate multiple IP addresses with commas (,).
         * For more information, see <a href="https://help.aliyun.com/document_detail/425591.html">Critical event protection</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12.XX.XX.2,3.XX.XX.3/24</p>
         */
        public Builder ipList(String ipList) {
            this.putQueryParameter("IpList", ipList);
            this.ipList = ipList;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland</p>
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
         * <p>The ID of the IP blacklist rule for critical event protection. Before you obtain the rule ID, enable the critical event protection feature. Then, call the <a href="https://help.aliyun.com/document_detail/2712643.html">DescribeDefenseTemplates</a> operation and set DefenseScene to major_protection to obtain the ID of the critical event protection template. After that, call the <a href="https://help.aliyun.com/document_detail/461426.html">DescribeDefenseRules</a> operation to obtain the ID of the IP blacklist rule under the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20012033</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The ID of the critical event protection template. Before you obtain the template ID, enable the critical event protection feature. Then, call the <a href="https://help.aliyun.com/document_detail/2712643.html">DescribeDefenseTemplates</a> operation and set DefenseScene to major_protection to obtain the ID of the critical event protection template.</p>
         * <blockquote>
         * <p>You can create this type of template only after you purchase critical event protection through an upgrade.</p>
         * <p>For more information about how to enable critical event protection and create a critical event protection rule template, see <a href="https://help.aliyun.com/document_detail/425591.html">Critical event protection</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5132</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ModifyMajorProtectionBlackIpRequest build() {
            return new ModifyMajorProtectionBlackIpRequest(this);
        } 

    } 

}
