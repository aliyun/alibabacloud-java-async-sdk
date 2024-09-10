// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountLabelResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountLabelResponseBody</p>
 */
public class GetAccountLabelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountLabelList")
    private java.util.List < AccountLabelList> accountLabelList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccountLabelResponseBody(Builder builder) {
        this.accountLabelList = builder.accountLabelList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountLabelResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountLabelList
     */
    public java.util.List < AccountLabelList> getAccountLabelList() {
        return this.accountLabelList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AccountLabelList> accountLabelList; 
        private String requestId; 

        /**
         * AccountLabelList.
         */
        public Builder accountLabelList(java.util.List < AccountLabelList> accountLabelList) {
            this.accountLabelList = accountLabelList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountLabelResponseBody build() {
            return new GetAccountLabelResponseBody(this);
        } 

    } 

    public static class AccountLabelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelSeries")
        private String labelSeries;

        @com.aliyun.core.annotation.NameInMap("LabelStatus")
        private Boolean labelStatus;

        private AccountLabelList(Builder builder) {
            this.labelSeries = builder.labelSeries;
            this.labelStatus = builder.labelStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountLabelList create() {
            return builder().build();
        }

        /**
         * @return labelSeries
         */
        public String getLabelSeries() {
            return this.labelSeries;
        }

        /**
         * @return labelStatus
         */
        public Boolean getLabelStatus() {
            return this.labelStatus;
        }

        public static final class Builder {
            private String labelSeries; 
            private Boolean labelStatus; 

            /**
             * LabelSeries.
             */
            public Builder labelSeries(String labelSeries) {
                this.labelSeries = labelSeries;
                return this;
            }

            /**
             * LabelStatus.
             */
            public Builder labelStatus(Boolean labelStatus) {
                this.labelStatus = labelStatus;
                return this;
            }

            public AccountLabelList build() {
                return new AccountLabelList(this);
            } 

        } 

    }
}
