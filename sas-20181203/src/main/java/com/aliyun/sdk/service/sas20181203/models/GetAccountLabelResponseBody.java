// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetAccountLabelResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountLabelResponseBody</p>
 */
public class GetAccountLabelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountLabelList")
    private java.util.List<AccountLabelList> accountLabelList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountLabelList
     */
    public java.util.List<AccountLabelList> getAccountLabelList() {
        return this.accountLabelList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AccountLabelList> accountLabelList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAccountLabelResponseBody model) {
            this.accountLabelList = model.accountLabelList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The tag list.</p>
         */
        public Builder accountLabelList(java.util.List<AccountLabelList> accountLabelList) {
            this.accountLabelList = accountLabelList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountLabelResponseBody build() {
            return new GetAccountLabelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccountLabelResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountLabelResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AccountLabelList model) {
                this.labelSeries = model.labelSeries;
                this.labelStatus = model.labelStatus;
            } 

            /**
             * <p>The tag information.</p>
             * 
             * <strong>example:</strong>
             * <p>SasStep</p>
             */
            public Builder labelSeries(String labelSeries) {
                this.labelSeries = labelSeries;
                return this;
            }

            /**
             * <p>Indicates whether the tag is valid.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
