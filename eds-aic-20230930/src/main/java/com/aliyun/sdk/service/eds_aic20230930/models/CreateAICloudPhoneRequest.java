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
 * {@link CreateAICloudPhoneRequest} extends {@link RequestModel}
 *
 * <p>CreateAICloudPhoneRequest</p>
 */
public class CreateAICloudPhoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 200, minimum = 1)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceGroupSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    private CreateAICloudPhoneRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.bizRegionId = builder.bizRegionId;
        this.imageId = builder.imageId;
        this.instanceGroupName = builder.instanceGroupName;
        this.instanceGroupSpec = builder.instanceGroupSpec;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.promotionId = builder.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAICloudPhoneRequest create() {
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
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
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
     * @return instanceGroupName
     */
    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    /**
     * @return instanceGroupSpec
     */
    public String getInstanceGroupSpec() {
        return this.instanceGroupSpec;
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
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    public static final class Builder extends Request.Builder<CreateAICloudPhoneRequest, Builder> {
        private Integer amount; 
        private Boolean autoPay; 
        private String bandwidthPackageId; 
        private String bizRegionId; 
        private String imageId; 
        private String instanceGroupName; 
        private String instanceGroupSpec; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private String promotionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAICloudPhoneRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoPay = request.autoPay;
            this.bandwidthPackageId = request.bandwidthPackageId;
            this.bizRegionId = request.bizRegionId;
            this.imageId = request.imageId;
            this.instanceGroupName = request.instanceGroupName;
            this.instanceGroupSpec = request.instanceGroupSpec;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.promotionId = request.promotionId;
        } 

        /**
         * <p>购买数量</p>
         * <p>This parameter is required.</p>
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
         * <p>是否自动支付（默认false，为true时下单后自动支付）</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>带宽包ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np-791ncq8qcuoopxxxx</p>
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putQueryParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * <p>业务地域ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>镜像ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-0aae4rxwoktvr851h</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>实例组名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder instanceGroupName(String instanceGroupName) {
            this.putQueryParameter("InstanceGroupName", instanceGroupName);
            this.instanceGroupName = instanceGroupName;
            return this;
        }

        /**
         * <p>实例组规格（枚举）：STANDARD=基础型 MEDIUM=标配型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        public Builder instanceGroupSpec(String instanceGroupSpec) {
            this.putQueryParameter("InstanceGroupSpec", instanceGroupSpec);
            this.instanceGroupSpec = instanceGroupSpec;
            return this;
        }

        /**
         * <p>购买时长</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>购买时长单位（Month/Year）</p>
         * <p>This parameter is required.</p>
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
         * <p>策略组ID</p>
         * 
         * <strong>example:</strong>
         * <p>pg-0bjrh3oxk2q0xxxxx</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>优惠券ID</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_xxx</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        @Override
        public CreateAICloudPhoneRequest build() {
            return new CreateAICloudPhoneRequest(this);
        } 

    } 

}
