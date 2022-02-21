// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomFieldsByTemplateIdResponse} extends {@link TeaModel}
 *
 * <p>GetCustomFieldsByTemplateIdResponse</p>
 */
public class GetCustomFieldsByTemplateIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCustomFieldsByTemplateIdResponseBody body;

    private GetCustomFieldsByTemplateIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCustomFieldsByTemplateIdResponse create() {
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
    public GetCustomFieldsByTemplateIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCustomFieldsByTemplateIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCustomFieldsByTemplateIdResponseBody body);

        @Override
        GetCustomFieldsByTemplateIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCustomFieldsByTemplateIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCustomFieldsByTemplateIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCustomFieldsByTemplateIdResponse response) {
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
        public Builder body(GetCustomFieldsByTemplateIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCustomFieldsByTemplateIdResponse build() {
            return new GetCustomFieldsByTemplateIdResponse(this);
        } 

    } 

}
