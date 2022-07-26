// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelExceedApplyQueryResponse} extends {@link TeaModel}
 *
 * <p>HotelExceedApplyQueryResponse</p>
 */
public class HotelExceedApplyQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelExceedApplyQueryResponseBody body;

    private HotelExceedApplyQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelExceedApplyQueryResponse create() {
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
    public HotelExceedApplyQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelExceedApplyQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelExceedApplyQueryResponseBody body);

        @Override
        HotelExceedApplyQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelExceedApplyQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelExceedApplyQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelExceedApplyQueryResponse response) {
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
        public Builder body(HotelExceedApplyQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelExceedApplyQueryResponse build() {
            return new HotelExceedApplyQueryResponse(this);
        } 

    } 

}
