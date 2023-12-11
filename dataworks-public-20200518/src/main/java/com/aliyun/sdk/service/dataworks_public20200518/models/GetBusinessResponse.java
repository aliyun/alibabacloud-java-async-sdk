// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessResponse} extends {@link TeaModel}
 *
 * <p>GetBusinessResponse</p>
 */
public class GetBusinessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBusinessResponseBody body;

    private GetBusinessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBusinessResponse create() {
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
    public GetBusinessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBusinessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBusinessResponseBody body);

        @Override
        GetBusinessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBusinessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBusinessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBusinessResponse response) {
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
        public Builder body(GetBusinessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBusinessResponse build() {
            return new GetBusinessResponse(this);
        } 

    } 

}
