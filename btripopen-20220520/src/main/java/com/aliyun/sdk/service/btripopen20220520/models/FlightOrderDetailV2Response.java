// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightOrderDetailV2Response} extends {@link TeaModel}
 *
 * <p>FlightOrderDetailV2Response</p>
 */
public class FlightOrderDetailV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightOrderDetailV2ResponseBody body;

    private FlightOrderDetailV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightOrderDetailV2Response create() {
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
    public FlightOrderDetailV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightOrderDetailV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightOrderDetailV2ResponseBody body);

        @Override
        FlightOrderDetailV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightOrderDetailV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightOrderDetailV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightOrderDetailV2Response response) {
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
        public Builder body(FlightOrderDetailV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightOrderDetailV2Response build() {
            return new FlightOrderDetailV2Response(this);
        } 

    } 

}
