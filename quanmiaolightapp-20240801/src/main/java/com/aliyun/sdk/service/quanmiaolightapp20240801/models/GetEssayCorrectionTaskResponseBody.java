// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link GetEssayCorrectionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetEssayCorrectionTaskResponseBody</p>
 */
public class GetEssayCorrectionTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetEssayCorrectionTaskResponseBody(Builder builder) {
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

    public static GetEssayCorrectionTaskResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetEssayCorrectionTaskResponseBody model) {
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
        public Builder httpStatusCode(Integer httpStatusCode) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
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

        public GetEssayCorrectionTaskResponseBody build() {
            return new GetEssayCorrectionTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEssayCorrectionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetEssayCorrectionTaskResponseBody</p>
     */
    public static class DimensionResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysis")
        private String analysis;

        @com.aliyun.core.annotation.NameInMap("maxScore")
        private Double maxScore;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("score")
        private Double score;

        private DimensionResults(Builder builder) {
            this.analysis = builder.analysis;
            this.maxScore = builder.maxScore;
            this.name = builder.name;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DimensionResults create() {
            return builder().build();
        }

        /**
         * @return analysis
         */
        public String getAnalysis() {
            return this.analysis;
        }

        /**
         * @return maxScore
         */
        public Double getMaxScore() {
            return this.maxScore;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        public static final class Builder {
            private String analysis; 
            private Double maxScore; 
            private String name; 
            private Double score; 

            private Builder() {
            } 

            private Builder(DimensionResults model) {
                this.analysis = model.analysis;
                this.maxScore = model.maxScore;
                this.name = model.name;
                this.score = model.score;
            } 

            /**
             * analysis.
             */
            public Builder analysis(String analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * maxScore.
             */
            public Builder maxScore(Double maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            public DimensionResults build() {
                return new DimensionResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEssayCorrectionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetEssayCorrectionTaskResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customId")
        private String customId;

        @com.aliyun.core.annotation.NameInMap("dimensionResults")
        private java.util.List<DimensionResults> dimensionResults;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("overallComment")
        private String overallComment;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("usage")
        private ModelUsage usage;

        private Results(Builder builder) {
            this.customId = builder.customId;
            this.dimensionResults = builder.dimensionResults;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.overallComment = builder.overallComment;
            this.result = builder.result;
            this.score = builder.score;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return customId
         */
        public String getCustomId() {
            return this.customId;
        }

        /**
         * @return dimensionResults
         */
        public java.util.List<DimensionResults> getDimensionResults() {
            return this.dimensionResults;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return overallComment
         */
        public String getOverallComment() {
            return this.overallComment;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return usage
         */
        public ModelUsage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String customId; 
            private java.util.List<DimensionResults> dimensionResults; 
            private String errorCode; 
            private String errorMessage; 
            private String overallComment; 
            private String result; 
            private Integer score; 
            private ModelUsage usage; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.customId = model.customId;
                this.dimensionResults = model.dimensionResults;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.overallComment = model.overallComment;
                this.result = model.result;
                this.score = model.score;
                this.usage = model.usage;
            } 

            /**
             * <p>xxx</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder customId(String customId) {
                this.customId = customId;
                return this;
            }

            /**
             * dimensionResults.
             */
            public Builder dimensionResults(java.util.List<DimensionResults> dimensionResults) {
                this.dimensionResults = dimensionResults;
                return this;
            }

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * overallComment.
             */
            public Builder overallComment(String overallComment) {
                this.overallComment = overallComment;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(ModelUsage usage) {
                this.usage = usage;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEssayCorrectionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetEssayCorrectionTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("totalUsage")
        private ModelUsage totalUsage;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.results = builder.results;
            this.status = builder.status;
            this.totalUsage = builder.totalUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalUsage
         */
        public ModelUsage getTotalUsage() {
            return this.totalUsage;
        }

        public static final class Builder {
            private String errorMessage; 
            private java.util.List<Results> results; 
            private String status; 
            private ModelUsage totalUsage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorMessage = model.errorMessage;
                this.results = model.results;
                this.status = model.status;
                this.totalUsage = model.totalUsage;
            } 

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * results.
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * totalUsage.
             */
            public Builder totalUsage(ModelUsage totalUsage) {
                this.totalUsage = totalUsage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
