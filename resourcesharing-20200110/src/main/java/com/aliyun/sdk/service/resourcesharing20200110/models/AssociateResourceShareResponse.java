// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateResourceShareResponse} extends {@link TeaModel}
 *
 * <p>AssociateResourceShareResponse</p>
 */
public class AssociateResourceShareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateResourceShareResponseBody body;

    private AssociateResourceShareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateResourceShareResponse create() {
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
    public AssociateResourceShareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateResourceShareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateResourceShareResponseBody body);

        @Override
        AssociateResourceShareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateResourceShareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateResourceShareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateResourceShareResponse response) {
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
        public Builder body(AssociateResourceShareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateResourceShareResponse build() {
            return new AssociateResourceShareResponse(this);
        } 

    } 

}
