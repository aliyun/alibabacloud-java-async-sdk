// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEcChGeneralResponse} extends {@link TeaModel}
 *
 * <p>GetEcChGeneralResponse</p>
 */
public class GetEcChGeneralResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEcChGeneralResponseBody body;

    private GetEcChGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEcChGeneralResponse create() {
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
    public GetEcChGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEcChGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEcChGeneralResponseBody body);

        @Override
        GetEcChGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEcChGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEcChGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEcChGeneralResponse response) {
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
        public Builder body(GetEcChGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEcChGeneralResponse build() {
            return new GetEcChGeneralResponse(this);
        } 

    } 

}
