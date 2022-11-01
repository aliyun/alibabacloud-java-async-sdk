// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOSSInfoForCardTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetOSSInfoForCardTemplateResponse</p>
 */
public class GetOSSInfoForCardTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOSSInfoForCardTemplateResponseBody body;

    private GetOSSInfoForCardTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOSSInfoForCardTemplateResponse create() {
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
    public GetOSSInfoForCardTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOSSInfoForCardTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOSSInfoForCardTemplateResponseBody body);

        @Override
        GetOSSInfoForCardTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOSSInfoForCardTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOSSInfoForCardTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOSSInfoForCardTemplateResponse response) {
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
        public Builder body(GetOSSInfoForCardTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOSSInfoForCardTemplateResponse build() {
            return new GetOSSInfoForCardTemplateResponse(this);
        } 

    } 

}
