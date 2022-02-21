// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCityCodeResponse} extends {@link TeaModel}
 *
 * <p>GetCityCodeResponse</p>
 */
public class GetCityCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCityCodeResponseBody body;

    private GetCityCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCityCodeResponse create() {
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
    public GetCityCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCityCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCityCodeResponseBody body);

        @Override
        GetCityCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCityCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCityCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCityCodeResponse response) {
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
        public Builder body(GetCityCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCityCodeResponse build() {
            return new GetCityCodeResponse(this);
        } 

    } 

}
