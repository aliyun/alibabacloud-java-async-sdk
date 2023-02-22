// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BtripBillInfoAdjustResponse} extends {@link TeaModel}
 *
 * <p>BtripBillInfoAdjustResponse</p>
 */
public class BtripBillInfoAdjustResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BtripBillInfoAdjustResponseBody body;

    private BtripBillInfoAdjustResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BtripBillInfoAdjustResponse create() {
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
    public BtripBillInfoAdjustResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BtripBillInfoAdjustResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BtripBillInfoAdjustResponseBody body);

        @Override
        BtripBillInfoAdjustResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BtripBillInfoAdjustResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BtripBillInfoAdjustResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BtripBillInfoAdjustResponse response) {
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
        public Builder body(BtripBillInfoAdjustResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BtripBillInfoAdjustResponse build() {
            return new BtripBillInfoAdjustResponse(this);
        } 

    } 

}
