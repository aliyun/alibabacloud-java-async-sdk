// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTcChGeneralResponse} extends {@link TeaModel}
 *
 * <p>GetTcChGeneralResponse</p>
 */
public class GetTcChGeneralResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTcChGeneralResponseBody body;

    private GetTcChGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTcChGeneralResponse create() {
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
    public GetTcChGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTcChGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTcChGeneralResponseBody body);

        @Override
        GetTcChGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTcChGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTcChGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTcChGeneralResponse response) {
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
        public Builder body(GetTcChGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTcChGeneralResponse build() {
            return new GetTcChGeneralResponse(this);
        } 

    } 

}
