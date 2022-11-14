// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTcChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetTcChEcomResponse</p>
 */
public class GetTcChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTcChEcomResponseBody body;

    private GetTcChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTcChEcomResponse create() {
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
    public GetTcChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTcChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTcChEcomResponseBody body);

        @Override
        GetTcChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTcChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTcChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTcChEcomResponse response) {
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
        public Builder body(GetTcChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTcChEcomResponse build() {
            return new GetTcChEcomResponse(this);
        } 

    } 

}
