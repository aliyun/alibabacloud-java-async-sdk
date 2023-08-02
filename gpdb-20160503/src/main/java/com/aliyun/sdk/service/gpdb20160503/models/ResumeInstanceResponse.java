// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeInstanceResponse} extends {@link TeaModel}
 *
 * <p>ResumeInstanceResponse</p>
 */
public class ResumeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeInstanceResponseBody body;

    private ResumeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeInstanceResponse create() {
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
    public ResumeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeInstanceResponseBody body);

        @Override
        ResumeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeInstanceResponse response) {
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
        public Builder body(ResumeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeInstanceResponse build() {
            return new ResumeInstanceResponse(this);
        } 

    } 

}
