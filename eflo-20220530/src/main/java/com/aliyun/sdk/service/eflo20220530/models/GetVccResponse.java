// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVccResponse} extends {@link TeaModel}
 *
 * <p>GetVccResponse</p>
 */
public class GetVccResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVccResponseBody body;

    private GetVccResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVccResponse create() {
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
    public GetVccResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVccResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVccResponseBody body);

        @Override
        GetVccResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVccResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVccResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVccResponse response) {
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
        public Builder body(GetVccResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVccResponse build() {
            return new GetVccResponse(this);
        } 

    } 

}
