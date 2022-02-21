// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshScdnObjectCachesResponse} extends {@link TeaModel}
 *
 * <p>RefreshScdnObjectCachesResponse</p>
 */
public class RefreshScdnObjectCachesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshScdnObjectCachesResponseBody body;

    private RefreshScdnObjectCachesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshScdnObjectCachesResponse create() {
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
    public RefreshScdnObjectCachesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshScdnObjectCachesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshScdnObjectCachesResponseBody body);

        @Override
        RefreshScdnObjectCachesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshScdnObjectCachesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshScdnObjectCachesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshScdnObjectCachesResponse response) {
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
        public Builder body(RefreshScdnObjectCachesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshScdnObjectCachesResponse build() {
            return new RefreshScdnObjectCachesResponse(this);
        } 

    } 

}
