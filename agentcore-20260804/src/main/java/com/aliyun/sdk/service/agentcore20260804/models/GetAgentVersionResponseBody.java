// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetAgentVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentVersionResponseBody</p>
 */
public class GetAgentVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetAgentVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentVersionResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAgentVersionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>业务状态码，请求成功时为 SUCCESS，失败时为错误码。</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>智能体固定版本详情，configuration 为版本保存时的 Agent 配置。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP 状态码。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>响应消息，请求成功时为 success，失败时为错误信息。</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求 ID，用于定位和排查请求。</p>
         * 
         * <strong>example:</strong>
         * <p>5E8F3C2A-1B4D-4F6E-9A7C-0D2B8E6F4A1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>请求是否成功。</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAgentVersionResponseBody build() {
            return new GetAgentVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentVersionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("agentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("artifactStatus")
        private String artifactStatus;

        @com.aliyun.core.annotation.NameInMap("configuration")
        private java.util.Map<String, ?> configuration;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("targetSpecVersion")
        private Long targetSpecVersion;

        @com.aliyun.core.annotation.NameInMap("versionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agentVersion = builder.agentVersion;
            this.artifactStatus = builder.artifactStatus;
            this.configuration = builder.configuration;
            this.createdAt = builder.createdAt;
            this.createdBy = builder.createdBy;
            this.description = builder.description;
            this.targetSpecVersion = builder.targetSpecVersion;
            this.versionName = builder.versionName;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return artifactStatus
         */
        public String getArtifactStatus() {
            return this.artifactStatus;
        }

        /**
         * @return configuration
         */
        public java.util.Map<String, ?> getConfiguration() {
            return this.configuration;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return targetSpecVersion
         */
        public Long getTargetSpecVersion() {
            return this.targetSpecVersion;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String agentId; 
            private String agentVersion; 
            private String artifactStatus; 
            private java.util.Map<String, ?> configuration; 
            private String createdAt; 
            private String createdBy; 
            private String description; 
            private Long targetSpecVersion; 
            private String versionName; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.agentVersion = model.agentVersion;
                this.artifactStatus = model.artifactStatus;
                this.configuration = model.configuration;
                this.createdAt = model.createdAt;
                this.createdBy = model.createdBy;
                this.description = model.description;
                this.targetSpecVersion = model.targetSpecVersion;
                this.versionName = model.versionName;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>版本所属的托管智能体或自定义智能体 ID。</p>
             * 
             * <strong>example:</strong>
             * <p>agent-0123456789abcdef0123456789abcdef</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>系统按 Agent 递增生成的版本号，例如 v1、v2。查询、删除版本及服务端点引用版本时使用。</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>仅表示版本模板与制品归档是否完整，不代表部署或运行状态。READY 为完整，INVALID 为归档缺失或不一致。</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder artifactStatus(String artifactStatus) {
                this.artifactStatus = artifactStatus;
                return this;
            }

            /**
             * <p>托管智能体与 GetManagedAgent 的 data 结构一致，自定义智能体与 GetCustomAgent 的 data 结构一致，脱敏规则相同。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;agentId&quot;:&quot;agent-0123456789abcdef0123456789abcdef&quot;,&quot;workspaceId&quot;:&quot;ws-0123456789abcdef01234&quot;,&quot;name&quot;:&quot;customer-service&quot;,&quot;description&quot;:&quot;客服智能体&quot;,&quot;status&quot;:&quot;Running&quot;,&quot;latestSpecVersion&quot;:2,&quot;instruction&quot;:&quot;你是一名客服助手。&quot;}</p>
             */
            public Builder configuration(java.util.Map<String, ?> configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>版本保存的时间，采用 ISO 8601 UTC 格式。</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T01:02:03Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>保存该版本的调用者阿里云账号 UID；RAM 用户调用时为其所属阿里云主账号 UID。</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>保存版本时填写的版本描述，最多 1024 个字符；保存时未填写则为空。</p>
             * 
             * <strong>example:</strong>
             * <p>生产环境稳定版本</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>保存版本时 Agent 已生效的发布流水号，即当时的 effectiveSpecVersion。版本保存后该值不再变化。</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder targetSpecVersion(Long targetSpecVersion) {
                this.targetSpecVersion = targetSpecVersion;
                return this;
            }

            /**
             * <p>保存版本时用户指定的展示名称。早期保存且未记录名称的版本返回 agentVersion。</p>
             * 
             * <strong>example:</strong>
             * <p>生产稳定版 V1.0</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * <p>版本所属智能体所在的 AgentCore 工作空间 ID。</p>
             * 
             * <strong>example:</strong>
             * <p>ws-0123456789abcdef01234</p>
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
