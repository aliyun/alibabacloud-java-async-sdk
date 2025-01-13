// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeDataObjectsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataObjectsRequest</p>
 */
public class DescribeDataObjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    private Long domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileCategoryCode")
    private Long fileCategoryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private Long fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberAccount")
    private Long memberAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelIds")
    private String modelIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTagIds")
    private String modelTagIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentCategoryIds")
    private String parentCategoryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductIds")
    private String productIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryName")
    private String queryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevels")
    private String riskLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    private String serviceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    private DescribeDataObjectsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.domainId = builder.domainId;
        this.featureType = builder.featureType;
        this.fileCategoryCode = builder.fileCategoryCode;
        this.fileType = builder.fileType;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.memberAccount = builder.memberAccount;
        this.modelIds = builder.modelIds;
        this.modelTagIds = builder.modelTagIds;
        this.pageSize = builder.pageSize;
        this.parentCategoryIds = builder.parentCategoryIds;
        this.productIds = builder.productIds;
        this.queryName = builder.queryName;
        this.riskLevels = builder.riskLevels;
        this.serviceRegionId = builder.serviceRegionId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataObjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return domainId
     */
    public Long getDomainId() {
        return this.domainId;
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return fileCategoryCode
     */
    public Long getFileCategoryCode() {
        return this.fileCategoryCode;
    }

    /**
     * @return fileType
     */
    public Long getFileType() {
        return this.fileType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberAccount
     */
    public Long getMemberAccount() {
        return this.memberAccount;
    }

    /**
     * @return modelIds
     */
    public String getModelIds() {
        return this.modelIds;
    }

    /**
     * @return modelTagIds
     */
    public String getModelTagIds() {
        return this.modelTagIds;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentCategoryIds
     */
    public String getParentCategoryIds() {
        return this.parentCategoryIds;
    }

    /**
     * @return productIds
     */
    public String getProductIds() {
        return this.productIds;
    }

    /**
     * @return queryName
     */
    public String getQueryName() {
        return this.queryName;
    }

    /**
     * @return riskLevels
     */
    public String getRiskLevels() {
        return this.riskLevels;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeDataObjectsRequest, Builder> {
        private Integer currentPage; 
        private Long domainId; 
        private Integer featureType; 
        private Long fileCategoryCode; 
        private Long fileType; 
        private String instanceId; 
        private String lang; 
        private Long memberAccount; 
        private String modelIds; 
        private String modelTagIds; 
        private Integer pageSize; 
        private String parentCategoryIds; 
        private String productIds; 
        private String queryName; 
        private String riskLevels; 
        private String serviceRegionId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataObjectsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.domainId = request.domainId;
            this.featureType = request.featureType;
            this.fileCategoryCode = request.fileCategoryCode;
            this.fileType = request.fileType;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.memberAccount = request.memberAccount;
            this.modelIds = request.modelIds;
            this.modelTagIds = request.modelTagIds;
            this.pageSize = request.pageSize;
            this.parentCategoryIds = request.parentCategoryIds;
            this.productIds = request.productIds;
            this.queryName = request.queryName;
            this.riskLevels = request.riskLevels;
            this.serviceRegionId = request.serviceRegionId;
            this.templateId = request.templateId;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DomainId.
         */
        public Builder domainId(Long domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * FeatureType.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * FileCategoryCode.
         */
        public Builder fileCategoryCode(Long fileCategoryCode) {
            this.putQueryParameter("FileCategoryCode", fileCategoryCode);
            this.fileCategoryCode = fileCategoryCode;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(Long fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MemberAccount.
         */
        public Builder memberAccount(Long memberAccount) {
            this.putQueryParameter("MemberAccount", memberAccount);
            this.memberAccount = memberAccount;
            return this;
        }

        /**
         * ModelIds.
         */
        public Builder modelIds(String modelIds) {
            this.putQueryParameter("ModelIds", modelIds);
            this.modelIds = modelIds;
            return this;
        }

        /**
         * ModelTagIds.
         */
        public Builder modelTagIds(String modelTagIds) {
            this.putQueryParameter("ModelTagIds", modelTagIds);
            this.modelTagIds = modelTagIds;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ParentCategoryIds.
         */
        public Builder parentCategoryIds(String parentCategoryIds) {
            this.putQueryParameter("ParentCategoryIds", parentCategoryIds);
            this.parentCategoryIds = parentCategoryIds;
            return this;
        }

        /**
         * ProductIds.
         */
        public Builder productIds(String productIds) {
            this.putQueryParameter("ProductIds", productIds);
            this.productIds = productIds;
            return this;
        }

        /**
         * QueryName.
         */
        public Builder queryName(String queryName) {
            this.putQueryParameter("QueryName", queryName);
            this.queryName = queryName;
            return this;
        }

        /**
         * RiskLevels.
         */
        public Builder riskLevels(String riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * ServiceRegionId.
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeDataObjectsRequest build() {
            return new DescribeDataObjectsRequest(this);
        } 

    } 

}
