// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeploymentSetResponse} extends {@link TeaModel}
 *
 * <p>DeleteDeploymentSetResponse</p>
 */
public class DeleteDeploymentSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDeploymentSetResponseBody body;

    private DeleteDeploymentSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDeploymentSetResponse create() {
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
    public DeleteDeploymentSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDeploymentSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDeploymentSetResponseBody body);

        @Override
        DeleteDeploymentSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDeploymentSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDeploymentSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDeploymentSetResponse response) {
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
        public Builder body(DeleteDeploymentSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDeploymentSetResponse build() {
            return new DeleteDeploymentSetResponse(this);
        } 

    } 

}
