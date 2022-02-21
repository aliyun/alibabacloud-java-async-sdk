// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveAccountResponse} extends {@link TeaModel}
 *
 * <p>MoveAccountResponse</p>
 */
public class MoveAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MoveAccountResponseBody body;

    private MoveAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MoveAccountResponse create() {
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
    public MoveAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MoveAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MoveAccountResponseBody body);

        @Override
        MoveAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MoveAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MoveAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MoveAccountResponse response) {
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
        public Builder body(MoveAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MoveAccountResponse build() {
            return new MoveAccountResponse(this);
        } 

    } 

}
