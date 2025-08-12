// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link GetAlipayTransferStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlipayTransferStatusResponseBody</p>
 */
public class GetAlipayTransferStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAlipayTransferStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlipayTransferStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAlipayTransferStatusResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAlipayTransferStatusResponseBody build() {
            return new GetAlipayTransferStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlipayTransferStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlipayTransferStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("alipayOrderDetail")
        private String alipayOrderDetail;

        @com.aliyun.core.annotation.NameInMap("alipayOrderId")
        private String alipayOrderId;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("mainAccountId")
        private String mainAccountId;

        @com.aliyun.core.annotation.NameInMap("modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("qrURL")
        private String qrURL;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("transAmount")
        private String transAmount;

        @com.aliyun.core.annotation.NameInMap("walletItemCode")
        private String walletItemCode;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.alipayOrderDetail = builder.alipayOrderDetail;
            this.alipayOrderId = builder.alipayOrderId;
            this.code = builder.code;
            this.creator = builder.creator;
            this.mainAccountId = builder.mainAccountId;
            this.modifier = builder.modifier;
            this.qrURL = builder.qrURL;
            this.scope = builder.scope;
            this.status = builder.status;
            this.title = builder.title;
            this.transAmount = builder.transAmount;
            this.walletItemCode = builder.walletItemCode;
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
         * @return alipayOrderDetail
         */
        public String getAlipayOrderDetail() {
            return this.alipayOrderDetail;
        }

        /**
         * @return alipayOrderId
         */
        public String getAlipayOrderId() {
            return this.alipayOrderId;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return mainAccountId
         */
        public String getMainAccountId() {
            return this.mainAccountId;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return qrURL
         */
        public String getQrURL() {
            return this.qrURL;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return transAmount
         */
        public String getTransAmount() {
            return this.transAmount;
        }

        /**
         * @return walletItemCode
         */
        public String getWalletItemCode() {
            return this.walletItemCode;
        }

        public static final class Builder {
            private String accountId; 
            private String alipayOrderDetail; 
            private String alipayOrderId; 
            private String code; 
            private String creator; 
            private String mainAccountId; 
            private String modifier; 
            private String qrURL; 
            private String scope; 
            private Long status; 
            private String title; 
            private String transAmount; 
            private String walletItemCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.alipayOrderDetail = model.alipayOrderDetail;
                this.alipayOrderId = model.alipayOrderId;
                this.code = model.code;
                this.creator = model.creator;
                this.mainAccountId = model.mainAccountId;
                this.modifier = model.modifier;
                this.qrURL = model.qrURL;
                this.scope = model.scope;
                this.status = model.status;
                this.title = model.title;
                this.transAmount = model.transAmount;
                this.walletItemCode = model.walletItemCode;
            } 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * alipayOrderDetail.
             */
            public Builder alipayOrderDetail(String alipayOrderDetail) {
                this.alipayOrderDetail = alipayOrderDetail;
                return this;
            }

            /**
             * alipayOrderId.
             */
            public Builder alipayOrderId(String alipayOrderId) {
                this.alipayOrderId = alipayOrderId;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * mainAccountId.
             */
            public Builder mainAccountId(String mainAccountId) {
                this.mainAccountId = mainAccountId;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * qrURL.
             */
            public Builder qrURL(String qrURL) {
                this.qrURL = qrURL;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * transAmount.
             */
            public Builder transAmount(String transAmount) {
                this.transAmount = transAmount;
                return this;
            }

            /**
             * walletItemCode.
             */
            public Builder walletItemCode(String walletItemCode) {
                this.walletItemCode = walletItemCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
