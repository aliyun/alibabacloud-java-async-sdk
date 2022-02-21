// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddOuterAccountResponse} extends {@link TeaModel}
 *
 * <p>AddOuterAccountResponse</p>
 */
public class AddOuterAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddOuterAccountResponseBody body;

    private AddOuterAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddOuterAccountResponse create() {
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
    public AddOuterAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddOuterAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddOuterAccountResponseBody body);

        @Override
        AddOuterAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddOuterAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddOuterAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddOuterAccountResponse response) {
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
        public Builder body(AddOuterAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddOuterAccountResponse build() {
            return new AddOuterAccountResponse(this);
        } 

    } 

}
