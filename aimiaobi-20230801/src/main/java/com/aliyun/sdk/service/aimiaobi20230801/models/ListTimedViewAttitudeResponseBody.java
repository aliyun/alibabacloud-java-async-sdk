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
 * {@link ListTimedViewAttitudeResponseBody} extends {@link TeaModel}
 *
 * <p>ListTimedViewAttitudeResponseBody</p>
 */
public class ListTimedViewAttitudeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTimedViewAttitudeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTimedViewAttitudeResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

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
        public Builder data(java.util.List<Data> data) {
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTimedViewAttitudeResponseBody build() {
            return new ListTimedViewAttitudeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTimedViewAttitudeResponseBody} extends {@link TeaModel}
     *
     * <p>ListTimedViewAttitudeResponseBody</p>
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
     * {@link ListTimedViewAttitudeResponseBody} extends {@link TeaModel}
     *
     * <p>ListTimedViewAttitudeResponseBody</p>
     */
    public static class ViewPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outlines")
        private java.util.List<Outlines> outlines;

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
        public java.util.List<Outlines> getOutlines() {
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
            private java.util.List<Outlines> outlines; 
            private String point; 
            private String summary; 

            /**
             * Outlines.
             */
            public Builder outlines(java.util.List<Outlines> outlines) {
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
     * {@link ListTimedViewAttitudeResponseBody} extends {@link TeaModel}
     *
     * <p>ListTimedViewAttitudeResponseBody</p>
     */
    public static class Data extends TeaModel {
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
        private java.util.List<ViewPoints> viewPoints;

        private Data(Builder builder) {
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

        public static Data create() {
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
        public java.util.List<ViewPoints> getViewPoints() {
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
            private java.util.List<ViewPoints> viewPoints; 

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
            public Builder viewPoints(java.util.List<ViewPoints> viewPoints) {
                this.viewPoints = viewPoints;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
