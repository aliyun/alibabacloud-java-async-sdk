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
 * {@link RenewCloudPhoneNodesRequest} extends {@link RequestModel}
 *
 * <p>RenewCloudPhoneNodesRequest</p>
 */
public class RenewCloudPhoneNodesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    private RenewCloudPhoneNodesRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.nodeIds = builder.nodeIds;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewCloudPhoneNodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
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

    public static final class Builder extends Request.Builder<RenewCloudPhoneNodesRequest, Builder> {
        private Boolean autoRenew; 
        private java.util.List<String> nodeIds; 
        private Integer period; 
        private String periodUnit; 

        private Builder() {
            super();
        } 

        private Builder(RenewCloudPhoneNodesRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.nodeIds = request.nodeIds;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
        } 

        /**
         * <p>Specifies whether to enable the auto-renewal feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enables the auto-renewal feature. In this case, the system automatically renews the instance upon expiration.</li>
         * <li>false (default): disables the auto-renewal feature. In this case, you need to manually renew the instance upon expiration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The cloud phone matrix IDs.</p>
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.putBodyParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>The subscription duration. The unit is specified by <code>PeriodUnit</code>. Valid values:</p>
         * <ul>
         * <li>When <code>PeriodUnit</code> is set to <strong>year</strong>: 1.</li>
         * <li>When <code>PeriodUnit</code> is set to <strong>month</strong>: 1, 2, 3, and 6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Month (default)</li>
         * <li>Year</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        @Override
        public RenewCloudPhoneNodesRequest build() {
            return new RenewCloudPhoneNodesRequest(this);
        } 

    } 

}
