// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSummaryChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetSummaryChEcomResponse</p>
 */
public class GetSummaryChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSummaryChEcomResponseBody body;

    private GetSummaryChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSummaryChEcomResponse create() {
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
    public GetSummaryChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSummaryChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSummaryChEcomResponseBody body);

        @Override
        GetSummaryChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSummaryChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSummaryChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSummaryChEcomResponse response) {
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
        public Builder body(GetSummaryChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSummaryChEcomResponse build() {
            return new GetSummaryChEcomResponse(this);
        } 

    } 

}
