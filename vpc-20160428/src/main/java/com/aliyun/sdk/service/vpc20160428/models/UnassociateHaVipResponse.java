// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassociateHaVipResponse} extends {@link TeaModel}
 *
 * <p>UnassociateHaVipResponse</p>
 */
public class UnassociateHaVipResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnassociateHaVipResponseBody body;

    private UnassociateHaVipResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnassociateHaVipResponse create() {
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
    public UnassociateHaVipResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnassociateHaVipResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnassociateHaVipResponseBody body);

        @Override
        UnassociateHaVipResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnassociateHaVipResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnassociateHaVipResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnassociateHaVipResponse response) {
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
        public Builder body(UnassociateHaVipResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnassociateHaVipResponse build() {
            return new UnassociateHaVipResponse(this);
        } 

    } 

}
