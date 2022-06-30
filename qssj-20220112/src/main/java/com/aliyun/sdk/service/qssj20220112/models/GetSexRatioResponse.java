// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSexRatioResponse} extends {@link TeaModel}
 *
 * <p>GetSexRatioResponse</p>
 */
public class GetSexRatioResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSexRatioResponseBody body;

    private GetSexRatioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSexRatioResponse create() {
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
    public GetSexRatioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSexRatioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSexRatioResponseBody body);

        @Override
        GetSexRatioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSexRatioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSexRatioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSexRatioResponse response) {
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
        public Builder body(GetSexRatioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSexRatioResponse build() {
            return new GetSexRatioResponse(this);
        } 

    } 

}
