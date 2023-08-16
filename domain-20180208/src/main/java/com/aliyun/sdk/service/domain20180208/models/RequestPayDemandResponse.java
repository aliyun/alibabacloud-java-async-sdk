// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestPayDemandResponse} extends {@link TeaModel}
 *
 * <p>RequestPayDemandResponse</p>
 */
public class RequestPayDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RequestPayDemandResponseBody body;

    private RequestPayDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RequestPayDemandResponse create() {
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
    public RequestPayDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RequestPayDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RequestPayDemandResponseBody body);

        @Override
        RequestPayDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RequestPayDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RequestPayDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RequestPayDemandResponse response) {
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
        public Builder body(RequestPayDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RequestPayDemandResponse build() {
            return new RequestPayDemandResponse(this);
        } 

    } 

}
