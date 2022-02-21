// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateClusterTemplateResponse</p>
 */
public class CreateClusterTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateClusterTemplateResponseBody body;

    private CreateClusterTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateClusterTemplateResponse create() {
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
    public CreateClusterTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateClusterTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateClusterTemplateResponseBody body);

        @Override
        CreateClusterTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateClusterTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateClusterTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateClusterTemplateResponse response) {
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
        public Builder body(CreateClusterTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateClusterTemplateResponse build() {
            return new CreateClusterTemplateResponse(this);
        } 

    } 

}
