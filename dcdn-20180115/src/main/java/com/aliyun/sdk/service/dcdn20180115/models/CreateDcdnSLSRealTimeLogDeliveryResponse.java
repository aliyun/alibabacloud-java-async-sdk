// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnSLSRealTimeLogDeliveryResponse} extends {@link TeaModel}
 *
 * <p>CreateDcdnSLSRealTimeLogDeliveryResponse</p>
 */
public class CreateDcdnSLSRealTimeLogDeliveryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDcdnSLSRealTimeLogDeliveryResponseBody body;

    private CreateDcdnSLSRealTimeLogDeliveryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDcdnSLSRealTimeLogDeliveryResponse create() {
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
    public CreateDcdnSLSRealTimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDcdnSLSRealTimeLogDeliveryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDcdnSLSRealTimeLogDeliveryResponseBody body);

        @Override
        CreateDcdnSLSRealTimeLogDeliveryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDcdnSLSRealTimeLogDeliveryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDcdnSLSRealTimeLogDeliveryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDcdnSLSRealTimeLogDeliveryResponse response) {
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
        public Builder body(CreateDcdnSLSRealTimeLogDeliveryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDcdnSLSRealTimeLogDeliveryResponse build() {
            return new CreateDcdnSLSRealTimeLogDeliveryResponse(this);
        } 

    } 

}
