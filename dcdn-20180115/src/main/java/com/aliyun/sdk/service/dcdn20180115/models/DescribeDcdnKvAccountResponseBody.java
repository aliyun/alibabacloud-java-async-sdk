// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnKvAccountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnKvAccountResponseBody</p>
 */
public class DescribeDcdnKvAccountResponseBody extends TeaModel {
    @NameInMap("CapacityString")
    private String capacityString;

    @NameInMap("CapacityUsedString")
    private String capacityUsedString;

    @NameInMap("NamespaceList")
    private java.util.List < NamespaceList> namespaceList;

    @NameInMap("NamespaceQuota")
    private Integer namespaceQuota;

    @NameInMap("NamespaceUsed")
    private Integer namespaceUsed;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeDcdnKvAccountResponseBody(Builder builder) {
        this.capacityString = builder.capacityString;
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

    public static DescribeDcdnKvAccountResponseBody create() {
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
     * @return namespaceList
     */
    public java.util.List < NamespaceList> getNamespaceList() {
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
        private String capacityString; 
        private String capacityUsedString; 
        private java.util.List < NamespaceList> namespaceList; 
        private Integer namespaceQuota; 
        private Integer namespaceUsed; 
        private String requestId; 
        private String status; 

        /**
         * The available capacity of all namespaces.
         */
        public Builder capacityString(String capacityString) {
            this.capacityString = capacityString;
            return this;
        }

        /**
         * All namespaces have used capacity.
         */
        public Builder capacityUsedString(String capacityUsedString) {
            this.capacityUsedString = capacityUsedString;
            return this;
        }

        /**
         * Details about the namespaces.
         */
        public Builder namespaceList(java.util.List < NamespaceList> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }

        /**
         * The maximum number of namespaces that you can apply for by using your account.
         */
        public Builder namespaceQuota(Integer namespaceQuota) {
            this.namespaceQuota = namespaceQuota;
            return this;
        }

        /**
         * The number of namespaces that you applied for by using your account.
         */
        public Builder namespaceUsed(Integer namespaceUsed) {
            this.namespaceUsed = namespaceUsed;
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
         * The status of the account.
         * <p>
         * 
         * *   **online**: enabled
         * *   **offline**: disabled
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDcdnKvAccountResponseBody build() {
            return new DescribeDcdnKvAccountResponseBody(this);
        } 

    } 

    public static class NamespaceList extends TeaModel {
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

        @NameInMap("Status")
        private String status;

        private NamespaceList(Builder builder) {
            this.capacityString = builder.capacityString;
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
            private String status; 

            /**
             * The available capacity of the namespace.
             */
            public Builder capacityString(String capacityString) {
                this.capacityString = capacityString;
                return this;
            }

            /**
             * The namespace has used capacity.
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

            public NamespaceList build() {
                return new NamespaceList(this);
            } 

        } 

    }
}
