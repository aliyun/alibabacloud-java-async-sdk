// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetContextDatabaseSyncDiscoveryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextDatabaseSyncDiscoveryTaskResponseBody</p>
 */
public class GetContextDatabaseSyncDiscoveryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetContextDatabaseSyncDiscoveryTaskResponseBody(Builder builder) {
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

    public static GetContextDatabaseSyncDiscoveryTaskResponseBody create() {
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
    public Long getHttpStatusCode() {
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
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetContextDatabaseSyncDiscoveryTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Example value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Example value</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBody build() {
            return new GetContextDatabaseSyncDiscoveryTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextDatabaseSyncDiscoveryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseSyncDiscoveryTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CancelRequestedAt")
        private String cancelRequestedAt;

        @com.aliyun.core.annotation.NameInMap("ConnectionId")
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("Containers")
        private Long containers;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("PluginRef")
        private String pluginRef;

        @com.aliyun.core.annotation.NameInMap("Scanned")
        private Long scanned;

        @com.aliyun.core.annotation.NameInMap("SourceConfig")
        private String sourceConfig;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        private Data(Builder builder) {
            this.cancelRequestedAt = builder.cancelRequestedAt;
            this.connectionId = builder.connectionId;
            this.containers = builder.containers;
            this.createdAt = builder.createdAt;
            this.error = builder.error;
            this.pluginRef = builder.pluginRef;
            this.scanned = builder.scanned;
            this.sourceConfig = builder.sourceConfig;
            this.sourceId = builder.sourceId;
            this.state = builder.state;
            this.taskId = builder.taskId;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cancelRequestedAt
         */
        public String getCancelRequestedAt() {
            return this.cancelRequestedAt;
        }

        /**
         * @return connectionId
         */
        public String getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return containers
         */
        public Long getContainers() {
            return this.containers;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return pluginRef
         */
        public String getPluginRef() {
            return this.pluginRef;
        }

        /**
         * @return scanned
         */
        public Long getScanned() {
            return this.scanned;
        }

        /**
         * @return sourceConfig
         */
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String cancelRequestedAt; 
            private String connectionId; 
            private Long containers; 
            private String createdAt; 
            private String error; 
            private String pluginRef; 
            private Long scanned; 
            private String sourceConfig; 
            private String sourceId; 
            private String state; 
            private String taskId; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cancelRequestedAt = model.cancelRequestedAt;
                this.connectionId = model.connectionId;
                this.containers = model.containers;
                this.createdAt = model.createdAt;
                this.error = model.error;
                this.pluginRef = model.pluginRef;
                this.scanned = model.scanned;
                this.sourceConfig = model.sourceConfig;
                this.sourceId = model.sourceId;
                this.state = model.state;
                this.taskId = model.taskId;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The time when the cancellation was requested.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder cancelRequestedAt(String cancelRequestedAt) {
                this.cancelRequestedAt = cancelRequestedAt;
                return this;
            }

            /**
             * <p>The connection ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>The number of containers.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000000000000</p>
             */
            public Builder containers(Long containers) {
                this.containers = containers;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>File size exceeds the limit</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The plug-in reference.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:dingtalk@1.0.0">dingtalk@1.0.0</a></p>
             */
            public Builder pluginRef(String pluginRef) {
                this.pluginRef = pluginRef;
                return this;
            }

            /**
             * <p>The number of scanned items.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000000000000</p>
             */
            public Builder scanned(Long scanned) {
                this.scanned = scanned;
                return this;
            }

            /**
             * <p>The datasource config. The structure varies depending on the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;folderIds&quot;:[&quot;<a href="https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****%22%5D,%22pageSize%22:50,%22maxDepth%22:5%7D">https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****&quot;],&quot;pageSize&quot;:50,&quot;maxDepth&quot;:5}</a></p>
             */
            public Builder sourceConfig(String sourceConfig) {
                this.sourceConfig = sourceConfig;
                return this;
            }

            /**
             * <p>The data source ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The discovery task status. Valid values: queued, running, succeeded, cancelled, and failed.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The discovery task ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The time when the task was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
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
