// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWeChGeneralResponse} extends {@link TeaModel}
 *
 * <p>GetWeChGeneralResponse</p>
 */
public class GetWeChGeneralResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWeChGeneralResponseBody body;

    private GetWeChGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWeChGeneralResponse create() {
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
    public GetWeChGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWeChGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWeChGeneralResponseBody body);

        @Override
        GetWeChGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWeChGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWeChGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWeChGeneralResponse response) {
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
        public Builder body(GetWeChGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWeChGeneralResponse build() {
            return new GetWeChGeneralResponse(this);
        } 

    } 

}
