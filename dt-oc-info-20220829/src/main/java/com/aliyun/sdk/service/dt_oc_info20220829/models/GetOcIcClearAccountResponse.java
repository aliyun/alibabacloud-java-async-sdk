// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcClearAccountResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcClearAccountResponse</p>
 */
public class GetOcIcClearAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcClearAccountResponseBody body;

    private GetOcIcClearAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcClearAccountResponse create() {
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
    public GetOcIcClearAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcClearAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcClearAccountResponseBody body);

        @Override
        GetOcIcClearAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcClearAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcClearAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcClearAccountResponse response) {
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
        public Builder body(GetOcIcClearAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcClearAccountResponse build() {
            return new GetOcIcClearAccountResponse(this);
        } 

    } 

}
