// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardRealStatusResponse} extends {@link TeaModel}
 *
 * <p>GetCardRealStatusResponse</p>
 */
public class GetCardRealStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCardRealStatusResponseBody body;

    private GetCardRealStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCardRealStatusResponse create() {
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
    public GetCardRealStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCardRealStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCardRealStatusResponseBody body);

        @Override
        GetCardRealStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCardRealStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCardRealStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCardRealStatusResponse response) {
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
        public Builder body(GetCardRealStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCardRealStatusResponse build() {
            return new GetCardRealStatusResponse(this);
        } 

    } 

}
