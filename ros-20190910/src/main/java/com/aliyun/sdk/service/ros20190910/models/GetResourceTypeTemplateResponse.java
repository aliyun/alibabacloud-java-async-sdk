// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetResourceTypeTemplateResponse</p>
 */
public class GetResourceTypeTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceTypeTemplateResponseBody body;

    private GetResourceTypeTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceTypeTemplateResponse create() {
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
    public GetResourceTypeTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceTypeTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceTypeTemplateResponseBody body);

        @Override
        GetResourceTypeTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceTypeTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceTypeTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceTypeTemplateResponse response) {
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
        public Builder body(GetResourceTypeTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceTypeTemplateResponse build() {
            return new GetResourceTypeTemplateResponse(this);
        } 

    } 

}
