// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link RenewARMServerInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewARMServerInstanceRequest</p>
 */
public class RenewARMServerInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    private RenewARMServerInstanceRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.instanceId = builder.instanceId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewARMServerInstanceRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<RenewARMServerInstanceRequest, Builder> {
        private Boolean autoRenew; 
        private String instanceId; 
        private Integer period; 
        private String periodUnit; 

        private Builder() {
            super();
        } 

        private Builder(RenewARMServerInstanceRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.instanceId = request.instanceId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
        } 

        /**
         * <p>Specifies whether to enable auto-renewal for the premium bandwidth plan. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>.</li>
         * <li><strong>false</strong> (default).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The ID of the instance that you want to renew.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourInstance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The renewal period. By default, instances are renewed on a monthly basis. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, and 12.</p>
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
         * <p>The unit of the renewal period. Valid values:</p>
         * <ul>
         * <li>Month (default)</li>
         * <li>Year</li>
         * </ul>
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

        @Override
        public RenewARMServerInstanceRequest build() {
            return new RenewARMServerInstanceRequest(this);
        } 

    } 

}
