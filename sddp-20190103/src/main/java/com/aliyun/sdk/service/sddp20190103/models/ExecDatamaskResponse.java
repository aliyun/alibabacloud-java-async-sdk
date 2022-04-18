// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecDatamaskResponse} extends {@link TeaModel}
 *
 * <p>ExecDatamaskResponse</p>
 */
public class ExecDatamaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecDatamaskResponseBody body;

    private ExecDatamaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecDatamaskResponse create() {
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
    public ExecDatamaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecDatamaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecDatamaskResponseBody body);

        @Override
        ExecDatamaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecDatamaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecDatamaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecDatamaskResponse response) {
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
        public Builder body(ExecDatamaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecDatamaskResponse build() {
            return new ExecDatamaskResponse(this);
        } 

    } 

}
