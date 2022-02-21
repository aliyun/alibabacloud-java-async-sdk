// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservationDemandCommittedAmountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservationDemandCommittedAmountResponseBody</p>
 */
public class DescribeReservationDemandCommittedAmountResponseBody extends TeaModel {
    @NameInMap("CommittedAmountInfo")
    private CommittedAmountInfo committedAmountInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeReservationDemandCommittedAmountResponseBody(Builder builder) {
        this.committedAmountInfo = builder.committedAmountInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservationDemandCommittedAmountResponseBody create() {
        return builder().build();
    }

    /**
     * @return committedAmountInfo
     */
    public CommittedAmountInfo getCommittedAmountInfo() {
        return this.committedAmountInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CommittedAmountInfo committedAmountInfo; 
        private String requestId; 

        /**
         * CommittedAmountInfo.
         */
        public Builder committedAmountInfo(CommittedAmountInfo committedAmountInfo) {
            this.committedAmountInfo = committedAmountInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeReservationDemandCommittedAmountResponseBody build() {
            return new DescribeReservationDemandCommittedAmountResponseBody(this);
        } 

    } 

    public static class CommittedAmountInfo extends TeaModel {
        @NameInMap("CommittedAmount")
        private Float committedAmount;

        @NameInMap("Currency")
        private String currency;

        private CommittedAmountInfo(Builder builder) {
            this.committedAmount = builder.committedAmount;
            this.currency = builder.currency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommittedAmountInfo create() {
            return builder().build();
        }

        /**
         * @return committedAmount
         */
        public Float getCommittedAmount() {
            return this.committedAmount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        public static final class Builder {
            private Float committedAmount; 
            private String currency; 

            /**
             * CommittedAmount.
             */
            public Builder committedAmount(Float committedAmount) {
                this.committedAmount = committedAmount;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            public CommittedAmountInfo build() {
                return new CommittedAmountInfo(this);
            } 

        } 

    }
}
