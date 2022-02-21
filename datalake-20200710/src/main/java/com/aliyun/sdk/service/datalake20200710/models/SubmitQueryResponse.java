// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitQueryResponse} extends {@link TeaModel}
 *
 * <p>SubmitQueryResponse</p>
 */
public class SubmitQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitQueryResponseBody body;

    private SubmitQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitQueryResponse create() {
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
    public SubmitQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitQueryResponseBody body);

        @Override
        SubmitQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitQueryResponse response) {
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
        public Builder body(SubmitQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitQueryResponse build() {
            return new SubmitQueryResponse(this);
        } 

    } 

}
