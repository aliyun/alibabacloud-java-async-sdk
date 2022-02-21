// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAccountResponse} extends {@link TeaModel}
 *
 * <p>UpdateAccountResponse</p>
 */
public class UpdateAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAccountResponseBody body;

    private UpdateAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAccountResponse create() {
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
    public UpdateAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAccountResponseBody body);

        @Override
        UpdateAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAccountResponse response) {
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
        public Builder body(UpdateAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAccountResponse build() {
            return new UpdateAccountResponse(this);
        } 

    } 

}
