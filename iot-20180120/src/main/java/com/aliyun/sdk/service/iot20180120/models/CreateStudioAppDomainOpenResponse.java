// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStudioAppDomainOpenResponse} extends {@link TeaModel}
 *
 * <p>CreateStudioAppDomainOpenResponse</p>
 */
public class CreateStudioAppDomainOpenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateStudioAppDomainOpenResponseBody body;

    private CreateStudioAppDomainOpenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateStudioAppDomainOpenResponse create() {
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
    public CreateStudioAppDomainOpenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateStudioAppDomainOpenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateStudioAppDomainOpenResponseBody body);

        @Override
        CreateStudioAppDomainOpenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateStudioAppDomainOpenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateStudioAppDomainOpenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateStudioAppDomainOpenResponse response) {
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
        public Builder body(CreateStudioAppDomainOpenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateStudioAppDomainOpenResponse build() {
            return new CreateStudioAppDomainOpenResponse(this);
        } 

    } 

}
