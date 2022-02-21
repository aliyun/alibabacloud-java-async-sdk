// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitInnerJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitInnerJobResponse</p>
 */
public class SubmitInnerJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitInnerJobResponseBody body;

    private SubmitInnerJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitInnerJobResponse create() {
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
    public SubmitInnerJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitInnerJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitInnerJobResponseBody body);

        @Override
        SubmitInnerJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitInnerJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitInnerJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitInnerJobResponse response) {
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
        public Builder body(SubmitInnerJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitInnerJobResponse build() {
            return new SubmitInnerJobResponse(this);
        } 

    } 

}
