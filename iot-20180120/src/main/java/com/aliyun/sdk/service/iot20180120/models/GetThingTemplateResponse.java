// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetThingTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetThingTemplateResponse</p>
 */
public class GetThingTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetThingTemplateResponseBody body;

    private GetThingTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetThingTemplateResponse create() {
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
    public GetThingTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetThingTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetThingTemplateResponseBody body);

        @Override
        GetThingTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetThingTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetThingTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetThingTemplateResponse response) {
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
        public Builder body(GetThingTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetThingTemplateResponse build() {
            return new GetThingTemplateResponse(this);
        } 

    } 

}
