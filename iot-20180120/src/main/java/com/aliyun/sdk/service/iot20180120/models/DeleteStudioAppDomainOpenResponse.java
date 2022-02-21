// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStudioAppDomainOpenResponse} extends {@link TeaModel}
 *
 * <p>DeleteStudioAppDomainOpenResponse</p>
 */
public class DeleteStudioAppDomainOpenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteStudioAppDomainOpenResponseBody body;

    private DeleteStudioAppDomainOpenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteStudioAppDomainOpenResponse create() {
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
    public DeleteStudioAppDomainOpenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteStudioAppDomainOpenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteStudioAppDomainOpenResponseBody body);

        @Override
        DeleteStudioAppDomainOpenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteStudioAppDomainOpenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteStudioAppDomainOpenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteStudioAppDomainOpenResponse response) {
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
        public Builder body(DeleteStudioAppDomainOpenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteStudioAppDomainOpenResponse build() {
            return new DeleteStudioAppDomainOpenResponse(this);
        } 

    } 

}
