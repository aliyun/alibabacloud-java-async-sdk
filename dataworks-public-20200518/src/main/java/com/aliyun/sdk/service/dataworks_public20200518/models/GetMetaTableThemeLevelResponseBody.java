// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableThemeLevelResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableThemeLevelResponseBody</p>
 */
public class GetMetaTableThemeLevelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entity")
    private Entity entity;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMetaTableThemeLevelResponseBody(Builder builder) {
        this.entity = builder.entity;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableThemeLevelResponseBody create() {
        return builder().build();
    }

    /**
     * @return entity
     */
    public Entity getEntity() {
        return this.entity;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Entity entity; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The returned data.
         */
        public Builder entity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can troubleshoot errors based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaTableThemeLevelResponseBody build() {
            return new GetMetaTableThemeLevelResponseBody(this);
        } 

    } 

    public static class Level extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LevelId")
        private Long levelId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Level(Builder builder) {
            this.description = builder.description;
            this.levelId = builder.levelId;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Level create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return levelId
         */
        public Long getLevelId() {
            return this.levelId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private Long levelId; 
            private String name; 
            private Integer type; 

            /**
             * The description of the table level.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the table level.
             */
            public Builder levelId(Long levelId) {
                this.levelId = levelId;
                return this;
            }

            /**
             * The name of the table level.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the table level. Valid values:
             * <p>
             * 
             * *   1: indicates the logical level.
             * *   2: indicates the physical level.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Level build() {
                return new Level(this);
            } 

        } 

    }
    public static class Theme extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("ThemeId")
        private Long themeId;

        private Theme(Builder builder) {
            this.level = builder.level;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this.themeId = builder.themeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Theme create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return themeId
         */
        public Long getThemeId() {
            return this.themeId;
        }

        public static final class Builder {
            private Integer level; 
            private String name; 
            private Long parentId; 
            private Long themeId; 

            /**
             * The level of the table folder. Valid values:
             * <p>
             * 
             * *   1: indicates a table folder of level 1.
             * *   2: indicates a table folder of level 2.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * The name of the table folder.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the parent table folder.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The ID of the table folder.
             */
            public Builder themeId(Long themeId) {
                this.themeId = themeId;
                return this;
            }

            public Theme build() {
                return new Theme(this);
            } 

        } 

    }
    public static class Entity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private java.util.List < Level> level;

        @com.aliyun.core.annotation.NameInMap("Theme")
        private java.util.List < Theme> theme;

        private Entity(Builder builder) {
            this.level = builder.level;
            this.theme = builder.theme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entity create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public java.util.List < Level> getLevel() {
            return this.level;
        }

        /**
         * @return theme
         */
        public java.util.List < Theme> getTheme() {
            return this.theme;
        }

        public static final class Builder {
            private java.util.List < Level> level; 
            private java.util.List < Theme> theme; 

            /**
             * The information about the table level.
             */
            public Builder level(java.util.List < Level> level) {
                this.level = level;
                return this;
            }

            /**
             * The information about the table folder.
             */
            public Builder theme(java.util.List < Theme> theme) {
                this.theme = theme;
                return this;
            }

            public Entity build() {
                return new Entity(this);
            } 

        } 

    }
}
