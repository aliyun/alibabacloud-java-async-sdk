// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditZeroCreditShutdownResponse} extends {@link TeaModel}
 *
 * <p>EditZeroCreditShutdownResponse</p>
 */
public class EditZeroCreditShutdownResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditZeroCreditShutdownResponseBody body;

    private EditZeroCreditShutdownResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditZeroCreditShutdownResponse create() {
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
    public EditZeroCreditShutdownResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditZeroCreditShutdownResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditZeroCreditShutdownResponseBody body);

        @Override
        EditZeroCreditShutdownResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditZeroCreditShutdownResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditZeroCreditShutdownResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditZeroCreditShutdownResponse response) {
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
        public Builder body(EditZeroCreditShutdownResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditZeroCreditShutdownResponse build() {
            return new EditZeroCreditShutdownResponse(this);
        } 

    } 

}
