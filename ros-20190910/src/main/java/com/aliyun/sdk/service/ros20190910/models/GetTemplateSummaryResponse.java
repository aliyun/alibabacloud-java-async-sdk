// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetTemplateSummaryResponse</p>
 */
public class GetTemplateSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTemplateSummaryResponseBody body;

    private GetTemplateSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTemplateSummaryResponse create() {
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
    public GetTemplateSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTemplateSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTemplateSummaryResponseBody body);

        @Override
        GetTemplateSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTemplateSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTemplateSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTemplateSummaryResponse response) {
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
        public Builder body(GetTemplateSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTemplateSummaryResponse build() {
            return new GetTemplateSummaryResponse(this);
        } 

    } 

}
