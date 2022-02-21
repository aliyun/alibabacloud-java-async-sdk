// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSetResponse} extends {@link TeaModel}
 *
 * <p>GetSetResponse</p>
 */
public class GetSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSetResponseBody body;

    private GetSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSetResponse create() {
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
    public GetSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSetResponseBody body);

        @Override
        GetSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSetResponse response) {
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
        public Builder body(GetSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSetResponse build() {
            return new GetSetResponse(this);
        } 

    } 

}
