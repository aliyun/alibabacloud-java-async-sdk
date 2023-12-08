// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExecutionTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetExecutionTemplateResponse</p>
 */
public class GetExecutionTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetExecutionTemplateResponseBody body;

    private GetExecutionTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetExecutionTemplateResponse create() {
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
    public GetExecutionTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetExecutionTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetExecutionTemplateResponseBody body);

        @Override
        GetExecutionTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetExecutionTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetExecutionTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetExecutionTemplateResponse response) {
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
        public Builder body(GetExecutionTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetExecutionTemplateResponse build() {
            return new GetExecutionTemplateResponse(this);
        } 

    } 

}
