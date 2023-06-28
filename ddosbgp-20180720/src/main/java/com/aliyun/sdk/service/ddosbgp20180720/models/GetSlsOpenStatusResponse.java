// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSlsOpenStatusResponse} extends {@link TeaModel}
 *
 * <p>GetSlsOpenStatusResponse</p>
 */
public class GetSlsOpenStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSlsOpenStatusResponseBody body;

    private GetSlsOpenStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSlsOpenStatusResponse create() {
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
    public GetSlsOpenStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSlsOpenStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSlsOpenStatusResponseBody body);

        @Override
        GetSlsOpenStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSlsOpenStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSlsOpenStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSlsOpenStatusResponse response) {
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
        public Builder body(GetSlsOpenStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSlsOpenStatusResponse build() {
            return new GetSlsOpenStatusResponse(this);
        } 

    } 

}
