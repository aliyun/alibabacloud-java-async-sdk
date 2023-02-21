// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIpWorksCopyrightResponse} extends {@link TeaModel}
 *
 * <p>GetOcIpWorksCopyrightResponse</p>
 */
public class GetOcIpWorksCopyrightResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIpWorksCopyrightResponseBody body;

    private GetOcIpWorksCopyrightResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIpWorksCopyrightResponse create() {
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
    public GetOcIpWorksCopyrightResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIpWorksCopyrightResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIpWorksCopyrightResponseBody body);

        @Override
        GetOcIpWorksCopyrightResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIpWorksCopyrightResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIpWorksCopyrightResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIpWorksCopyrightResponse response) {
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
        public Builder body(GetOcIpWorksCopyrightResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIpWorksCopyrightResponse build() {
            return new GetOcIpWorksCopyrightResponse(this);
        } 

    } 

}
