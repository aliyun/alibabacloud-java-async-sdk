// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTsChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetTsChEcomResponse</p>
 */
public class GetTsChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTsChEcomResponseBody body;

    private GetTsChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTsChEcomResponse create() {
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
    public GetTsChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTsChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTsChEcomResponseBody body);

        @Override
        GetTsChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTsChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTsChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTsChEcomResponse response) {
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
        public Builder body(GetTsChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTsChEcomResponse build() {
            return new GetTsChEcomResponse(this);
        } 

    } 

}
