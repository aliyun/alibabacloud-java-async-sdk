// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLaunchTemplateVersionResponse} extends {@link TeaModel}
 *
 * <p>DeleteLaunchTemplateVersionResponse</p>
 */
public class DeleteLaunchTemplateVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLaunchTemplateVersionResponseBody body;

    private DeleteLaunchTemplateVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLaunchTemplateVersionResponse create() {
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
    public DeleteLaunchTemplateVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLaunchTemplateVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLaunchTemplateVersionResponseBody body);

        @Override
        DeleteLaunchTemplateVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLaunchTemplateVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLaunchTemplateVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLaunchTemplateVersionResponse response) {
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
        public Builder body(DeleteLaunchTemplateVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLaunchTemplateVersionResponse build() {
            return new DeleteLaunchTemplateVersionResponse(this);
        } 

    } 

}
