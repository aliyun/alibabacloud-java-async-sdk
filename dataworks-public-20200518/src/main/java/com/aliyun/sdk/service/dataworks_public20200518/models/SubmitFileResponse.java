// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitFileResponse} extends {@link TeaModel}
 *
 * <p>SubmitFileResponse</p>
 */
public class SubmitFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitFileResponseBody body;

    private SubmitFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitFileResponse create() {
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
    public SubmitFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitFileResponseBody body);

        @Override
        SubmitFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitFileResponse response) {
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
        public Builder body(SubmitFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitFileResponse build() {
            return new SubmitFileResponse(this);
        } 

    } 

}
