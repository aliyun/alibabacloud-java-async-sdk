// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshDcdnObjectCachesResponse} extends {@link TeaModel}
 *
 * <p>RefreshDcdnObjectCachesResponse</p>
 */
public class RefreshDcdnObjectCachesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshDcdnObjectCachesResponseBody body;

    private RefreshDcdnObjectCachesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshDcdnObjectCachesResponse create() {
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
    public RefreshDcdnObjectCachesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshDcdnObjectCachesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshDcdnObjectCachesResponseBody body);

        @Override
        RefreshDcdnObjectCachesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshDcdnObjectCachesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshDcdnObjectCachesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshDcdnObjectCachesResponse response) {
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
        public Builder body(RefreshDcdnObjectCachesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshDcdnObjectCachesResponse build() {
            return new RefreshDcdnObjectCachesResponse(this);
        } 

    } 

}
