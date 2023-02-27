// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetrieveCallResponse} extends {@link TeaModel}
 *
 * <p>RetrieveCallResponse</p>
 */
public class RetrieveCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetrieveCallResponseBody body;

    private RetrieveCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetrieveCallResponse create() {
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
    public RetrieveCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetrieveCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetrieveCallResponseBody body);

        @Override
        RetrieveCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetrieveCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetrieveCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetrieveCallResponse response) {
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
        public Builder body(RetrieveCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetrieveCallResponse build() {
            return new RetrieveCallResponse(this);
        } 

    } 

}
