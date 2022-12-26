// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AdvanceSecurityEventOperationsResponse} extends {@link TeaModel}
 *
 * <p>AdvanceSecurityEventOperationsResponse</p>
 */
public class AdvanceSecurityEventOperationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AdvanceSecurityEventOperationsResponseBody body;

    private AdvanceSecurityEventOperationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AdvanceSecurityEventOperationsResponse create() {
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
    public AdvanceSecurityEventOperationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AdvanceSecurityEventOperationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AdvanceSecurityEventOperationsResponseBody body);

        @Override
        AdvanceSecurityEventOperationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AdvanceSecurityEventOperationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AdvanceSecurityEventOperationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AdvanceSecurityEventOperationsResponse response) {
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
        public Builder body(AdvanceSecurityEventOperationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AdvanceSecurityEventOperationsResponse build() {
            return new AdvanceSecurityEventOperationsResponse(this);
        } 

    } 

}
