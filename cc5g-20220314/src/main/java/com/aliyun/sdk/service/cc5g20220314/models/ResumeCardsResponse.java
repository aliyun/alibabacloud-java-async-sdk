// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeCardsResponse} extends {@link TeaModel}
 *
 * <p>ResumeCardsResponse</p>
 */
public class ResumeCardsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeCardsResponseBody body;

    private ResumeCardsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeCardsResponse create() {
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
    public ResumeCardsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeCardsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeCardsResponseBody body);

        @Override
        ResumeCardsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeCardsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeCardsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeCardsResponse response) {
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
        public Builder body(ResumeCardsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeCardsResponse build() {
            return new ResumeCardsResponse(this);
        } 

    } 

}
