// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterPayTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterPayTypeRequest</p>
 */
public class ModifyDBClusterPayTypeRequest extends Request {
    @Query
    @NameInMap("DbClusterId")
    @Validation(required = true)
    private String dbClusterId;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("UsedTime")
    @Validation(maximum = 9, minimum = 1)
    private String usedTime;

    private ModifyDBClusterPayTypeRequest(Builder builder) {
        super(builder);
        this.dbClusterId = builder.dbClusterId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterPayTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbClusterId
     */
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterPayTypeRequest, Builder> {
        private String dbClusterId; 
        private String payType; 
        private String period; 
        private String usedTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterPayTypeRequest request) {
            super(request);
            this.dbClusterId = request.dbClusterId;
            this.payType = request.payType;
            this.period = request.period;
            this.usedTime = request.usedTime;
        } 

        /**
         * The cluster ID.
         */
        public Builder dbClusterId(String dbClusterId) {
            this.putQueryParameter("DbClusterId", dbClusterId);
            this.dbClusterId = dbClusterId;
            return this;
        }

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go.
         * *   **Prepaid**: subscription.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The subscription type of the subscription cluster. Valid values:
         * <p>
         * 
         * *   **Year**: subscription on a yearly basis.
         * *   **Month**: subscription on a monthly basis.
         * 
         * > This parameter must be specified when PayType is set to Prepaid.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The subscription duration of the subscription cluster.
         * <p>
         * 
         * *   Valid values when Period is set to Year: 1, 2, 3, and 5 (integer).
         * *   Valid values when Period is set to Month: 1 to 11 (integer).
         * 
         * > 
         * 
         * *   This parameter must be specified when PayType is set to Prepaid.
         * 
         * *   Longer subscription durations offer more savings. Purchasing a cluster for one year is more cost-effective than purchasing the cluster for 10 or 11 months.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public ModifyDBClusterPayTypeRequest build() {
            return new ModifyDBClusterPayTypeRequest(this);
        } 

    } 

}
