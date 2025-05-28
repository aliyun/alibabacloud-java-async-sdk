// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link CreateFundAccountPayRelationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFundAccountPayRelationResponseBody</p>
 */
public class CreateFundAccountPayRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFundAccountPayRelationResponseBody(Builder builder) {
        this.data = builder.data;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFundAccountPayRelationResponseBody create() {
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
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Object metadata; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateFundAccountPayRelationResponseBody model) {
            this.data = model.data;
            this.metadata = model.metadata;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFundAccountPayRelationResponseBody build() {
            return new CreateFundAccountPayRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateFundAccountPayRelationResponseBody} extends {@link TeaModel}
     *
     * <p>CreateFundAccountPayRelationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("FundAccountId")
        private String fundAccountId;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private String resultCode;

        @com.aliyun.core.annotation.NameInMap("ResultMessage")
        private String resultMessage;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.fundAccountId = builder.fundAccountId;
            this.resultCode = builder.resultCode;
            this.resultMessage = builder.resultMessage;
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
         * @return fundAccountId
         */
        public String getFundAccountId() {
            return this.fundAccountId;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        /**
         * @return resultMessage
         */
        public String getResultMessage() {
            return this.resultMessage;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private String fundAccountId; 
            private String resultCode; 
            private String resultMessage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.fundAccountId = model.fundAccountId;
                this.resultCode = model.resultCode;
                this.resultMessage = model.resultMessage;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * FundAccountId.
             */
            public Builder fundAccountId(String fundAccountId) {
                this.fundAccountId = fundAccountId;
                return this;
            }

            /**
             * ResultCode.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * ResultMessage.
             */
            public Builder resultMessage(String resultMessage) {
                this.resultMessage = resultMessage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
