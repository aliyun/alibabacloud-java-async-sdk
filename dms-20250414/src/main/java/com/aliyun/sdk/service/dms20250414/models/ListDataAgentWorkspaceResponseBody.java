// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataAgentWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataAgentWorkspaceResponseBody</p>
 */
public class ListDataAgentWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private ListDataAgentWorkspaceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(ListDataAgentWorkspaceResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DMS-DA-40114</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>nu use</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>no use</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E0D2-*****-A63B6</p>
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListDataAgentWorkspaceResponseBody build() {
            return new ListDataAgentWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAgentWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentWorkspaceResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsSessionShareEnabled")
        private Boolean isSessionShareEnabled;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RunningSessionCount")
        private Integer runningSessionCount;

        @com.aliyun.core.annotation.NameInMap("TotalMember")
        private Long totalMember;

        @com.aliyun.core.annotation.NameInMap("TotalSessionCount")
        private Integer totalSessionCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        @com.aliyun.core.annotation.NameInMap("WorkspaceStatus")
        private String workspaceStatus;

        private Content(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.isSessionShareEnabled = builder.isSessionShareEnabled;
            this.modifyTime = builder.modifyTime;
            this.roleName = builder.roleName;
            this.runningSessionCount = builder.runningSessionCount;
            this.totalMember = builder.totalMember;
            this.totalSessionCount = builder.totalSessionCount;
            this.type = builder.type;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
            this.workspaceStatus = builder.workspaceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isSessionShareEnabled
         */
        public Boolean getIsSessionShareEnabled() {
            return this.isSessionShareEnabled;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return runningSessionCount
         */
        public Integer getRunningSessionCount() {
            return this.runningSessionCount;
        }

        /**
         * @return totalMember
         */
        public Long getTotalMember() {
            return this.totalMember;
        }

        /**
         * @return totalSessionCount
         */
        public Integer getTotalSessionCount() {
            return this.totalSessionCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        /**
         * @return workspaceStatus
         */
        public String getWorkspaceStatus() {
            return this.workspaceStatus;
        }

        public static final class Builder {
            private Long createTime; 
            private String creator; 
            private String creatorName; 
            private String description; 
            private Boolean isSessionShareEnabled; 
            private Long modifyTime; 
            private String roleName; 
            private Integer runningSessionCount; 
            private Long totalMember; 
            private Integer totalSessionCount; 
            private String type; 
            private String workspaceId; 
            private String workspaceName; 
            private String workspaceStatus; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.isSessionShareEnabled = model.isSessionShareEnabled;
                this.modifyTime = model.modifyTime;
                this.roleName = model.roleName;
                this.runningSessionCount = model.runningSessionCount;
                this.totalMember = model.totalMember;
                this.totalSessionCount = model.totalSessionCount;
                this.type = model.type;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
                this.workspaceStatus = model.workspaceStatus;
            } 

            /**
             * <p>The creation time of the workspace, in milliseconds (UNIX timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1765960516000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The UID of the workspace creator.</p>
             * 
             * <strong>example:</strong>
             * <p>20282*****7591</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The description of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>space for test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether session sharing is enabled for the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSessionShareEnabled(Boolean isSessionShareEnabled) {
                this.isSessionShareEnabled = isSessionShareEnabled;
                return this;
            }

            /**
             * <p>The most recent modification time of the workspace, in milliseconds (UNIX timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1765961516000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The role name of the user in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * RunningSessionCount.
             */
            public Builder runningSessionCount(Integer runningSessionCount) {
                this.runningSessionCount = runningSessionCount;
                return this;
            }

            /**
             * <p>The number of members in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder totalMember(Long totalMember) {
                this.totalMember = totalMember;
                return this;
            }

            /**
             * TotalSessionCount.
             */
            public Builder totalSessionCount(Integer totalSessionCount) {
                this.totalSessionCount = totalSessionCount;
                return this;
            }

            /**
             * <p>The workspace type.</p>
             * 
             * <strong>example:</strong>
             * <p>personal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20923*****7291</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>workspaceTest</p>
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            /**
             * <p>The status of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder workspaceStatus(String workspaceStatus) {
                this.workspaceStatus = workspaceStatus;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataAgentWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentWorkspaceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalElements")
        private Long totalElements;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Long totalPages;

        private Data(Builder builder) {
            this.content = builder.content;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalElements = builder.totalElements;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalElements
         */
        public Long getTotalElements() {
            return this.totalElements;
        }

        /**
         * @return totalPages
         */
        public Long getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalElements; 
            private Long totalPages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalElements = model.totalElements;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>The configuration content.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of workspaces per page.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of workspaces.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder totalElements(Long totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalPages(Long totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
