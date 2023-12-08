// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndAnalyzeNetworkPathResponse} extends {@link TeaModel}
 *
 * <p>CreateAndAnalyzeNetworkPathResponse</p>
 */
public class CreateAndAnalyzeNetworkPathResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAndAnalyzeNetworkPathResponseBody body;

    private CreateAndAnalyzeNetworkPathResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAndAnalyzeNetworkPathResponse create() {
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
    public CreateAndAnalyzeNetworkPathResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAndAnalyzeNetworkPathResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAndAnalyzeNetworkPathResponseBody body);

        @Override
        CreateAndAnalyzeNetworkPathResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAndAnalyzeNetworkPathResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAndAnalyzeNetworkPathResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAndAnalyzeNetworkPathResponse response) {
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
        public Builder body(CreateAndAnalyzeNetworkPathResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAndAnalyzeNetworkPathResponse build() {
            return new CreateAndAnalyzeNetworkPathResponse(this);
        } 

    } 

}
