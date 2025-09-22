// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.anytrans20250707.models;

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
 * {@link TermQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TermQueryResponseBody</p>
 */
public class TermQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private TermQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TermQueryResponseBody create() {
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(TermQueryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public TermQueryResponseBody build() {
            return new TermQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TermQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TermQueryResponseBody</p>
     */
    public static class Terms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("src")
        private String src;

        @com.aliyun.core.annotation.NameInMap("termId")
        private String termId;

        @com.aliyun.core.annotation.NameInMap("tgt")
        private String tgt;

        private Terms(Builder builder) {
            this.src = builder.src;
            this.termId = builder.termId;
            this.tgt = builder.tgt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terms create() {
            return builder().build();
        }

        /**
         * @return src
         */
        public String getSrc() {
            return this.src;
        }

        /**
         * @return termId
         */
        public String getTermId() {
            return this.termId;
        }

        /**
         * @return tgt
         */
        public String getTgt() {
            return this.tgt;
        }

        public static final class Builder {
            private String src; 
            private String termId; 
            private String tgt; 

            private Builder() {
            } 

            private Builder(Terms model) {
                this.src = model.src;
                this.termId = model.termId;
                this.tgt = model.tgt;
            } 

            /**
             * src.
             */
            public Builder src(String src) {
                this.src = src;
                return this;
            }

            /**
             * termId.
             */
            public Builder termId(String termId) {
                this.termId = termId;
                return this;
            }

            /**
             * tgt.
             */
            public Builder tgt(String tgt) {
                this.tgt = tgt;
                return this;
            }

            public Terms build() {
                return new Terms(this);
            } 

        } 

    }
    /**
     * 
     * {@link TermQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TermQueryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failCount")
        private Long failCount;

        @com.aliyun.core.annotation.NameInMap("terms")
        private java.util.List<Terms> terms;

        private Data(Builder builder) {
            this.failCount = builder.failCount;
            this.terms = builder.terms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failCount
         */
        public Long getFailCount() {
            return this.failCount;
        }

        /**
         * @return terms
         */
        public java.util.List<Terms> getTerms() {
            return this.terms;
        }

        public static final class Builder {
            private Long failCount; 
            private java.util.List<Terms> terms; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failCount = model.failCount;
                this.terms = model.terms;
            } 

            /**
             * failCount.
             */
            public Builder failCount(Long failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * terms.
             */
            public Builder terms(java.util.List<Terms> terms) {
                this.terms = terms;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
