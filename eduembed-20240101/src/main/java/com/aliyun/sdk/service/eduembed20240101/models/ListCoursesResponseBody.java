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
 * {@link ListCoursesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCoursesResponseBody</p>
 */
public class ListCoursesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Courses")
    private java.util.List<Courses> courses;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCoursesResponseBody(Builder builder) {
        this.code = builder.code;
        this.courses = builder.courses;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCoursesResponseBody create() {
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
     * @return courses
     */
    public java.util.List<Courses> getCourses() {
        return this.courses;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Courses> courses; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCoursesResponseBody model) {
            this.code = model.code;
            this.courses = model.courses;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Courses.
         */
        public Builder courses(java.util.List<Courses> courses) {
            this.courses = courses;
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
         * Page.
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCoursesResponseBody build() {
            return new ListCoursesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCoursesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCoursesResponseBody</p>
     */
    public static class Courses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("LessonNum")
        private Integer lessonNum;

        @com.aliyun.core.annotation.NameInMap("PictureUrl")
        private String pictureUrl;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Courses(Builder builder) {
            this.category = builder.category;
            this.id = builder.id;
            this.introduction = builder.introduction;
            this.lessonNum = builder.lessonNum;
            this.pictureUrl = builder.pictureUrl;
            this.tags = builder.tags;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Courses create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return lessonNum
         */
        public Integer getLessonNum() {
            return this.lessonNum;
        }

        /**
         * @return pictureUrl
         */
        public String getPictureUrl() {
            return this.pictureUrl;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String category; 
            private String id; 
            private String introduction; 
            private Integer lessonNum; 
            private String pictureUrl; 
            private String tags; 
            private String title; 

            private Builder() {
            } 

            private Builder(Courses model) {
                this.category = model.category;
                this.id = model.id;
                this.introduction = model.introduction;
                this.lessonNum = model.lessonNum;
                this.pictureUrl = model.pictureUrl;
                this.tags = model.tags;
                this.title = model.title;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * Introduction.
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * LessonNum.
             */
            public Builder lessonNum(Integer lessonNum) {
                this.lessonNum = lessonNum;
                return this;
            }

            /**
             * PictureUrl.
             */
            public Builder pictureUrl(String pictureUrl) {
                this.pictureUrl = pictureUrl;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
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

            public Courses build() {
                return new Courses(this);
            } 

        } 

    }
}
