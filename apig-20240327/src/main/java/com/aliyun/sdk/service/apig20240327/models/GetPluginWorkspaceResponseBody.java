// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetPluginWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetPluginWorkspaceResponseBody</p>
 */
public class GetPluginWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetPluginWorkspaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPluginWorkspaceResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPluginWorkspaceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4AFA893B-A75B-5002-AACF-84CABE06197A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPluginWorkspaceResponseBody build() {
            return new GetPluginWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPluginWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPluginWorkspaceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("pipelineRunId")
        private String pipelineRunId;

        @com.aliyun.core.annotation.NameInMap("repoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("repoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("wasmUrl")
        private String wasmUrl;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.organizationId = builder.organizationId;
            this.pipelineRunId = builder.pipelineRunId;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.wasmUrl = builder.wasmUrl;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return pipelineRunId
         */
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return wasmUrl
         */
        public String getWasmUrl() {
            return this.wasmUrl;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String organizationId; 
            private String pipelineRunId; 
            private String repoId; 
            private String repoName; 
            private String wasmUrl; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.organizationId = model.organizationId;
                this.pipelineRunId = model.pipelineRunId;
                this.repoId = model.repoId;
                this.repoName = model.repoName;
                this.wasmUrl = model.wasmUrl;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The Codeup organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>664f1e2xxxx</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * <p>The ID of the most recent pipeline run. This parameter is not returned if the plugin has never been built.</p>
             * 
             * <strong>example:</strong>
             * <p>987654</p>
             */
            public Builder pipelineRunId(String pipelineRunId) {
                this.pipelineRunId = pipelineRunId;
                return this;
            }

            /**
             * <p>The Codeup repository ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The repository name (the English ID of the plugin).</p>
             * 
             * <strong>example:</strong>
             * <p>my-custom-plugin</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The OSS download URL of the compiled WASM build output. This parameter is returned only when the pipeline status is SUCCESS.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://apigw-console-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/%7Buid%7D/plugin/plugin_1756262400.wasm">https://apigw-console-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/{uid}/plugin/plugin_1756262400.wasm</a></p>
             */
            public Builder wasmUrl(String wasmUrl) {
                this.wasmUrl = wasmUrl;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>plw-xxxxxxxx</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
