// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeResponse} extends {@link TeaModel}
 *
 * <p>GetNodeResponse</p>
 */
public class GetNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNodeResponseBody body;

    private GetNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNodeResponse create() {
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
    public GetNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNodeResponseBody body);

        @Override
        GetNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNodeResponse response) {
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
        public Builder body(GetNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNodeResponse build() {
            return new GetNodeResponse(this);
        } 

    } 

}
