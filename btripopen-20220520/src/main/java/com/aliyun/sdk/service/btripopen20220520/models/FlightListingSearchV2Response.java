// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightListingSearchV2Response} extends {@link TeaModel}
 *
 * <p>FlightListingSearchV2Response</p>
 */
public class FlightListingSearchV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightListingSearchV2ResponseBody body;

    private FlightListingSearchV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightListingSearchV2Response create() {
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
    public FlightListingSearchV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightListingSearchV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightListingSearchV2ResponseBody body);

        @Override
        FlightListingSearchV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightListingSearchV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightListingSearchV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightListingSearchV2Response response) {
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
        public Builder body(FlightListingSearchV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightListingSearchV2Response build() {
            return new FlightListingSearchV2Response(this);
        } 

    } 

}
