// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperationSuspEventsResponse} extends {@link TeaModel}
 *
 * <p>OperationSuspEventsResponse</p>
 */
public class OperationSuspEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperationSuspEventsResponseBody body;

    private OperationSuspEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperationSuspEventsResponse create() {
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
    public OperationSuspEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperationSuspEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperationSuspEventsResponseBody body);

        @Override
        OperationSuspEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperationSuspEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperationSuspEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperationSuspEventsResponse response) {
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
        public Builder body(OperationSuspEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperationSuspEventsResponse build() {
            return new OperationSuspEventsResponse(this);
        } 

    } 

}
