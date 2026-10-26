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
 * {@link ListDataMaskingColumnsRequest} extends {@link RequestModel}
 *
 * <p>ListDataMaskingColumnsRequest</p>
 */
public class ListDataMaskingColumnsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RiskLeveLId")
    private Long riskLeveLId;

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

    private ListDataMaskingColumnsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columnName = builder.columnName;
        this.currentPage = builder.currentPage;
        this.dbName = builder.dbName;
        this.engineType = builder.engineType;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.maskingStatus = builder.maskingStatus;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.productIds = builder.productIds;
        this.riskLeveLId = builder.riskLeveLId;
        this.riskLevelIds = builder.riskLevelIds;
        this.tableName = builder.tableName;
        this.templateId = builder.templateId;
        this.templateRuleIds = builder.templateRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataMaskingColumnsRequest create() {
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
     * @return riskLeveLId
     */
    public Long getRiskLeveLId() {
        return this.riskLeveLId;
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

    public static final class Builder extends Request.Builder<ListDataMaskingColumnsRequest, Builder> {
        private String regionId; 
        private String columnName; 
        private Integer currentPage; 
        private String dbName; 
        private String engineType; 
        private String instanceId; 
        private String lang; 
        private String maskingStatus; 
        private Integer pageSize; 
        private String productCode; 
        private Long productId; 
        private String productIds; 
        private Long riskLeveLId; 
        private String riskLevelIds; 
        private String tableName; 
        private Long templateId; 
        private String templateRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(ListDataMaskingColumnsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columnName = request.columnName;
            this.currentPage = request.currentPage;
            this.dbName = request.dbName;
            this.engineType = request.engineType;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.maskingStatus = request.maskingStatus;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.productIds = request.productIds;
            this.riskLeveLId = request.riskLeveLId;
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
         * <p>The filter condition for the column name.</p>
         * 
         * <strong>example:</strong>
         * <p>phone</p>
         */
        public Builder columnName(String columnName) {
            this.putQueryParameter("ColumnName", columnName);
            this.columnName = columnName;
            return this;
        }

        /**
         * <p>The current page number for the query. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>business_db</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The type of the database engine. It must be consistent with the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>The instance identity of the database. You can obtain it from Items[].InstanceId in the response of ListDataMaskingInstances.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the response description. Valid values: zh: Chinese; en: English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The filter for the column encryption status. Valid values: NotEncrypted: not encrypted; Success: encrypted successfully; Failed: encryption failed.</p>
         * 
         * <strong>example:</strong>
         * <p>NotEncrypted</p>
         */
        public Builder maskingStatus(String maskingStatus) {
            this.putQueryParameter("MaskingStatus", maskingStatus);
            this.maskingStatus = maskingStatus;
            return this;
        }

        /**
         * <p>The number of records to return per page. Keep other filter conditions consistent when querying the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The code of the cloud service. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also provided, the two must correspond to each other.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The ID of the cloud service type. Valid values: 5: RDS; 8: POLARDB; 27: PolarDBX2. It must correspond to ProductCode if both are specified.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The compatible parameter for the list of product IDs. For the current column query, use a single ProductId or ProductCode. Call the operation separately to query multiple products.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder productIds(String productIds) {
            this.putQueryParameter("ProductIds", productIds);
            this.productIds = productIds;
            return this;
        }

        /**
         * <p>The ID of a single sensitivity level. You can obtain it from ListRiskLevels. The uppercase L in the parameter name must be preserved.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder riskLeveLId(Long riskLeveLId) {
            this.putQueryParameter("RiskLeveLId", riskLeveLId);
            this.riskLeveLId = riskLeveLId;
            return this;
        }

        /**
         * <p>The list of sensitivity level IDs. Separate multiple values with commas. Select the values from the response of ListRiskLevels corresponding to the same TemplateId.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder riskLevelIds(String riskLevelIds) {
            this.putQueryParameter("RiskLevelIds", riskLevelIds);
            this.riskLevelIds = riskLevelIds;
            return this;
        }

        /**
         * <p>The name of the table. In PostgreSQL or Oracle scenarios, retain the schema.table format obtained from the table list.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The ID of the data classification template. You can obtain it from Items[].Id in the response of ListTemplates. It must be consistent with the selected sensitivity level and detection model.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The list of detection model IDs. Separate multiple values with commas. Select the values from the response of ListIdentifyModels corresponding to the same TemplateId.</p>
         * 
         * <strong>example:</strong>
         * <p>1001,1002</p>
         */
        public Builder templateRuleIds(String templateRuleIds) {
            this.putQueryParameter("TemplateRuleIds", templateRuleIds);
            this.templateRuleIds = templateRuleIds;
            return this;
        }

        @Override
        public ListDataMaskingColumnsRequest build() {
            return new ListDataMaskingColumnsRequest(this);
        } 

    } 

}
