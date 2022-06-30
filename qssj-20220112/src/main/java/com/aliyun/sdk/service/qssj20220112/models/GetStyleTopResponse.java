// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStyleTopResponse} extends {@link TeaModel}
 *
 * <p>GetStyleTopResponse</p>
 */
public class GetStyleTopResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStyleTopResponseBody body;

    private GetStyleTopResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStyleTopResponse create() {
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
    public GetStyleTopResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStyleTopResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStyleTopResponseBody body);

        @Override
        GetStyleTopResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStyleTopResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStyleTopResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStyleTopResponse response) {
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
        public Builder body(GetStyleTopResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStyleTopResponse build() {
            return new GetStyleTopResponse(this);
        } 

    } 

}
