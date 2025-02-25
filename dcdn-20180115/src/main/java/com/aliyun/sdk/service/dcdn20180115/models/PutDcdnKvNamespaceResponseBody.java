// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutDcdnKvNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>PutDcdnKvNamespaceResponseBody</p>
 */
public class PutDcdnKvNamespaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private PutDcdnKvNamespaceResponseBody(Builder builder) {
        this.description = builder.description;
        this.namespace = builder.namespace;
        this.namespaceId = builder.namespaceId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDcdnKvNamespaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
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
        private String description; 
        private String namespace; 
        private String namespaceId; 
        private String requestId; 
        private String status; 

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>the first namespace</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>12423131231****</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D61E4801-EAFF-4A63-AAE1-FBF6CE1CFD1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the namespace. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: normal</li>
         * <li><strong>delete</strong>: pending delete</li>
         * <li><strong>deleting</strong>: being deleted</li>
         * <li><strong>deleted</strong>: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public PutDcdnKvNamespaceResponseBody build() {
            return new PutDcdnKvNamespaceResponseBody(this);
        } 

    } 

}
