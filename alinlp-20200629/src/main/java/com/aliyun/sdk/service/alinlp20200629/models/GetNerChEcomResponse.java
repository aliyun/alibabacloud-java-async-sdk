// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNerChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetNerChEcomResponse</p>
 */
public class GetNerChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNerChEcomResponseBody body;

    private GetNerChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNerChEcomResponse create() {
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
    public GetNerChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNerChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNerChEcomResponseBody body);

        @Override
        GetNerChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNerChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNerChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNerChEcomResponse response) {
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
        public Builder body(GetNerChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNerChEcomResponse build() {
            return new GetNerChEcomResponse(this);
        } 

    } 

}
