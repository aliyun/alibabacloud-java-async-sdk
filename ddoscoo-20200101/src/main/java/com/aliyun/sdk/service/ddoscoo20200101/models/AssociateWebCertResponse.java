// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateWebCertResponse} extends {@link TeaModel}
 *
 * <p>AssociateWebCertResponse</p>
 */
public class AssociateWebCertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateWebCertResponseBody body;

    private AssociateWebCertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateWebCertResponse create() {
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
    public AssociateWebCertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateWebCertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateWebCertResponseBody body);

        @Override
        AssociateWebCertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateWebCertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateWebCertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateWebCertResponse response) {
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
        public Builder body(AssociateWebCertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateWebCertResponse build() {
            return new AssociateWebCertResponse(this);
        } 

    } 

}
