// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIVideoTagResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIVideoTagResultResponseBody</p>
 */
public class GetAIVideoTagResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VideoTagResult")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VideoTagResult.
         */
        public Builder videoTagResult(VideoTagResult videoTagResult) {
            this.videoTagResult = videoTagResult;
            return this;
        }

        public GetAIVideoTagResultResponseBody build() {
            return new GetAIVideoTagResultResponseBody(this);
        } 

    } 

    public static class Category extends TeaModel {
        @NameInMap("Tag")
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
             * Tag.
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
    public static class Keyword extends TeaModel {
        @NameInMap("Tag")
        private String tag;

        @NameInMap("Times")
        private java.util.List < String > times;

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
        public java.util.List < String > getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String tag; 
            private java.util.List < String > times; 

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(java.util.List < String > times) {
                this.times = times;
                return this;
            }

            public Keyword build() {
                return new Keyword(this);
            } 

        } 

    }
    public static class Location extends TeaModel {
        @NameInMap("Tag")
        private String tag;

        @NameInMap("Times")
        private java.util.List < String > times;

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
        public java.util.List < String > getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String tag; 
            private java.util.List < String > times; 

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(java.util.List < String > times) {
                this.times = times;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    public static class Person extends TeaModel {
        @NameInMap("FaceUrl")
        private String faceUrl;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Times")
        private java.util.List < String > times;

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
        public java.util.List < String > getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String faceUrl; 
            private String tag; 
            private java.util.List < String > times; 

            /**
             * FaceUrl.
             */
            public Builder faceUrl(String faceUrl) {
                this.faceUrl = faceUrl;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(java.util.List < String > times) {
                this.times = times;
                return this;
            }

            public Person build() {
                return new Person(this);
            } 

        } 

    }
    public static class Time extends TeaModel {
        @NameInMap("Tag")
        private String tag;

        @NameInMap("Times")
        private java.util.List < String > times;

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
        public java.util.List < String > getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String tag; 
            private java.util.List < String > times; 

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(java.util.List < String > times) {
                this.times = times;
                return this;
            }

            public Time build() {
                return new Time(this);
            } 

        } 

    }
    public static class VideoTagResult extends TeaModel {
        @NameInMap("Category")
        private java.util.List < Category> category;

        @NameInMap("Keyword")
        private java.util.List < Keyword> keyword;

        @NameInMap("Location")
        private java.util.List < Location> location;

        @NameInMap("Person")
        private java.util.List < Person> person;

        @NameInMap("Time")
        private java.util.List < Time> time;

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
        public java.util.List < Category> getCategory() {
            return this.category;
        }

        /**
         * @return keyword
         */
        public java.util.List < Keyword> getKeyword() {
            return this.keyword;
        }

        /**
         * @return location
         */
        public java.util.List < Location> getLocation() {
            return this.location;
        }

        /**
         * @return person
         */
        public java.util.List < Person> getPerson() {
            return this.person;
        }

        /**
         * @return time
         */
        public java.util.List < Time> getTime() {
            return this.time;
        }

        public static final class Builder {
            private java.util.List < Category> category; 
            private java.util.List < Keyword> keyword; 
            private java.util.List < Location> location; 
            private java.util.List < Person> person; 
            private java.util.List < Time> time; 

            /**
             * Category.
             */
            public Builder category(java.util.List < Category> category) {
                this.category = category;
                return this;
            }

            /**
             * Keyword.
             */
            public Builder keyword(java.util.List < Keyword> keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(java.util.List < Location> location) {
                this.location = location;
                return this;
            }

            /**
             * Person.
             */
            public Builder person(java.util.List < Person> person) {
                this.person = person;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(java.util.List < Time> time) {
                this.time = time;
                return this;
            }

            public VideoTagResult build() {
                return new VideoTagResult(this);
            } 

        } 

    }
}
