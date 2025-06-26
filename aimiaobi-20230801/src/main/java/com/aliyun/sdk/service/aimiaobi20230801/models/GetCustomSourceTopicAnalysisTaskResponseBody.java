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
 * {@link GetCustomSourceTopicAnalysisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomSourceTopicAnalysisTaskResponseBody</p>
 */
public class GetCustomSourceTopicAnalysisTaskResponseBody extends TeaModel {
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

    private GetCustomSourceTopicAnalysisTaskResponseBody(Builder builder) {
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

    public static GetCustomSourceTopicAnalysisTaskResponseBody create() {
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

        private Builder(GetCustomSourceTopicAnalysisTaskResponseBody model) {
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

        public GetCustomSourceTopicAnalysisTaskResponseBody build() {
            return new GetCustomSourceTopicAnalysisTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomSourceTopicAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomSourceTopicAnalysisTaskResponseBody</p>
     */
    public static class ClusterNews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ClusterNews(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterNews create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(ClusterNews model) {
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ClusterNews build() {
                return new ClusterNews(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomSourceTopicAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomSourceTopicAnalysisTaskResponseBody</p>
     */
    public static class ClusterResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterNews")
        private java.util.List<ClusterNews> clusterNews;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private ClusterResults(Builder builder) {
            this.clusterNews = builder.clusterNews;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterResults create() {
            return builder().build();
        }

        /**
         * @return clusterNews
         */
        public java.util.List<ClusterNews> getClusterNews() {
            return this.clusterNews;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private java.util.List<ClusterNews> clusterNews; 
            private String topic; 

            private Builder() {
            } 

            private Builder(ClusterResults model) {
                this.clusterNews = model.clusterNews;
                this.topic = model.topic;
            } 

            /**
             * ClusterNews.
             */
            public Builder clusterNews(java.util.List<ClusterNews> clusterNews) {
                this.clusterNews = clusterNews;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public ClusterResults build() {
                return new ClusterResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomSourceTopicAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomSourceTopicAnalysisTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterCount")
        private Integer clusterCount;

        @com.aliyun.core.annotation.NameInMap("ClusterResults")
        private java.util.List<ClusterResults> clusterResults;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("MaxClusteredTopicNewsSize")
        private Integer maxClusteredTopicNewsSize;

        @com.aliyun.core.annotation.NameInMap("ParsedNewsSize")
        private Integer parsedNewsSize;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("rt")
        private Long rt;

        @com.aliyun.core.annotation.NameInMap("usages")
        private java.util.Map<String, Long> usages;

        private Data(Builder builder) {
            this.clusterCount = builder.clusterCount;
            this.clusterResults = builder.clusterResults;
            this.errorMessage = builder.errorMessage;
            this.maxClusteredTopicNewsSize = builder.maxClusteredTopicNewsSize;
            this.parsedNewsSize = builder.parsedNewsSize;
            this.status = builder.status;
            this.rt = builder.rt;
            this.usages = builder.usages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterCount
         */
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        /**
         * @return clusterResults
         */
        public java.util.List<ClusterResults> getClusterResults() {
            return this.clusterResults;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return maxClusteredTopicNewsSize
         */
        public Integer getMaxClusteredTopicNewsSize() {
            return this.maxClusteredTopicNewsSize;
        }

        /**
         * @return parsedNewsSize
         */
        public Integer getParsedNewsSize() {
            return this.parsedNewsSize;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return rt
         */
        public Long getRt() {
            return this.rt;
        }

        /**
         * @return usages
         */
        public java.util.Map<String, Long> getUsages() {
            return this.usages;
        }

        public static final class Builder {
            private Integer clusterCount; 
            private java.util.List<ClusterResults> clusterResults; 
            private String errorMessage; 
            private Integer maxClusteredTopicNewsSize; 
            private Integer parsedNewsSize; 
            private String status; 
            private Long rt; 
            private java.util.Map<String, Long> usages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterCount = model.clusterCount;
                this.clusterResults = model.clusterResults;
                this.errorMessage = model.errorMessage;
                this.maxClusteredTopicNewsSize = model.maxClusteredTopicNewsSize;
                this.parsedNewsSize = model.parsedNewsSize;
                this.status = model.status;
                this.rt = model.rt;
                this.usages = model.usages;
            } 

            /**
             * ClusterCount.
             */
            public Builder clusterCount(Integer clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * ClusterResults.
             */
            public Builder clusterResults(java.util.List<ClusterResults> clusterResults) {
                this.clusterResults = clusterResults;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * MaxClusteredTopicNewsSize.
             */
            public Builder maxClusteredTopicNewsSize(Integer maxClusteredTopicNewsSize) {
                this.maxClusteredTopicNewsSize = maxClusteredTopicNewsSize;
                return this;
            }

            /**
             * ParsedNewsSize.
             */
            public Builder parsedNewsSize(Integer parsedNewsSize) {
                this.parsedNewsSize = parsedNewsSize;
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
             * rt.
             */
            public Builder rt(Long rt) {
                this.rt = rt;
                return this;
            }

            /**
             * usages.
             */
            public Builder usages(java.util.Map<String, Long> usages) {
                this.usages = usages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
