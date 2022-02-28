// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetTemplateResponse</p>
 */
public class GetTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTemplateResponseBody body;

    private GetTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTemplateResponse create() {
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
    public GetTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTemplateResponseBody body);

        @Override
        GetTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTemplateResponse response) {
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
        public Builder body(GetTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTemplateResponse build() {
            return new GetTemplateResponse(this);
        } 

    } 

}
