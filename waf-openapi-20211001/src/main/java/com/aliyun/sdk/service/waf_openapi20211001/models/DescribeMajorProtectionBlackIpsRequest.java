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
 * {@link DescribeMajorProtectionBlackIpsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMajorProtectionBlackIpsRequest</p>
 */
public class DescribeMajorProtectionBlackIpsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpLike")
    private String ipLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private DescribeMajorProtectionBlackIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ipLike = builder.ipLike;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.ruleId = builder.ruleId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMajorProtectionBlackIpsRequest create() {
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
     * @return ipLike
     */
    public String getIpLike() {
        return this.ipLike;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<DescribeMajorProtectionBlackIpsRequest, Builder> {
        private String instanceId; 
        private String ipLike; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Long ruleId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMajorProtectionBlackIpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ipLike = request.ipLike;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.ruleId = request.ruleId;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
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
         * <p>The IP address to query. You can set this parameter to perform a fuzzy match against the added IP blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder ipLike(String ipLike) {
            this.putQueryParameter("IpLike", ipLike);
            this.ipLike = ipLike;
            return this;
        }

        /**
         * <p>The sorting attribute. Results are sorted in <strong>descending order</strong> by the specified attribute. Valid values:</p>
         * <ul>
         * <li><p><strong>gmtModified</strong>: sorts by modification time.</p>
         * </li>
         * <li><p><strong>ip</strong>: sorts by IP address.</p>
         * </li>
         * <li><p><strong>templateId</strong>: sorts by template ID.</p>
         * </li>
         * <li><p><strong>id</strong>: sorts by primary key.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gmtModified</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number to return when paging is used. Default value: <strong>1</strong>, which indicates the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page when paging is used. Default value: <strong>10</strong>, which indicates 10 entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * <p>The Alibaba Cloud resource group ID.</p>
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
         * <p>The ID of the critical event protection IP blacklist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20013199</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The ID of the critical event protection template.</p>
         * <blockquote>
         * <p>This parameter requires the ID of a protection template of the critical event protection type. You can create this type of template only after purchasing the critical event protection upgrade separately.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5673</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeMajorProtectionBlackIpsRequest build() {
            return new DescribeMajorProtectionBlackIpsRequest(this);
        } 

    } 

}
