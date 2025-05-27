// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

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
 * {@link DescribeCourseLessonResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCourseLessonResponseBody</p>
 */
public class DescribeCourseLessonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CourseLesson")
    private CourseLesson courseLesson;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCourseLessonResponseBody(Builder builder) {
        this.code = builder.code;
        this.courseLesson = builder.courseLesson;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCourseLessonResponseBody create() {
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
     * @return courseLesson
     */
    public CourseLesson getCourseLesson() {
        return this.courseLesson;
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
        private CourseLesson courseLesson; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCourseLessonResponseBody model) {
            this.code = model.code;
            this.courseLesson = model.courseLesson;
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
         * CourseLesson.
         */
        public Builder courseLesson(CourseLesson courseLesson) {
            this.courseLesson = courseLesson;
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

        public DescribeCourseLessonResponseBody build() {
            return new DescribeCourseLessonResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCourseLessonResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCourseLessonResponseBody</p>
     */
    public static class CourseLesson extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private CourseLesson(Builder builder) {
            this.content = builder.content;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CourseLesson create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String content; 
            private String url; 

            private Builder() {
            } 

            private Builder(CourseLesson model) {
                this.content = model.content;
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
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public CourseLesson build() {
                return new CourseLesson(this);
            } 

        } 

    }
}
