// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link QueryBlockchainDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBlockchainDataResponseBody</p>
 */
public class QueryBlockchainDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryBlockchainDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBlockchainDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryBlockchainDataResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryBlockchainDataResponseBody build() {
            return new QueryBlockchainDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBlockchainDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBlockchainDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgType")
        private String algType;

        @com.aliyun.core.annotation.NameInMap("PlainData")
        private String plainData;

        @com.aliyun.core.annotation.NameInMap("PrivacyData")
        private String privacyData;

        @com.aliyun.core.annotation.NameInMap("PrivacyRuleId")
        private String privacyRuleId;

        private Data(Builder builder) {
            this.algType = builder.algType;
            this.plainData = builder.plainData;
            this.privacyData = builder.privacyData;
            this.privacyRuleId = builder.privacyRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algType
         */
        public String getAlgType() {
            return this.algType;
        }

        /**
         * @return plainData
         */
        public String getPlainData() {
            return this.plainData;
        }

        /**
         * @return privacyData
         */
        public String getPrivacyData() {
            return this.privacyData;
        }

        /**
         * @return privacyRuleId
         */
        public String getPrivacyRuleId() {
            return this.privacyRuleId;
        }

        public static final class Builder {
            private String algType; 
            private String plainData; 
            private String privacyData; 
            private String privacyRuleId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.algType = model.algType;
                this.plainData = model.plainData;
                this.privacyData = model.privacyData;
                this.privacyRuleId = model.privacyRuleId;
            } 

            /**
             * AlgType.
             */
            public Builder algType(String algType) {
                this.algType = algType;
                return this;
            }

            /**
             * PlainData.
             */
            public Builder plainData(String plainData) {
                this.plainData = plainData;
                return this;
            }

            /**
             * PrivacyData.
             */
            public Builder privacyData(String privacyData) {
                this.privacyData = privacyData;
                return this;
            }

            /**
             * PrivacyRuleId.
             */
            public Builder privacyRuleId(String privacyRuleId) {
                this.privacyRuleId = privacyRuleId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
