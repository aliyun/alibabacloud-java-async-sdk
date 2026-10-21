// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateDataIngestionRequest} extends {@link RequestModel}
 *
 * <p>CreateDataIngestionRequest</p>
 */
public class CreateDataIngestionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CapacityCount")
    private Integer capacityCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionMode")
    private String dataIngestionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionStateCode")
    private String dataIngestionStateCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionType")
    private String dataIngestionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceEditable")
    private Boolean dataSourceEditable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleEditable")
    private Boolean normalizationRuleEditable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
    private String normalizationRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanDataSourceId")
    private String scanDataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StreamJobId")
    private String streamJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private Long updateTime;

    private CreateDataIngestionRequest(Builder builder) {
        super(builder);
        this.capacityCount = builder.capacityCount;
        this.dataIngestionMode = builder.dataIngestionMode;
        this.dataIngestionStateCode = builder.dataIngestionStateCode;
        this.dataIngestionType = builder.dataIngestionType;
        this.dataSourceEditable = builder.dataSourceEditable;
        this.dataSourceId = builder.dataSourceId;
        this.lang = builder.lang;
        this.normalizationRuleEditable = builder.normalizationRuleEditable;
        this.normalizationRuleId = builder.normalizationRuleId;
        this.productId = builder.productId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.scanDataSourceId = builder.scanDataSourceId;
        this.streamJobId = builder.streamJobId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataIngestionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityCount
     */
    public Integer getCapacityCount() {
        return this.capacityCount;
    }

    /**
     * @return dataIngestionMode
     */
    public String getDataIngestionMode() {
        return this.dataIngestionMode;
    }

    /**
     * @return dataIngestionStateCode
     */
    public String getDataIngestionStateCode() {
        return this.dataIngestionStateCode;
    }

    /**
     * @return dataIngestionType
     */
    public String getDataIngestionType() {
        return this.dataIngestionType;
    }

    /**
     * @return dataSourceEditable
     */
    public Boolean getDataSourceEditable() {
        return this.dataSourceEditable;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return normalizationRuleEditable
     */
    public Boolean getNormalizationRuleEditable() {
        return this.normalizationRuleEditable;
    }

    /**
     * @return normalizationRuleId
     */
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
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
     * @return scanDataSourceId
     */
    public String getScanDataSourceId() {
        return this.scanDataSourceId;
    }

    /**
     * @return streamJobId
     */
    public String getStreamJobId() {
        return this.streamJobId;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder extends Request.Builder<CreateDataIngestionRequest, Builder> {
        private Integer capacityCount; 
        private String dataIngestionMode; 
        private String dataIngestionStateCode; 
        private String dataIngestionType; 
        private Boolean dataSourceEditable; 
        private String dataSourceId; 
        private String lang; 
        private Boolean normalizationRuleEditable; 
        private String normalizationRuleId; 
        private String productId; 
        private String regionId; 
        private Long roleFor; 
        private String scanDataSourceId; 
        private String streamJobId; 
        private Long updateTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataIngestionRequest request) {
            super(request);
            this.capacityCount = request.capacityCount;
            this.dataIngestionMode = request.dataIngestionMode;
            this.dataIngestionStateCode = request.dataIngestionStateCode;
            this.dataIngestionType = request.dataIngestionType;
            this.dataSourceEditable = request.dataSourceEditable;
            this.dataSourceId = request.dataSourceId;
            this.lang = request.lang;
            this.normalizationRuleEditable = request.normalizationRuleEditable;
            this.normalizationRuleId = request.normalizationRuleId;
            this.productId = request.productId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.scanDataSourceId = request.scanDataSourceId;
            this.streamJobId = request.streamJobId;
            this.updateTime = request.updateTime;
        } 

        /**
         * <p>The number of associated security capabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder capacityCount(Integer capacityCount) {
            this.putBodyParameter("CapacityCount", capacityCount);
            this.capacityCount = capacityCount;
            return this;
        }

        /**
         * <p>The data ingestion mode. Valid values:</p>
         * <ul>
         * <li>realtime</li>
         * <li>scan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>realtime</p>
         */
        public Builder dataIngestionMode(String dataIngestionMode) {
            this.putBodyParameter("DataIngestionMode", dataIngestionMode);
            this.dataIngestionMode = dataIngestionMode;
            return this;
        }

        /**
         * <p>The status code for data ingestion exceptions.</p>
         * 
         * <strong>example:</strong>
         * <p>UserUnauthorized</p>
         */
        public Builder dataIngestionStateCode(String dataIngestionStateCode) {
            this.putBodyParameter("DataIngestionStateCode", dataIngestionStateCode);
            this.dataIngestionStateCode = dataIngestionStateCode;
            return this;
        }

        /**
         * <p>The data ingestion type. Valid values:</p>
         * <ul>
         * <li>preset</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder dataIngestionType(String dataIngestionType) {
            this.putBodyParameter("DataIngestionType", dataIngestionType);
            this.dataIngestionType = dataIngestionType;
            return this;
        }

        /**
         * <p>Specifies whether the data source is editable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dataSourceEditable(Boolean dataSourceEditable) {
            this.putBodyParameter("DataSourceEditable", dataSourceEditable);
            this.dataSourceEditable = dataSourceEditable;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * <blockquote>
         * <p>This parameter is required in practice. If you do not specify this parameter, the API returns a 400 error: &quot;The specified DataSourceId is invalid.&quot;
         * Before calling this operation, call the CreateDataSource operation to create a data source and obtain the data source ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ds-3g6lyf4eonngyohaq7tr</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.<blockquote>
         * <p>This parameter is required in practice. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Specifies whether the normalization rule is editable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder normalizationRuleEditable(Boolean normalizationRuleEditable) {
            this.putBodyParameter("NormalizationRuleEditable", normalizationRuleEditable);
            this.normalizationRuleEditable = normalizationRuleEditable;
            return this;
        }

        /**
         * <p>The normalization rule ID.
         * Before calling this operation, call the CreateNormalizationRule operation to create a normalization rule and obtain the normalization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nr-hdmady54piigkjfv17yp</p>
         */
        public Builder normalizationRuleId(String normalizationRuleId) {
            this.putBodyParameter("NormalizationRuleId", normalizationRuleId);
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The region of the management center for threat analysis. Specify the management center based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
         * <li>ap-southeast-1: Your assets reside outside China.</li>
         * <li>cn-shanghai: The actual effective value. RegionId refers to the management center location, which is a different dimension from the API endpoint region (cn-shanghai).</li>
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
         * <p>The ID of the member to which the administrator switches the view.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The data source ID for scan mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-014frtpy28m5ct2eoyo1</p>
         */
        public Builder scanDataSourceId(String scanDataSourceId) {
            this.putBodyParameter("ScanDataSourceId", scanDataSourceId);
            this.scanDataSourceId = scanDataSourceId;
            return this;
        }

        /**
         * <p>The job ID of the stream task.</p>
         * 
         * <strong>example:</strong>
         * <p>802c0129b6cfd50861d4b25deea29afb</p>
         */
        public Builder streamJobId(String streamJobId) {
            this.putBodyParameter("StreamJobId", streamJobId);
            this.streamJobId = streamJobId;
            return this;
        }

        /**
         * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        public Builder updateTime(Long updateTime) {
            this.putBodyParameter("UpdateTime", updateTime);
            this.updateTime = updateTime;
            return this;
        }

        @Override
        public CreateDataIngestionRequest build() {
            return new CreateDataIngestionRequest(this);
        } 

    } 

}
