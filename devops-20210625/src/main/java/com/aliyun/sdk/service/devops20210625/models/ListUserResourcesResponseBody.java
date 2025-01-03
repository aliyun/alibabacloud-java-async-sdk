// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListUserResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserResourcesResponseBody</p>
 */
public class ListUserResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListUserResourcesResponseBody(Builder builder) {
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

    public static ListUserResourcesResponseBody create() {
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
    public java.util.List<Result> getResult() {
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
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 
        private Long total; 

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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
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

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListUserResourcesResponseBody build() {
            return new ListUserResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserResourcesResponseBody</p>
     */
    public static class GroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameWithNamespace")
        private String nameWithNamespace;

        @com.aliyun.core.annotation.NameInMap("ownerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("parentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("pathWithNamespace")
        private String pathWithNamespace;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("visibilityLevel")
        private Integer visibilityLevel;

        private GroupInfo(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.nameWithNamespace = builder.nameWithNamespace;
            this.ownerId = builder.ownerId;
            this.parentId = builder.parentId;
            this.path = builder.path;
            this.pathWithNamespace = builder.pathWithNamespace;
            this.updatedAt = builder.updatedAt;
            this.visibilityLevel = builder.visibilityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfo create() {
            return builder().build();
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
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return visibilityLevel
         */
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public static final class Builder {
            private String createdAt; 
            private String description; 
            private Long id; 
            private String name; 
            private String nameWithNamespace; 
            private Long ownerId; 
            private Long parentId; 
            private String path; 
            private String pathWithNamespace; 
            private String updatedAt; 
            private Integer visibilityLevel; 

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
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
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * visibilityLevel.
             */
            public Builder visibilityLevel(Integer visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            public GroupInfo build() {
                return new GroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserResourcesResponseBody</p>
     */
    public static class GroupRole extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessLevel")
        private Integer accessLevel;

        @com.aliyun.core.annotation.NameInMap("cnRoleName")
        private String cnRoleName;

        @com.aliyun.core.annotation.NameInMap("enRoleName")
        private String enRoleName;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        private GroupRole(Builder builder) {
            this.accessLevel = builder.accessLevel;
            this.cnRoleName = builder.cnRoleName;
            this.enRoleName = builder.enRoleName;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupRole create() {
            return builder().build();
        }

        /**
         * @return accessLevel
         */
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        /**
         * @return cnRoleName
         */
        public String getCnRoleName() {
            return this.cnRoleName;
        }

        /**
         * @return enRoleName
         */
        public String getEnRoleName() {
            return this.enRoleName;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private Integer accessLevel; 
            private String cnRoleName; 
            private String enRoleName; 
            private Long sourceId; 
            private String sourceType; 

            /**
             * accessLevel.
             */
            public Builder accessLevel(Integer accessLevel) {
                this.accessLevel = accessLevel;
                return this;
            }

            /**
             * cnRoleName.
             */
            public Builder cnRoleName(String cnRoleName) {
                this.cnRoleName = cnRoleName;
                return this;
            }

            /**
             * enRoleName.
             */
            public Builder enRoleName(String enRoleName) {
                this.enRoleName = enRoleName;
                return this;
            }

            /**
             * sourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public GroupRole build() {
                return new GroupRole(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserResourcesResponseBody</p>
     */
    public static class GroupInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupInfo")
        private GroupInfo groupInfo;

        @com.aliyun.core.annotation.NameInMap("groupRole")
        private GroupRole groupRole;

        private GroupInfos(Builder builder) {
            this.groupInfo = builder.groupInfo;
            this.groupRole = builder.groupRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfos create() {
            return builder().build();
        }

        /**
         * @return groupInfo
         */
        public GroupInfo getGroupInfo() {
            return this.groupInfo;
        }

        /**
         * @return groupRole
         */
        public GroupRole getGroupRole() {
            return this.groupRole;
        }

        public static final class Builder {
            private GroupInfo groupInfo; 
            private GroupRole groupRole; 

            /**
             * groupInfo.
             */
            public Builder groupInfo(GroupInfo groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            /**
             * groupRole.
             */
            public Builder groupRole(GroupRole groupRole) {
                this.groupRole = groupRole;
                return this;
            }

            public GroupInfos build() {
                return new GroupInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserResourcesResponseBody</p>
     */
    public static class RepositoryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessLevel")
        private Integer accessLevel;

        @com.aliyun.core.annotation.NameInMap("archived")
        private Boolean archived;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastActivityAt")
        private String lastActivityAt;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameWithNamespace")
        private String nameWithNamespace;

        @com.aliyun.core.annotation.NameInMap("namespaceId")
        private Long namespaceId;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("pathWithNamespace")
        private String pathWithNamespace;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("visibilityLevel")
        private Integer visibilityLevel;

        private RepositoryInfo(Builder builder) {
            this.accessLevel = builder.accessLevel;
            this.archived = builder.archived;
            this.createdAt = builder.createdAt;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.encrypted = builder.encrypted;
            this.id = builder.id;
            this.lastActivityAt = builder.lastActivityAt;
            this.name = builder.name;
            this.nameWithNamespace = builder.nameWithNamespace;
            this.namespaceId = builder.namespaceId;
            this.path = builder.path;
            this.pathWithNamespace = builder.pathWithNamespace;
            this.updatedAt = builder.updatedAt;
            this.visibilityLevel = builder.visibilityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepositoryInfo create() {
            return builder().build();
        }

        /**
         * @return accessLevel
         */
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        /**
         * @return archived
         */
        public Boolean getArchived() {
            return this.archived;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return visibilityLevel
         */
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public static final class Builder {
            private Integer accessLevel; 
            private Boolean archived; 
            private String createdAt; 
            private Long creatorId; 
            private String description; 
            private Boolean encrypted; 
            private Long id; 
            private String lastActivityAt; 
            private String name; 
            private String nameWithNamespace; 
            private Long namespaceId; 
            private String path; 
            private String pathWithNamespace; 
            private String updatedAt; 
            private Integer visibilityLevel; 

            /**
             * accessLevel.
             */
            public Builder accessLevel(Integer accessLevel) {
                this.accessLevel = accessLevel;
                return this;
            }

            /**
             * archived.
             */
            public Builder archived(Boolean archived) {
                this.archived = archived;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * creatorId.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
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
             * encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
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
             * lastActivityAt.
             */
            public Builder lastActivityAt(String lastActivityAt) {
                this.lastActivityAt = lastActivityAt;
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
             * namespaceId.
             */
            public Builder namespaceId(Long namespaceId) {
                this.namespaceId = namespaceId;
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
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * visibilityLevel.
             */
            public Builder visibilityLevel(Integer visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            public RepositoryInfo build() {
                return new RepositoryInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserResourcesResponseBody</p>
     */
    public static class RepositoryRole extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessLevel")
        private Integer accessLevel;

        @com.aliyun.core.annotation.NameInMap("cnRoleName")
        private String cnRoleName;

        @com.aliyun.core.annotation.NameInMap("enRoleName")
        private String enRoleName;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        private RepositoryRole(Builder builder) {
            this.accessLevel = builder.accessLevel;
            this.cnRoleName = builder.cnRoleName;
            this.enRoleName = builder.enRoleName;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepositoryRole create() {
            return builder().build();
        }

        /**
         * @return accessLevel
         */
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        /**
         * @return cnRoleName
         */
        public String getCnRoleName() {
            return this.cnRoleName;
        }

        /**
         * @return enRoleName
         */
        public String getEnRoleName() {
            return this.enRoleName;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private Integer accessLevel; 
            private String cnRoleName; 
            private String enRoleName; 
            private Long sourceId; 
            private String sourceType; 

            /**
             * accessLevel.
             */
            public Builder accessLevel(Integer accessLevel) {
                this.accessLevel = accessLevel;
                return this;
            }

            /**
             * cnRoleName.
             */
            public Builder cnRoleName(String cnRoleName) {
                this.cnRoleName = cnRoleName;
                return this;
            }

            /**
             * enRoleName.
             */
            public Builder enRoleName(String enRoleName) {
                this.enRoleName = enRoleName;
                return this;
            }

            /**
             * sourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public RepositoryRole build() {
                return new RepositoryRole(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserResourcesResponseBody</p>
     */
    public static class RepositoryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("repositoryInfo")
        private RepositoryInfo repositoryInfo;

        @com.aliyun.core.annotation.NameInMap("repositoryRole")
        private RepositoryRole repositoryRole;

        private RepositoryInfos(Builder builder) {
            this.repositoryInfo = builder.repositoryInfo;
            this.repositoryRole = builder.repositoryRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepositoryInfos create() {
            return builder().build();
        }

        /**
         * @return repositoryInfo
         */
        public RepositoryInfo getRepositoryInfo() {
            return this.repositoryInfo;
        }

        /**
         * @return repositoryRole
         */
        public RepositoryRole getRepositoryRole() {
            return this.repositoryRole;
        }

        public static final class Builder {
            private RepositoryInfo repositoryInfo; 
            private RepositoryRole repositoryRole; 

            /**
             * repositoryInfo.
             */
            public Builder repositoryInfo(RepositoryInfo repositoryInfo) {
                this.repositoryInfo = repositoryInfo;
                return this;
            }

            /**
             * repositoryRole.
             */
            public Builder repositoryRole(RepositoryRole repositoryRole) {
                this.repositoryRole = repositoryRole;
                return this;
            }

            public RepositoryInfos build() {
                return new RepositoryInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserResourcesResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private UserInfo(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.state = builder.state;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String email; 
            private Long id; 
            private String name; 
            private String state; 
            private String username; 

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
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
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserResourcesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupInfos")
        private java.util.List<GroupInfos> groupInfos;

        @com.aliyun.core.annotation.NameInMap("repositoryInfos")
        private java.util.List<RepositoryInfos> repositoryInfos;

        @com.aliyun.core.annotation.NameInMap("userInfo")
        private UserInfo userInfo;

        private Result(Builder builder) {
            this.groupInfos = builder.groupInfos;
            this.repositoryInfos = builder.repositoryInfos;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return groupInfos
         */
        public java.util.List<GroupInfos> getGroupInfos() {
            return this.groupInfos;
        }

        /**
         * @return repositoryInfos
         */
        public java.util.List<RepositoryInfos> getRepositoryInfos() {
            return this.repositoryInfos;
        }

        /**
         * @return userInfo
         */
        public UserInfo getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private java.util.List<GroupInfos> groupInfos; 
            private java.util.List<RepositoryInfos> repositoryInfos; 
            private UserInfo userInfo; 

            /**
             * groupInfos.
             */
            public Builder groupInfos(java.util.List<GroupInfos> groupInfos) {
                this.groupInfos = groupInfos;
                return this;
            }

            /**
             * repositoryInfos.
             */
            public Builder repositoryInfos(java.util.List<RepositoryInfos> repositoryInfos) {
                this.repositoryInfos = repositoryInfos;
                return this;
            }

            /**
             * userInfo.
             */
            public Builder userInfo(UserInfo userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
