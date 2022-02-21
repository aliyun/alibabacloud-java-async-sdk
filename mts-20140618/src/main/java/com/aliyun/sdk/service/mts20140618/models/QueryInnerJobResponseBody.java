// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInnerJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInnerJobResponseBody</p>
 */
public class QueryInnerJobResponseBody extends TeaModel {
    @NameInMap("Image")
    private Image image;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Suggestion")
    private String suggestion;

    @NameInMap("Video")
    private Video video;

    private QueryInnerJobResponseBody(Builder builder) {
        this.image = builder.image;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.suggestion = builder.suggestion;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInnerJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return suggestion
     */
    public String getSuggestion() {
        return this.suggestion;
    }

    /**
     * @return video
     */
    public Video getVideo() {
        return this.video;
    }

    public static final class Builder {
        private Image image; 
        private String requestId; 
        private String status; 
        private String suggestion; 
        private Video video; 

        /**
         * Image.
         */
        public Builder image(Image image) {
            this.image = image;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Suggestion.
         */
        public Builder suggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }

        /**
         * Video.
         */
        public Builder video(Video video) {
            this.video = video;
            return this;
        }

        public QueryInnerJobResponseBody build() {
            return new QueryInnerJobResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("Result")
        private Integer result;

        private Result(Builder builder) {
            this.code = builder.code;
            this.index = builder.index;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        public static final class Builder {
            private String code; 
            private Integer index; 
            private Integer result; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Image extends TeaModel {
        @NameInMap("Result")
        private java.util.List < Result> result;

        private Image(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < Result> result; 

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    public static class Video extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("Result")
        private Integer result;

        private Video(Builder builder) {
            this.code = builder.code;
            this.index = builder.index;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Video create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        public static final class Builder {
            private String code; 
            private Integer index; 
            private Integer result; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            public Video build() {
                return new Video(this);
            } 

        } 

    }
}
