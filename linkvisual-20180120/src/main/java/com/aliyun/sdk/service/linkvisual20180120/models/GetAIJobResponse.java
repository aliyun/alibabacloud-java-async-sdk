// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIJobResponse} extends {@link TeaModel}
 *
 * <p>GetAIJobResponse</p>
 */
public class GetAIJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAIJobResponseBody body;

    private GetAIJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAIJobResponse create() {
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
    public GetAIJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAIJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAIJobResponseBody body);

        @Override
        GetAIJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAIJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAIJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAIJobResponse response) {
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
        public Builder body(GetAIJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAIJobResponse build() {
            return new GetAIJobResponse(this);
        } 

    } 

}
