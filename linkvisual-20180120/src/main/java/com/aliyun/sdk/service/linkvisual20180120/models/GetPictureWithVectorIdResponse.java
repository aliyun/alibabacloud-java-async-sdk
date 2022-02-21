// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPictureWithVectorIdResponse} extends {@link TeaModel}
 *
 * <p>GetPictureWithVectorIdResponse</p>
 */
public class GetPictureWithVectorIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPictureWithVectorIdResponseBody body;

    private GetPictureWithVectorIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPictureWithVectorIdResponse create() {
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
    public GetPictureWithVectorIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPictureWithVectorIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPictureWithVectorIdResponseBody body);

        @Override
        GetPictureWithVectorIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPictureWithVectorIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPictureWithVectorIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPictureWithVectorIdResponse response) {
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
        public Builder body(GetPictureWithVectorIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPictureWithVectorIdResponse build() {
            return new GetPictureWithVectorIdResponse(this);
        } 

    } 

}
