// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableMultiAccountResourceCenterResponse} extends {@link TeaModel}
 *
 * <p>EnableMultiAccountResourceCenterResponse</p>
 */
public class EnableMultiAccountResourceCenterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableMultiAccountResourceCenterResponseBody body;

    private EnableMultiAccountResourceCenterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableMultiAccountResourceCenterResponse create() {
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
    public EnableMultiAccountResourceCenterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableMultiAccountResourceCenterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableMultiAccountResourceCenterResponseBody body);

        @Override
        EnableMultiAccountResourceCenterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableMultiAccountResourceCenterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableMultiAccountResourceCenterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableMultiAccountResourceCenterResponse response) {
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
        public Builder body(EnableMultiAccountResourceCenterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableMultiAccountResourceCenterResponse build() {
            return new EnableMultiAccountResourceCenterResponse(this);
        } 

    } 

}
