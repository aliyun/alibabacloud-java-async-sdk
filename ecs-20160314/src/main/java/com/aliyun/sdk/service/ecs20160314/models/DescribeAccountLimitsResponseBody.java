// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountLimitsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountLimitsResponseBody</p>
 */
public class DescribeAccountLimitsResponseBody extends TeaModel {
    @NameInMap("AccountLimitTypeSet")
    private AccountLimitTypeSet accountLimitTypeSet;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAccountLimitsResponseBody(Builder builder) {
        this.accountLimitTypeSet = builder.accountLimitTypeSet;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountLimitsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountLimitTypeSet
     */
    public AccountLimitTypeSet getAccountLimitTypeSet() {
        return this.accountLimitTypeSet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccountLimitTypeSet accountLimitTypeSet; 
        private String requestId; 

        /**
         * AccountLimitTypeSet.
         */
        public Builder accountLimitTypeSet(AccountLimitTypeSet accountLimitTypeSet) {
            this.accountLimitTypeSet = accountLimitTypeSet;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountLimitsResponseBody build() {
            return new DescribeAccountLimitsResponseBody(this);
        } 

    } 

    public static class LimitValueSet extends TeaModel {
        @NameInMap("LimitValue")
        private java.util.List < String > limitValue;

        private LimitValueSet(Builder builder) {
            this.limitValue = builder.limitValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LimitValueSet create() {
            return builder().build();
        }

        /**
         * @return limitValue
         */
        public java.util.List < String > getLimitValue() {
            return this.limitValue;
        }

        public static final class Builder {
            private java.util.List < String > limitValue; 

            /**
             * LimitValue.
             */
            public Builder limitValue(java.util.List < String > limitValue) {
                this.limitValue = limitValue;
                return this;
            }

            public LimitValueSet build() {
                return new LimitValueSet(this);
            } 

        } 

    }
    public static class AccountLimit extends TeaModel {
        @NameInMap("LimitName")
        private String limitName;

        @NameInMap("LimitValueSet")
        private LimitValueSet limitValueSet;

        private AccountLimit(Builder builder) {
            this.limitName = builder.limitName;
            this.limitValueSet = builder.limitValueSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountLimit create() {
            return builder().build();
        }

        /**
         * @return limitName
         */
        public String getLimitName() {
            return this.limitName;
        }

        /**
         * @return limitValueSet
         */
        public LimitValueSet getLimitValueSet() {
            return this.limitValueSet;
        }

        public static final class Builder {
            private String limitName; 
            private LimitValueSet limitValueSet; 

            /**
             * LimitName.
             */
            public Builder limitName(String limitName) {
                this.limitName = limitName;
                return this;
            }

            /**
             * LimitValueSet.
             */
            public Builder limitValueSet(LimitValueSet limitValueSet) {
                this.limitValueSet = limitValueSet;
                return this;
            }

            public AccountLimit build() {
                return new AccountLimit(this);
            } 

        } 

    }
    public static class AccountLimitTypeSet extends TeaModel {
        @NameInMap("AccountLimit")
        private java.util.List < AccountLimit> accountLimit;

        private AccountLimitTypeSet(Builder builder) {
            this.accountLimit = builder.accountLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountLimitTypeSet create() {
            return builder().build();
        }

        /**
         * @return accountLimit
         */
        public java.util.List < AccountLimit> getAccountLimit() {
            return this.accountLimit;
        }

        public static final class Builder {
            private java.util.List < AccountLimit> accountLimit; 

            /**
             * AccountLimit.
             */
            public Builder accountLimit(java.util.List < AccountLimit> accountLimit) {
                this.accountLimit = accountLimit;
                return this;
            }

            public AccountLimitTypeSet build() {
                return new AccountLimitTypeSet(this);
            } 

        } 

    }
}
