// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLaunchTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateLaunchTemplateResponse</p>
 */
public class CreateLaunchTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLaunchTemplateResponseBody body;

    private CreateLaunchTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLaunchTemplateResponse create() {
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
    public CreateLaunchTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLaunchTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLaunchTemplateResponseBody body);

        @Override
        CreateLaunchTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLaunchTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLaunchTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLaunchTemplateResponse response) {
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
        public Builder body(CreateLaunchTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLaunchTemplateResponse build() {
            return new CreateLaunchTemplateResponse(this);
        } 

    } 

}
