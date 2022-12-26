// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCheckResponse} extends {@link TeaModel}
 *
 * <p>SubmitCheckResponse</p>
 */
public class SubmitCheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitCheckResponseBody body;

    private SubmitCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitCheckResponse create() {
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
    public SubmitCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitCheckResponseBody body);

        @Override
        SubmitCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitCheckResponse response) {
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
        public Builder body(SubmitCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitCheckResponse build() {
            return new SubmitCheckResponse(this);
        } 

    } 

}
