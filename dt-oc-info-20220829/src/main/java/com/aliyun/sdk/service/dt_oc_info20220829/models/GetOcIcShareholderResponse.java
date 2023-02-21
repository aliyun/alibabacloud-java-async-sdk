// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcShareholderResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcShareholderResponse</p>
 */
public class GetOcIcShareholderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcShareholderResponseBody body;

    private GetOcIcShareholderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcShareholderResponse create() {
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
    public GetOcIcShareholderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcShareholderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcShareholderResponseBody body);

        @Override
        GetOcIcShareholderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcShareholderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcShareholderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcShareholderResponse response) {
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
        public Builder body(GetOcIcShareholderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcShareholderResponse build() {
            return new GetOcIcShareholderResponse(this);
        } 

    } 

}
