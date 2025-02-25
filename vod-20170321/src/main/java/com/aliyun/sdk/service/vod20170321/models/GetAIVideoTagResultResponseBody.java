// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetAIVideoTagResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIVideoTagResultResponseBody</p>
 */
public class GetAIVideoTagResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VideoTagResult")
    private VideoTagResult videoTagResult;

    private GetAIVideoTagResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.videoTagResult = builder.videoTagResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIVideoTagResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return videoTagResult
     */
    public VideoTagResult getVideoTagResult() {
        return this.videoTagResult;
    }

    public static final class Builder {
        private String requestId; 
        private VideoTagResult videoTagResult; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8829B4DB-AFD9-4FF6-12965DBFFA14****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder videoTagResult(VideoTagResult videoTagResult) {
            this.videoTagResult = videoTagResult;
            return this;
        }

        public GetAIVideoTagResultResponseBody build() {
            return new GetAIVideoTagResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAIVideoTagResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIVideoTagResultResponseBody</p>
     */
    public static class Category extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private Category(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Category create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String tag; 

            /**
             * <p>The tag string.</p>
             * 
             * <strong>example:</strong>
             * <p>Retouching</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Category build() {
                return new Category(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIVideoTagResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIVideoTagResultResponseBody</p>
     */
    public static class Keyword extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Times")
        private java.util.List<String> times;

        private Keyword(Builder builder) {
            this.tag = builder.tag;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keyword create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return times
         */
        public java.util.List<String> getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String tag; 
            private java.util.List<String> times; 

            /**
             * <p>The tag string.</p>
             * 
             * <strong>example:</strong>
             * <p>Cushion</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The points in time when the tags are displayed. Unit: milliseconds.</p>
             */
            public Builder times(java.util.List<String> times) {
                this.times = times;
                return this;
            }

            public Keyword build() {
                return new Keyword(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIVideoTagResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIVideoTagResultResponseBody</p>
     */
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Times")
        private java.util.List<String> times;

        private Location(Builder builder) {
            this.tag = builder.tag;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return times
         */
        public java.util.List<String> getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String tag; 
            private java.util.List<String> times; 

            /**
             * <p>The tag string.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The points in time when the tags are displayed. Unit: milliseconds.</p>
             */
            public Builder times(java.util.List<String> times) {
                this.times = times;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIVideoTagResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIVideoTagResultResponseBody</p>
     */
    public static class Person extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceUrl")
        private String faceUrl;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Times")
        private java.util.List<String> times;

        private Person(Builder builder) {
            this.faceUrl = builder.faceUrl;
            this.tag = builder.tag;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Person create() {
            return builder().build();
        }

        /**
         * @return faceUrl
         */
        public String getFaceUrl() {
            return this.faceUrl;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return times
         */
        public java.util.List<String> getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String faceUrl; 
            private String tag; 
            private java.util.List<String> times; 

            /**
             * <p>The URL of the profile photo.</p>
             * <blockquote>
             * <p>This parameter is returned only when a figure tag was used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/aivideotag/8829B4DB-AFD9-4F*****F6-12965DBFFA14/Index_****.jpg">http://example.com/aivideotag/8829B4DB-AFD9-4F*****F6-12965DBFFA14/Index_****.jpg</a></p>
             */
            public Builder faceUrl(String faceUrl) {
                this.faceUrl = faceUrl;
                return this;
            }

            /**
             * <p>The tag string.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The points in time when the tags are displayed. Unit: milliseconds.</p>
             */
            public Builder times(java.util.List<String> times) {
                this.times = times;
                return this;
            }

            public Person build() {
                return new Person(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIVideoTagResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIVideoTagResultResponseBody</p>
     */
    public static class Time extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Times")
        private java.util.List<String> times;

        private Time(Builder builder) {
            this.tag = builder.tag;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Time create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return times
         */
        public java.util.List<String> getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String tag; 
            private java.util.List<String> times; 

            /**
             * <p>The tag string.</p>
             * 
             * <strong>example:</strong>
             * <p>Milliseconds</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The points in time when the tags are displayed. Unit: milliseconds.</p>
             */
            public Builder times(java.util.List<String> times) {
                this.times = times;
                return this;
            }

            public Time build() {
                return new Time(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIVideoTagResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIVideoTagResultResponseBody</p>
     */
    public static class VideoTagResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private java.util.List<Category> category;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private java.util.List<Keyword> keyword;

        @com.aliyun.core.annotation.NameInMap("Location")
        private java.util.List<Location> location;

        @com.aliyun.core.annotation.NameInMap("Person")
        private java.util.List<Person> person;

        @com.aliyun.core.annotation.NameInMap("Time")
        private java.util.List<Time> time;

        private VideoTagResult(Builder builder) {
            this.category = builder.category;
            this.keyword = builder.keyword;
            this.location = builder.location;
            this.person = builder.person;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTagResult create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public java.util.List<Category> getCategory() {
            return this.category;
        }

        /**
         * @return keyword
         */
        public java.util.List<Keyword> getKeyword() {
            return this.keyword;
        }

        /**
         * @return location
         */
        public java.util.List<Location> getLocation() {
            return this.location;
        }

        /**
         * @return person
         */
        public java.util.List<Person> getPerson() {
            return this.person;
        }

        /**
         * @return time
         */
        public java.util.List<Time> getTime() {
            return this.time;
        }

        public static final class Builder {
            private java.util.List<Category> category; 
            private java.util.List<Keyword> keyword; 
            private java.util.List<Location> location; 
            private java.util.List<Person> person; 
            private java.util.List<Time> time; 

            /**
             * <p>The video categories.</p>
             */
            public Builder category(java.util.List<Category> category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The keyword tags.</p>
             */
            public Builder keyword(java.util.List<Keyword> keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The location tags.</p>
             */
            public Builder location(java.util.List<Location> location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The figure tags.</p>
             */
            public Builder person(java.util.List<Person> person) {
                this.person = person;
                return this;
            }

            /**
             * <p>The time tags.</p>
             */
            public Builder time(java.util.List<Time> time) {
                this.time = time;
                return this;
            }

            public VideoTagResult build() {
                return new VideoTagResult(this);
            } 

        } 

    }
}
