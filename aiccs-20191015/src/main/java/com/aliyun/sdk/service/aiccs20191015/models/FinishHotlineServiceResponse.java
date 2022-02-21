// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FinishHotlineServiceResponse} extends {@link TeaModel}
 *
 * <p>FinishHotlineServiceResponse</p>
 */
public class FinishHotlineServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FinishHotlineServiceResponseBody body;

    private FinishHotlineServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FinishHotlineServiceResponse create() {
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
    public FinishHotlineServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FinishHotlineServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FinishHotlineServiceResponseBody body);

        @Override
        FinishHotlineServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FinishHotlineServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FinishHotlineServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FinishHotlineServiceResponse response) {
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
        public Builder body(FinishHotlineServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FinishHotlineServiceResponse build() {
            return new FinishHotlineServiceResponse(this);
        } 

    } 

}
