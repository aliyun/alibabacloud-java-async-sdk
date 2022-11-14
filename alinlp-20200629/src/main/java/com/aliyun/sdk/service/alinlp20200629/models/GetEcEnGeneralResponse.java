// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEcEnGeneralResponse} extends {@link TeaModel}
 *
 * <p>GetEcEnGeneralResponse</p>
 */
public class GetEcEnGeneralResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEcEnGeneralResponseBody body;

    private GetEcEnGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEcEnGeneralResponse create() {
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
    public GetEcEnGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEcEnGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEcEnGeneralResponseBody body);

        @Override
        GetEcEnGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEcEnGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEcEnGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEcEnGeneralResponse response) {
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
        public Builder body(GetEcEnGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEcEnGeneralResponse build() {
            return new GetEcEnGeneralResponse(this);
        } 

    } 

}
