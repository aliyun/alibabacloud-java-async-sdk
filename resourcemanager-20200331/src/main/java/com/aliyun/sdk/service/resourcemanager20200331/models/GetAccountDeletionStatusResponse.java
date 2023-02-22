// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountDeletionStatusResponse} extends {@link TeaModel}
 *
 * <p>GetAccountDeletionStatusResponse</p>
 */
public class GetAccountDeletionStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccountDeletionStatusResponseBody body;

    private GetAccountDeletionStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccountDeletionStatusResponse create() {
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
    public GetAccountDeletionStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccountDeletionStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccountDeletionStatusResponseBody body);

        @Override
        GetAccountDeletionStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccountDeletionStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccountDeletionStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccountDeletionStatusResponse response) {
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
        public Builder body(GetAccountDeletionStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccountDeletionStatusResponse build() {
            return new GetAccountDeletionStatusResponse(this);
        } 

    } 

}
