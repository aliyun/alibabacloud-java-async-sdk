// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>The returned data.</p>
         */
        public Builder entity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID. You can troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1324afdsfde</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaTableThemeLevelResponseBody build() {
            return new GetMetaTableThemeLevelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaTableThemeLevelResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableThemeLevelResponseBody</p>
     */
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
             * <p>The description of the level.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder levelId(Long levelId) {
                this.levelId = levelId;
                return this;
            }

            /**
             * <p>The name of the level.</p>
             * 
             * <strong>example:</strong>
             * <p>level1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the level. Valid values:</p>
             * <ul>
             * <li>1: indicates the logical level.</li>
             * <li>2: indicates the physical level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetMetaTableThemeLevelResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableThemeLevelResponseBody</p>
     */
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
             * <p>The level of the theme. Valid values:</p>
             * <ul>
             * <li>1</li>
             * <li>2</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The name of the theme.</p>
             * 
             * <strong>example:</strong>
             * <p>theme1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the parent theme.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The ID of the theme.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
    /**
     * 
     * {@link GetMetaTableThemeLevelResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableThemeLevelResponseBody</p>
     */
    public static class Entity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private java.util.List<Level> level;

        @com.aliyun.core.annotation.NameInMap("Theme")
        private java.util.List<Theme> theme;

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
        public java.util.List<Level> getLevel() {
            return this.level;
        }

        /**
         * @return theme
         */
        public java.util.List<Theme> getTheme() {
            return this.theme;
        }

        public static final class Builder {
            private java.util.List<Level> level; 
            private java.util.List<Theme> theme; 

            /**
             * <p>The information about the levels of the metatable.</p>
             */
            public Builder level(java.util.List<Level> level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The information about the themes of the metatable.</p>
             */
            public Builder theme(java.util.List<Theme> theme) {
                this.theme = theme;
                return this;
            }

            public Entity build() {
                return new Entity(this);
            } 

        } 

    }
}
