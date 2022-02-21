// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnTagLiveResourcesResponse} extends {@link TeaModel}
 *
 * <p>UnTagLiveResourcesResponse</p>
 */
public class UnTagLiveResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnTagLiveResourcesResponseBody body;

    private UnTagLiveResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnTagLiveResourcesResponse create() {
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

    /**
     * @return body
     */
    public UnTagLiveResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnTagLiveResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnTagLiveResourcesResponseBody body);

        @Override
        UnTagLiveResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnTagLiveResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnTagLiveResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnTagLiveResourcesResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(UnTagLiveResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnTagLiveResourcesResponse build() {
            return new UnTagLiveResourcesResponse(this);
        } 

    } 

}
