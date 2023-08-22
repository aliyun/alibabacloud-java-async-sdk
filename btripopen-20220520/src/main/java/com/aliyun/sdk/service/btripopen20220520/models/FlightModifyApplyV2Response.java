// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightModifyApplyV2Response} extends {@link TeaModel}
 *
 * <p>FlightModifyApplyV2Response</p>
 */
public class FlightModifyApplyV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightModifyApplyV2ResponseBody body;

    private FlightModifyApplyV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightModifyApplyV2Response create() {
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
    public FlightModifyApplyV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightModifyApplyV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightModifyApplyV2ResponseBody body);

        @Override
        FlightModifyApplyV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightModifyApplyV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightModifyApplyV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightModifyApplyV2Response response) {
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
        public Builder body(FlightModifyApplyV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightModifyApplyV2Response build() {
            return new FlightModifyApplyV2Response(this);
        } 

    } 

}
