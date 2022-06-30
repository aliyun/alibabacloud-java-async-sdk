// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStoreSalesVolumeTopResponse} extends {@link TeaModel}
 *
 * <p>GetStoreSalesVolumeTopResponse</p>
 */
public class GetStoreSalesVolumeTopResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStoreSalesVolumeTopResponseBody body;

    private GetStoreSalesVolumeTopResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStoreSalesVolumeTopResponse create() {
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
    public GetStoreSalesVolumeTopResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStoreSalesVolumeTopResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStoreSalesVolumeTopResponseBody body);

        @Override
        GetStoreSalesVolumeTopResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStoreSalesVolumeTopResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStoreSalesVolumeTopResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStoreSalesVolumeTopResponse response) {
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
        public Builder body(GetStoreSalesVolumeTopResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStoreSalesVolumeTopResponse build() {
            return new GetStoreSalesVolumeTopResponse(this);
        } 

    } 

}
