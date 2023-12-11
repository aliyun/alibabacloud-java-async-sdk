// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileVersionResponse} extends {@link TeaModel}
 *
 * <p>GetFileVersionResponse</p>
 */
public class GetFileVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFileVersionResponseBody body;

    private GetFileVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFileVersionResponse create() {
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
    public GetFileVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFileVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFileVersionResponseBody body);

        @Override
        GetFileVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFileVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFileVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFileVersionResponse response) {
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
        public Builder body(GetFileVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFileVersionResponse build() {
            return new GetFileVersionResponse(this);
        } 

    } 

}
