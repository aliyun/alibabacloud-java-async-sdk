// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDcdnKvStatusRequest} extends {@link RequestModel}
 *
 * <p>GetDcdnKvStatusRequest</p>
 */
public class GetDcdnKvStatusRequest extends Request {
    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private GetDcdnKvStatusRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDcdnKvStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetDcdnKvStatusRequest, Builder> {
        private String key; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(GetDcdnKvStatusRequest request) {
            super(request);
            this.key = request.key;
            this.namespace = request.namespace;
        } 

        /**
         * The name of the key that you want to query.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
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
        public GetDcdnKvStatusRequest build() {
            return new GetDcdnKvStatusRequest(this);
        } 

    } 

}
