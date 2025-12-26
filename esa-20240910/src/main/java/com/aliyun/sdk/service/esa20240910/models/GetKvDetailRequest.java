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
 * {@link GetKvDetailRequest} extends {@link RequestModel}
 *
 * <p>GetKvDetailRequest</p>
 */
public class GetKvDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private GetKvDetailRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKvDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<GetKvDetailRequest, Builder> {
        private String key; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(GetKvDetailRequest request) {
            super(request);
            this.key = request.key;
            this.namespace = request.namespace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_key</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
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
        public GetKvDetailRequest build() {
            return new GetKvDetailRequest(this);
        } 

    } 

}
