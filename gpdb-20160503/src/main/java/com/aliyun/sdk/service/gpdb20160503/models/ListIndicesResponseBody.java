// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListIndicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndicesResponseBody</p>
 */
public class ListIndicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Indices")
    private Indices indices;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListIndicesResponseBody(Builder builder) {
        this.indices = builder.indices;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return indices
     */
    public Indices getIndices() {
        return this.indices;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Indices indices; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * Indices.
         */
        public Builder indices(Indices indices) {
            this.indices = indices;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListIndicesResponseBody build() {
            return new ListIndicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIndicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndicesResponseBody</p>
     */
    public static class IndicesIndices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Collection")
        private String collection;

        @com.aliyun.core.annotation.NameInMap("IndexDef")
        private String indexDef;

        @com.aliyun.core.annotation.NameInMap("IndexName")
        private String indexName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        private IndicesIndices(Builder builder) {
            this.collection = builder.collection;
            this.indexDef = builder.indexDef;
            this.indexName = builder.indexName;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndicesIndices create() {
            return builder().build();
        }

        /**
         * @return collection
         */
        public String getCollection() {
            return this.collection;
        }

        /**
         * @return indexDef
         */
        public String getIndexDef() {
            return this.indexDef;
        }

        /**
         * @return indexName
         */
        public String getIndexName() {
            return this.indexName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private String collection; 
            private String indexDef; 
            private String indexName; 
            private String namespace; 

            /**
             * Collection.
             */
            public Builder collection(String collection) {
                this.collection = collection;
                return this;
            }

            /**
             * IndexDef.
             */
            public Builder indexDef(String indexDef) {
                this.indexDef = indexDef;
                return this;
            }

            /**
             * IndexName.
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public IndicesIndices build() {
                return new IndicesIndices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIndicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndicesResponseBody</p>
     */
    public static class Indices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Indices")
        private java.util.List<IndicesIndices> indices;

        private Indices(Builder builder) {
            this.indices = builder.indices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Indices create() {
            return builder().build();
        }

        /**
         * @return indices
         */
        public java.util.List<IndicesIndices> getIndices() {
            return this.indices;
        }

        public static final class Builder {
            private java.util.List<IndicesIndices> indices; 

            /**
             * Indices.
             */
            public Builder indices(java.util.List<IndicesIndices> indices) {
                this.indices = indices;
                return this;
            }

            public Indices build() {
                return new Indices(this);
            } 

        } 

    }
}
