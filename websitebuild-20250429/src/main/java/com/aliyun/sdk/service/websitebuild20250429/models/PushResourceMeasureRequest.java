// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link PushResourceMeasureRequest} extends {@link RequestModel}
 *
 * <p>PushResourceMeasureRequest</p>
 */
public class PushResourceMeasureRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    private Long amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BelongId")
    private String belongId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BelongIdType")
    private String belongIdType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MeasureData")
    private String measureData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaData")
    private String metaData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceCode")
    private String resourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseTime")
    private String useTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseType")
    private String useType;

    private PushResourceMeasureRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.amount = builder.amount;
        this.belongId = builder.belongId;
        this.belongIdType = builder.belongIdType;
        this.bizId = builder.bizId;
        this.measureData = builder.measureData;
        this.metaData = builder.metaData;
        this.resourceCode = builder.resourceCode;
        this.useTime = builder.useTime;
        this.useType = builder.useType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushResourceMeasureRequest create() {
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
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return belongId
     */
    public String getBelongId() {
        return this.belongId;
    }

    /**
     * @return belongIdType
     */
    public String getBelongIdType() {
        return this.belongIdType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return measureData
     */
    public String getMeasureData() {
        return this.measureData;
    }

    /**
     * @return metaData
     */
    public String getMetaData() {
        return this.metaData;
    }

    /**
     * @return resourceCode
     */
    public String getResourceCode() {
        return this.resourceCode;
    }

    /**
     * @return useTime
     */
    public String getUseTime() {
        return this.useTime;
    }

    /**
     * @return useType
     */
    public String getUseType() {
        return this.useType;
    }

    public static final class Builder extends Request.Builder<PushResourceMeasureRequest, Builder> {
        private String regionId; 
        private Long amount; 
        private String belongId; 
        private String belongIdType; 
        private String bizId; 
        private String measureData; 
        private String metaData; 
        private String resourceCode; 
        private String useTime; 
        private String useType; 

        private Builder() {
            super();
        } 

        private Builder(PushResourceMeasureRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.amount = request.amount;
            this.belongId = request.belongId;
            this.belongIdType = request.belongIdType;
            this.bizId = request.bizId;
            this.measureData = request.measureData;
            this.metaData = request.metaData;
            this.resourceCode = request.resourceCode;
            this.useTime = request.useTime;
            this.useType = request.useType;
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
         * Amount.
         */
        public Builder amount(Long amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * BelongId.
         */
        public Builder belongId(String belongId) {
            this.putQueryParameter("BelongId", belongId);
            this.belongId = belongId;
            return this;
        }

        /**
         * BelongIdType.
         */
        public Builder belongIdType(String belongIdType) {
            this.putQueryParameter("BelongIdType", belongIdType);
            this.belongIdType = belongIdType;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * MeasureData.
         */
        public Builder measureData(String measureData) {
            this.putQueryParameter("MeasureData", measureData);
            this.measureData = measureData;
            return this;
        }

        /**
         * MetaData.
         */
        public Builder metaData(String metaData) {
            this.putQueryParameter("MetaData", metaData);
            this.metaData = metaData;
            return this;
        }

        /**
         * ResourceCode.
         */
        public Builder resourceCode(String resourceCode) {
            this.putQueryParameter("ResourceCode", resourceCode);
            this.resourceCode = resourceCode;
            return this;
        }

        /**
         * UseTime.
         */
        public Builder useTime(String useTime) {
            this.putQueryParameter("UseTime", useTime);
            this.useTime = useTime;
            return this;
        }

        /**
         * UseType.
         */
        public Builder useType(String useType) {
            this.putQueryParameter("UseType", useType);
            this.useType = useType;
            return this;
        }

        @Override
        public PushResourceMeasureRequest build() {
            return new PushResourceMeasureRequest(this);
        } 

    } 

}
