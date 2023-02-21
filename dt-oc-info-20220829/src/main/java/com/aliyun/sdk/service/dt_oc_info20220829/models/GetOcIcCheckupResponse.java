// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcCheckupResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcCheckupResponse</p>
 */
public class GetOcIcCheckupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcCheckupResponseBody body;

    private GetOcIcCheckupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcCheckupResponse create() {
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
    public GetOcIcCheckupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcCheckupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcCheckupResponseBody body);

        @Override
        GetOcIcCheckupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcCheckupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcCheckupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcCheckupResponse response) {
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
        public Builder body(GetOcIcCheckupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcCheckupResponse build() {
            return new GetOcIcCheckupResponse(this);
        } 

    } 

}
