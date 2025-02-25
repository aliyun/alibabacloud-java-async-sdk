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
 * {@link RenewAndroidInstanceGroupsRequest} extends {@link RequestModel}
 *
 * <p>RenewAndroidInstanceGroupsRequest</p>
 */
public class RenewAndroidInstanceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupIds")
    private java.util.List<String> instanceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    private RenewAndroidInstanceGroupsRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.instanceGroupIds = builder.instanceGroupIds;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewAndroidInstanceGroupsRequest create() {
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
     * @return instanceGroupIds
     */
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
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

    public static final class Builder extends Request.Builder<RenewAndroidInstanceGroupsRequest, Builder> {
        private Boolean autoPay; 
        private java.util.List<String> instanceGroupIds; 
        private Integer period; 
        private String periodUnit; 

        private Builder() {
            super();
        } 

        private Builder(RenewAndroidInstanceGroupsRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.instanceGroupIds = request.instanceGroupIds;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
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
         * InstanceGroupIds.
         */
        public Builder instanceGroupIds(java.util.List<String> instanceGroupIds) {
            this.putQueryParameter("InstanceGroupIds", instanceGroupIds);
            this.instanceGroupIds = instanceGroupIds;
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

        @Override
        public RenewAndroidInstanceGroupsRequest build() {
            return new RenewAndroidInstanceGroupsRequest(this);
        } 

    } 

}
