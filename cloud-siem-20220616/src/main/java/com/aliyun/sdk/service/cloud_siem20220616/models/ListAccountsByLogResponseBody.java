// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link ListAccountsByLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountsByLogResponseBody</p>
 */
public class ListAccountsByLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccountsByLogResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountsByLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAccountsByLogResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccountsByLogResponseBody build() {
            return new ListAccountsByLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccountsByLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccountsByLogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Imported")
        private Integer imported;

        @com.aliyun.core.annotation.NameInMap("LogCode")
        private String logCode;

        @com.aliyun.core.annotation.NameInMap("MainUserId")
        private Long mainUserId;

        @com.aliyun.core.annotation.NameInMap("ProdCode")
        private String prodCode;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.imported = builder.imported;
            this.logCode = builder.logCode;
            this.mainUserId = builder.mainUserId;
            this.prodCode = builder.prodCode;
            this.subUserId = builder.subUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return imported
         */
        public Integer getImported() {
            return this.imported;
        }

        /**
         * @return logCode
         */
        public String getLogCode() {
            return this.logCode;
        }

        /**
         * @return mainUserId
         */
        public Long getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return prodCode
         */
        public String getProdCode() {
            return this.prodCode;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private Integer imported; 
            private String logCode; 
            private Long mainUserId; 
            private String prodCode; 
            private Long subUserId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.imported = model.imported;
                this.logCode = model.logCode;
                this.mainUserId = model.mainUserId;
                this.prodCode = model.prodCode;
                this.subUserId = model.subUserId;
            } 

            /**
             * <p>The ID of the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxxx</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The name of the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_account_xxx</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>Indicates whether the account is added. Valid values: -1: yes -0: no</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxxx</p>
             */
            public Builder imported(Integer imported) {
                this.imported = imported;
                return this;
            }

            /**
             * <p>The code of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_siem_waf_xxxxx</p>
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXXXXX</p>
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * <p>The code of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>qcloud_waf</p>
             */
            public Builder prodCode(String prodCode) {
                this.prodCode = prodCode;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account for which the threat analysis feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXXXX</p>
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
