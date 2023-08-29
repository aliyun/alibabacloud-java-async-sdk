// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnKvNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnKvNamespaceResponseBody</p>
 */
public class DescribeDcdnKvNamespaceResponseBody extends TeaModel {
    @NameInMap("CapacityString")
    private String capacityString;

    @NameInMap("CapacityUsedString")
    private String capacityUsedString;

    @NameInMap("Description")
    private String description;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("NamespaceId")
    private String namespaceId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeDcdnKvNamespaceResponseBody(Builder builder) {
        this.capacityString = builder.capacityString;
        this.capacityUsedString = builder.capacityUsedString;
        this.description = builder.description;
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
     * @return capacityString
     */
    public String getCapacityString() {
        return this.capacityString;
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
        private String capacityString; 
        private String capacityUsedString; 
        private String description; 
        private String namespace; 
        private String namespaceId; 
        private String requestId; 
        private String status; 

        /**
         * The available capacity of all namespaces in your account.
         */
        public Builder capacityString(String capacityString) {
            this.capacityString = capacityString;
            return this;
        }

        /**
         * The used capacity of all namespaces in your account.
         */
        public Builder capacityUsedString(String capacityUsedString) {
            this.capacityUsedString = capacityUsedString;
            return this;
        }

        /**
         * The description of the namespace.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * The ID of the namespace.
         */
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the namespace. Valid values:
         * <p>
         * 
         * *   **online**: normal
         * *   **delete**: pending delete
         * *   **deleting**: being deleted
         * *   **deleted**: deleted
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
