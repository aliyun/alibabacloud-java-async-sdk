// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDcdnKvDetailRequest} extends {@link RequestModel}
 *
 * <p>GetDcdnKvDetailRequest</p>
 */
public class GetDcdnKvDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private GetDcdnKvDetailRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDcdnKvDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetDcdnKvDetailRequest, Builder> {
        private String key; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(GetDcdnKvDetailRequest request) {
            super(request);
            this.key = request.key;
            this.namespace = request.namespace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
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
        public GetDcdnKvDetailRequest build() {
            return new GetDcdnKvDetailRequest(this);
        } 

    } 

}
