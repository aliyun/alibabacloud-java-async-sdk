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
 * {@link GetContextDatabaseSyncSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextDatabaseSyncSourceResponseBody</p>
 */
public class GetContextDatabaseSyncSourceResponseBody extends TeaModel {
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

    private GetContextDatabaseSyncSourceResponseBody(Builder builder) {
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

    public static GetContextDatabaseSyncSourceResponseBody create() {
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

        private Builder(GetContextDatabaseSyncSourceResponseBody model) {
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
         * <p>The message.</p>
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

        public GetContextDatabaseSyncSourceResponseBody build() {
            return new GetContextDatabaseSyncSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextDatabaseSyncSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseSyncSourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfirmedAt")
        private String confirmedAt;

        @com.aliyun.core.annotation.NameInMap("ConnectionId")
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SelectedNodeKeys")
        private java.util.List<String> selectedNodeKeys;

        @com.aliyun.core.annotation.NameInMap("SelectionPolicy")
        private String selectionPolicy;

        @com.aliyun.core.annotation.NameInMap("SourceConfig")
        private String sourceConfig;

        private Data(Builder builder) {
            this.confirmedAt = builder.confirmedAt;
            this.connectionId = builder.connectionId;
            this.id = builder.id;
            this.name = builder.name;
            this.selectedNodeKeys = builder.selectedNodeKeys;
            this.selectionPolicy = builder.selectionPolicy;
            this.sourceConfig = builder.sourceConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return confirmedAt
         */
        public String getConfirmedAt() {
            return this.confirmedAt;
        }

        /**
         * @return connectionId
         */
        public String getConnectionId() {
            return this.connectionId;
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
         * @return selectedNodeKeys
         */
        public java.util.List<String> getSelectedNodeKeys() {
            return this.selectedNodeKeys;
        }

        /**
         * @return selectionPolicy
         */
        public String getSelectionPolicy() {
            return this.selectionPolicy;
        }

        /**
         * @return sourceConfig
         */
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        public static final class Builder {
            private String confirmedAt; 
            private String connectionId; 
            private String id; 
            private String name; 
            private java.util.List<String> selectedNodeKeys; 
            private String selectionPolicy; 
            private String sourceConfig; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.confirmedAt = model.confirmedAt;
                this.connectionId = model.connectionId;
                this.id = model.id;
                this.name = model.name;
                this.selectedNodeKeys = model.selectedNodeKeys;
                this.selectionPolicy = model.selectionPolicy;
                this.sourceConfig = model.sourceConfig;
            } 

            /**
             * <p>The confirmation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder confirmedAt(String confirmedAt) {
                this.confirmedAt = confirmedAt;
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
             * <p>The data source ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D team document scope</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of selected node keys.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;doc:1234567890&quot;]</p>
             */
            public Builder selectedNodeKeys(java.util.List<String> selectedNodeKeys) {
                this.selectedNodeKeys = selectedNodeKeys;
                return this;
            }

            /**
             * <p>The selection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>subtree</p>
             */
            public Builder selectionPolicy(String selectionPolicy) {
                this.selectionPolicy = selectionPolicy;
                return this;
            }

            /**
             * <p>The datasource config, which varies by plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;folderIds&quot;:[&quot;<a href="https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****%22%5D,%22pageSize%22:50,%22maxDepth%22:5%7D">https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****&quot;],&quot;pageSize&quot;:50,&quot;maxDepth&quot;:5}</a></p>
             */
            public Builder sourceConfig(String sourceConfig) {
                this.sourceConfig = sourceConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
