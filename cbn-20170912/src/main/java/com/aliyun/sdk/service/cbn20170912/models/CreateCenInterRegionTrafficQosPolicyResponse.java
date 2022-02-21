// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenInterRegionTrafficQosPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateCenInterRegionTrafficQosPolicyResponse</p>
 */
public class CreateCenInterRegionTrafficQosPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCenInterRegionTrafficQosPolicyResponseBody body;

    private CreateCenInterRegionTrafficQosPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCenInterRegionTrafficQosPolicyResponse create() {
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
    public CreateCenInterRegionTrafficQosPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCenInterRegionTrafficQosPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCenInterRegionTrafficQosPolicyResponseBody body);

        @Override
        CreateCenInterRegionTrafficQosPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCenInterRegionTrafficQosPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCenInterRegionTrafficQosPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCenInterRegionTrafficQosPolicyResponse response) {
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
        public Builder body(CreateCenInterRegionTrafficQosPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCenInterRegionTrafficQosPolicyResponse build() {
            return new CreateCenInterRegionTrafficQosPolicyResponse(this);
        } 

    } 

}
