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
 * {@link UpdateDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDatasetResponseBody</p>
 */
public class UpdateDatasetResponseBody extends TeaModel {
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

    private UpdateDatasetResponseBody(Builder builder) {
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

    public static UpdateDatasetResponseBody create() {
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

        private Builder(UpdateDatasetResponseBody model) {
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

        public UpdateDatasetResponseBody build() {
            return new UpdateDatasetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDatasetResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateDatasetResponseBody</p>
     */
    public static class NewsArticleResultsData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private NewsArticleResultsData(Builder builder) {
            this.content = builder.content;
            this.pubTime = builder.pubTime;
            this.source = builder.source;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewsArticleResultsData create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
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
            private String content; 
            private String pubTime; 
            private String source; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(NewsArticleResultsData model) {
                this.content = model.content;
                this.pubTime = model.pubTime;
                this.source = model.source;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
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

            public NewsArticleResultsData build() {
                return new NewsArticleResultsData(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDatasetResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateDatasetResponseBody</p>
     */
    public static class NewsArticleResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Current")
        private Integer current;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<NewsArticleResultsData> data;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private NewsArticleResults(Builder builder) {
            this.code = builder.code;
            this.current = builder.current;
            this.data = builder.data;
            this.message = builder.message;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewsArticleResults create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return data
         */
        public java.util.List<NewsArticleResultsData> getData() {
            return this.data;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String code; 
            private Integer current; 
            private java.util.List<NewsArticleResultsData> data; 
            private String message; 
            private Integer size; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(NewsArticleResults model) {
                this.code = model.code;
                this.current = model.current;
                this.data = model.data;
                this.message = model.message;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Current.
             */
            public Builder current(Integer current) {
                this.current = current;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.List<NewsArticleResultsData> data) {
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
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public NewsArticleResults build() {
                return new NewsArticleResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDatasetResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateDatasetResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DatasetDescription")
        private String datasetDescription;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private Long datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("DatasetType")
        private String datasetType;

        @com.aliyun.core.annotation.NameInMap("NewsArticleResults")
        private java.util.List<NewsArticleResults> newsArticleResults;

        @com.aliyun.core.annotation.NameInMap("SearchDatasetEnable")
        private Integer searchDatasetEnable;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.datasetDescription = builder.datasetDescription;
            this.datasetId = builder.datasetId;
            this.datasetName = builder.datasetName;
            this.datasetType = builder.datasetType;
            this.newsArticleResults = builder.newsArticleResults;
            this.searchDatasetEnable = builder.searchDatasetEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return datasetDescription
         */
        public String getDatasetDescription() {
            return this.datasetDescription;
        }

        /**
         * @return datasetId
         */
        public Long getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return datasetType
         */
        public String getDatasetType() {
            return this.datasetType;
        }

        /**
         * @return newsArticleResults
         */
        public java.util.List<NewsArticleResults> getNewsArticleResults() {
            return this.newsArticleResults;
        }

        /**
         * @return searchDatasetEnable
         */
        public Integer getSearchDatasetEnable() {
            return this.searchDatasetEnable;
        }

        public static final class Builder {
            private String createTime; 
            private String createUser; 
            private String datasetDescription; 
            private Long datasetId; 
            private String datasetName; 
            private String datasetType; 
            private java.util.List<NewsArticleResults> newsArticleResults; 
            private Integer searchDatasetEnable; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.datasetDescription = model.datasetDescription;
                this.datasetId = model.datasetId;
                this.datasetName = model.datasetName;
                this.datasetType = model.datasetType;
                this.newsArticleResults = model.newsArticleResults;
                this.searchDatasetEnable = model.searchDatasetEnable;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * DatasetDescription.
             */
            public Builder datasetDescription(String datasetDescription) {
                this.datasetDescription = datasetDescription;
                return this;
            }

            /**
             * DatasetId.
             */
            public Builder datasetId(Long datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * DatasetType.
             */
            public Builder datasetType(String datasetType) {
                this.datasetType = datasetType;
                return this;
            }

            /**
             * NewsArticleResults.
             */
            public Builder newsArticleResults(java.util.List<NewsArticleResults> newsArticleResults) {
                this.newsArticleResults = newsArticleResults;
                return this;
            }

            /**
             * SearchDatasetEnable.
             */
            public Builder searchDatasetEnable(Integer searchDatasetEnable) {
                this.searchDatasetEnable = searchDatasetEnable;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
