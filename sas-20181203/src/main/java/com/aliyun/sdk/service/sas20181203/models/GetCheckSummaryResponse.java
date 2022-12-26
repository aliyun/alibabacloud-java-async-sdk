// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetCheckSummaryResponse</p>
 */
public class GetCheckSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCheckSummaryResponseBody body;

    private GetCheckSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCheckSummaryResponse create() {
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
    public GetCheckSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCheckSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCheckSummaryResponseBody body);

        @Override
        GetCheckSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCheckSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCheckSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCheckSummaryResponse response) {
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
        public Builder body(GetCheckSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCheckSummaryResponse build() {
            return new GetCheckSummaryResponse(this);
        } 

    } 

}
