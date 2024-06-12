// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndroidInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAndroidInstanceGroupRequest</p>
 */
public class CreateAndroidInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupName")
    private String instanceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceGroupSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberOfInstances")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer numberOfInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateAndroidInstanceGroupRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.imageId = builder.imageId;
        this.instanceGroupName = builder.instanceGroupName;
        this.instanceGroupSpec = builder.instanceGroupSpec;
        this.numberOfInstances = builder.numberOfInstances;
        this.officeSiteId = builder.officeSiteId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndroidInstanceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
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
     * @return numberOfInstances
     */
    public Integer getNumberOfInstances() {
        return this.numberOfInstances;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateAndroidInstanceGroupRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bizRegionId; 
        private String chargeType; 
        private String imageId; 
        private String instanceGroupName; 
        private String instanceGroupSpec; 
        private Integer numberOfInstances; 
        private String officeSiteId; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndroidInstanceGroupRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.imageId = request.imageId;
            this.instanceGroupName = request.instanceGroupName;
            this.instanceGroupSpec = request.instanceGroupSpec;
            this.numberOfInstances = request.numberOfInstances;
            this.officeSiteId = request.officeSiteId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * BizRegionId.
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
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * InstanceGroupName.
         */
        public Builder instanceGroupName(String instanceGroupName) {
            this.putQueryParameter("InstanceGroupName", instanceGroupName);
            this.instanceGroupName = instanceGroupName;
            return this;
        }

        /**
         * InstanceGroupSpec.
         */
        public Builder instanceGroupSpec(String instanceGroupSpec) {
            this.putQueryParameter("InstanceGroupSpec", instanceGroupSpec);
            this.instanceGroupSpec = instanceGroupSpec;
            return this;
        }

        /**
         * NumberOfInstances.
         */
        public Builder numberOfInstances(Integer numberOfInstances) {
            this.putQueryParameter("NumberOfInstances", numberOfInstances);
            this.numberOfInstances = numberOfInstances;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
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
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateAndroidInstanceGroupRequest build() {
            return new CreateAndroidInstanceGroupRequest(this);
        } 

    } 

}
