// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("maxResults")
    private Long maxResults;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("projects")
    private java.util.List < Projects> projects;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListProjectsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.projects = builder.projects;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return projects
     */
    public java.util.List < Projects> getProjects() {
        return this.projects;
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
        private String errorCode; 
        private String errorMsg; 
        private Long maxResults; 
        private String nextToken; 
        private java.util.List < Projects> projects; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * 每页数量
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页Token，没有下一页则为空
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 项目信息
         */
        public Builder projects(java.util.List < Projects> projects) {
            this.projects = projects;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true或者false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 总数
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    public static class Projects extends TeaModel {
        @NameInMap("categoryIdentifier")
        private String categoryIdentifier;

        @NameInMap("creator")
        private String creator;

        @NameInMap("customCode")
        private String customCode;

        @NameInMap("deleteTime")
        private Long deleteTime;

        @NameInMap("description")
        private String description;

        @NameInMap("gmtCreate")
        private Long gmtCreate;

        @NameInMap("icon")
        private String icon;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("logicalStatus")
        private String logicalStatus;

        @NameInMap("name")
        private String name;

        @NameInMap("scope")
        private String scope;

        @NameInMap("statusStageIdentifier")
        private String statusStageIdentifier;

        @NameInMap("typeIdentifier")
        private String typeIdentifier;

        private Projects(Builder builder) {
            this.categoryIdentifier = builder.categoryIdentifier;
            this.creator = builder.creator;
            this.customCode = builder.customCode;
            this.deleteTime = builder.deleteTime;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.icon = builder.icon;
            this.identifier = builder.identifier;
            this.logicalStatus = builder.logicalStatus;
            this.name = builder.name;
            this.scope = builder.scope;
            this.statusStageIdentifier = builder.statusStageIdentifier;
            this.typeIdentifier = builder.typeIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return categoryIdentifier
         */
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return customCode
         */
        public String getCustomCode() {
            return this.customCode;
        }

        /**
         * @return deleteTime
         */
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return logicalStatus
         */
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return statusStageIdentifier
         */
        public String getStatusStageIdentifier() {
            return this.statusStageIdentifier;
        }

        /**
         * @return typeIdentifier
         */
        public String getTypeIdentifier() {
            return this.typeIdentifier;
        }

        public static final class Builder {
            private String categoryIdentifier; 
            private String creator; 
            private String customCode; 
            private Long deleteTime; 
            private String description; 
            private Long gmtCreate; 
            private String icon; 
            private String identifier; 
            private String logicalStatus; 
            private String name; 
            private String scope; 
            private String statusStageIdentifier; 
            private String typeIdentifier; 

            /**
             * 类型
             */
            public Builder categoryIdentifier(String categoryIdentifier) {
                this.categoryIdentifier = categoryIdentifier;
                return this;
            }

            /**
             * 创建人
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * 自定义编号
             */
            public Builder customCode(String customCode) {
                this.customCode = customCode;
                return this;
            }

            /**
             * 删除时间
             */
            public Builder deleteTime(Long deleteTime) {
                this.deleteTime = deleteTime;
                return this;
            }

            /**
             * 描述信息
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 项目封面
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * 项目唯一标识符
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * 逻辑状态
             */
            public Builder logicalStatus(String logicalStatus) {
                this.logicalStatus = logicalStatus;
                return this;
            }

            /**
             * 项目名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 公开还是私有
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * 状态阶段
             */
            public Builder statusStageIdentifier(String statusStageIdentifier) {
                this.statusStageIdentifier = statusStageIdentifier;
                return this;
            }

            /**
             * 类型id
             */
            public Builder typeIdentifier(String typeIdentifier) {
                this.typeIdentifier = typeIdentifier;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
}
