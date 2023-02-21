// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcAbnormalOperationResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcAbnormalOperationResponse</p>
 */
public class GetOcIcAbnormalOperationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcAbnormalOperationResponseBody body;

    private GetOcIcAbnormalOperationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcAbnormalOperationResponse create() {
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
    public GetOcIcAbnormalOperationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcAbnormalOperationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcAbnormalOperationResponseBody body);

        @Override
        GetOcIcAbnormalOperationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcAbnormalOperationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcAbnormalOperationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcAbnormalOperationResponse response) {
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
        public Builder body(GetOcIcAbnormalOperationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcAbnormalOperationResponse build() {
            return new GetOcIcAbnormalOperationResponse(this);
        } 

    } 

}
