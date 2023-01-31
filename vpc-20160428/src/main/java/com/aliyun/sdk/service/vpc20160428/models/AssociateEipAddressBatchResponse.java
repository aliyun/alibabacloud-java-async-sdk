// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateEipAddressBatchResponse} extends {@link TeaModel}
 *
 * <p>AssociateEipAddressBatchResponse</p>
 */
public class AssociateEipAddressBatchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateEipAddressBatchResponseBody body;

    private AssociateEipAddressBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateEipAddressBatchResponse create() {
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
    public AssociateEipAddressBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateEipAddressBatchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateEipAddressBatchResponseBody body);

        @Override
        AssociateEipAddressBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateEipAddressBatchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateEipAddressBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateEipAddressBatchResponse response) {
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
        public Builder body(AssociateEipAddressBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateEipAddressBatchResponse build() {
            return new AssociateEipAddressBatchResponse(this);
        } 

    } 

}
