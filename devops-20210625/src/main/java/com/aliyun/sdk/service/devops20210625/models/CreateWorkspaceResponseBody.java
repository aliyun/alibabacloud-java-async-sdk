// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkspaceResponseBody</p>
 */
public class CreateWorkspaceResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("workspace")
    private Workspace workspace;

    private CreateWorkspaceResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return workspace
     */
    public Workspace getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Workspace workspace; 

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
         * 工作空间信息
         */
        public Builder workspace(Workspace workspace) {
            this.workspace = workspace;
            return this;
        }

        public CreateWorkspaceResponseBody build() {
            return new CreateWorkspaceResponseBody(this);
        } 

    } 

    public static class Workspace extends TeaModel {
        @NameInMap("createTime")
        private String createTime;

        @NameInMap("creator")
        private String creator;

        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("status")
        private String status;

        @NameInMap("template")
        private String template;

        private Workspace(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.id = builder.id;
            this.name = builder.name;
            this.status = builder.status;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workspace create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
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

        public static final class Builder {
            private String createTime; 
            private String creator; 
            private String id; 
            private String name; 
            private String status; 
            private String template; 

            /**
             * 创建时间戳
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 创建者，阿里云PK
             */
            public Builder creator(String creator) {
                this.creator = creator;
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

            public Workspace build() {
                return new Workspace(this);
            } 

        } 

    }
}
