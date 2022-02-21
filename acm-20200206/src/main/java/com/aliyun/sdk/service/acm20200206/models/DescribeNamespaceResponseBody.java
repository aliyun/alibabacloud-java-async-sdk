// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespaceResponseBody</p>
 */
public class DescribeNamespaceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Namespace")
    private Namespace namespace;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNamespaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.namespace = builder.namespace;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespaceResponseBody create() {
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
     * @return namespace
     */
    public Namespace getNamespace() {
        return this.namespace;
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
        private Namespace namespace; 
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
         * Namespace.
         */
        public Builder namespace(Namespace namespace) {
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

        public DescribeNamespaceResponseBody build() {
            return new DescribeNamespaceResponseBody(this);
        } 

    } 

    public static class Namespace extends TeaModel {
        @NameInMap("AccessKey")
        private String accessKey;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecretKey")
        private String secretKey;

        private Namespace(Builder builder) {
            this.accessKey = builder.accessKey;
            this.endpoint = builder.endpoint;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.secretKey = builder.secretKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespace create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        public static final class Builder {
            private String accessKey; 
            private String endpoint; 
            private String name; 
            private String regionId; 
            private String secretKey; 

            /**
             * AccessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecretKey.
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            public Namespace build() {
                return new Namespace(this);
            } 

        } 

    }
}
