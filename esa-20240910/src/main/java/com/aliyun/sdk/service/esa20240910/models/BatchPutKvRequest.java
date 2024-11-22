// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchPutKvRequest} extends {@link RequestModel}
 *
 * <p>BatchPutKvRequest</p>
 */
public class BatchPutKvRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KvList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < KvList> kvList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private BatchPutKvRequest(Builder builder) {
        super(builder);
        this.kvList = builder.kvList;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchPutKvRequest create() {
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

    public static final class Builder extends Request.Builder<BatchPutKvRequest, Builder> {
        private java.util.List < KvList> kvList; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(BatchPutKvRequest request) {
            super(request);
            this.kvList = request.kvList;
            this.namespace = request.namespace;
        } 

        /**
         * <p>The key-value pairs that you want to configure at a time. The total size can be up to 2 MB (2 × 1000 × 1000).</p>
         * <p>This parameter is required.</p>
         */
        public Builder kvList(java.util.List < KvList> kvList) {
            String kvListShrink = shrink(kvList, "KvList", "json");
            this.putBodyParameter("KvList", kvListShrink);
            this.kvList = kvList;
            return this;
        }

        /**
         * <p>The name of the namespace that you specify when you call the <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public BatchPutKvRequest build() {
            return new BatchPutKvRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchPutKvRequest} extends {@link TeaModel}
     *
     * <p>BatchPutKvRequest</p>
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
             * <p>The time when the key-value pair expires, which cannot be earlier than the current time. The value is a timestamp in seconds. If you specify both Expiration and ExpirationTtl, only ExpirationTtl takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1690081381</p>
             */
            public Builder expiration(Long expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>The relative expiration time. Unit: seconds. If you specify both Expiration and ExpirationTtl, only ExpirationTtl takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder expirationTtl(Long expirationTtl) {
                this.expirationTtl = expirationTtl;
                return this;
            }

            /**
             * <p>The key name. The name can be up to 512 characters in length and cannot contain spaces or backslashes (\).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test_key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The key content.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test_value</p>
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
