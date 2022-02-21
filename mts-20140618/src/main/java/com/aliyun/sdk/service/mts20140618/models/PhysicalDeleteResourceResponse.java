// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PhysicalDeleteResourceResponse} extends {@link TeaModel}
 *
 * <p>PhysicalDeleteResourceResponse</p>
 */
public class PhysicalDeleteResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PhysicalDeleteResourceResponseBody body;

    private PhysicalDeleteResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PhysicalDeleteResourceResponse create() {
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
    public PhysicalDeleteResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PhysicalDeleteResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PhysicalDeleteResourceResponseBody body);

        @Override
        PhysicalDeleteResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PhysicalDeleteResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PhysicalDeleteResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PhysicalDeleteResourceResponse response) {
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
        public Builder body(PhysicalDeleteResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PhysicalDeleteResourceResponse build() {
            return new PhysicalDeleteResourceResponse(this);
        } 

    } 

}
