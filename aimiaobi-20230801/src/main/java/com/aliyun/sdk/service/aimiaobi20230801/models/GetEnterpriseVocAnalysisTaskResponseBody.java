// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("TagTaskType")
        private String tagTaskType;

        @com.aliyun.core.annotation.NameInMap("ValueCount")
        private Integer valueCount;

        private TagValueCountStatistic(Builder builder) {
            this.tagName = builder.tagName;
            this.tagTaskType = builder.tagTaskType;
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
         * @return tagTaskType
         */
        public String getTagTaskType() {
            return this.tagTaskType;
        }

        /**
         * @return valueCount
         */
        public Integer getValueCount() {
            return this.valueCount;
        }

        public static final class Builder {
            private String tagName; 
            private String tagTaskType; 
            private Integer valueCount; 

            private Builder() {
            } 

            private Builder(TagValueCountStatistic model) {
                this.tagName = model.tagName;
                this.tagTaskType = model.tagTaskType;
                this.valueCount = model.valueCount;
            } 

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * TagTaskType.
             */
            public Builder tagTaskType(String tagTaskType) {
                this.tagTaskType = tagTaskType;
                return this;
            }

            /**
             * ValueCount.
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
        @com.aliyun.core.annotation.NameInMap("TagValueCountStatistic")
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
             * TagValueCountStatistic.
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
        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("TagTaskType")
        private String tagTaskType;

        @com.aliyun.core.annotation.NameInMap("ValueCount")
        private Integer valueCount;

        private TagDimensionStatisticsTagValueCountStatistic(Builder builder) {
            this.tagName = builder.tagName;
            this.tagTaskType = builder.tagTaskType;
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
         * @return tagTaskType
         */
        public String getTagTaskType() {
            return this.tagTaskType;
        }

        /**
         * @return valueCount
         */
        public Integer getValueCount() {
            return this.valueCount;
        }

        public static final class Builder {
            private String tagName; 
            private String tagTaskType; 
            private Integer valueCount; 

            private Builder() {
            } 

            private Builder(TagDimensionStatisticsTagValueCountStatistic model) {
                this.tagName = model.tagName;
                this.tagTaskType = model.tagTaskType;
                this.valueCount = model.valueCount;
            } 

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * TagTaskType.
             */
            public Builder tagTaskType(String tagTaskType) {
                this.tagTaskType = tagTaskType;
                return this;
            }

            /**
             * ValueCount.
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
        @com.aliyun.core.annotation.NameInMap("TagValueCountStatistic")
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
             * TagValueCountStatistic.
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
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("FilterDimensionStatistics")
        private FilterDimensionStatistics filterDimensionStatistics;

        @com.aliyun.core.annotation.NameInMap("TagDimensionStatistics")
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * FilterDimensionStatistics.
             */
            public Builder filterDimensionStatistics(FilterDimensionStatistics filterDimensionStatistics) {
                this.filterDimensionStatistics = filterDimensionStatistics;
                return this;
            }

            /**
             * TagDimensionStatistics.
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
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

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
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
            } 

            /**
             * InputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
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
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("StatisticsOverview")
        private StatisticsOverview statisticsOverview;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Usage usage;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
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
            private StatisticsOverview statisticsOverview; 
            private String status; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorMessage = model.errorMessage;
                this.statisticsOverview = model.statisticsOverview;
                this.status = model.status;
                this.usage = model.usage;
            } 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * StatisticsOverview.
             */
            public Builder statisticsOverview(StatisticsOverview statisticsOverview) {
                this.statisticsOverview = statisticsOverview;
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
             * Usage.
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
