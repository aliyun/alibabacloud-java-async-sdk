// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditNewBuyStatusResponse} extends {@link TeaModel}
 *
 * <p>EditNewBuyStatusResponse</p>
 */
public class EditNewBuyStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditNewBuyStatusResponseBody body;

    private EditNewBuyStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditNewBuyStatusResponse create() {
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
    public EditNewBuyStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditNewBuyStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditNewBuyStatusResponseBody body);

        @Override
        EditNewBuyStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditNewBuyStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditNewBuyStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditNewBuyStatusResponse response) {
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
        public Builder body(EditNewBuyStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditNewBuyStatusResponse build() {
            return new EditNewBuyStatusResponse(this);
        } 

    } 

}
