// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

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
 * {@link QueryDocParserStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDocParserStatusResponseBody</p>
 */
public class QueryDocParserStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDocParserStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDocParserStatusResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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

        public QueryDocParserStatusResponseBody build() {
            return new QueryDocParserStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDocParserStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDocParserStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageCount")
        private Integer imageCount;

        @com.aliyun.core.annotation.NameInMap("NumberOfSuccessfulParsing")
        private Integer numberOfSuccessfulParsing;

        @com.aliyun.core.annotation.NameInMap("PageCountEstimate")
        private Integer pageCountEstimate;

        @com.aliyun.core.annotation.NameInMap("ParagraphCount")
        private Integer paragraphCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TableCount")
        private Integer tableCount;

        @com.aliyun.core.annotation.NameInMap("Tokens")
        private Long tokens;

        private Data(Builder builder) {
            this.imageCount = builder.imageCount;
            this.numberOfSuccessfulParsing = builder.numberOfSuccessfulParsing;
            this.pageCountEstimate = builder.pageCountEstimate;
            this.paragraphCount = builder.paragraphCount;
            this.status = builder.status;
            this.tableCount = builder.tableCount;
            this.tokens = builder.tokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return imageCount
         */
        public Integer getImageCount() {
            return this.imageCount;
        }

        /**
         * @return numberOfSuccessfulParsing
         */
        public Integer getNumberOfSuccessfulParsing() {
            return this.numberOfSuccessfulParsing;
        }

        /**
         * @return pageCountEstimate
         */
        public Integer getPageCountEstimate() {
            return this.pageCountEstimate;
        }

        /**
         * @return paragraphCount
         */
        public Integer getParagraphCount() {
            return this.paragraphCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableCount
         */
        public Integer getTableCount() {
            return this.tableCount;
        }

        /**
         * @return tokens
         */
        public Long getTokens() {
            return this.tokens;
        }

        public static final class Builder {
            private Integer imageCount; 
            private Integer numberOfSuccessfulParsing; 
            private Integer pageCountEstimate; 
            private Integer paragraphCount; 
            private String status; 
            private Integer tableCount; 
            private Long tokens; 

            /**
             * ImageCount.
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * NumberOfSuccessfulParsing.
             */
            public Builder numberOfSuccessfulParsing(Integer numberOfSuccessfulParsing) {
                this.numberOfSuccessfulParsing = numberOfSuccessfulParsing;
                return this;
            }

            /**
             * PageCountEstimate.
             */
            public Builder pageCountEstimate(Integer pageCountEstimate) {
                this.pageCountEstimate = pageCountEstimate;
                return this;
            }

            /**
             * ParagraphCount.
             */
            public Builder paragraphCount(Integer paragraphCount) {
                this.paragraphCount = paragraphCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TableCount.
             */
            public Builder tableCount(Integer tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * Tokens.
             */
            public Builder tokens(Long tokens) {
                this.tokens = tokens;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
