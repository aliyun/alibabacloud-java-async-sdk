// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
 */
public class GetTopicSelectionPerspectiveAnalysisTaskResponseBody extends TeaModel {
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

    private GetTopicSelectionPerspectiveAnalysisTaskResponseBody(Builder builder) {
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

    public static GetTopicSelectionPerspectiveAnalysisTaskResponseBody create() {
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

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBody build() {
            return new GetTopicSelectionPerspectiveAnalysisTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class Outlines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outline")
        private String outline;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private Outlines(Builder builder) {
            this.outline = builder.outline;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outlines create() {
            return builder().build();
        }

        /**
         * @return outline
         */
        public String getOutline() {
            return this.outline;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String outline; 
            private String summary; 

            /**
             * Outline.
             */
            public Builder outline(String outline) {
                this.outline = outline;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public Outlines build() {
                return new Outlines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class ViewPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outlines")
        private java.util.List < Outlines> outlines;

        @com.aliyun.core.annotation.NameInMap("Point")
        private String point;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private ViewPoints(Builder builder) {
            this.outlines = builder.outlines;
            this.point = builder.point;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewPoints create() {
            return builder().build();
        }

        /**
         * @return outlines
         */
        public java.util.List < Outlines> getOutlines() {
            return this.outlines;
        }

        /**
         * @return point
         */
        public String getPoint() {
            return this.point;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private java.util.List < Outlines> outlines; 
            private String point; 
            private String summary; 

            /**
             * Outlines.
             */
            public Builder outlines(java.util.List < Outlines> outlines) {
                this.outlines = outlines;
                return this;
            }

            /**
             * Point.
             */
            public Builder point(String point) {
                this.point = point;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public ViewPoints build() {
                return new ViewPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class Attitudes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attitude")
        private String attitude;

        @com.aliyun.core.annotation.NameInMap("AttitudeType")
        private String attitudeType;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private String ratio;

        @com.aliyun.core.annotation.NameInMap("ViewPoints")
        private java.util.List < ViewPoints> viewPoints;

        private Attitudes(Builder builder) {
            this.attitude = builder.attitude;
            this.attitudeType = builder.attitudeType;
            this.ratio = builder.ratio;
            this.viewPoints = builder.viewPoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attitudes create() {
            return builder().build();
        }

        /**
         * @return attitude
         */
        public String getAttitude() {
            return this.attitude;
        }

        /**
         * @return attitudeType
         */
        public String getAttitudeType() {
            return this.attitudeType;
        }

        /**
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
        }

        /**
         * @return viewPoints
         */
        public java.util.List < ViewPoints> getViewPoints() {
            return this.viewPoints;
        }

        public static final class Builder {
            private String attitude; 
            private String attitudeType; 
            private String ratio; 
            private java.util.List < ViewPoints> viewPoints; 

            /**
             * Attitude.
             */
            public Builder attitude(String attitude) {
                this.attitude = attitude;
                return this;
            }

            /**
             * AttitudeType.
             */
            public Builder attitudeType(String attitudeType) {
                this.attitudeType = attitudeType;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * ViewPoints.
             */
            public Builder viewPoints(java.util.List < ViewPoints> viewPoints) {
                this.viewPoints = viewPoints;
                return this;
            }

            public Attitudes build() {
                return new Attitudes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class FreshViewPointsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attitudes")
        private java.util.List < Attitudes> attitudes;

        private FreshViewPointsResult(Builder builder) {
            this.attitudes = builder.attitudes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreshViewPointsResult create() {
            return builder().build();
        }

        /**
         * @return attitudes
         */
        public java.util.List < Attitudes> getAttitudes() {
            return this.attitudes;
        }

        public static final class Builder {
            private java.util.List < Attitudes> attitudes; 

            /**
             * Attitudes.
             */
            public Builder attitudes(java.util.List < Attitudes> attitudes) {
                this.attitudes = attitudes;
                return this;
            }

            public FreshViewPointsResult build() {
                return new FreshViewPointsResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class News extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("ImageUrls")
        private java.util.List < String > imageUrls;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < String > tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private News(Builder builder) {
            this.content = builder.content;
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.imageUrls = builder.imageUrls;
            this.source = builder.source;
            this.summary = builder.summary;
            this.tags = builder.tags;
            this.title = builder.title;
            this.topic = builder.topic;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static News create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return imageUrls
         */
        public java.util.List < String > getImageUrls() {
            return this.imageUrls;
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
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String content; 
            private String docId; 
            private String docUuid; 
            private java.util.List < String > imageUrls; 
            private String source; 
            private String summary; 
            private java.util.List < String > tags; 
            private String title; 
            private String topic; 
            private String url; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DocId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * DocUuid.
             */
            public Builder docUuid(String docUuid) {
                this.docUuid = docUuid;
                return this;
            }

            /**
             * ImageUrls.
             */
            public Builder imageUrls(java.util.List < String > imageUrls) {
                this.imageUrls = imageUrls;
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
             * Tags.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
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
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public News build() {
                return new News(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class ViewPointsOutlines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outline")
        private String outline;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private ViewPointsOutlines(Builder builder) {
            this.outline = builder.outline;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewPointsOutlines create() {
            return builder().build();
        }

        /**
         * @return outline
         */
        public String getOutline() {
            return this.outline;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String outline; 
            private String summary; 

            /**
             * Outline.
             */
            public Builder outline(String outline) {
                this.outline = outline;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public ViewPointsOutlines build() {
                return new ViewPointsOutlines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class AttitudesViewPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outlines")
        private java.util.List < ViewPointsOutlines> outlines;

        @com.aliyun.core.annotation.NameInMap("Point")
        private String point;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private AttitudesViewPoints(Builder builder) {
            this.outlines = builder.outlines;
            this.point = builder.point;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttitudesViewPoints create() {
            return builder().build();
        }

        /**
         * @return outlines
         */
        public java.util.List < ViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        /**
         * @return point
         */
        public String getPoint() {
            return this.point;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private java.util.List < ViewPointsOutlines> outlines; 
            private String point; 
            private String summary; 

            /**
             * Outlines.
             */
            public Builder outlines(java.util.List < ViewPointsOutlines> outlines) {
                this.outlines = outlines;
                return this;
            }

            /**
             * Point.
             */
            public Builder point(String point) {
                this.point = point;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public AttitudesViewPoints build() {
                return new AttitudesViewPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class HotViewPointsResultAttitudes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attitude")
        private String attitude;

        @com.aliyun.core.annotation.NameInMap("AttitudeType")
        private String attitudeType;

        @com.aliyun.core.annotation.NameInMap("News")
        private java.util.List < News> news;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private String ratio;

        @com.aliyun.core.annotation.NameInMap("ViewPoints")
        private java.util.List < AttitudesViewPoints> viewPoints;

        private HotViewPointsResultAttitudes(Builder builder) {
            this.attitude = builder.attitude;
            this.attitudeType = builder.attitudeType;
            this.news = builder.news;
            this.ratio = builder.ratio;
            this.viewPoints = builder.viewPoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotViewPointsResultAttitudes create() {
            return builder().build();
        }

        /**
         * @return attitude
         */
        public String getAttitude() {
            return this.attitude;
        }

        /**
         * @return attitudeType
         */
        public String getAttitudeType() {
            return this.attitudeType;
        }

        /**
         * @return news
         */
        public java.util.List < News> getNews() {
            return this.news;
        }

        /**
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
        }

        /**
         * @return viewPoints
         */
        public java.util.List < AttitudesViewPoints> getViewPoints() {
            return this.viewPoints;
        }

        public static final class Builder {
            private String attitude; 
            private String attitudeType; 
            private java.util.List < News> news; 
            private String ratio; 
            private java.util.List < AttitudesViewPoints> viewPoints; 

            /**
             * Attitude.
             */
            public Builder attitude(String attitude) {
                this.attitude = attitude;
                return this;
            }

            /**
             * AttitudeType.
             */
            public Builder attitudeType(String attitudeType) {
                this.attitudeType = attitudeType;
                return this;
            }

            /**
             * News.
             */
            public Builder news(java.util.List < News> news) {
                this.news = news;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * ViewPoints.
             */
            public Builder viewPoints(java.util.List < AttitudesViewPoints> viewPoints) {
                this.viewPoints = viewPoints;
                return this;
            }

            public HotViewPointsResultAttitudes build() {
                return new HotViewPointsResultAttitudes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class HotViewPointsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attitudes")
        private java.util.List < HotViewPointsResultAttitudes> attitudes;

        private HotViewPointsResult(Builder builder) {
            this.attitudes = builder.attitudes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotViewPointsResult create() {
            return builder().build();
        }

        /**
         * @return attitudes
         */
        public java.util.List < HotViewPointsResultAttitudes> getAttitudes() {
            return this.attitudes;
        }

        public static final class Builder {
            private java.util.List < HotViewPointsResultAttitudes> attitudes; 

            /**
             * Attitudes.
             */
            public Builder attitudes(java.util.List < HotViewPointsResultAttitudes> attitudes) {
                this.attitudes = attitudes;
                return this;
            }

            public HotViewPointsResult build() {
                return new HotViewPointsResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class AttitudesViewPointsOutlines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outline")
        private String outline;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private AttitudesViewPointsOutlines(Builder builder) {
            this.outline = builder.outline;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttitudesViewPointsOutlines create() {
            return builder().build();
        }

        /**
         * @return outline
         */
        public String getOutline() {
            return this.outline;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String outline; 
            private String summary; 

            /**
             * Outline.
             */
            public Builder outline(String outline) {
                this.outline = outline;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public AttitudesViewPointsOutlines build() {
                return new AttitudesViewPointsOutlines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class TimedViewPointsResultAttitudesViewPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outlines")
        private java.util.List < AttitudesViewPointsOutlines> outlines;

        @com.aliyun.core.annotation.NameInMap("Point")
        private String point;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private TimedViewPointsResultAttitudesViewPoints(Builder builder) {
            this.outlines = builder.outlines;
            this.point = builder.point;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimedViewPointsResultAttitudesViewPoints create() {
            return builder().build();
        }

        /**
         * @return outlines
         */
        public java.util.List < AttitudesViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        /**
         * @return point
         */
        public String getPoint() {
            return this.point;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private java.util.List < AttitudesViewPointsOutlines> outlines; 
            private String point; 
            private String summary; 

            /**
             * Outlines.
             */
            public Builder outlines(java.util.List < AttitudesViewPointsOutlines> outlines) {
                this.outlines = outlines;
                return this;
            }

            /**
             * Point.
             */
            public Builder point(String point) {
                this.point = point;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public TimedViewPointsResultAttitudesViewPoints build() {
                return new TimedViewPointsResultAttitudesViewPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class TimedViewPointsResultAttitudes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attitude")
        private String attitude;

        @com.aliyun.core.annotation.NameInMap("AttitudeType")
        private String attitudeType;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private String ratio;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("ViewPoints")
        private java.util.List < TimedViewPointsResultAttitudesViewPoints> viewPoints;

        private TimedViewPointsResultAttitudes(Builder builder) {
            this.attitude = builder.attitude;
            this.attitudeType = builder.attitudeType;
            this.pubTime = builder.pubTime;
            this.ratio = builder.ratio;
            this.source = builder.source;
            this.title = builder.title;
            this.url = builder.url;
            this.viewPoints = builder.viewPoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimedViewPointsResultAttitudes create() {
            return builder().build();
        }

        /**
         * @return attitude
         */
        public String getAttitude() {
            return this.attitude;
        }

        /**
         * @return attitudeType
         */
        public String getAttitudeType() {
            return this.attitudeType;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
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
         * @return viewPoints
         */
        public java.util.List < TimedViewPointsResultAttitudesViewPoints> getViewPoints() {
            return this.viewPoints;
        }

        public static final class Builder {
            private String attitude; 
            private String attitudeType; 
            private String pubTime; 
            private String ratio; 
            private String source; 
            private String title; 
            private String url; 
            private java.util.List < TimedViewPointsResultAttitudesViewPoints> viewPoints; 

            /**
             * Attitude.
             */
            public Builder attitude(String attitude) {
                this.attitude = attitude;
                return this;
            }

            /**
             * AttitudeType.
             */
            public Builder attitudeType(String attitudeType) {
                this.attitudeType = attitudeType;
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
             * Ratio.
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
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
             * ViewPoints.
             */
            public Builder viewPoints(java.util.List < TimedViewPointsResultAttitudesViewPoints> viewPoints) {
                this.viewPoints = viewPoints;
                return this;
            }

            public TimedViewPointsResultAttitudes build() {
                return new TimedViewPointsResultAttitudes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class TimedViewPointsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attitudes")
        private java.util.List < TimedViewPointsResultAttitudes> attitudes;

        private TimedViewPointsResult(Builder builder) {
            this.attitudes = builder.attitudes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimedViewPointsResult create() {
            return builder().build();
        }

        /**
         * @return attitudes
         */
        public java.util.List < TimedViewPointsResultAttitudes> getAttitudes() {
            return this.attitudes;
        }

        public static final class Builder {
            private java.util.List < TimedViewPointsResultAttitudes> attitudes; 

            /**
             * Attitudes.
             */
            public Builder attitudes(java.util.List < TimedViewPointsResultAttitudes> attitudes) {
                this.attitudes = attitudes;
                return this;
            }

            public TimedViewPointsResult build() {
                return new TimedViewPointsResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class DocList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private DocList(Builder builder) {
            this.source = builder.source;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocList create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
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
            private String source; 
            private String title; 
            private String url; 

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
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

            public DocList build() {
                return new DocList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class Summaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocList")
        private java.util.List < DocList> docList;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Summaries(Builder builder) {
            this.docList = builder.docList;
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
         * @return docList
         */
        public java.util.List < DocList> getDocList() {
            return this.docList;
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
            private java.util.List < DocList> docList; 
            private String summary; 
            private String title; 

            /**
             * DocList.
             */
            public Builder docList(java.util.List < DocList> docList) {
                this.docList = docList;
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

            public Summaries build() {
                return new Summaries(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class TopicSummaryResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Summaries")
        private java.util.List < Summaries> summaries;

        private TopicSummaryResult(Builder builder) {
            this.summaries = builder.summaries;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicSummaryResult create() {
            return builder().build();
        }

        /**
         * @return summaries
         */
        public java.util.List < Summaries> getSummaries() {
            return this.summaries;
        }

        public static final class Builder {
            private java.util.List < Summaries> summaries; 

            /**
             * Summaries.
             */
            public Builder summaries(java.util.List < Summaries> summaries) {
                this.summaries = summaries;
                return this;
            }

            public TopicSummaryResult build() {
                return new TopicSummaryResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class Comments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Comments(Builder builder) {
            this.source = builder.source;
            this.text = builder.text;
            this.title = builder.title;
            this.url = builder.url;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comments create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
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
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String source; 
            private String text; 
            private String title; 
            private String url; 
            private String username; 

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
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
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class WebReviewPointsResultAttitudesViewPointsOutlines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outline")
        private String outline;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private WebReviewPointsResultAttitudesViewPointsOutlines(Builder builder) {
            this.outline = builder.outline;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebReviewPointsResultAttitudesViewPointsOutlines create() {
            return builder().build();
        }

        /**
         * @return outline
         */
        public String getOutline() {
            return this.outline;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String outline; 
            private String summary; 

            /**
             * Outline.
             */
            public Builder outline(String outline) {
                this.outline = outline;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public WebReviewPointsResultAttitudesViewPointsOutlines build() {
                return new WebReviewPointsResultAttitudesViewPointsOutlines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class WebReviewPointsResultAttitudesViewPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outlines")
        private java.util.List < WebReviewPointsResultAttitudesViewPointsOutlines> outlines;

        @com.aliyun.core.annotation.NameInMap("Point")
        private String point;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private WebReviewPointsResultAttitudesViewPoints(Builder builder) {
            this.outlines = builder.outlines;
            this.point = builder.point;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebReviewPointsResultAttitudesViewPoints create() {
            return builder().build();
        }

        /**
         * @return outlines
         */
        public java.util.List < WebReviewPointsResultAttitudesViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        /**
         * @return point
         */
        public String getPoint() {
            return this.point;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private java.util.List < WebReviewPointsResultAttitudesViewPointsOutlines> outlines; 
            private String point; 
            private String summary; 

            /**
             * Outlines.
             */
            public Builder outlines(java.util.List < WebReviewPointsResultAttitudesViewPointsOutlines> outlines) {
                this.outlines = outlines;
                return this;
            }

            /**
             * Point.
             */
            public Builder point(String point) {
                this.point = point;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public WebReviewPointsResultAttitudesViewPoints build() {
                return new WebReviewPointsResultAttitudesViewPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class WebReviewPointsResultAttitudes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attitude")
        private String attitude;

        @com.aliyun.core.annotation.NameInMap("AttitudeType")
        private String attitudeType;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private java.util.List < Comments> comments;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private String ratio;

        @com.aliyun.core.annotation.NameInMap("ViewPoints")
        private java.util.List < WebReviewPointsResultAttitudesViewPoints> viewPoints;

        private WebReviewPointsResultAttitudes(Builder builder) {
            this.attitude = builder.attitude;
            this.attitudeType = builder.attitudeType;
            this.comments = builder.comments;
            this.ratio = builder.ratio;
            this.viewPoints = builder.viewPoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebReviewPointsResultAttitudes create() {
            return builder().build();
        }

        /**
         * @return attitude
         */
        public String getAttitude() {
            return this.attitude;
        }

        /**
         * @return attitudeType
         */
        public String getAttitudeType() {
            return this.attitudeType;
        }

        /**
         * @return comments
         */
        public java.util.List < Comments> getComments() {
            return this.comments;
        }

        /**
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
        }

        /**
         * @return viewPoints
         */
        public java.util.List < WebReviewPointsResultAttitudesViewPoints> getViewPoints() {
            return this.viewPoints;
        }

        public static final class Builder {
            private String attitude; 
            private String attitudeType; 
            private java.util.List < Comments> comments; 
            private String ratio; 
            private java.util.List < WebReviewPointsResultAttitudesViewPoints> viewPoints; 

            /**
             * Attitude.
             */
            public Builder attitude(String attitude) {
                this.attitude = attitude;
                return this;
            }

            /**
             * AttitudeType.
             */
            public Builder attitudeType(String attitudeType) {
                this.attitudeType = attitudeType;
                return this;
            }

            /**
             * Comments.
             */
            public Builder comments(java.util.List < Comments> comments) {
                this.comments = comments;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * ViewPoints.
             */
            public Builder viewPoints(java.util.List < WebReviewPointsResultAttitudesViewPoints> viewPoints) {
                this.viewPoints = viewPoints;
                return this;
            }

            public WebReviewPointsResultAttitudes build() {
                return new WebReviewPointsResultAttitudes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class WebReviewPointsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attitudes")
        private java.util.List < WebReviewPointsResultAttitudes> attitudes;

        private WebReviewPointsResult(Builder builder) {
            this.attitudes = builder.attitudes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebReviewPointsResult create() {
            return builder().build();
        }

        /**
         * @return attitudes
         */
        public java.util.List < WebReviewPointsResultAttitudes> getAttitudes() {
            return this.attitudes;
        }

        public static final class Builder {
            private java.util.List < WebReviewPointsResultAttitudes> attitudes; 

            /**
             * Attitudes.
             */
            public Builder attitudes(java.util.List < WebReviewPointsResultAttitudes> attitudes) {
                this.attitudes = attitudes;
                return this;
            }

            public WebReviewPointsResult build() {
                return new WebReviewPointsResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FreshViewPointsResult")
        private FreshViewPointsResult freshViewPointsResult;

        @com.aliyun.core.annotation.NameInMap("HotViewPointsResult")
        private HotViewPointsResult hotViewPointsResult;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimedViewPointsResult")
        private TimedViewPointsResult timedViewPointsResult;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("TopicSummaryResult")
        private TopicSummaryResult topicSummaryResult;

        @com.aliyun.core.annotation.NameInMap("WebReviewPointsResult")
        private WebReviewPointsResult webReviewPointsResult;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.freshViewPointsResult = builder.freshViewPointsResult;
            this.hotViewPointsResult = builder.hotViewPointsResult;
            this.status = builder.status;
            this.timedViewPointsResult = builder.timedViewPointsResult;
            this.topic = builder.topic;
            this.topicSummaryResult = builder.topicSummaryResult;
            this.webReviewPointsResult = builder.webReviewPointsResult;
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
         * @return freshViewPointsResult
         */
        public FreshViewPointsResult getFreshViewPointsResult() {
            return this.freshViewPointsResult;
        }

        /**
         * @return hotViewPointsResult
         */
        public HotViewPointsResult getHotViewPointsResult() {
            return this.hotViewPointsResult;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timedViewPointsResult
         */
        public TimedViewPointsResult getTimedViewPointsResult() {
            return this.timedViewPointsResult;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return topicSummaryResult
         */
        public TopicSummaryResult getTopicSummaryResult() {
            return this.topicSummaryResult;
        }

        /**
         * @return webReviewPointsResult
         */
        public WebReviewPointsResult getWebReviewPointsResult() {
            return this.webReviewPointsResult;
        }

        public static final class Builder {
            private String errorMessage; 
            private FreshViewPointsResult freshViewPointsResult; 
            private HotViewPointsResult hotViewPointsResult; 
            private String status; 
            private TimedViewPointsResult timedViewPointsResult; 
            private String topic; 
            private TopicSummaryResult topicSummaryResult; 
            private WebReviewPointsResult webReviewPointsResult; 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * FreshViewPointsResult.
             */
            public Builder freshViewPointsResult(FreshViewPointsResult freshViewPointsResult) {
                this.freshViewPointsResult = freshViewPointsResult;
                return this;
            }

            /**
             * HotViewPointsResult.
             */
            public Builder hotViewPointsResult(HotViewPointsResult hotViewPointsResult) {
                this.hotViewPointsResult = hotViewPointsResult;
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
             * TimedViewPointsResult.
             */
            public Builder timedViewPointsResult(TimedViewPointsResult timedViewPointsResult) {
                this.timedViewPointsResult = timedViewPointsResult;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * TopicSummaryResult.
             */
            public Builder topicSummaryResult(TopicSummaryResult topicSummaryResult) {
                this.topicSummaryResult = topicSummaryResult;
                return this;
            }

            /**
             * WebReviewPointsResult.
             */
            public Builder webReviewPointsResult(WebReviewPointsResult webReviewPointsResult) {
                this.webReviewPointsResult = webReviewPointsResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
