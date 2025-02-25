// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SearchMediaClipByFaceResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaClipByFaceResponseBody</p>
 */
public class SearchMediaClipByFaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MediaClipList")
    private java.util.List<MediaClipList> mediaClipList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private SearchMediaClipByFaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.mediaClipList = builder.mediaClipList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaClipByFaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return mediaClipList
     */
    public java.util.List<MediaClipList> getMediaClipList() {
        return this.mediaClipList;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<MediaClipList> mediaClipList; 
        private String requestId; 
        private String success; 
        private Long total; 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The media asset clips that meet the requirements.</p>
         */
        public Builder mediaClipList(java.util.List<MediaClipList> mediaClipList) {
            this.mediaClipList = mediaClipList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E44FFACD-9E90-555A-A09A-6FD3B7335E39</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of media asset clips that meet the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchMediaClipByFaceResponseBody build() {
            return new SearchMediaClipByFaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMediaClipByFaceResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaClipByFaceResponseBody</p>
     */
    public static class BoxPosition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("H")
        private Integer h;

        @com.aliyun.core.annotation.NameInMap("W")
        private Integer w;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private BoxPosition(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BoxPosition create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Integer getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Integer getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer h; 
            private Integer w; 
            private Integer x; 
            private Integer y; 

            /**
             * <p>The height of the rectangle frame. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>168</p>
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The width of the rectangle frame. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The x-axis coordinate of the upper-left corner. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>517</p>
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-axis coordinate of the upper-left corner. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>409</p>
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public BoxPosition build() {
                return new BoxPosition(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaClipByFaceResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaClipByFaceResponseBody</p>
     */
    public static class TrackData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoxPosition")
        private BoxPosition boxPosition;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Float timestamp;

        private TrackData(Builder builder) {
            this.boxPosition = builder.boxPosition;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrackData create() {
            return builder().build();
        }

        /**
         * @return boxPosition
         */
        public BoxPosition getBoxPosition() {
            return this.boxPosition;
        }

        /**
         * @return timestamp
         */
        public Float getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private BoxPosition boxPosition; 
            private Float timestamp; 

            /**
             * <p>The coordinates of the face.</p>
             */
            public Builder boxPosition(BoxPosition boxPosition) {
                this.boxPosition = boxPosition;
                return this;
            }

            /**
             * <p>The timestamp when the face appears in the clip. Unit: seconds. The value is of the Float type.</p>
             * 
             * <strong>example:</strong>
             * <p>62.03302</p>
             */
            public Builder timestamp(Float timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public TrackData build() {
                return new TrackData(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaClipByFaceResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaClipByFaceResponseBody</p>
     */
    public static class OccurrencesInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Float endTime;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Float startTime;

        @com.aliyun.core.annotation.NameInMap("TrackData")
        private java.util.List<TrackData> trackData;

        private OccurrencesInfos(Builder builder) {
            this.endTime = builder.endTime;
            this.expression = builder.expression;
            this.startTime = builder.startTime;
            this.trackData = builder.trackData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OccurrencesInfos create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Float getEndTime() {
            return this.endTime;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return startTime
         */
        public Float getStartTime() {
            return this.startTime;
        }

        /**
         * @return trackData
         */
        public java.util.List<TrackData> getTrackData() {
            return this.trackData;
        }

        public static final class Builder {
            private Float endTime; 
            private String expression; 
            private Float startTime; 
            private java.util.List<TrackData> trackData; 

            /**
             * <p>The end time of the clip. Unit: seconds. The value is of the Float type.</p>
             * 
             * <strong>example:</strong>
             * <p>69.06635</p>
             */
            public Builder endTime(Float endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The start time of the clip. Unit: seconds. The value is of the Float type.</p>
             * 
             * <strong>example:</strong>
             * <p>61.066353</p>
             */
            public Builder startTime(Float startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The information about the face in the clip.</p>
             */
            public Builder trackData(java.util.List<TrackData> trackData) {
                this.trackData = trackData;
                return this;
            }

            public OccurrencesInfos build() {
                return new OccurrencesInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaClipByFaceResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaClipByFaceResponseBody</p>
     */
    public static class MediaClipList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("LabelName")
        private String labelName;

        @com.aliyun.core.annotation.NameInMap("OccurrencesInfos")
        private java.util.List<OccurrencesInfos> occurrencesInfos;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        private MediaClipList(Builder builder) {
            this.category = builder.category;
            this.entityId = builder.entityId;
            this.labelName = builder.labelName;
            this.occurrencesInfos = builder.occurrencesInfos;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaClipList create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return labelName
         */
        public String getLabelName() {
            return this.labelName;
        }

        /**
         * @return occurrencesInfos
         */
        public java.util.List<OccurrencesInfos> getOccurrencesInfos() {
            return this.occurrencesInfos;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        public static final class Builder {
            private String category; 
            private String entityId; 
            private String labelName; 
            private java.util.List<OccurrencesInfos> occurrencesInfos; 
            private Float score; 

            /**
             * <p>The type of the character. Valid values: celebrity sensitive politician custom unknown</p>
             * 
             * <strong>example:</strong>
             * <p>celebrity</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The ID of the entity, which is the same as the entity ID returned in tag analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>1031025****</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The name of the entity.</p>
             */
            public Builder labelName(String labelName) {
                this.labelName = labelName;
                return this;
            }

            /**
             * <p>The information about clips related to the face.</p>
             */
            public Builder occurrencesInfos(java.util.List<OccurrencesInfos> occurrencesInfos) {
                this.occurrencesInfos = occurrencesInfos;
                return this;
            }

            /**
             * <p>The score of the clip. The value is of the Float type. The value is in the range of [0,1].</p>
             * 
             * <strong>example:</strong>
             * <p>0.99041677</p>
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            public MediaClipList build() {
                return new MediaClipList(this);
            } 

        } 

    }
}
