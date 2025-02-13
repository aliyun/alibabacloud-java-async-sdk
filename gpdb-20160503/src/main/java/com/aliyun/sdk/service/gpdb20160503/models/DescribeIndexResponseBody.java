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
 * {@link DescribeIndexResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIndexResponseBody</p>
 */
public class DescribeIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Collection")
    private String collection;

    @com.aliyun.core.annotation.NameInMap("IndexDef")
    private String indexDef;

    @com.aliyun.core.annotation.NameInMap("IndexName")
    private String indexName;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeIndexResponseBody(Builder builder) {
        this.collection = builder.collection;
        this.indexDef = builder.indexDef;
        this.indexName = builder.indexName;
        this.message = builder.message;
        this.namespace = builder.namespace;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIndexResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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
        private String collection; 
        private String indexDef; 
        private String indexName; 
        private String message; 
        private String namespace; 
        private String requestId; 
        private String status; 

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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * RequestId.
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

        public DescribeIndexResponseBody build() {
            return new DescribeIndexResponseBody(this);
        } 

    } 

}
