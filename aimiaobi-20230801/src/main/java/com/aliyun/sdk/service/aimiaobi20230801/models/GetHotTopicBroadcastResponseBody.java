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
 * {@link GetHotTopicBroadcastResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotTopicBroadcastResponseBody</p>
 */
public class GetHotTopicBroadcastResponseBody extends TeaModel {
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

    private GetHotTopicBroadcastResponseBody(Builder builder) {
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

    public static GetHotTopicBroadcastResponseBody create() {
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

        private Builder(GetHotTopicBroadcastResponseBody model) {
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

        public GetHotTopicBroadcastResponseBody build() {
            return new GetHotTopicBroadcastResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHotTopicBroadcastResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Images(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.url = model.url;
            } 

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotTopicBroadcastResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastResponseBody</p>
     */
    public static class Comments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Comments(Builder builder) {
            this.text = builder.text;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comments create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String text; 
            private String username; 

            private Builder() {
            } 

            private Builder(Comments model) {
                this.text = model.text;
                this.username = model.username;
            } 

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Comments build() {
                return new Comments(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotTopicBroadcastResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastResponseBody</p>
     */
    public static class News extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalysisCategory")
        private String analysisCategory;

        @com.aliyun.core.annotation.NameInMap("AnalysisTopic")
        private String analysisTopic;

        @com.aliyun.core.annotation.NameInMap("Author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("Category")
        private java.util.List<String> category;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private java.util.List<Comments> comments;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Dt")
        private String dt;

        @com.aliyun.core.annotation.NameInMap("HotTopic")
        private String hotTopic;

        @com.aliyun.core.annotation.NameInMap("ImgList")
        private java.util.List<String> imgList;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private String logo;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("Website")
        private String website;

        private News(Builder builder) {
            this.analysisCategory = builder.analysisCategory;
            this.analysisTopic = builder.analysisTopic;
            this.author = builder.author;
            this.category = builder.category;
            this.comments = builder.comments;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.domain = builder.domain;
            this.dt = builder.dt;
            this.hotTopic = builder.hotTopic;
            this.imgList = builder.imgList;
            this.logo = builder.logo;
            this.pubTime = builder.pubTime;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
            this.uuid = builder.uuid;
            this.website = builder.website;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static News create() {
            return builder().build();
        }

        /**
         * @return analysisCategory
         */
        public String getAnalysisCategory() {
            return this.analysisCategory;
        }

        /**
         * @return analysisTopic
         */
        public String getAnalysisTopic() {
            return this.analysisTopic;
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * @return category
         */
        public java.util.List<String> getCategory() {
            return this.category;
        }

        /**
         * @return comments
         */
        public java.util.List<Comments> getComments() {
            return this.comments;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return dt
         */
        public String getDt() {
            return this.dt;
        }

        /**
         * @return hotTopic
         */
        public String getHotTopic() {
            return this.hotTopic;
        }

        /**
         * @return imgList
         */
        public java.util.List<String> getImgList() {
            return this.imgList;
        }

        /**
         * @return logo
         */
        public String getLogo() {
            return this.logo;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
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

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return website
         */
        public String getWebsite() {
            return this.website;
        }

        public static final class Builder {
            private String analysisCategory; 
            private String analysisTopic; 
            private String author; 
            private java.util.List<String> category; 
            private java.util.List<Comments> comments; 
            private String content; 
            private String createTime; 
            private String domain; 
            private String dt; 
            private String hotTopic; 
            private java.util.List<String> imgList; 
            private String logo; 
            private String pubTime; 
            private String summary; 
            private String title; 
            private String url; 
            private String uuid; 
            private String website; 

            private Builder() {
            } 

            private Builder(News model) {
                this.analysisCategory = model.analysisCategory;
                this.analysisTopic = model.analysisTopic;
                this.author = model.author;
                this.category = model.category;
                this.comments = model.comments;
                this.content = model.content;
                this.createTime = model.createTime;
                this.domain = model.domain;
                this.dt = model.dt;
                this.hotTopic = model.hotTopic;
                this.imgList = model.imgList;
                this.logo = model.logo;
                this.pubTime = model.pubTime;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
                this.uuid = model.uuid;
                this.website = model.website;
            } 

            /**
             * AnalysisCategory.
             */
            public Builder analysisCategory(String analysisCategory) {
                this.analysisCategory = analysisCategory;
                return this;
            }

            /**
             * AnalysisTopic.
             */
            public Builder analysisTopic(String analysisTopic) {
                this.analysisTopic = analysisTopic;
                return this;
            }

            /**
             * Author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(java.util.List<String> category) {
                this.category = category;
                return this;
            }

            /**
             * Comments.
             */
            public Builder comments(java.util.List<Comments> comments) {
                this.comments = comments;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Dt.
             */
            public Builder dt(String dt) {
                this.dt = dt;
                return this;
            }

            /**
             * HotTopic.
             */
            public Builder hotTopic(String hotTopic) {
                this.hotTopic = hotTopic;
                return this;
            }

            /**
             * ImgList.
             */
            public Builder imgList(java.util.List<String> imgList) {
                this.imgList = imgList;
                return this;
            }

            /**
             * <p>logo</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com/a.png">https://www.example.com/a.png</a></p>
             */
            public Builder logo(String logo) {
                this.logo = logo;
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

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * Website.
             */
            public Builder website(String website) {
                this.website = website;
                return this;
            }

            public News build() {
                return new News(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotTopicBroadcastResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastResponseBody</p>
     */
    public static class Summaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Summaries(Builder builder) {
            this.summary = builder.summary;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summaries create() {
            return builder().build();
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

        public static final class Builder {
            private String summary; 
            private String title; 

            private Builder() {
            } 

            private Builder(Summaries model) {
                this.summary = model.summary;
                this.title = model.title;
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

            public Summaries build() {
                return new Summaries(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotTopicBroadcastResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputToken")
        private Integer inputToken;

        @com.aliyun.core.annotation.NameInMap("OutputToken")
        private Integer outputToken;

        @com.aliyun.core.annotation.NameInMap("Summaries")
        private java.util.List<Summaries> summaries;

        private Summary(Builder builder) {
            this.inputToken = builder.inputToken;
            this.outputToken = builder.outputToken;
            this.summaries = builder.summaries;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return inputToken
         */
        public Integer getInputToken() {
            return this.inputToken;
        }

        /**
         * @return outputToken
         */
        public Integer getOutputToken() {
            return this.outputToken;
        }

        /**
         * @return summaries
         */
        public java.util.List<Summaries> getSummaries() {
            return this.summaries;
        }

        public static final class Builder {
            private Integer inputToken; 
            private Integer outputToken; 
            private java.util.List<Summaries> summaries; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.inputToken = model.inputToken;
                this.outputToken = model.outputToken;
                this.summaries = model.summaries;
            } 

            /**
             * InputToken.
             */
            public Builder inputToken(Integer inputToken) {
                this.inputToken = inputToken;
                return this;
            }

            /**
             * OutputToken.
             */
            public Builder outputToken(Integer outputToken) {
                this.outputToken = outputToken;
                return this;
            }

            /**
             * Summaries.
             */
            public Builder summaries(java.util.List<Summaries> summaries) {
                this.summaries = summaries;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotTopicBroadcastResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomHotValue")
        private Double customHotValue;

        @com.aliyun.core.annotation.NameInMap("CustomTextSummary")
        private String customTextSummary;

        @com.aliyun.core.annotation.NameInMap("HotTopic")
        private String hotTopic;

        @com.aliyun.core.annotation.NameInMap("HotTopicVersion")
        private String hotTopicVersion;

        @com.aliyun.core.annotation.NameInMap("HotValue")
        private Double hotValue;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("InputToken")
        private Integer inputToken;

        @com.aliyun.core.annotation.NameInMap("Locations")
        private java.util.List<String> locations;

        @com.aliyun.core.annotation.NameInMap("News")
        private java.util.List<News> news;

        @com.aliyun.core.annotation.NameInMap("OutputToken")
        private Integer outputToken;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private Summary summary;

        @com.aliyun.core.annotation.NameInMap("TextSummary")
        private String textSummary;

        private DataData(Builder builder) {
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.customHotValue = builder.customHotValue;
            this.customTextSummary = builder.customTextSummary;
            this.hotTopic = builder.hotTopic;
            this.hotTopicVersion = builder.hotTopicVersion;
            this.hotValue = builder.hotValue;
            this.id = builder.id;
            this.images = builder.images;
            this.inputToken = builder.inputToken;
            this.locations = builder.locations;
            this.news = builder.news;
            this.outputToken = builder.outputToken;
            this.summary = builder.summary;
            this.textSummary = builder.textSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customHotValue
         */
        public Double getCustomHotValue() {
            return this.customHotValue;
        }

        /**
         * @return customTextSummary
         */
        public String getCustomTextSummary() {
            return this.customTextSummary;
        }

        /**
         * @return hotTopic
         */
        public String getHotTopic() {
            return this.hotTopic;
        }

        /**
         * @return hotTopicVersion
         */
        public String getHotTopicVersion() {
            return this.hotTopicVersion;
        }

        /**
         * @return hotValue
         */
        public Double getHotValue() {
            return this.hotValue;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        /**
         * @return inputToken
         */
        public Integer getInputToken() {
            return this.inputToken;
        }

        /**
         * @return locations
         */
        public java.util.List<String> getLocations() {
            return this.locations;
        }

        /**
         * @return news
         */
        public java.util.List<News> getNews() {
            return this.news;
        }

        /**
         * @return outputToken
         */
        public Integer getOutputToken() {
            return this.outputToken;
        }

        /**
         * @return summary
         */
        public Summary getSummary() {
            return this.summary;
        }

        /**
         * @return textSummary
         */
        public String getTextSummary() {
            return this.textSummary;
        }

        public static final class Builder {
            private String category; 
            private String createTime; 
            private Double customHotValue; 
            private String customTextSummary; 
            private String hotTopic; 
            private String hotTopicVersion; 
            private Double hotValue; 
            private String id; 
            private java.util.List<Images> images; 
            private Integer inputToken; 
            private java.util.List<String> locations; 
            private java.util.List<News> news; 
            private Integer outputToken; 
            private Summary summary; 
            private String textSummary; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.category = model.category;
                this.createTime = model.createTime;
                this.customHotValue = model.customHotValue;
                this.customTextSummary = model.customTextSummary;
                this.hotTopic = model.hotTopic;
                this.hotTopicVersion = model.hotTopicVersion;
                this.hotValue = model.hotValue;
                this.id = model.id;
                this.images = model.images;
                this.inputToken = model.inputToken;
                this.locations = model.locations;
                this.news = model.news;
                this.outputToken = model.outputToken;
                this.summary = model.summary;
                this.textSummary = model.textSummary;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomHotValue.
             */
            public Builder customHotValue(Double customHotValue) {
                this.customHotValue = customHotValue;
                return this;
            }

            /**
             * CustomTextSummary.
             */
            public Builder customTextSummary(String customTextSummary) {
                this.customTextSummary = customTextSummary;
                return this;
            }

            /**
             * HotTopic.
             */
            public Builder hotTopic(String hotTopic) {
                this.hotTopic = hotTopic;
                return this;
            }

            /**
             * HotTopicVersion.
             */
            public Builder hotTopicVersion(String hotTopicVersion) {
                this.hotTopicVersion = hotTopicVersion;
                return this;
            }

            /**
             * HotValue.
             */
            public Builder hotValue(Double hotValue) {
                this.hotValue = hotValue;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Images.
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * InputToken.
             */
            public Builder inputToken(Integer inputToken) {
                this.inputToken = inputToken;
                return this;
            }

            /**
             * Locations.
             */
            public Builder locations(java.util.List<String> locations) {
                this.locations = locations;
                return this;
            }

            /**
             * News.
             */
            public Builder news(java.util.List<News> news) {
                this.news = news;
                return this;
            }

            /**
             * OutputToken.
             */
            public Builder outputToken(Integer outputToken) {
                this.outputToken = outputToken;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(Summary summary) {
                this.summary = summary;
                return this;
            }

            /**
             * TextSummary.
             */
            public Builder textSummary(String textSummary) {
                this.textSummary = textSummary;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotTopicBroadcastResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastResponseBody</p>
     */
    public static class TotalTokenInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HotTopicCount")
        private Integer hotTopicCount;

        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Integer inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Integer outputTokens;

        @com.aliyun.core.annotation.NameInMap("WordCount")
        private Integer wordCount;

        private TotalTokenInfo(Builder builder) {
            this.hotTopicCount = builder.hotTopicCount;
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.wordCount = builder.wordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalTokenInfo create() {
            return builder().build();
        }

        /**
         * @return hotTopicCount
         */
        public Integer getHotTopicCount() {
            return this.hotTopicCount;
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

        /**
         * @return wordCount
         */
        public Integer getWordCount() {
            return this.wordCount;
        }

        public static final class Builder {
            private Integer hotTopicCount; 
            private Integer inputTokens; 
            private Integer outputTokens; 
            private Integer wordCount; 

            private Builder() {
            } 

            private Builder(TotalTokenInfo model) {
                this.hotTopicCount = model.hotTopicCount;
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.wordCount = model.wordCount;
            } 

            /**
             * HotTopicCount.
             */
            public Builder hotTopicCount(Integer hotTopicCount) {
                this.hotTopicCount = hotTopicCount;
                return this;
            }

            /**
             * InputTokens.
             */
            public Builder inputTokens(Integer inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Integer outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * WordCount.
             */
            public Builder wordCount(Integer wordCount) {
                this.wordCount = wordCount;
                return this;
            }

            public TotalTokenInfo build() {
                return new TotalTokenInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotTopicBroadcastResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<DataData> data;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalTokenInfo")
        private TotalTokenInfo totalTokenInfo;

        private Data(Builder builder) {
            this.data = builder.data;
            this.totalCount = builder.totalCount;
            this.totalTokenInfo = builder.totalTokenInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalTokenInfo
         */
        public TotalTokenInfo getTotalTokenInfo() {
            return this.totalTokenInfo;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 
            private Integer totalCount; 
            private TotalTokenInfo totalTokenInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.totalCount = model.totalCount;
                this.totalTokenInfo = model.totalTokenInfo;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalTokenInfo.
             */
            public Builder totalTokenInfo(TotalTokenInfo totalTokenInfo) {
                this.totalTokenInfo = totalTokenInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
