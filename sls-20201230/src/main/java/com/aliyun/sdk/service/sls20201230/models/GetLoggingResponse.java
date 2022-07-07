// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetLoggingResponse} extends {@link TeaModel}
 *
 * <p>GetLoggingResponse</p>
 */
public class GetLoggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Logging body;

    private GetLoggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLoggingResponse create() {
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
    public Logging getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLoggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Logging body);

        @Override
        GetLoggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLoggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Logging body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLoggingResponse response) {
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
        public Builder body(Logging body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLoggingResponse build() {
            return new GetLoggingResponse(this);
        } 

    } 

}
