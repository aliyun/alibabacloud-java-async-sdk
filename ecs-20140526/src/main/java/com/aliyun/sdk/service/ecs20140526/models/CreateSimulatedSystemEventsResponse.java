// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimulatedSystemEventsResponse} extends {@link TeaModel}
 *
 * <p>CreateSimulatedSystemEventsResponse</p>
 */
public class CreateSimulatedSystemEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSimulatedSystemEventsResponseBody body;

    private CreateSimulatedSystemEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSimulatedSystemEventsResponse create() {
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
    public CreateSimulatedSystemEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSimulatedSystemEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSimulatedSystemEventsResponseBody body);

        @Override
        CreateSimulatedSystemEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSimulatedSystemEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSimulatedSystemEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSimulatedSystemEventsResponse response) {
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
        public Builder body(CreateSimulatedSystemEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSimulatedSystemEventsResponse build() {
            return new CreateSimulatedSystemEventsResponse(this);
        } 

    } 

}
