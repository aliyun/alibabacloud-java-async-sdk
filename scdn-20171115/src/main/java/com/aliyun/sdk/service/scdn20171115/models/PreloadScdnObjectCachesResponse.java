// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreloadScdnObjectCachesResponse} extends {@link TeaModel}
 *
 * <p>PreloadScdnObjectCachesResponse</p>
 */
public class PreloadScdnObjectCachesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PreloadScdnObjectCachesResponseBody body;

    private PreloadScdnObjectCachesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PreloadScdnObjectCachesResponse create() {
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
    public PreloadScdnObjectCachesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PreloadScdnObjectCachesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PreloadScdnObjectCachesResponseBody body);

        @Override
        PreloadScdnObjectCachesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PreloadScdnObjectCachesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PreloadScdnObjectCachesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PreloadScdnObjectCachesResponse response) {
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
        public Builder body(PreloadScdnObjectCachesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PreloadScdnObjectCachesResponse build() {
            return new PreloadScdnObjectCachesResponse(this);
        } 

    } 

}
