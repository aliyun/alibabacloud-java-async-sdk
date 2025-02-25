// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDcdnKvRequest} extends {@link RequestModel}
 *
 * <p>GetDcdnKvRequest</p>
 */
public class GetDcdnKvRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private GetDcdnKvRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDcdnKvRequest create() {
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

    public static final class Builder extends Request.Builder<GetDcdnKvRequest, Builder> {
        private String key; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(GetDcdnKvRequest request) {
            super(request);
            this.key = request.key;
            this.namespace = request.namespace;
        } 

        /**
         * <p>The name of the key that you want to query.</p>
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
        public GetDcdnKvRequest build() {
            return new GetDcdnKvRequest(this);
        } 

    } 

}
