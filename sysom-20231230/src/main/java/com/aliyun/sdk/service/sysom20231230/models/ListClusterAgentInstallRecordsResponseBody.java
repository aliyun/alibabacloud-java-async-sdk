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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * total.
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
            private String clusterId; 
            private String createdAt; 
            private String grayscaleConfig; 
            private String pluginId; 
            private String pluginVersion; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterId = model.clusterId;
                this.createdAt = model.createdAt;
                this.grayscaleConfig = model.grayscaleConfig;
                this.pluginId = model.pluginId;
                this.pluginVersion = model.pluginVersion;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * created_at.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * grayscale_config.
             */
            public Builder grayscaleConfig(String grayscaleConfig) {
                this.grayscaleConfig = grayscaleConfig;
                return this;
            }

            /**
             * plugin_id.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * plugin_version.
             */
            public Builder pluginVersion(String pluginVersion) {
                this.pluginVersion = pluginVersion;
                return this;
            }

            /**
             * updated_at.
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
