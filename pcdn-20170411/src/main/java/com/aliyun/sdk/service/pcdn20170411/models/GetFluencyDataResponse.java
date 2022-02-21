// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFluencyDataResponse} extends {@link TeaModel}
 *
 * <p>GetFluencyDataResponse</p>
 */
public class GetFluencyDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFluencyDataResponseBody body;

    private GetFluencyDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFluencyDataResponse create() {
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
    public GetFluencyDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFluencyDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFluencyDataResponseBody body);

        @Override
        GetFluencyDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFluencyDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFluencyDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFluencyDataResponse response) {
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
        public Builder body(GetFluencyDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFluencyDataResponse build() {
            return new GetFluencyDataResponse(this);
        } 

    } 

}
