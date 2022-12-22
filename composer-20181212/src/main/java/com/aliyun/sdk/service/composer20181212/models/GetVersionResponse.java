// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVersionResponse} extends {@link TeaModel}
 *
 * <p>GetVersionResponse</p>
 */
public class GetVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVersionResponseBody body;

    private GetVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVersionResponse create() {
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
    public GetVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVersionResponseBody body);

        @Override
        GetVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVersionResponse response) {
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
        public Builder body(GetVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVersionResponse build() {
            return new GetVersionResponse(this);
        } 

    } 

}
