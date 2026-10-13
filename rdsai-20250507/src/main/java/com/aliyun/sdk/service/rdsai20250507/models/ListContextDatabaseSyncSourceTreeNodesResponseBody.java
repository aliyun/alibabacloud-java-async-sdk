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
 * {@link ListContextDatabaseSyncSourceTreeNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListContextDatabaseSyncSourceTreeNodesResponseBody</p>
 */
public class ListContextDatabaseSyncSourceTreeNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListContextDatabaseSyncSourceTreeNodesResponseBody(Builder builder) {
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

    public static ListContextDatabaseSyncSourceTreeNodesResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListContextDatabaseSyncSourceTreeNodesResponseBody model) {
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
        public Builder data(java.util.List<Data> data) {
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
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListContextDatabaseSyncSourceTreeNodesResponseBody build() {
            return new ListContextDatabaseSyncSourceTreeNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContextDatabaseSyncSourceTreeNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseSyncSourceTreeNodesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscoveredAt")
        private String discoveredAt;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("HasChildren")
        private Boolean hasChildren;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("NodeKey")
        private String nodeKey;

        @com.aliyun.core.annotation.NameInMap("ParentKey")
        private String parentKey;

        @com.aliyun.core.annotation.NameInMap("StaleAt")
        private String staleAt;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UnsupportedReason")
        private String unsupportedReason;

        private Data(Builder builder) {
            this.discoveredAt = builder.discoveredAt;
            this.extension = builder.extension;
            this.hasChildren = builder.hasChildren;
            this.kind = builder.kind;
            this.nodeKey = builder.nodeKey;
            this.parentKey = builder.parentKey;
            this.staleAt = builder.staleAt;
            this.title = builder.title;
            this.unsupportedReason = builder.unsupportedReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return discoveredAt
         */
        public String getDiscoveredAt() {
            return this.discoveredAt;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return hasChildren
         */
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return nodeKey
         */
        public String getNodeKey() {
            return this.nodeKey;
        }

        /**
         * @return parentKey
         */
        public String getParentKey() {
            return this.parentKey;
        }

        /**
         * @return staleAt
         */
        public String getStaleAt() {
            return this.staleAt;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return unsupportedReason
         */
        public String getUnsupportedReason() {
            return this.unsupportedReason;
        }

        public static final class Builder {
            private String discoveredAt; 
            private String extension; 
            private Boolean hasChildren; 
            private String kind; 
            private String nodeKey; 
            private String parentKey; 
            private String staleAt; 
            private String title; 
            private String unsupportedReason; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.discoveredAt = model.discoveredAt;
                this.extension = model.extension;
                this.hasChildren = model.hasChildren;
                this.kind = model.kind;
                this.nodeKey = model.nodeKey;
                this.parentKey = model.parentKey;
                this.staleAt = model.staleAt;
                this.title = model.title;
                this.unsupportedReason = model.unsupportedReason;
            } 

            /**
             * <p>The discovery time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder discoveredAt(String discoveredAt) {
                this.discoveredAt = discoveredAt;
                return this;
            }

            /**
             * <p>The file name extension.</p>
             * 
             * <strong>example:</strong>
             * <p>.docx</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>Indicates whether the node has child nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasChildren(Boolean hasChildren) {
                this.hasChildren = hasChildren;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>folder</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The node identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>doc:1234567890</p>
             */
            public Builder nodeKey(String nodeKey) {
                this.nodeKey = nodeKey;
                return this;
            }

            /**
             * <p>The parent node identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>folder:9876543210</p>
             */
            public Builder parentKey(String parentKey) {
                this.parentKey = parentKey;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder staleAt(String staleAt) {
                this.staleAt = staleAt;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>Project plan</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The reason why the operation is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>The current plugin does not support this operation</p>
             */
            public Builder unsupportedReason(String unsupportedReason) {
                this.unsupportedReason = unsupportedReason;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
