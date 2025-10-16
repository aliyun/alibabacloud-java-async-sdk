// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link RetrieveMemoryRequest} extends {@link RequestModel}
 *
 * <p>RetrieveMemoryRequest</p>
 */
public class RetrieveMemoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("from")
    private Integer from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private RetrieveMemoryRequestQuery query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("store")
    private String store;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("to")
    private Integer to;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topk")
    private Integer topk;

    private RetrieveMemoryRequest(Builder builder) {
        super(builder);
        this.memoryName = builder.memoryName;
        this.from = builder.from;
        this.query = builder.query;
        this.store = builder.store;
        this.to = builder.to;
        this.topk = builder.topk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memoryName
     */
    public String getMemoryName() {
        return this.memoryName;
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return query
     */
    public RetrieveMemoryRequestQuery getQuery() {
        return this.query;
    }

    /**
     * @return store
     */
    public String getStore() {
        return this.store;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    /**
     * @return topk
     */
    public Integer getTopk() {
        return this.topk;
    }

    public static final class Builder extends Request.Builder<RetrieveMemoryRequest, Builder> {
        private String memoryName; 
        private Integer from; 
        private RetrieveMemoryRequestQuery query; 
        private String store; 
        private Integer to; 
        private Integer topk; 

        private Builder() {
            super();
        } 

        private Builder(RetrieveMemoryRequest request) {
            super(request);
            this.memoryName = request.memoryName;
            this.from = request.from;
            this.query = request.query;
            this.store = request.store;
            this.to = request.to;
            this.topk = request.topk;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-memory</p>
         */
        public Builder memoryName(String memoryName) {
            this.putPathParameter("memoryName", memoryName);
            this.memoryName = memoryName;
            return this;
        }

        /**
         * from.
         */
        public Builder from(Integer from) {
            this.putBodyParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(RetrieveMemoryRequestQuery query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * store.
         */
        public Builder store(String store) {
            this.putBodyParameter("store", store);
            this.store = store;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Integer to) {
            this.putBodyParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * topk.
         */
        public Builder topk(Integer topk) {
            this.putBodyParameter("topk", topk);
            this.topk = topk;
            return this;
        }

        @Override
        public RetrieveMemoryRequest build() {
            return new RetrieveMemoryRequest(this);
        } 

    } 

    /**
     * 
     * {@link RetrieveMemoryRequest} extends {@link TeaModel}
     *
     * <p>RetrieveMemoryRequest</p>
     */
    public static class RetrieveMemoryRequestQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("userId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private RetrieveMemoryRequestQuery(Builder builder) {
            this.memory = builder.memory;
            this.metadata = builder.metadata;
            this.namespace = builder.namespace;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetrieveMemoryRequestQuery create() {
            return builder().build();
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String memory; 
            private java.util.Map<String, String> metadata; 
            private String namespace; 
            private String userId; 

            private Builder() {
            } 

            private Builder(RetrieveMemoryRequestQuery model) {
                this.memory = model.memory;
                this.metadata = model.metadata;
                this.namespace = model.namespace;
                this.userId = model.userId;
            } 

            /**
             * memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * metadata.
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>uid1</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public RetrieveMemoryRequestQuery build() {
                return new RetrieveMemoryRequestQuery(this);
            } 

        } 

    }
}
