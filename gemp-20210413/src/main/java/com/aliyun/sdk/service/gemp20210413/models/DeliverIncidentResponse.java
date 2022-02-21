// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeliverIncidentResponse} extends {@link TeaModel}
 *
 * <p>DeliverIncidentResponse</p>
 */
public class DeliverIncidentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeliverIncidentResponseBody body;

    private DeliverIncidentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeliverIncidentResponse create() {
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
    public DeliverIncidentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeliverIncidentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeliverIncidentResponseBody body);

        @Override
        DeliverIncidentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeliverIncidentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeliverIncidentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeliverIncidentResponse response) {
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
        public Builder body(DeliverIncidentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeliverIncidentResponse build() {
            return new DeliverIncidentResponse(this);
        } 

    } 

}
