// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecordFailureResponse} extends {@link TeaModel}
 *
 * <p>RecordFailureResponse</p>
 */
public class RecordFailureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecordFailureResponseBody body;

    private RecordFailureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecordFailureResponse create() {
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
    public RecordFailureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecordFailureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecordFailureResponseBody body);

        @Override
        RecordFailureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecordFailureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecordFailureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecordFailureResponse response) {
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
        public Builder body(RecordFailureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecordFailureResponse build() {
            return new RecordFailureResponse(this);
        } 

    } 

}
