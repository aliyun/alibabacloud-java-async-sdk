// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListDataMaskingInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListDataMaskingInstancesRequest</p>
 */
public class ListDataMaskingInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnName")
    private String columnName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaskingStatus")
    private String maskingStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTagId")
    private String modelTagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductIds")
    private String productIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelId")
    private Long riskLevelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelIds")
    private String riskLevelIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateRuleIds")
    private String templateRuleIds;

    private ListDataMaskingInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columnName = builder.columnName;
        this.currentPage = builder.currentPage;
        this.dbName = builder.dbName;
        this.engineType = builder.engineType;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.maskingStatus = builder.maskingStatus;
        this.modelTagId = builder.modelTagId;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.productIds = builder.productIds;
        this.riskLevelId = builder.riskLevelId;
        this.riskLevelIds = builder.riskLevelIds;
        this.tableName = builder.tableName;
        this.templateId = builder.templateId;
        this.templateRuleIds = builder.templateRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataMaskingInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
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
     * @return maskingStatus
     */
    public String getMaskingStatus() {
        return this.maskingStatus;
    }

    /**
     * @return modelTagId
     */
    public String getModelTagId() {
        return this.modelTagId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return productIds
     */
    public String getProductIds() {
        return this.productIds;
    }

    /**
     * @return riskLevelId
     */
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    /**
     * @return riskLevelIds
     */
    public String getRiskLevelIds() {
        return this.riskLevelIds;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateRuleIds
     */
    public String getTemplateRuleIds() {
        return this.templateRuleIds;
    }

    public static final class Builder extends Request.Builder<ListDataMaskingInstancesRequest, Builder> {
        private String regionId; 
        private String columnName; 
        private Integer currentPage; 
        private String dbName; 
        private String engineType; 
        private String instanceId; 
        private String lang; 
        private String maskingStatus; 
        private String modelTagId; 
        private Integer pageSize; 
        private String productCode; 
        private Long productId; 
        private String productIds; 
        private Long riskLevelId; 
        private String riskLevelIds; 
        private String tableName; 
        private Long templateId; 
        private String templateRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(ListDataMaskingInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columnName = request.columnName;
            this.currentPage = request.currentPage;
            this.dbName = request.dbName;
            this.engineType = request.engineType;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.maskingStatus = request.maskingStatus;
            this.modelTagId = request.modelTagId;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.productIds = request.productIds;
            this.riskLevelId = request.riskLevelId;
            this.riskLevelIds = request.riskLevelIds;
            this.tableName = request.tableName;
            this.templateId = request.templateId;
            this.templateRuleIds = request.templateRuleIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ColumnName.
         */
        public Builder columnName(String columnName) {
            this.putQueryParameter("ColumnName", columnName);
            this.columnName = columnName;
            return this;
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
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
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
         * MaskingStatus.
         */
        public Builder maskingStatus(String maskingStatus) {
            this.putQueryParameter("MaskingStatus", maskingStatus);
            this.maskingStatus = maskingStatus;
            return this;
        }

        /**
         * ModelTagId.
         */
        public Builder modelTagId(String modelTagId) {
            this.putQueryParameter("ModelTagId", modelTagId);
            this.modelTagId = modelTagId;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
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
         * RiskLevelId.
         */
        public Builder riskLevelId(Long riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * RiskLevelIds.
         */
        public Builder riskLevelIds(String riskLevelIds) {
            this.putQueryParameter("RiskLevelIds", riskLevelIds);
            this.riskLevelIds = riskLevelIds;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateRuleIds.
         */
        public Builder templateRuleIds(String templateRuleIds) {
            this.putQueryParameter("TemplateRuleIds", templateRuleIds);
            this.templateRuleIds = templateRuleIds;
            return this;
        }

        @Override
        public ListDataMaskingInstancesRequest build() {
            return new ListDataMaskingInstancesRequest(this);
        } 

    } 

}
