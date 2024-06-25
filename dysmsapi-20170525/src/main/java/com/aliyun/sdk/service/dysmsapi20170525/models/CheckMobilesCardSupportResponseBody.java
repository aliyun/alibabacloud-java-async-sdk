// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMobilesCardSupportResponseBody} extends {@link TeaModel}
 *
 * <p>CheckMobilesCardSupportResponseBody</p>
 */
public class CheckMobilesCardSupportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CheckMobilesCardSupportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMobilesCardSupportResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other values indicate that the request failed. For more information, see [Error codes](~~101346~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckMobilesCardSupportResponseBody build() {
            return new CheckMobilesCardSupportResponseBody(this);
        } 

    } 

    public static class QueryResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("support")
        private Boolean support;

        private QueryResult(Builder builder) {
            this.mobile = builder.mobile;
            this.support = builder.support;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryResult create() {
            return builder().build();
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return support
         */
        public Boolean getSupport() {
            return this.support;
        }

        public static final class Builder {
            private String mobile; 
            private Boolean support; 

            /**
             * The mobile phone number.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Indicates whether the mobile phone number supports card messages.
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder support(Boolean support) {
                this.support = support;
                return this;
            }

            public QueryResult build() {
                return new QueryResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("queryResult")
        private java.util.List < QueryResult> queryResult;

        private Data(Builder builder) {
            this.queryResult = builder.queryResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return queryResult
         */
        public java.util.List < QueryResult> getQueryResult() {
            return this.queryResult;
        }

        public static final class Builder {
            private java.util.List < QueryResult> queryResult; 

            /**
             * The list of returned results.
             */
            public Builder queryResult(java.util.List < QueryResult> queryResult) {
                this.queryResult = queryResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
