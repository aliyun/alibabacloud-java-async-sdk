// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteDcdnKvRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteDcdnKvRequest</p>
 */
public class BatchDeleteDcdnKvRequest extends Request {
    @Body
    @NameInMap("Keys")
    @Validation(required = true)
    private java.util.List < String > keys;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private BatchDeleteDcdnKvRequest(Builder builder) {
        super(builder);
        this.keys = builder.keys;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteDcdnKvRequest create() {
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

    public static final class Builder extends Request.Builder<BatchDeleteDcdnKvRequest, Builder> {
        private java.util.List < String > keys; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteDcdnKvRequest request) {
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
        public BatchDeleteDcdnKvRequest build() {
            return new BatchDeleteDcdnKvRequest(this);
        } 

    } 

}
