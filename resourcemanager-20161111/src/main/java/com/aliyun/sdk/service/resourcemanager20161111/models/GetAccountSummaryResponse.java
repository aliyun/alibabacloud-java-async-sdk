// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetAccountSummaryResponse</p>
 */
public class GetAccountSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccountSummaryResponseBody body;

    private GetAccountSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccountSummaryResponse create() {
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
    public GetAccountSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccountSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccountSummaryResponseBody body);

        @Override
        GetAccountSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccountSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccountSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccountSummaryResponse response) {
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
        public Builder body(GetAccountSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccountSummaryResponse build() {
            return new GetAccountSummaryResponse(this);
        } 

    } 

}
