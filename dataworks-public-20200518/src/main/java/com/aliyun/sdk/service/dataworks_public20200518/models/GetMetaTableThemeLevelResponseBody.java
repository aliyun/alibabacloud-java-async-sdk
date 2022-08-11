// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableThemeLevelResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableThemeLevelResponseBody</p>
 */
public class GetMetaTableThemeLevelResponseBody extends TeaModel {
    @NameInMap("Entity")
    private Entity entity;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Entity.
         */
        public Builder entity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetMetaTableThemeLevelResponseBody build() {
            return new GetMetaTableThemeLevelResponseBody(this);
        } 

    } 

    public static class Level extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("LevelId")
        private Long levelId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * LevelId.
             */
            public Builder levelId(Long levelId) {
                this.levelId = levelId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("Level")
        private Integer level;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentId")
        private Long parentId;

        @NameInMap("ThemeId")
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
             * Level.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * ThemeId.
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
        @NameInMap("Level")
        private java.util.List < Level> level;

        @NameInMap("Theme")
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
             * Level.
             */
            public Builder level(java.util.List < Level> level) {
                this.level = level;
                return this;
            }

            /**
             * Theme.
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
