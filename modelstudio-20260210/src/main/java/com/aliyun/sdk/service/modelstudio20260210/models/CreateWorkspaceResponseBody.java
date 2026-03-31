// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link CreateWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkspaceResponseBody</p>
 */
public class CreateWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private Workspace workspace;

    private CreateWorkspaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Workspace workspace; 

        private Builder() {
        } 

        private Builder(CreateWorkspaceResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.workspace = model.workspace;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BB521414-5D38-5E66-AA66-963B2B4200E2</p>
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

        public CreateWorkspaceResponseBody build() {
            return new CreateWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceResponseBody</p>
     */
    public static class Workspace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiHost")
        private String apiHost;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("serviceSite")
        private String serviceSite;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("workspaceName")
        private String workspaceName;

        private Workspace(Builder builder) {
            this.apiHost = builder.apiHost;
            this.gmtCreate = builder.gmtCreate;
            this.region = builder.region;
            this.serviceSite = builder.serviceSite;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workspace create() {
            return builder().build();
        }

        /**
         * @return apiHost
         */
        public String getApiHost() {
            return this.apiHost;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serviceSite
         */
        public String getServiceSite() {
            return this.serviceSite;
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

        public static final class Builder {
            private String apiHost; 
            private Long gmtCreate; 
            private String region; 
            private String serviceSite; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Workspace model) {
                this.apiHost = model.apiHost;
                this.gmtCreate = model.gmtCreate;
                this.region = model.region;
                this.serviceSite = model.serviceSite;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>API Host。</p>
             * 
             * <strong>example:</strong>
             * <p>llm-34o9ts1dai60z5sf.cn-beijing.maas.aliyuncs.com</p>
             */
            public Builder apiHost(String apiHost) {
                this.apiHost = apiHost;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * serviceSite.
             */
            public Builder serviceSite(String serviceSite) {
                this.serviceSite = serviceSite;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * workspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Workspace build() {
                return new Workspace(this);
            } 

        } 

    }
}
