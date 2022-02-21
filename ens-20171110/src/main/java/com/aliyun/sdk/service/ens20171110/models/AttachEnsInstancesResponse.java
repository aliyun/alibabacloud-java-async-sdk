// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachEnsInstancesResponse} extends {@link TeaModel}
 *
 * <p>AttachEnsInstancesResponse</p>
 */
public class AttachEnsInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachEnsInstancesResponseBody body;

    private AttachEnsInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachEnsInstancesResponse create() {
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
    public AttachEnsInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachEnsInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachEnsInstancesResponseBody body);

        @Override
        AttachEnsInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachEnsInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachEnsInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachEnsInstancesResponse response) {
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
        public Builder body(AttachEnsInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachEnsInstancesResponse build() {
            return new AttachEnsInstancesResponse(this);
        } 

    } 

}
