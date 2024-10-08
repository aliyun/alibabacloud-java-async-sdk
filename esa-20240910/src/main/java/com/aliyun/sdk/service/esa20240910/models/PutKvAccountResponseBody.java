// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutKvAccountResponseBody} extends {@link TeaModel}
 *
 * <p>PutKvAccountResponseBody</p>
 */
public class PutKvAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NamespaceList")
    private java.util.List < NamespaceList> namespaceList;

    @com.aliyun.core.annotation.NameInMap("NamespaceQuota")
    private Integer namespaceQuota;

    @com.aliyun.core.annotation.NameInMap("NamespaceUsed")
    private Integer namespaceUsed;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private PutKvAccountResponseBody(Builder builder) {
        this.namespaceList = builder.namespaceList;
        this.namespaceQuota = builder.namespaceQuota;
        this.namespaceUsed = builder.namespaceUsed;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutKvAccountResponseBody create() {
        return builder().build();
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
        private java.util.List < NamespaceList> namespaceList; 
        private Integer namespaceQuota; 
        private Integer namespaceUsed; 
        private String requestId; 
        private String status; 

        /**
         * NamespaceList.
         */
        public Builder namespaceList(java.util.List < NamespaceList> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }

        /**
         * NamespaceQuota.
         */
        public Builder namespaceQuota(Integer namespaceQuota) {
            this.namespaceQuota = namespaceQuota;
            return this;
        }

        /**
         * NamespaceUsed.
         */
        public Builder namespaceUsed(Integer namespaceUsed) {
            this.namespaceUsed = namespaceUsed;
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

        public PutKvAccountResponseBody build() {
            return new PutKvAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PutKvAccountResponseBody} extends {@link TeaModel}
     *
     * <p>PutKvAccountResponseBody</p>
     */
    public static class NamespaceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private NamespaceList(Builder builder) {
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
            private String description; 
            private String namespace; 
            private String namespaceId; 
            private String status; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * Status.
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
