// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspacesResponseBody</p>
 */
public class ListWorkspacesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("maxResults")
    private Integer maxResults;

    @NameInMap("nextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("totalCount")
    private Integer totalCount;

    @NameInMap("workspaces")
    private java.util.List < Workspaces> workspaces;

    private ListWorkspacesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.workspaces = builder.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesResponseBody create() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workspaces
     */
    public java.util.List < Workspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private java.util.List < Workspaces> workspaces; 

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
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * MaxResults本次请求所返回的最大记录条数
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 表示当前调用返回读取到的位置，空代表数据已经读取完毕
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 请求是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * 工作空间列表
         */
        public Builder workspaces(java.util.List < Workspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public ListWorkspacesResponseBody build() {
            return new ListWorkspacesResponseBody(this);
        } 

    } 

    public static class Workspaces extends TeaModel {
        @NameInMap("codeUrl")
        private String codeUrl;

        @NameInMap("codeVersion")
        private String codeVersion;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("spec")
        private String spec;

        @NameInMap("status")
        private String status;

        @NameInMap("template")
        private String template;

        @NameInMap("userId")
        private String userId;

        private Workspaces(Builder builder) {
            this.codeUrl = builder.codeUrl;
            this.codeVersion = builder.codeVersion;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.name = builder.name;
            this.spec = builder.spec;
            this.status = builder.status;
            this.template = builder.template;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workspaces create() {
            return builder().build();
        }

        /**
         * @return codeUrl
         */
        public String getCodeUrl() {
            return this.codeUrl;
        }

        /**
         * @return codeVersion
         */
        public String getCodeVersion() {
            return this.codeVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String codeUrl; 
            private String codeVersion; 
            private String createTime; 
            private String id; 
            private String name; 
            private String spec; 
            private String status; 
            private String template; 
            private String userId; 

            /**
             * 代码来源URL
             */
            public Builder codeUrl(String codeUrl) {
                this.codeUrl = codeUrl;
                return this;
            }

            /**
             * 代码版本，支持 commitSHA、分支、标签
             */
            public Builder codeVersion(String codeVersion) {
                this.codeVersion = codeVersion;
                return this;
            }

            /**
             * 创建时间戳
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 工作空间唯一标识，字符串形式，可在云效DevStudio访问空间链接中获取
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 工作空间名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 机器规格
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * 空间状态，枚举：CREATING-创建中, SUCCESS-运行中, FROZEN-冻结中, RECOVERING-恢复中
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 工作空间模板
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * 用户阿里云PK
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Workspaces build() {
                return new Workspaces(this);
            } 

        } 

    }
}
