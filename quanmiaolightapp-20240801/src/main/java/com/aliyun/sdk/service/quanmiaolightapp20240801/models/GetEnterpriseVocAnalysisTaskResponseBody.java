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
 * {@link GetEnterpriseVocAnalysisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnterpriseVocAnalysisTaskResponseBody</p>
 */
public class GetEnterpriseVocAnalysisTaskResponseBody extends TeaModel {
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

    private GetEnterpriseVocAnalysisTaskResponseBody(Builder builder) {
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

    public static GetEnterpriseVocAnalysisTaskResponseBody create() {
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

        private Builder(GetEnterpriseVocAnalysisTaskResponseBody model) {
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

        public GetEnterpriseVocAnalysisTaskResponseBody build() {
            return new GetEnterpriseVocAnalysisTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEnterpriseVocAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnterpriseVocAnalysisTaskResponseBody</p>
     */
    public static class TagValueCountStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("valueCount")
        private Integer valueCount;

        private TagValueCountStatistic(Builder builder) {
            this.tagName = builder.tagName;
            this.valueCount = builder.valueCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagValueCountStatistic create() {
            return builder().build();
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return valueCount
         */
        public Integer getValueCount() {
            return this.valueCount;
        }

        public static final class Builder {
            private String tagName; 
            private Integer valueCount; 

            private Builder() {
            } 

            private Builder(TagValueCountStatistic model) {
                this.tagName = model.tagName;
                this.valueCount = model.valueCount;
            } 

            /**
             * tagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * valueCount.
             */
            public Builder valueCount(Integer valueCount) {
                this.valueCount = valueCount;
                return this;
            }

            public TagValueCountStatistic build() {
                return new TagValueCountStatistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEnterpriseVocAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnterpriseVocAnalysisTaskResponseBody</p>
     */
    public static class FilterDimensionStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagValueCountStatistic")
        private java.util.List<TagValueCountStatistic> tagValueCountStatistic;

        private FilterDimensionStatistics(Builder builder) {
            this.tagValueCountStatistic = builder.tagValueCountStatistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterDimensionStatistics create() {
            return builder().build();
        }

        /**
         * @return tagValueCountStatistic
         */
        public java.util.List<TagValueCountStatistic> getTagValueCountStatistic() {
            return this.tagValueCountStatistic;
        }

        public static final class Builder {
            private java.util.List<TagValueCountStatistic> tagValueCountStatistic; 

            private Builder() {
            } 

            private Builder(FilterDimensionStatistics model) {
                this.tagValueCountStatistic = model.tagValueCountStatistic;
            } 

            /**
             * tagValueCountStatistic.
             */
            public Builder tagValueCountStatistic(java.util.List<TagValueCountStatistic> tagValueCountStatistic) {
                this.tagValueCountStatistic = tagValueCountStatistic;
                return this;
            }

            public FilterDimensionStatistics build() {
                return new FilterDimensionStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEnterpriseVocAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnterpriseVocAnalysisTaskResponseBody</p>
     */
    public static class TagDimensionStatisticsTagValueCountStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("valueCount")
        private Integer valueCount;

        private TagDimensionStatisticsTagValueCountStatistic(Builder builder) {
            this.tagName = builder.tagName;
            this.valueCount = builder.valueCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagDimensionStatisticsTagValueCountStatistic create() {
            return builder().build();
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return valueCount
         */
        public Integer getValueCount() {
            return this.valueCount;
        }

        public static final class Builder {
            private String tagName; 
            private Integer valueCount; 

            private Builder() {
            } 

            private Builder(TagDimensionStatisticsTagValueCountStatistic model) {
                this.tagName = model.tagName;
                this.valueCount = model.valueCount;
            } 

            /**
             * tagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * valueCount.
             */
            public Builder valueCount(Integer valueCount) {
                this.valueCount = valueCount;
                return this;
            }

            public TagDimensionStatisticsTagValueCountStatistic build() {
                return new TagDimensionStatisticsTagValueCountStatistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEnterpriseVocAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnterpriseVocAnalysisTaskResponseBody</p>
     */
    public static class TagDimensionStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagValueCountStatistic")
        private java.util.List<TagDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic;

        private TagDimensionStatistics(Builder builder) {
            this.tagValueCountStatistic = builder.tagValueCountStatistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagDimensionStatistics create() {
            return builder().build();
        }

        /**
         * @return tagValueCountStatistic
         */
        public java.util.List<TagDimensionStatisticsTagValueCountStatistic> getTagValueCountStatistic() {
            return this.tagValueCountStatistic;
        }

        public static final class Builder {
            private java.util.List<TagDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic; 

            private Builder() {
            } 

            private Builder(TagDimensionStatistics model) {
                this.tagValueCountStatistic = model.tagValueCountStatistic;
            } 

            /**
             * tagValueCountStatistic.
             */
            public Builder tagValueCountStatistic(java.util.List<TagDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic) {
                this.tagValueCountStatistic = tagValueCountStatistic;
                return this;
            }

            public TagDimensionStatistics build() {
                return new TagDimensionStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEnterpriseVocAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnterpriseVocAnalysisTaskResponseBody</p>
     */
    public static class StatisticsOverview extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("filterDimensionStatistics")
        private FilterDimensionStatistics filterDimensionStatistics;

        @com.aliyun.core.annotation.NameInMap("tagDimensionStatistics")
        private TagDimensionStatistics tagDimensionStatistics;

        private StatisticsOverview(Builder builder) {
            this.count = builder.count;
            this.filterDimensionStatistics = builder.filterDimensionStatistics;
            this.tagDimensionStatistics = builder.tagDimensionStatistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatisticsOverview create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return filterDimensionStatistics
         */
        public FilterDimensionStatistics getFilterDimensionStatistics() {
            return this.filterDimensionStatistics;
        }

        /**
         * @return tagDimensionStatistics
         */
        public TagDimensionStatistics getTagDimensionStatistics() {
            return this.tagDimensionStatistics;
        }

        public static final class Builder {
            private Integer count; 
            private FilterDimensionStatistics filterDimensionStatistics; 
            private TagDimensionStatistics tagDimensionStatistics; 

            private Builder() {
            } 

            private Builder(StatisticsOverview model) {
                this.count = model.count;
                this.filterDimensionStatistics = model.filterDimensionStatistics;
                this.tagDimensionStatistics = model.tagDimensionStatistics;
            } 

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * filterDimensionStatistics.
             */
            public Builder filterDimensionStatistics(FilterDimensionStatistics filterDimensionStatistics) {
                this.filterDimensionStatistics = filterDimensionStatistics;
                return this;
            }

            /**
             * tagDimensionStatistics.
             */
            public Builder tagDimensionStatistics(TagDimensionStatistics tagDimensionStatistics) {
                this.tagDimensionStatistics = tagDimensionStatistics;
                return this;
            }

            public StatisticsOverview build() {
                return new StatisticsOverview(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEnterpriseVocAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnterpriseVocAnalysisTaskResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Integer inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Integer outputTokens;

        private Usage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public static final class Builder {
            private Integer inputTokens; 
            private Integer outputTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
            } 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Integer inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Integer outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEnterpriseVocAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnterpriseVocAnalysisTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("statisticsOverview")
        private StatisticsOverview statisticsOverview;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Usage usage;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.statisticsOverview = builder.statisticsOverview;
            this.status = builder.status;
            this.usage = builder.usage;
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
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return statisticsOverview
         */
        public StatisticsOverview getStatisticsOverview() {
            return this.statisticsOverview;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String errorMessage; 
            private String modelId; 
            private String modelName; 
            private StatisticsOverview statisticsOverview; 
            private String status; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorMessage = model.errorMessage;
                this.modelId = model.modelId;
                this.modelName = model.modelName;
                this.statisticsOverview = model.statisticsOverview;
                this.status = model.status;
                this.usage = model.usage;
            } 

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * statisticsOverview.
             */
            public Builder statisticsOverview(StatisticsOverview statisticsOverview) {
                this.statisticsOverview = statisticsOverview;
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
             * usage.
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
