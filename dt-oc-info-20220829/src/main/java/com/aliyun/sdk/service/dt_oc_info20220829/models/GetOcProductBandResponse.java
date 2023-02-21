// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcProductBandResponse} extends {@link TeaModel}
 *
 * <p>GetOcProductBandResponse</p>
 */
public class GetOcProductBandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcProductBandResponseBody body;

    private GetOcProductBandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcProductBandResponse create() {
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
    public GetOcProductBandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcProductBandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcProductBandResponseBody body);

        @Override
        GetOcProductBandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcProductBandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcProductBandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcProductBandResponse response) {
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
        public Builder body(GetOcProductBandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcProductBandResponse build() {
            return new GetOcProductBandResponse(this);
        } 

    } 

}
