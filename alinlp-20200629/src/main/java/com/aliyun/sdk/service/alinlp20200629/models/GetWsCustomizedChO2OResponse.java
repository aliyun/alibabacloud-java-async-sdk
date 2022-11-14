// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWsCustomizedChO2OResponse} extends {@link TeaModel}
 *
 * <p>GetWsCustomizedChO2OResponse</p>
 */
public class GetWsCustomizedChO2OResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWsCustomizedChO2OResponseBody body;

    private GetWsCustomizedChO2OResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWsCustomizedChO2OResponse create() {
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
    public GetWsCustomizedChO2OResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWsCustomizedChO2OResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWsCustomizedChO2OResponseBody body);

        @Override
        GetWsCustomizedChO2OResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWsCustomizedChO2OResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWsCustomizedChO2OResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWsCustomizedChO2OResponse response) {
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
        public Builder body(GetWsCustomizedChO2OResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWsCustomizedChO2OResponse build() {
            return new GetWsCustomizedChO2OResponse(this);
        } 

    } 

}
