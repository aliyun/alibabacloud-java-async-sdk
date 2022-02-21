// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevicePictureResponse} extends {@link TeaModel}
 *
 * <p>GetDevicePictureResponse</p>
 */
public class GetDevicePictureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDevicePictureResponseBody body;

    private GetDevicePictureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDevicePictureResponse create() {
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
    public GetDevicePictureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDevicePictureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDevicePictureResponseBody body);

        @Override
        GetDevicePictureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDevicePictureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDevicePictureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDevicePictureResponse response) {
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
        public Builder body(GetDevicePictureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDevicePictureResponse build() {
            return new GetDevicePictureResponse(this);
        } 

    } 

}
