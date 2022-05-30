// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepositoriesResponseBody</p>
 */
public class ListRepositoriesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private Integer errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("total")
    private Long total;

    private ListRepositoriesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepositoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 
        private Long total; 

        /**
         * 错误码
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * 调用是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 总数量
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListRepositoriesResponseBody build() {
            return new ListRepositoriesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("accessLevel")
        private Integer accessLevel;

        @NameInMap("archive")
        private Boolean archive;

        @NameInMap("avatarUrl")
        private String avatarUrl;

        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("description")
        private String description;

        @NameInMap("importStatus")
        private String importStatus;

        @NameInMap("lastActivityAt")
        private String lastActivityAt;

        @NameInMap("name")
        private String name;

        @NameInMap("nameWithNamespace")
        private String nameWithNamespace;

        @NameInMap("namespaceId")
        private Long namespaceId;

        @NameInMap("path")
        private String path;

        @NameInMap("pathWithNamespace")
        private String pathWithNamespace;

        @NameInMap("star")
        private Boolean star;

        @NameInMap("starCount")
        private Long starCount;

        @NameInMap("updatedAt")
        private String updatedAt;

        @NameInMap("visibilityLevel")
        private String visibilityLevel;

        @NameInMap("webUrl")
        private String webUrl;

        private Result(Builder builder) {
            this.id = builder.id;
            this.accessLevel = builder.accessLevel;
            this.archive = builder.archive;
            this.avatarUrl = builder.avatarUrl;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.importStatus = builder.importStatus;
            this.lastActivityAt = builder.lastActivityAt;
            this.name = builder.name;
            this.nameWithNamespace = builder.nameWithNamespace;
            this.namespaceId = builder.namespaceId;
            this.path = builder.path;
            this.pathWithNamespace = builder.pathWithNamespace;
            this.star = builder.star;
            this.starCount = builder.starCount;
            this.updatedAt = builder.updatedAt;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return accessLevel
         */
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        /**
         * @return archive
         */
        public Boolean getArchive() {
            return this.archive;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return importStatus
         */
        public String getImportStatus() {
            return this.importStatus;
        }

        /**
         * @return lastActivityAt
         */
        public String getLastActivityAt() {
            return this.lastActivityAt;
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
         * @return namespaceId
         */
        public Long getNamespaceId() {
            return this.namespaceId;
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
         * @return star
         */
        public Boolean getStar() {
            return this.star;
        }

        /**
         * @return starCount
         */
        public Long getStarCount() {
            return this.starCount;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return visibilityLevel
         */
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        /**
         * @return webUrl
         */
        public String getWebUrl() {
            return this.webUrl;
        }

        public static final class Builder {
            private Long id; 
            private Integer accessLevel; 
            private Boolean archive; 
            private String avatarUrl; 
            private String createdAt; 
            private String description; 
            private String importStatus; 
            private String lastActivityAt; 
            private String name; 
            private String nameWithNamespace; 
            private Long namespaceId; 
            private String path; 
            private String pathWithNamespace; 
            private Boolean star; 
            private Long starCount; 
            private String updatedAt; 
            private String visibilityLevel; 
            private String webUrl; 

            /**
             * 代码库Id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 当前用户在该代码库上的权限类型
             */
            public Builder accessLevel(Integer accessLevel) {
                this.accessLevel = accessLevel;
                return this;
            }

            /**
             * 代码库是否归档
             */
            public Builder archive(Boolean archive) {
                this.archive = archive;
                return this;
            }

            /**
             * 头像地址
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * 代码库描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 代码库导入状态
             */
            public Builder importStatus(String importStatus) {
                this.importStatus = importStatus;
                return this;
            }

            /**
             * 最后活跃时间
             */
            public Builder lastActivityAt(String lastActivityAt) {
                this.lastActivityAt = lastActivityAt;
                return this;
            }

            /**
             * 代码库名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 代码库完整名称（含完整组名称）
             */
            public Builder nameWithNamespace(String nameWithNamespace) {
                this.nameWithNamespace = nameWithNamespace;
                return this;
            }

            /**
             * 上级路径的id
             */
            public Builder namespaceId(Long namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * 代码库路径
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * 代码库完整路径（含完整组路径）
             */
            public Builder pathWithNamespace(String pathWithNamespace) {
                this.pathWithNamespace = pathWithNamespace;
                return this;
            }

            /**
             * 是否被收藏
             */
            public Builder star(Boolean star) {
                this.star = star;
                return this;
            }

            /**
             * 被收藏的数量
             */
            public Builder starCount(Long starCount) {
                this.starCount = starCount;
                return this;
            }

            /**
             * 更新时间
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * 可见性;0标识私有的/10标识企业内公开
             */
            public Builder visibilityLevel(String visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            /**
             * 页面访问时的URL
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
