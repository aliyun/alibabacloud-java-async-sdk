// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectorySsoStatusResponse} extends {@link TeaModel}
 *
 * <p>GetDirectorySsoStatusResponse</p>
 */
public class GetDirectorySsoStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDirectorySsoStatusResponseBody body;

    private GetDirectorySsoStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDirectorySsoStatusResponse create() {
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
    public GetDirectorySsoStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDirectorySsoStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDirectorySsoStatusResponseBody body);

        @Override
        GetDirectorySsoStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDirectorySsoStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDirectorySsoStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDirectorySsoStatusResponse response) {
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
        public Builder body(GetDirectorySsoStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDirectorySsoStatusResponse build() {
            return new GetDirectorySsoStatusResponse(this);
        } 

    } 

}
