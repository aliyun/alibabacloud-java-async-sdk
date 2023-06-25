// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceResponseBody</p>
 */
public class GetWorkspaceResponseBody extends TeaModel {
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

    private GetWorkspaceResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceResponseBody create() {
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(Workspace workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetWorkspaceResponseBody build() {
            return new GetWorkspaceResponseBody(this);
        } 

    } 

    public static class Workspace extends TeaModel {
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

        private Workspace(Builder builder) {
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

        public static Workspace create() {
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
             * codeUrl.
             */
            public Builder codeUrl(String codeUrl) {
                this.codeUrl = codeUrl;
                return this;
            }

            /**
             * codeVersion.
             */
            public Builder codeVersion(String codeVersion) {
                this.codeVersion = codeVersion;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
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
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Workspace build() {
                return new Workspace(this);
            } 

        } 

    }
}
