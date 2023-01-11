// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelStackOperationResponse} extends {@link TeaModel}
 *
 * <p>CancelStackOperationResponse</p>
 */
public class CancelStackOperationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelStackOperationResponseBody body;

    private CancelStackOperationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelStackOperationResponse create() {
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
    public CancelStackOperationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelStackOperationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelStackOperationResponseBody body);

        @Override
        CancelStackOperationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelStackOperationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelStackOperationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelStackOperationResponse response) {
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
        public Builder body(CancelStackOperationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelStackOperationResponse build() {
            return new CancelStackOperationResponse(this);
        } 

    } 

}
