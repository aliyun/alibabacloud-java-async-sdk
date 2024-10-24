// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMobilesCardSupportResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMobilesCardSupportResponseBody</p>
 */
public class QueryMobilesCardSupportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMobilesCardSupportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMobilesCardSupportResponseBody create() {
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
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08C17DFE-2E10-54F4-BAFB-7180039CC217</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMobilesCardSupportResponseBody build() {
            return new QueryMobilesCardSupportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMobilesCardSupportResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMobilesCardSupportResponseBody</p>
     */
    public static class QueryResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Support")
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
             * <p>The mobile phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1380000****</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>Indicates whether the mobile phone number supports card messages. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link QueryMobilesCardSupportResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMobilesCardSupportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QueryResult")
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
             * <p>The list of returned results.</p>
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
