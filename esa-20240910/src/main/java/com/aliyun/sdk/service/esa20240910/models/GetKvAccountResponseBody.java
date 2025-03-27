// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetKvAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetKvAccountResponseBody</p>
 */
public class GetKvAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Capacity")
    private Long capacity;

    @com.aliyun.core.annotation.NameInMap("CapacityString")
    private String capacityString;

    @com.aliyun.core.annotation.NameInMap("CapacityUsed")
    private Long capacityUsed;

    @com.aliyun.core.annotation.NameInMap("CapacityUsedString")
    private String capacityUsedString;

    @com.aliyun.core.annotation.NameInMap("NamespaceList")
    private java.util.List<NamespaceList> namespaceList;

    @com.aliyun.core.annotation.NameInMap("NamespaceQuota")
    private Integer namespaceQuota;

    @com.aliyun.core.annotation.NameInMap("NamespaceUsed")
    private Integer namespaceUsed;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetKvAccountResponseBody(Builder builder) {
        this.capacity = builder.capacity;
        this.capacityString = builder.capacityString;
        this.capacityUsed = builder.capacityUsed;
        this.capacityUsedString = builder.capacityUsedString;
        this.namespaceList = builder.namespaceList;
        this.namespaceQuota = builder.namespaceQuota;
        this.namespaceUsed = builder.namespaceUsed;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKvAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return namespaceList
     */
    public java.util.List<NamespaceList> getNamespaceList() {
        return this.namespaceList;
    }

    /**
     * @return namespaceQuota
     */
    public Integer getNamespaceQuota() {
        return this.namespaceQuota;
    }

    /**
     * @return namespaceUsed
     */
    public Integer getNamespaceUsed() {
        return this.namespaceUsed;
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
        private java.util.List<NamespaceList> namespaceList; 
        private Integer namespaceQuota; 
        private Integer namespaceUsed; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetKvAccountResponseBody model) {
            this.capacity = model.capacity;
            this.capacityString = model.capacityString;
            this.capacityUsed = model.capacityUsed;
            this.capacityUsedString = model.capacityUsedString;
            this.namespaceList = model.namespaceList;
            this.namespaceQuota = model.namespaceQuota;
            this.namespaceUsed = model.namespaceUsed;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The available capacity of all namespaces in the account. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1073741824</p>
         */
        public Builder capacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }

        /**
         * <p>The available capacity of all namespaces in the account.</p>
         * 
         * <strong>example:</strong>
         * <p>1 GB</p>
         */
        public Builder capacityString(String capacityString) {
            this.capacityString = capacityString;
            return this;
        }

        /**
         * <p>The used capacity of all namespaces in the account. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10048576</p>
         */
        public Builder capacityUsed(Long capacityUsed) {
            this.capacityUsed = capacityUsed;
            return this;
        }

        /**
         * <p>The used capacity of all namespaces in the account.</p>
         * 
         * <strong>example:</strong>
         * <p>100 MB</p>
         */
        public Builder capacityUsedString(String capacityUsedString) {
            this.capacityUsedString = capacityUsedString;
            return this;
        }

        /**
         * <p>The namespaces in the account.</p>
         */
        public Builder namespaceList(java.util.List<NamespaceList> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }

        /**
         * <p>The maximum number of namespaces that can be created in the account.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder namespaceQuota(Integer namespaceQuota) {
            this.namespaceQuota = namespaceQuota;
            return this;
        }

        /**
         * <p>The number of created namespaces that store key-value data in the account.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder namespaceUsed(Integer namespaceUsed) {
            this.namespaceUsed = namespaceUsed;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether Edge KV is activated for the Alibaba Cloud account.</p>
         * <ul>
         * <li><strong>online</strong></li>
         * <li><strong>offline</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetKvAccountResponseBody build() {
            return new GetKvAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKvAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetKvAccountResponseBody</p>
     */
    public static class NamespaceList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private NamespaceList(Builder builder) {
            this.capacity = builder.capacity;
            this.capacityString = builder.capacityString;
            this.capacityUsed = builder.capacityUsed;
            this.capacityUsedString = builder.capacityUsedString;
            this.description = builder.description;
            this.namespace = builder.namespace;
            this.namespaceId = builder.namespaceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NamespaceList create() {
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
            private String namespace; 
            private String namespaceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(NamespaceList model) {
                this.capacity = model.capacity;
                this.capacityString = model.capacityString;
                this.capacityUsed = model.capacityUsed;
                this.capacityUsedString = model.capacityUsedString;
                this.description = model.description;
                this.namespace = model.namespace;
                this.namespaceId = model.namespaceId;
                this.status = model.status;
            } 

            /**
             * <p>The available capacity of the namespace. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1073741824</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The available capacity of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>1 GB</p>
             */
            public Builder capacityString(String capacityString) {
                this.capacityString = capacityString;
                return this;
            }

            /**
             * <p>The used capacity of the namespace. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>100048576</p>
             */
            public Builder capacityUsed(Long capacityUsed) {
                this.capacityUsed = capacityUsed;
                return this;
            }

            /**
             * <p>The used capacity of the namespace.</p>
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
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test_namespace</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>643355322374688768</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The status of the namespace. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: normal.</li>
             * <li><strong>delete</strong>: pending deletion.</li>
             * <li><strong>deleting</strong>: being deleted.</li>
             * <li><strong>deleted</strong>: deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NamespaceList build() {
                return new NamespaceList(this);
            } 

        } 

    }
}
