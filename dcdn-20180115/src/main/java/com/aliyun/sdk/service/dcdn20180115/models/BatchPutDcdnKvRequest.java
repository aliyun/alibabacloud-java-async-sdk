// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchPutDcdnKvRequest} extends {@link RequestModel}
 *
 * <p>BatchPutDcdnKvRequest</p>
 */
public class BatchPutDcdnKvRequest extends Request {
    @Body
    @NameInMap("KvList")
    @Validation(required = true)
    private java.util.List < KvList> kvList;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private BatchPutDcdnKvRequest(Builder builder) {
        super(builder);
        this.kvList = builder.kvList;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchPutDcdnKvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kvList
     */
    public java.util.List < KvList> getKvList() {
        return this.kvList;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<BatchPutDcdnKvRequest, Builder> {
        private java.util.List < KvList> kvList; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(BatchPutDcdnKvRequest request) {
            super(request);
            this.kvList = request.kvList;
            this.namespace = request.namespace;
        } 

        /**
         * KvList.
         */
        public Builder kvList(java.util.List < KvList> kvList) {
            String kvListShrink = shrink(kvList, "KvList", "json");
            this.putBodyParameter("KvList", kvListShrink);
            this.kvList = kvList;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public BatchPutDcdnKvRequest build() {
            return new BatchPutDcdnKvRequest(this);
        } 

    } 

    public static class KvList extends TeaModel {
        @NameInMap("Expiration")
        private Long expiration;

        @NameInMap("ExpirationTtl")
        private Long expirationTtl;

        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        @Validation(required = true)
        private String value;

        private KvList(Builder builder) {
            this.expiration = builder.expiration;
            this.expirationTtl = builder.expirationTtl;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KvList create() {
            return builder().build();
        }

        /**
         * @return expiration
         */
        public Long getExpiration() {
            return this.expiration;
        }

        /**
         * @return expirationTtl
         */
        public Long getExpirationTtl() {
            return this.expirationTtl;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long expiration; 
            private Long expirationTtl; 
            private String key; 
            private String value; 

            /**
             * Expiration.
             */
            public Builder expiration(Long expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * ExpirationTtl.
             */
            public Builder expirationTtl(Long expirationTtl) {
                this.expirationTtl = expirationTtl;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public KvList build() {
                return new KvList(this);
            } 

        } 

    }
}
