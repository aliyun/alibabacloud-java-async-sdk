// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPictureSearchJobStatusResponse} extends {@link TeaModel}
 *
 * <p>GetPictureSearchJobStatusResponse</p>
 */
public class GetPictureSearchJobStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPictureSearchJobStatusResponseBody body;

    private GetPictureSearchJobStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPictureSearchJobStatusResponse create() {
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
    public GetPictureSearchJobStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPictureSearchJobStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPictureSearchJobStatusResponseBody body);

        @Override
        GetPictureSearchJobStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPictureSearchJobStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPictureSearchJobStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPictureSearchJobStatusResponse response) {
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
        public Builder body(GetPictureSearchJobStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPictureSearchJobStatusResponse build() {
            return new GetPictureSearchJobStatusResponse(this);
        } 

    } 

}
