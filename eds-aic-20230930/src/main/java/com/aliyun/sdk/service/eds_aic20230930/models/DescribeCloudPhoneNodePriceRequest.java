// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeCloudPhoneNodePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudPhoneNodePriceRequest</p>
 */
public class DescribeCloudPhoneNodePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSingleImgDisk")
    private Boolean isSingleImgDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneCount")
    private Integer phoneCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneDataVolume")
    private Integer phoneDataVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerShareDataVolume")
    private Integer serverShareDataVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwapSize")
    private Integer swapSize;

    private DescribeCloudPhoneNodePriceRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.count = builder.count;
        this.isSingleImgDisk = builder.isSingleImgDisk;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.phoneCount = builder.phoneCount;
        this.phoneDataVolume = builder.phoneDataVolume;
        this.promotionId = builder.promotionId;
        this.serverShareDataVolume = builder.serverShareDataVolume;
        this.serverType = builder.serverType;
        this.swapSize = builder.swapSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudPhoneNodePriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return isSingleImgDisk
     */
    public Boolean getIsSingleImgDisk() {
        return this.isSingleImgDisk;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return phoneCount
     */
    public Integer getPhoneCount() {
        return this.phoneCount;
    }

    /**
     * @return phoneDataVolume
     */
    public Integer getPhoneDataVolume() {
        return this.phoneDataVolume;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return serverShareDataVolume
     */
    public Integer getServerShareDataVolume() {
        return this.serverShareDataVolume;
    }

    /**
     * @return serverType
     */
    public String getServerType() {
        return this.serverType;
    }

    /**
     * @return swapSize
     */
    public Integer getSwapSize() {
        return this.swapSize;
    }

    public static final class Builder extends Request.Builder<DescribeCloudPhoneNodePriceRequest, Builder> {
        private String bizRegionId; 
        private String chargeType; 
        private String count; 
        private Boolean isSingleImgDisk; 
        private String period; 
        private String periodUnit; 
        private Integer phoneCount; 
        private Integer phoneDataVolume; 
        private String promotionId; 
        private Integer serverShareDataVolume; 
        private String serverType; 
        private Integer swapSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudPhoneNodePriceRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.count = request.count;
            this.isSingleImgDisk = request.isSingleImgDisk;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.phoneCount = request.phoneCount;
            this.phoneDataVolume = request.phoneDataVolume;
            this.promotionId = request.promotionId;
            this.serverShareDataVolume = request.serverShareDataVolume;
            this.serverType = request.serverType;
            this.swapSize = request.swapSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(String count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * IsSingleImgDisk.
         */
        public Builder isSingleImgDisk(Boolean isSingleImgDisk) {
            this.putQueryParameter("IsSingleImgDisk", isSingleImgDisk);
            this.isSingleImgDisk = isSingleImgDisk;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * PhoneCount.
         */
        public Builder phoneCount(Integer phoneCount) {
            this.putQueryParameter("PhoneCount", phoneCount);
            this.phoneCount = phoneCount;
            return this;
        }

        /**
         * PhoneDataVolume.
         */
        public Builder phoneDataVolume(Integer phoneDataVolume) {
            this.putQueryParameter("PhoneDataVolume", phoneDataVolume);
            this.phoneDataVolume = phoneDataVolume;
            return this;
        }

        /**
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * ServerShareDataVolume.
         */
        public Builder serverShareDataVolume(Integer serverShareDataVolume) {
            this.putQueryParameter("ServerShareDataVolume", serverShareDataVolume);
            this.serverShareDataVolume = serverShareDataVolume;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpm.gx7.10xlarge</p>
         */
        public Builder serverType(String serverType) {
            this.putQueryParameter("ServerType", serverType);
            this.serverType = serverType;
            return this;
        }

        /**
         * SwapSize.
         */
        public Builder swapSize(Integer swapSize) {
            this.putQueryParameter("SwapSize", swapSize);
            this.swapSize = swapSize;
            return this;
        }

        @Override
        public DescribeCloudPhoneNodePriceRequest build() {
            return new DescribeCloudPhoneNodePriceRequest(this);
        } 

    } 

}
