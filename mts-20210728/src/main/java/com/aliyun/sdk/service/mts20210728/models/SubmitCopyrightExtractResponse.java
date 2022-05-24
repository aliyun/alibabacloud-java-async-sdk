// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCopyrightExtractResponse} extends {@link TeaModel}
 *
 * <p>SubmitCopyrightExtractResponse</p>
 */
public class SubmitCopyrightExtractResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitCopyrightExtractResponseBody body;

    private SubmitCopyrightExtractResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitCopyrightExtractResponse create() {
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
    public SubmitCopyrightExtractResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitCopyrightExtractResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitCopyrightExtractResponseBody body);

        @Override
        SubmitCopyrightExtractResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitCopyrightExtractResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitCopyrightExtractResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitCopyrightExtractResponse response) {
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
        public Builder body(SubmitCopyrightExtractResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitCopyrightExtractResponse build() {
            return new SubmitCopyrightExtractResponse(this);
        } 

    } 

}
