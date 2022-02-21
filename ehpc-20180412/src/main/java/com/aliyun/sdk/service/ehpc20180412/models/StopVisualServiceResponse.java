// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopVisualServiceResponse} extends {@link TeaModel}
 *
 * <p>StopVisualServiceResponse</p>
 */
public class StopVisualServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopVisualServiceResponseBody body;

    private StopVisualServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopVisualServiceResponse create() {
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
    public StopVisualServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopVisualServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopVisualServiceResponseBody body);

        @Override
        StopVisualServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopVisualServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopVisualServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopVisualServiceResponse response) {
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
        public Builder body(StopVisualServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopVisualServiceResponse build() {
            return new StopVisualServiceResponse(this);
        } 

    } 

}
