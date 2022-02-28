// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopStackGroupOperationResponse} extends {@link TeaModel}
 *
 * <p>StopStackGroupOperationResponse</p>
 */
public class StopStackGroupOperationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopStackGroupOperationResponseBody body;

    private StopStackGroupOperationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopStackGroupOperationResponse create() {
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
    public StopStackGroupOperationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopStackGroupOperationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopStackGroupOperationResponseBody body);

        @Override
        StopStackGroupOperationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopStackGroupOperationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopStackGroupOperationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopStackGroupOperationResponse response) {
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
        public Builder body(StopStackGroupOperationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopStackGroupOperationResponse build() {
            return new StopStackGroupOperationResponse(this);
        } 

    } 

}
