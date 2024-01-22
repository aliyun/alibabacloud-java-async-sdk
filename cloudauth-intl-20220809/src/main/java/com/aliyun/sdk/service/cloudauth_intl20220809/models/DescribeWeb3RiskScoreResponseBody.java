// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWeb3RiskScoreResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWeb3RiskScoreResponseBody</p>
 */
public class DescribeWeb3RiskScoreResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeWeb3RiskScoreResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWeb3RiskScoreResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * Return code. For the full list of codes, see Codes and Messages.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Response detailed message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The unique ID of the request, which can be used to locate issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWeb3RiskScoreResponseBody build() {
            return new DescribeWeb3RiskScoreResponseBody(this);
        } 

    } 

    public static class RiskResults extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Type")
        private String type;

        private RiskResults(Builder builder) {
            this.description = builder.description;
            this.severity = builder.severity;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskResults create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String severity; 
            private String type; 

            /**
             * description
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * [ CRITICAL, HIGH, MEDIUM, LOW, NO ]
             * <p>
             * 100: Critical
             * 67-99: High risk
             * 34-66: Medium risk
             * 1-33: Low risk
             * 0: No risk
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Address
             * <p>
             * Transaction
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RiskResults build() {
                return new RiskResults(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("RiskResults")
        private java.util.List < RiskResults> riskResults;

        @NameInMap("Score")
        private String score;

        private Data(Builder builder) {
            this.riskResults = builder.riskResults;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return riskResults
         */
        public java.util.List < RiskResults> getRiskResults() {
            return this.riskResults;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        public static final class Builder {
            private java.util.List < RiskResults> riskResults; 
            private String score; 

            /**
             * risk results
             */
            public Builder riskResults(java.util.List < RiskResults> riskResults) {
                this.riskResults = riskResults;
                return this;
            }

            /**
             * Risk score
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
