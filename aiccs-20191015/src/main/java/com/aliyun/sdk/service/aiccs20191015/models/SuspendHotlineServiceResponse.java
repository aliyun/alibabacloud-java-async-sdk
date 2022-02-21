// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendHotlineServiceResponse} extends {@link TeaModel}
 *
 * <p>SuspendHotlineServiceResponse</p>
 */
public class SuspendHotlineServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendHotlineServiceResponseBody body;

    private SuspendHotlineServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendHotlineServiceResponse create() {
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
    public SuspendHotlineServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendHotlineServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendHotlineServiceResponseBody body);

        @Override
        SuspendHotlineServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendHotlineServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendHotlineServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendHotlineServiceResponse response) {
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
        public Builder body(SuspendHotlineServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendHotlineServiceResponse build() {
            return new SuspendHotlineServiceResponse(this);
        } 

    } 

}
