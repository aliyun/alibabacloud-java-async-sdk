// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceLiveUrlResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceLiveUrlResponse</p>
 */
public class GetDeviceLiveUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceLiveUrlResponseBody body;

    private GetDeviceLiveUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceLiveUrlResponse create() {
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
    public GetDeviceLiveUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceLiveUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceLiveUrlResponseBody body);

        @Override
        GetDeviceLiveUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceLiveUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceLiveUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceLiveUrlResponse response) {
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
        public Builder body(GetDeviceLiveUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceLiveUrlResponse build() {
            return new GetDeviceLiveUrlResponse(this);
        } 

    } 

}
