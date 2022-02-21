// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespacesResponseBody</p>
 */
public class DescribeNamespacesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Namespaces")
    private java.util.List < Namespaces> namespaces;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNamespacesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.namespaces = builder.namespaces;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return namespaces
     */
    public java.util.List < Namespaces> getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < Namespaces> namespaces; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Namespaces.
         */
        public Builder namespaces(java.util.List < Namespaces> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNamespacesResponseBody build() {
            return new DescribeNamespacesResponseBody(this);
        } 

    } 

    public static class Namespaces extends TeaModel {
        @NameInMap("ConfigCount")
        private Integer configCount;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("NamespaceName")
        private String namespaceName;

        @NameInMap("Quota")
        private Integer quota;

        @NameInMap("Type")
        private Integer type;

        private Namespaces(Builder builder) {
            this.configCount = builder.configCount;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.quota = builder.quota;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespaces create() {
            return builder().build();
        }

        /**
         * @return configCount
         */
        public Integer getConfigCount() {
            return this.configCount;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return quota
         */
        public Integer getQuota() {
            return this.quota;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer configCount; 
            private String namespaceId; 
            private String namespaceName; 
            private Integer quota; 
            private Integer type; 

            /**
             * ConfigCount.
             */
            public Builder configCount(Integer configCount) {
                this.configCount = configCount;
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
             * NamespaceName.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * Quota.
             */
            public Builder quota(Integer quota) {
                this.quota = quota;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
}
