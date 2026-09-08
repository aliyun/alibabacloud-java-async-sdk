// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link GetDataMaskingAccountCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataMaskingAccountCountResponseBody</p>
 */
public class GetDataMaskingAccountCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountCount")
    private AccountCount accountCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataMaskingAccountCountResponseBody(Builder builder) {
        this.accountCount = builder.accountCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataMaskingAccountCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountCount
     */
    public AccountCount getAccountCount() {
        return this.accountCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccountCount accountCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataMaskingAccountCountResponseBody model) {
            this.accountCount = model.accountCount;
            this.requestId = model.requestId;
        } 

        /**
         * AccountCount.
         */
        public Builder accountCount(AccountCount accountCount) {
            this.accountCount = accountCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataMaskingAccountCountResponseBody build() {
            return new GetDataMaskingAccountCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataMaskingAccountCountResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataMaskingAccountCountResponseBody</p>
     */
    public static class AccountCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullAccessCount")
        private Long fullAccessCount;

        @com.aliyun.core.annotation.NameInMap("NoneAccessCount")
        private Long noneAccessCount;

        @com.aliyun.core.annotation.NameInMap("RestrictedAccessCount")
        private Long restrictedAccessCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private AccountCount(Builder builder) {
            this.fullAccessCount = builder.fullAccessCount;
            this.noneAccessCount = builder.noneAccessCount;
            this.restrictedAccessCount = builder.restrictedAccessCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountCount create() {
            return builder().build();
        }

        /**
         * @return fullAccessCount
         */
        public Long getFullAccessCount() {
            return this.fullAccessCount;
        }

        /**
         * @return noneAccessCount
         */
        public Long getNoneAccessCount() {
            return this.noneAccessCount;
        }

        /**
         * @return restrictedAccessCount
         */
        public Long getRestrictedAccessCount() {
            return this.restrictedAccessCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long fullAccessCount; 
            private Long noneAccessCount; 
            private Long restrictedAccessCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(AccountCount model) {
                this.fullAccessCount = model.fullAccessCount;
                this.noneAccessCount = model.noneAccessCount;
                this.restrictedAccessCount = model.restrictedAccessCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * FullAccessCount.
             */
            public Builder fullAccessCount(Long fullAccessCount) {
                this.fullAccessCount = fullAccessCount;
                return this;
            }

            /**
             * NoneAccessCount.
             */
            public Builder noneAccessCount(Long noneAccessCount) {
                this.noneAccessCount = noneAccessCount;
                return this;
            }

            /**
             * RestrictedAccessCount.
             */
            public Builder restrictedAccessCount(Long restrictedAccessCount) {
                this.restrictedAccessCount = restrictedAccessCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public AccountCount build() {
                return new AccountCount(this);
            } 

        } 

    }
}
