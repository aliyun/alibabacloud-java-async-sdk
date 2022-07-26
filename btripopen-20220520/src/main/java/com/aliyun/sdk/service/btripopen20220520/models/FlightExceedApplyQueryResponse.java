// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightExceedApplyQueryResponse} extends {@link TeaModel}
 *
 * <p>FlightExceedApplyQueryResponse</p>
 */
public class FlightExceedApplyQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightExceedApplyQueryResponseBody body;

    private FlightExceedApplyQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightExceedApplyQueryResponse create() {
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
    public FlightExceedApplyQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightExceedApplyQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightExceedApplyQueryResponseBody body);

        @Override
        FlightExceedApplyQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightExceedApplyQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightExceedApplyQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightExceedApplyQueryResponse response) {
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
        public Builder body(FlightExceedApplyQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightExceedApplyQueryResponse build() {
            return new FlightExceedApplyQueryResponse(this);
        } 

    } 

}
