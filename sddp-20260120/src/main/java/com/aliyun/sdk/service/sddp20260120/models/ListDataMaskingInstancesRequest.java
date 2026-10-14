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
         * <p>The column name filter condition.</p>
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
         * <p>The page number of the current query. Pages start from 1.</p>
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
         * <p>The database engine type. The value must match the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
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
         * <p>The instance identity of the database instance. You can obtain the value from Items[].InstanceId in the response of ListDataMaskingInstances.</p>
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
         * <p>The language of the response description. Valid values:</p>
         * <ul>
         * <li>zh: Chinese.</li>
         * <li>en: English.</li>
         * </ul>
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
         * <p>The column encryption status used for filtering. Valid values:</p>
         * <ul>
         * <li>NotEncrypted: Not encrypted.</li>
         * <li>Success: Encryption succeeded.</li>
         * <li>Failed: Encryption failed.</li>
         * </ul>
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
         * <p>The ID of the model tag. This parameter is used to limit the data to those that match the specified model tag.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder modelTagId(String modelTagId) {
            this.putQueryParameter("ModelTagId", modelTagId);
            this.modelTagId = modelTagId;
            return this;
        }

        /**
         * <p>The number of records per page. Keep other filter conditions consistent when querying the next page.</p>
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
         * <p>The code of the cloud product. Column encryption supports RDS, POLARDB, and PolarDBX2. If you also specify ProductId, the two values must correspond to each other.</p>
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
         * <p>The ID of the cloud product type. Valid values: 5 (RDS), 8 (POLARDB), and 27 (PolarDBX2). If you specify both ProductId and ProductCode, the values must correspond to each other.</p>
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
         * <p>The list of cloud product type IDs. Separate multiple values with commas (,). Valid values for column encryption: 5 (RDS), 8 (POLARDB), and 27 (PolarDBX2).</p>
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
         * <p>The ID of the sensitivity level. You can obtain the value from the response of ListRiskLevels.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder riskLevelId(Long riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * <p>The list of sensitivity level IDs. Separate multiple values with commas (,). Select values from the response of ListRiskLevels that corresponds to the same TemplateId.</p>
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
         * <p>The name of the table. For PostgreSQL or Oracle scenarios, retain the schema.table format obtained from the table list.</p>
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
         * <p>The ID of the classification and grading template. You can obtain the value from Items[].Id in the response of ListTemplates. The value must be consistent with the selected sensitivity level and detection model.</p>
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
         * <p>The list of detection model IDs. Separate multiple values with commas (,). Select values from the response of ListIdentifyModels that corresponds to the same TemplateId.</p>
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
        public ListDataMaskingInstancesRequest build() {
            return new ListDataMaskingInstancesRequest(this);
        } 

    } 

}
