// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceStatusNotifyResponse} extends {@link TeaModel}
 *
 * <p>ResourceStatusNotifyResponse</p>
 */
public class ResourceStatusNotifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private ResourceStatusNotifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static ResourceStatusNotifyResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    public interface Builder extends Response.Builder<ResourceStatusNotifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        ResourceStatusNotifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResourceStatusNotifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResourceStatusNotifyResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public ResourceStatusNotifyResponse build() {
            return new ResourceStatusNotifyResponse(this);
        } 

    } 

}
