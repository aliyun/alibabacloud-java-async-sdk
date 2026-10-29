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
         * <p>The region ID.</p>
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
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The number of cloud phone matrices to purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(String count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>Specifies whether to use a single image disk. Default value: false. Valid values:</p>
         * <ul>
         * <li><p>true: Uses only the system disk.</p>
         * </li>
         * <li><p>false: Uses the system disk and the shared internal storage image disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isSingleImgDisk(Boolean isSingleImgDisk) {
            this.putQueryParameter("IsSingleImgDisk", isSingleImgDisk);
            this.isSingleImgDisk = isSingleImgDisk;
            return this;
        }

        /**
         * <p>The subscription period of the resource. The unit is specified by PeriodUnit. Valid values: 1 month, 2 months, 3 months, 6 months, and 1 year.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription period. Valid values:</p>
         * <ul>
         * <li><strong>Month</strong>: Month.</li>
         * <li><strong>Year</strong>: Year.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The number of provisioned instances, which refers to the number of cloud phone instances in the matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder phoneCount(Integer phoneCount) {
            this.putQueryParameter("PhoneCount", phoneCount);
            this.phoneCount = phoneCount;
            return this;
        }

        /**
         * <p>The size of the dedicated internal storage. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder phoneDataVolume(Integer phoneDataVolume) {
            this.putQueryParameter("PhoneDataVolume", phoneDataVolume);
            this.phoneDataVolume = phoneDataVolume;
            return this;
        }

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50003308011****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The size of the shared internal storage. Unit: GiB.</p>
         * <blockquote>
         * <p>The minimum size of the shared internal storage must be greater than the number of instances in the matrix multiplied by 10 GiB.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder serverShareDataVolume(Integer serverShareDataVolume) {
            this.putQueryParameter("ServerShareDataVolume", serverShareDataVolume);
            this.serverShareDataVolume = serverShareDataVolume;
            return this;
        }

        /**
         * <p>The specifications of the cloud phone matrix.</p>
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
         * <p>The size of the swap space.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
