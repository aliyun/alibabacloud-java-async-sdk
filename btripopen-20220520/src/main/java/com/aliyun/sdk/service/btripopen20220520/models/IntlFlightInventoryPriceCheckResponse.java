// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IntlFlightInventoryPriceCheckResponse} extends {@link TeaModel}
 *
 * <p>IntlFlightInventoryPriceCheckResponse</p>
 */
public class IntlFlightInventoryPriceCheckResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private IntlFlightInventoryPriceCheckResponseBody body;

    private IntlFlightInventoryPriceCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static IntlFlightInventoryPriceCheckResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public IntlFlightInventoryPriceCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IntlFlightInventoryPriceCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(IntlFlightInventoryPriceCheckResponseBody body);

        @Override
        IntlFlightInventoryPriceCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IntlFlightInventoryPriceCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private IntlFlightInventoryPriceCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IntlFlightInventoryPriceCheckResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(IntlFlightInventoryPriceCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IntlFlightInventoryPriceCheckResponse build() {
            return new IntlFlightInventoryPriceCheckResponse(this);
        } 

    } 

}
