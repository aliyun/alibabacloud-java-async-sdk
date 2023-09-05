// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDomainAcceleratorRelationResponse} extends {@link TeaModel}
 *
 * <p>DeleteDomainAcceleratorRelationResponse</p>
 */
public class DeleteDomainAcceleratorRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDomainAcceleratorRelationResponseBody body;

    private DeleteDomainAcceleratorRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDomainAcceleratorRelationResponse create() {
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
    public DeleteDomainAcceleratorRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDomainAcceleratorRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDomainAcceleratorRelationResponseBody body);

        @Override
        DeleteDomainAcceleratorRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDomainAcceleratorRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDomainAcceleratorRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDomainAcceleratorRelationResponse response) {
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
        public Builder body(DeleteDomainAcceleratorRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDomainAcceleratorRelationResponse build() {
            return new DeleteDomainAcceleratorRelationResponse(this);
        } 

    } 

}
