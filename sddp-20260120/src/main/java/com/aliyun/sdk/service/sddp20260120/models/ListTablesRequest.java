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
 * {@link ListTablesRequest} extends {@link RequestModel}
 *
 * <p>ListTablesRequest</p>
 */
public class ListTablesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataAssetSourceId")
    private String dataAssetSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Marker")
    private Long marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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
    @com.aliyun.core.annotation.NameInMap("RiskLevelId")
    private Long riskLevelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private ListTablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.currentPage = builder.currentPage;
        this.dataAssetSourceId = builder.dataAssetSourceId;
        this.dataSourceName = builder.dataSourceName;
        this.lang = builder.lang;
        this.marker = builder.marker;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.riskLevelId = builder.riskLevelId;
        this.ruleId = builder.ruleId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dataAssetSourceId
     */
    public String getDataAssetSourceId() {
        return this.dataAssetSourceId;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return marker
     */
    public Long getMarker() {
        return this.marker;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return riskLevelId
     */
    public Long getRiskLevelId() {
        return this.riskLevelId;
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

    public static final class Builder extends Request.Builder<ListTablesRequest, Builder> {
        private String regionId; 
        private Integer currentPage; 
        private String dataAssetSourceId; 
        private String dataSourceName; 
        private String lang; 
        private Long marker; 
        private String name; 
        private Integer pageSize; 
        private String productCode; 
        private Long productId; 
        private Long riskLevelId; 
        private Long ruleId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ListTablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.currentPage = request.currentPage;
            this.dataAssetSourceId = request.dataAssetSourceId;
            this.dataSourceName = request.dataSourceName;
            this.lang = request.lang;
            this.marker = request.marker;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.riskLevelId = request.riskLevelId;
            this.ruleId = request.ruleId;
            this.templateId = request.templateId;
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
         * <p>The page number of the current page. Pages start from page 1.</p>
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
         * <p>The instance identity of the cloud database instance. Set the value to the InstanceId value in the instance list.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        public Builder dataAssetSourceId(String dataAssetSourceId) {
            this.putQueryParameter("DataAssetSourceId", dataAssetSourceId);
            this.dataAssetSourceId = dataAssetSourceId;
            return this;
        }

        /**
         * <p>The name of the database. Set the value to the DbName value returned by the ListDataSources operation.</p>
         * 
         * <strong>example:</strong>
         * <p>business_db</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The language of the response. Valid values: zh: Chinese. en: English.</p>
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
         * <p>The start position of the cursor-based pagination. Use the NextMarker value returned in the previous request for subsequent requests. Keep the value consistent with the original filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder marker(Long marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The name filter.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Keep other filter conditions consistent when you query the next page.</p>
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
         * <p>The code of the cloud service. Column encryption supports ApsaraDB RDS, PolarDB, and PolarDB-X 2.0. If you specify this parameter and ProductId at the same time, the values must match.</p>
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
         * <p>The ID of the cloud service type. Valid values: 5: ApsaraDB RDS. 8: PolarDB. 27: PolarDB-X 2.0. If you specify this parameter and ProductCode at the same time, the values must match.</p>
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
         * <p>The ID of the sensitivity level. You can obtain the ID from the response of the ListRiskLevels operation.</p>
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
         * <p>The ID of the detection rule or model. Set the value to the ID of the corresponding detection rule in the target template.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The ID of the data classification template. You can obtain the ID from the Items[].Id parameter in the response of the ListTemplates operation. The value must be consistent with the selected sensitivity level and detection model.</p>
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
        public ListTablesRequest build() {
            return new ListTablesRequest(this);
        } 

    } 

}
