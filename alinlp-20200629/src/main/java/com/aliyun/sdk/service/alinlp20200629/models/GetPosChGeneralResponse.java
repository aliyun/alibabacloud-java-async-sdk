// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPosChGeneralResponse} extends {@link TeaModel}
 *
 * <p>GetPosChGeneralResponse</p>
 */
public class GetPosChGeneralResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPosChGeneralResponseBody body;

    private GetPosChGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPosChGeneralResponse create() {
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
    public GetPosChGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPosChGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPosChGeneralResponseBody body);

        @Override
        GetPosChGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPosChGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPosChGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPosChGeneralResponse response) {
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
        public Builder body(GetPosChGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPosChGeneralResponse build() {
            return new GetPosChGeneralResponse(this);
        } 

    } 

}
