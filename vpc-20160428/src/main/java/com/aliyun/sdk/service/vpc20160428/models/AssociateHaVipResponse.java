// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateHaVipResponse} extends {@link TeaModel}
 *
 * <p>AssociateHaVipResponse</p>
 */
public class AssociateHaVipResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateHaVipResponseBody body;

    private AssociateHaVipResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateHaVipResponse create() {
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
    public AssociateHaVipResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateHaVipResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateHaVipResponseBody body);

        @Override
        AssociateHaVipResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateHaVipResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateHaVipResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateHaVipResponse response) {
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
        public Builder body(AssociateHaVipResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateHaVipResponse build() {
            return new AssociateHaVipResponse(this);
        } 

    } 

}
