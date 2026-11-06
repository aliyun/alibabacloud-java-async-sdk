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
         * CapacityCount.
         */
        public Builder capacityCount(Integer capacityCount) {
            this.putBodyParameter("CapacityCount", capacityCount);
            this.capacityCount = capacityCount;
            return this;
        }

        /**
         * DataIngestionMode.
         */
        public Builder dataIngestionMode(String dataIngestionMode) {
            this.putBodyParameter("DataIngestionMode", dataIngestionMode);
            this.dataIngestionMode = dataIngestionMode;
            return this;
        }

        /**
         * DataIngestionStateCode.
         */
        public Builder dataIngestionStateCode(String dataIngestionStateCode) {
            this.putBodyParameter("DataIngestionStateCode", dataIngestionStateCode);
            this.dataIngestionStateCode = dataIngestionStateCode;
            return this;
        }

        /**
         * DataIngestionType.
         */
        public Builder dataIngestionType(String dataIngestionType) {
            this.putBodyParameter("DataIngestionType", dataIngestionType);
            this.dataIngestionType = dataIngestionType;
            return this;
        }

        /**
         * DataSourceEditable.
         */
        public Builder dataSourceEditable(Boolean dataSourceEditable) {
            this.putBodyParameter("DataSourceEditable", dataSourceEditable);
            this.dataSourceEditable = dataSourceEditable;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * NormalizationRuleEditable.
         */
        public Builder normalizationRuleEditable(Boolean normalizationRuleEditable) {
            this.putBodyParameter("NormalizationRuleEditable", normalizationRuleEditable);
            this.normalizationRuleEditable = normalizationRuleEditable;
            return this;
        }

        /**
         * NormalizationRuleId.
         */
        public Builder normalizationRuleId(String normalizationRuleId) {
            this.putBodyParameter("NormalizationRuleId", normalizationRuleId);
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * ScanDataSourceId.
         */
        public Builder scanDataSourceId(String scanDataSourceId) {
            this.putBodyParameter("ScanDataSourceId", scanDataSourceId);
            this.scanDataSourceId = scanDataSourceId;
            return this;
        }

        /**
         * StreamJobId.
         */
        public Builder streamJobId(String streamJobId) {
            this.putBodyParameter("StreamJobId", streamJobId);
            this.streamJobId = streamJobId;
            return this;
        }

        /**
         * UpdateTime.
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
