// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableResourceCenterResponse} extends {@link TeaModel}
 *
 * <p>EnableResourceCenterResponse</p>
 */
public class EnableResourceCenterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableResourceCenterResponseBody body;

    private EnableResourceCenterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableResourceCenterResponse create() {
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
    public EnableResourceCenterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableResourceCenterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableResourceCenterResponseBody body);

        @Override
        EnableResourceCenterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableResourceCenterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableResourceCenterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableResourceCenterResponse response) {
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
        public Builder body(EnableResourceCenterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableResourceCenterResponse build() {
            return new EnableResourceCenterResponse(this);
        } 

    } 

}
