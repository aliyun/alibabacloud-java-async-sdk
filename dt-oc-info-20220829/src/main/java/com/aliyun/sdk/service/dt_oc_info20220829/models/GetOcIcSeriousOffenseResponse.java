// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcSeriousOffenseResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcSeriousOffenseResponse</p>
 */
public class GetOcIcSeriousOffenseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcSeriousOffenseResponseBody body;

    private GetOcIcSeriousOffenseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcSeriousOffenseResponse create() {
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
    public GetOcIcSeriousOffenseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcSeriousOffenseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcSeriousOffenseResponseBody body);

        @Override
        GetOcIcSeriousOffenseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcSeriousOffenseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcSeriousOffenseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcSeriousOffenseResponse response) {
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
        public Builder body(GetOcIcSeriousOffenseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcSeriousOffenseResponse build() {
            return new GetOcIcSeriousOffenseResponse(this);
        } 

    } 

}
