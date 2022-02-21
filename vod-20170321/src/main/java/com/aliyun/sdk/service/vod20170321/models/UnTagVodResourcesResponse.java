// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnTagVodResourcesResponse} extends {@link TeaModel}
 *
 * <p>UnTagVodResourcesResponse</p>
 */
public class UnTagVodResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnTagVodResourcesResponseBody body;

    private UnTagVodResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnTagVodResourcesResponse create() {
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
    public UnTagVodResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnTagVodResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnTagVodResourcesResponseBody body);

        @Override
        UnTagVodResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnTagVodResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnTagVodResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnTagVodResourcesResponse response) {
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
        public Builder body(UnTagVodResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnTagVodResourcesResponse build() {
            return new UnTagVodResourcesResponse(this);
        } 

    } 

}
