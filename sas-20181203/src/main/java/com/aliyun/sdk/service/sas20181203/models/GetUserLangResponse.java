// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserLangResponse} extends {@link TeaModel}
 *
 * <p>GetUserLangResponse</p>
 */
public class GetUserLangResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserLangResponseBody body;

    private GetUserLangResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserLangResponse create() {
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
    public GetUserLangResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserLangResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserLangResponseBody body);

        @Override
        GetUserLangResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserLangResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserLangResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserLangResponse response) {
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
        public Builder body(GetUserLangResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserLangResponse build() {
            return new GetUserLangResponse(this);
        } 

    } 

}
