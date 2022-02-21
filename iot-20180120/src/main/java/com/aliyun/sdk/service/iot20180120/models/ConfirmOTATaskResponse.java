// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmOTATaskResponse} extends {@link TeaModel}
 *
 * <p>ConfirmOTATaskResponse</p>
 */
public class ConfirmOTATaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfirmOTATaskResponseBody body;

    private ConfirmOTATaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfirmOTATaskResponse create() {
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
    public ConfirmOTATaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfirmOTATaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfirmOTATaskResponseBody body);

        @Override
        ConfirmOTATaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfirmOTATaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfirmOTATaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfirmOTATaskResponse response) {
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
        public Builder body(ConfirmOTATaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfirmOTATaskResponse build() {
            return new ConfirmOTATaskResponse(this);
        } 

    } 

}
