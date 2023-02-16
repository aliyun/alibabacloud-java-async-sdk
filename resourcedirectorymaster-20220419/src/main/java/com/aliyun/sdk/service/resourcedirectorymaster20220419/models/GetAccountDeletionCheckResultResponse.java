// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountDeletionCheckResultResponse} extends {@link TeaModel}
 *
 * <p>GetAccountDeletionCheckResultResponse</p>
 */
public class GetAccountDeletionCheckResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccountDeletionCheckResultResponseBody body;

    private GetAccountDeletionCheckResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccountDeletionCheckResultResponse create() {
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
    public GetAccountDeletionCheckResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccountDeletionCheckResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccountDeletionCheckResultResponseBody body);

        @Override
        GetAccountDeletionCheckResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccountDeletionCheckResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccountDeletionCheckResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccountDeletionCheckResultResponse response) {
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
        public Builder body(GetAccountDeletionCheckResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccountDeletionCheckResultResponse build() {
            return new GetAccountDeletionCheckResultResponse(this);
        } 

    } 

}
