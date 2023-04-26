// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreMediaResponse} extends {@link TeaModel}
 *
 * <p>RestoreMediaResponse</p>
 */
public class RestoreMediaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestoreMediaResponseBody body;

    private RestoreMediaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestoreMediaResponse create() {
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
    public RestoreMediaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestoreMediaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestoreMediaResponseBody body);

        @Override
        RestoreMediaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestoreMediaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestoreMediaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestoreMediaResponse response) {
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
        public Builder body(RestoreMediaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestoreMediaResponse build() {
            return new RestoreMediaResponse(this);
        } 

    } 

}
