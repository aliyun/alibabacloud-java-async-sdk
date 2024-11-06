// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchPutDcdnKvRequest} extends {@link RequestModel}
 *
 * <p>BatchPutDcdnKvRequest</p>
 */
public class BatchPutDcdnKvRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KvList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < KvList> kvList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder kvList(java.util.List < KvList> kvList) {
            String kvListShrink = shrink(kvList, "KvList", "json");
            this.putBodyParameter("KvList", kvListShrink);
            this.kvList = kvList;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
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

    /**
     * 
     * {@link BatchPutDcdnKvRequest} extends {@link TeaModel}
     *
     * <p>BatchPutDcdnKvRequest</p>
     */
    public static class KvList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expiration")
        private Long expiration;

        @com.aliyun.core.annotation.NameInMap("ExpirationTtl")
        private Long expirationTtl;

        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
