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
 * {@link DescribeInstanceGroupPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceGroupPriceRequest</p>
 */
public class DescribeInstanceGroupPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceGroupSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceVersion")
    private String instanceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberOfInstances")
    private Integer numberOfInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleMode")
    private String saleMode;

    private DescribeInstanceGroupPriceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.bandwidth = builder.bandwidth;
        this.bizRegionId = builder.bizRegionId;
        this.imageId = builder.imageId;
        this.instanceGroupSpec = builder.instanceGroupSpec;
        this.instanceVersion = builder.instanceVersion;
        this.numberOfInstances = builder.numberOfInstances;
        this.orderType = builder.orderType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.saleMode = builder.saleMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceGroupPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceGroupSpec
     */
    public String getInstanceGroupSpec() {
        return this.instanceGroupSpec;
    }

    /**
     * @return instanceVersion
     */
    public String getInstanceVersion() {
        return this.instanceVersion;
    }

    /**
     * @return numberOfInstances
     */
    public Integer getNumberOfInstances() {
        return this.numberOfInstances;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return saleMode
     */
    public String getSaleMode() {
        return this.saleMode;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceGroupPriceRequest, Builder> {
        private Integer amount; 
        private Integer bandwidth; 
        private String bizRegionId; 
        private String imageId; 
        private String instanceGroupSpec; 
        private String instanceVersion; 
        private Integer numberOfInstances; 
        private String orderType; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String saleMode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceGroupPriceRequest request) {
            super(request);
            this.amount = request.amount;
            this.bandwidth = request.bandwidth;
            this.bizRegionId = request.bizRegionId;
            this.imageId = request.imageId;
            this.instanceGroupSpec = request.instanceGroupSpec;
            this.instanceVersion = request.instanceVersion;
            this.numberOfInstances = request.numberOfInstances;
            this.orderType = request.orderType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.saleMode = request.saleMode;
        } 

        /**
         * <p>The number of instance groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>The ID of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>np-shdbbkdubb****</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
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
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-0aae4rgm5umzo****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The instance group specifications.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acp.basic.small</p>
         */
        public Builder instanceGroupSpec(String instanceGroupSpec) {
            this.putQueryParameter("InstanceGroupSpec", instanceGroupSpec);
            this.instanceGroupSpec = instanceGroupSpec;
            return this;
        }

        /**
         * <p>The instance version. You do not need to specify this parameter. The system automatically matches the value.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder instanceVersion(String instanceVersion) {
            this.putQueryParameter("InstanceVersion", instanceVersion);
            this.instanceVersion = instanceVersion;
            return this;
        }

        /**
         * <p>The number of instances in the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder numberOfInstances(Integer numberOfInstances) {
            this.putQueryParameter("NumberOfInstances", numberOfInstances);
            this.numberOfInstances = numberOfInstances;
            return this;
        }

        /**
         * <p>The order type.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The subscription period. The unit is specified by PeriodUnit. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription period. Default value: Month.</p>
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
         * <p>The ID of the promotion.</p>
         * 
         * <strong>example:</strong>
         * <p>88436689****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The sales mode. You do not need to specify this parameter. The system automatically matches the value.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder saleMode(String saleMode) {
            this.putQueryParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        @Override
        public DescribeInstanceGroupPriceRequest build() {
            return new DescribeInstanceGroupPriceRequest(this);
        } 

    } 

}
