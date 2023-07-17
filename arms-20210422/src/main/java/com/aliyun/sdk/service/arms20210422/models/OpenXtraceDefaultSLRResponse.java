// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenXtraceDefaultSLRResponse} extends {@link TeaModel}
 *
 * <p>OpenXtraceDefaultSLRResponse</p>
 */
public class OpenXtraceDefaultSLRResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenXtraceDefaultSLRResponseBody body;

    private OpenXtraceDefaultSLRResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenXtraceDefaultSLRResponse create() {
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
    public OpenXtraceDefaultSLRResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenXtraceDefaultSLRResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenXtraceDefaultSLRResponseBody body);

        @Override
        OpenXtraceDefaultSLRResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenXtraceDefaultSLRResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenXtraceDefaultSLRResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenXtraceDefaultSLRResponse response) {
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
        public Builder body(OpenXtraceDefaultSLRResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenXtraceDefaultSLRResponse build() {
            return new OpenXtraceDefaultSLRResponse(this);
        } 

    } 

}
