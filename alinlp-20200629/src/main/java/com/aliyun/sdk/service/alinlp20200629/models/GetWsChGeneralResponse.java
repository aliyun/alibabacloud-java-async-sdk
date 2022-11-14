// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWsChGeneralResponse} extends {@link TeaModel}
 *
 * <p>GetWsChGeneralResponse</p>
 */
public class GetWsChGeneralResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWsChGeneralResponseBody body;

    private GetWsChGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWsChGeneralResponse create() {
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
    public GetWsChGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWsChGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWsChGeneralResponseBody body);

        @Override
        GetWsChGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWsChGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWsChGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWsChGeneralResponse response) {
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
        public Builder body(GetWsChGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWsChGeneralResponse build() {
            return new GetWsChGeneralResponse(this);
        } 

    } 

}
