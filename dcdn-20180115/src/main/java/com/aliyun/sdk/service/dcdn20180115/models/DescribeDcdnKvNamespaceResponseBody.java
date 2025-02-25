// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnKvNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnKvNamespaceResponseBody</p>
 */
public class DescribeDcdnKvNamespaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Capacity")
    private Long capacity;

    @com.aliyun.core.annotation.NameInMap("CapacityString")
    private String capacityString;

    @com.aliyun.core.annotation.NameInMap("CapacityUsed")
    private Long capacityUsed;

    @com.aliyun.core.annotation.NameInMap("CapacityUsedString")
    private String capacityUsedString;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeDcdnKvNamespaceResponseBody(Builder builder) {
        this.capacity = builder.capacity;
        this.capacityString = builder.capacityString;
        this.capacityUsed = builder.capacityUsed;
        this.capacityUsedString = builder.capacityUsedString;
        this.description = builder.description;
        this.mode = builder.mode;
        this.namespace = builder.namespace;
        this.namespaceId = builder.namespaceId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnKvNamespaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return capacity
     */
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * @return capacityString
     */
    public String getCapacityString() {
        return this.capacityString;
    }

    /**
     * @return capacityUsed
     */
    public Long getCapacityUsed() {
        return this.capacityUsed;
    }

    /**
     * @return capacityUsedString
     */
    public String getCapacityUsedString() {
        return this.capacityUsedString;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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
        private Long capacity; 
        private String capacityString; 
        private Long capacityUsed; 
        private String capacityUsedString; 
        private String description; 
        private String mode; 
        private String namespace; 
        private String namespaceId; 
        private String requestId; 
        private String status; 

        /**
         * Capacity.
         */
        public Builder capacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }

        /**
         * <p>The available capacity of all namespaces in your account.</p>
         * 
         * <strong>example:</strong>
         * <p>1 GB</p>
         */
        public Builder capacityString(String capacityString) {
            this.capacityString = capacityString;
            return this;
        }

        /**
         * CapacityUsed.
         */
        public Builder capacityUsed(Long capacityUsed) {
            this.capacityUsed = capacityUsed;
            return this;
        }

        /**
         * <p>The used capacity of all namespaces in your account.</p>
         * 
         * <strong>example:</strong>
         * <p>100 MB</p>
         */
        public Builder capacityUsedString(String capacityUsedString) {
            this.capacityUsedString = capacityUsedString;
            return this;
        }

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
         * <p>The system behavior when a key-value pair fails to be obtained at the edge. Valid values:</p>
         * <ul>
         * <li>Normal (default): If a key-value pair fails to be obtained at the edge, DCDN attempts to query the key-value pair from the origin server to ensure global data consistency.</li>
         * <li>Rapid: If a key-value pair fails to be obtained at the edge, an error message indicating that the key does not exist is returned. This feature enhances key-value query performance but may decrease the hit rate of queries. To enable this feature, submit a ticket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
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

        public DescribeDcdnKvNamespaceResponseBody build() {
            return new DescribeDcdnKvNamespaceResponseBody(this);
        } 

    } 

}
