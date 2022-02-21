// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeChangeResponse} extends {@link TeaModel}
 *
 * <p>ResumeChangeResponse</p>
 */
public class ResumeChangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeChangeResponseBody body;

    private ResumeChangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeChangeResponse create() {
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
    public ResumeChangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeChangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeChangeResponseBody body);

        @Override
        ResumeChangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeChangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeChangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeChangeResponse response) {
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
        public Builder body(ResumeChangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeChangeResponse build() {
            return new ResumeChangeResponse(this);
        } 

    } 

}
