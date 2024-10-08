// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchDeleteKvRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteKvRequest</p>
 */
public class BatchDeleteKvRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > keys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private BatchDeleteKvRequest(Builder builder) {
        super(builder);
        this.keys = builder.keys;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteKvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keys
     */
    public java.util.List < String > getKeys() {
        return this.keys;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<BatchDeleteKvRequest, Builder> {
        private java.util.List < String > keys; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteKvRequest request) {
            super(request);
            this.keys = request.keys;
            this.namespace = request.namespace;
        } 

        /**
         * Keys.
         */
        public Builder keys(java.util.List < String > keys) {
            String keysShrink = shrink(keys, "Keys", "json");
            this.putBodyParameter("Keys", keysShrink);
            this.keys = keys;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public BatchDeleteKvRequest build() {
            return new BatchDeleteKvRequest(this);
        } 

    } 

}
