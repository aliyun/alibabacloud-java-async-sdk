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
 * {@link DescribeCourseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCourseResponseBody</p>
 */
public class DescribeCourseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Course")
    private Course course;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCourseResponseBody(Builder builder) {
        this.code = builder.code;
        this.course = builder.course;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCourseResponseBody create() {
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
     * @return course
     */
    public Course getCourse() {
        return this.course;
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
        private Course course; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCourseResponseBody model) {
            this.code = model.code;
            this.course = model.course;
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
         * Course.
         */
        public Builder course(Course course) {
            this.course = course;
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

        public DescribeCourseResponseBody build() {
            return new DescribeCourseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCourseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCourseResponseBody</p>
     */
    public static class Lessons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Lessons(Builder builder) {
            this.duration = builder.duration;
            this.id = builder.id;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lessons create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer duration; 
            private Long id; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(Lessons model) {
                this.duration = model.duration;
                this.id = model.id;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Lessons build() {
                return new Lessons(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCourseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCourseResponseBody</p>
     */
    public static class UnitLessons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UnitLessons(Builder builder) {
            this.duration = builder.duration;
            this.id = builder.id;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnitLessons create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer duration; 
            private Long id; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(UnitLessons model) {
                this.duration = model.duration;
                this.id = model.id;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UnitLessons build() {
                return new UnitLessons(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCourseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCourseResponseBody</p>
     */
    public static class Unit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Lessons")
        private java.util.List<UnitLessons> lessons;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Unit(Builder builder) {
            this.lessons = builder.lessons;
            this.number = builder.number;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Unit create() {
            return builder().build();
        }

        /**
         * @return lessons
         */
        public java.util.List<UnitLessons> getLessons() {
            return this.lessons;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List<UnitLessons> lessons; 
            private Integer number; 
            private String title; 

            private Builder() {
            } 

            private Builder(Unit model) {
                this.lessons = model.lessons;
                this.number = model.number;
                this.title = model.title;
            } 

            /**
             * Lessons.
             */
            public Builder lessons(java.util.List<UnitLessons> lessons) {
                this.lessons = lessons;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Unit build() {
                return new Unit(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCourseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCourseResponseBody</p>
     */
    public static class Chapters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Lessons")
        private java.util.List<Lessons> lessons;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private java.util.List<Unit> unit;

        private Chapters(Builder builder) {
            this.lessons = builder.lessons;
            this.number = builder.number;
            this.title = builder.title;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chapters create() {
            return builder().build();
        }

        /**
         * @return lessons
         */
        public java.util.List<Lessons> getLessons() {
            return this.lessons;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return unit
         */
        public java.util.List<Unit> getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private java.util.List<Lessons> lessons; 
            private Integer number; 
            private String title; 
            private java.util.List<Unit> unit; 

            private Builder() {
            } 

            private Builder(Chapters model) {
                this.lessons = model.lessons;
                this.number = model.number;
                this.title = model.title;
                this.unit = model.unit;
            } 

            /**
             * Lessons.
             */
            public Builder lessons(java.util.List<Lessons> lessons) {
                this.lessons = lessons;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(Integer number) {
                this.number = number;
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
             * Unit.
             */
            public Builder unit(java.util.List<Unit> unit) {
                this.unit = unit;
                return this;
            }

            public Chapters build() {
                return new Chapters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCourseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCourseResponseBody</p>
     */
    public static class CourseLessons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CourseLessons(Builder builder) {
            this.duration = builder.duration;
            this.id = builder.id;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CourseLessons create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer duration; 
            private Long id; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(CourseLessons model) {
                this.duration = model.duration;
                this.id = model.id;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CourseLessons build() {
                return new CourseLessons(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCourseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCourseResponseBody</p>
     */
    public static class Course extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Chapters")
        private java.util.List<Chapters> chapters;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("LessonNum")
        private Integer lessonNum;

        @com.aliyun.core.annotation.NameInMap("Lessons")
        private java.util.List<CourseLessons> lessons;

        @com.aliyun.core.annotation.NameInMap("PictureUrl")
        private String pictureUrl;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Course(Builder builder) {
            this.category = builder.category;
            this.chapters = builder.chapters;
            this.id = builder.id;
            this.introduction = builder.introduction;
            this.lessonNum = builder.lessonNum;
            this.lessons = builder.lessons;
            this.pictureUrl = builder.pictureUrl;
            this.tags = builder.tags;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Course create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return chapters
         */
        public java.util.List<Chapters> getChapters() {
            return this.chapters;
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
         * @return lessons
         */
        public java.util.List<CourseLessons> getLessons() {
            return this.lessons;
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
            private java.util.List<Chapters> chapters; 
            private String id; 
            private String introduction; 
            private Integer lessonNum; 
            private java.util.List<CourseLessons> lessons; 
            private String pictureUrl; 
            private String tags; 
            private String title; 

            private Builder() {
            } 

            private Builder(Course model) {
                this.category = model.category;
                this.chapters = model.chapters;
                this.id = model.id;
                this.introduction = model.introduction;
                this.lessonNum = model.lessonNum;
                this.lessons = model.lessons;
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
             * Chapters.
             */
            public Builder chapters(java.util.List<Chapters> chapters) {
                this.chapters = chapters;
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
             * Lessons.
             */
            public Builder lessons(java.util.List<CourseLessons> lessons) {
                this.lessons = lessons;
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

            public Course build() {
                return new Course(this);
            } 

        } 

    }
}
