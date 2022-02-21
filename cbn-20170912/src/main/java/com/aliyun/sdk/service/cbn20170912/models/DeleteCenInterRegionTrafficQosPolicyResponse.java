// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCenInterRegionTrafficQosPolicyResponse} extends {@link TeaModel}
 *
 * <p>DeleteCenInterRegionTrafficQosPolicyResponse</p>
 */
public class DeleteCenInterRegionTrafficQosPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCenInterRegionTrafficQosPolicyResponseBody body;

    private DeleteCenInterRegionTrafficQosPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCenInterRegionTrafficQosPolicyResponse create() {
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
    public DeleteCenInterRegionTrafficQosPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCenInterRegionTrafficQosPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCenInterRegionTrafficQosPolicyResponseBody body);

        @Override
        DeleteCenInterRegionTrafficQosPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCenInterRegionTrafficQosPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCenInterRegionTrafficQosPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCenInterRegionTrafficQosPolicyResponse response) {
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
        public Builder body(DeleteCenInterRegionTrafficQosPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCenInterRegionTrafficQosPolicyResponse build() {
            return new DeleteCenInterRegionTrafficQosPolicyResponse(this);
        } 

    } 

}
