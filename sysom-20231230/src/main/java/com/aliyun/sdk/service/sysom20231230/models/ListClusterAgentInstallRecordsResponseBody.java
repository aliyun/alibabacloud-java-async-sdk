// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListClusterAgentInstallRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterAgentInstallRecordsResponseBody</p>
 */
public class ListClusterAgentInstallRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListClusterAgentInstallRecordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterAgentInstallRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListClusterAgentInstallRecordsResponseBody model) {
            this.requestId = model.requestId;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.total = model.total;
        } 

        /**
         * <p>The request ID, which can be used for end-to-end diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <p>B149FD9C-ED5C-5765-B3AD-05AA4A4D64D7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code.</p>
         * <ul>
         * <li><code>code == Success</code> indicates that the authorization is successful.</li>
         * <li>Other status codes indicate that the authorization failed. Check the <code>message</code> field for the detailed fault information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>If <code>code == Success</code>, this field is empty.</li>
         * <li>Otherwise, this field contains the request error information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListClusterAgentInstallRecordsResponseBody build() {
            return new ListClusterAgentInstallRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterAgentInstallRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterAgentInstallRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agent_config_id")
        private String agentConfigId;

        @com.aliyun.core.annotation.NameInMap("agent_config_name")
        private String agentConfigName;

        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("created_at")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("grayscale_config")
        private String grayscaleConfig;

        @com.aliyun.core.annotation.NameInMap("plugin_id")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("plugin_version")
        private String pluginVersion;

        @com.aliyun.core.annotation.NameInMap("updated_at")
        private String updatedAt;

        private Data(Builder builder) {
            this.agentConfigId = builder.agentConfigId;
            this.agentConfigName = builder.agentConfigName;
            this.clusterId = builder.clusterId;
            this.createdAt = builder.createdAt;
            this.grayscaleConfig = builder.grayscaleConfig;
            this.pluginId = builder.pluginId;
            this.pluginVersion = builder.pluginVersion;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentConfigId
         */
        public String getAgentConfigId() {
            return this.agentConfigId;
        }

        /**
         * @return agentConfigName
         */
        public String getAgentConfigName() {
            return this.agentConfigName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return grayscaleConfig
         */
        public String getGrayscaleConfig() {
            return this.grayscaleConfig;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return pluginVersion
         */
        public String getPluginVersion() {
            return this.pluginVersion;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String agentConfigId; 
            private String agentConfigName; 
            private String clusterId; 
            private String createdAt; 
            private String grayscaleConfig; 
            private String pluginId; 
            private String pluginVersion; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentConfigId = model.agentConfigId;
                this.agentConfigName = model.agentConfigName;
                this.clusterId = model.clusterId;
                this.createdAt = model.createdAt;
                this.grayscaleConfig = model.grayscaleConfig;
                this.pluginId = model.pluginId;
                this.pluginVersion = model.pluginVersion;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * agent_config_id.
             */
            public Builder agentConfigId(String agentConfigId) {
                this.agentConfigId = agentConfigId;
                return this;
            }

            /**
             * agent_config_name.
             */
            public Builder agentConfigName(String agentConfigName) {
                this.agentConfigName = agentConfigName;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * <blockquote>
             * <p>This cluster ID is not the ACK cluster ID.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cbf7a37bc905d4682a3338b3744810269</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-25T15:08:19</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The canary release environment.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder grayscaleConfig(String grayscaleConfig) {
                this.grayscaleConfig = grayscaleConfig;
                return this;
            }

            /**
             * <p>The component ID.</p>
             * 
             * <strong>example:</strong>
             * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * <p>The plug-in version.</p>
             * 
             * <strong>example:</strong>
             * <p>3.4.0-1</p>
             */
            public Builder pluginVersion(String pluginVersion) {
                this.pluginVersion = pluginVersion;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-25T15:08:19</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
