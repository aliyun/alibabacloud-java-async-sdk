// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGroupResponseBody</p>
 */
public class UpdateGroupResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    @NameInMap("success")
    private Boolean success;

    private UpdateGroupResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateGroupResponseBody build() {
            return new UpdateGroupResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("avatarUrl")
        private String avatarUrl;

        @NameInMap("description")
        private String description;

        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        @NameInMap("nameWithNamespace")
        private String nameWithNamespace;

        @NameInMap("ownerId")
        private Long ownerId;

        @NameInMap("parentId")
        private Long parentId;

        @NameInMap("path")
        private String path;

        @NameInMap("pathWithNamespace")
        private String pathWithNamespace;

        @NameInMap("type")
        private String type;

        @NameInMap("visibilityLevel")
        private Integer visibilityLevel;

        @NameInMap("webUrl")
        private String webUrl;

        private Result(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.nameWithNamespace = builder.nameWithNamespace;
            this.ownerId = builder.ownerId;
            this.parentId = builder.parentId;
            this.path = builder.path;
            this.pathWithNamespace = builder.pathWithNamespace;
            this.type = builder.type;
            this.visibilityLevel = builder.visibilityLevel;
            this.webUrl = builder.webUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameWithNamespace
         */
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return pathWithNamespace
         */
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return visibilityLevel
         */
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        /**
         * @return webUrl
         */
        public String getWebUrl() {
            return this.webUrl;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String description; 
            private Long id; 
            private String name; 
            private String nameWithNamespace; 
            private Long ownerId; 
            private Long parentId; 
            private String path; 
            private String pathWithNamespace; 
            private String type; 
            private Integer visibilityLevel; 
            private String webUrl; 

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * nameWithNamespace.
             */
            public Builder nameWithNamespace(String nameWithNamespace) {
                this.nameWithNamespace = nameWithNamespace;
                return this;
            }

            /**
             * ownerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * parentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * pathWithNamespace.
             */
            public Builder pathWithNamespace(String pathWithNamespace) {
                this.pathWithNamespace = pathWithNamespace;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * visibilityLevel.
             */
            public Builder visibilityLevel(Integer visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            /**
             * webUrl.
             */
            public Builder webUrl(String webUrl) {
                this.webUrl = webUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
