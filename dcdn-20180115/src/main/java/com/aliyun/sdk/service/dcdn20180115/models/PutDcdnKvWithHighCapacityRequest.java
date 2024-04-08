// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDcdnKvWithHighCapacityRequest} extends {@link RequestModel}
 *
 * <p>PutDcdnKvWithHighCapacityRequest</p>
 */
public class PutDcdnKvWithHighCapacityRequest extends Request {
    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private PutDcdnKvWithHighCapacityRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.namespace = builder.namespace;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDcdnKvWithHighCapacityRequest create() {
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

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<PutDcdnKvWithHighCapacityRequest, Builder> {
        private String key; 
        private String namespace; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(PutDcdnKvWithHighCapacityRequest request) {
            super(request);
            this.key = request.key;
            this.namespace = request.namespace;
            this.url = request.url;
        } 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
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

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public PutDcdnKvWithHighCapacityRequest build() {
            return new PutDcdnKvWithHighCapacityRequest(this);
        } 

    } 

}
