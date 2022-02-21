// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDBInstancesResponse} extends {@link TeaModel}
 *
 * <p>AttachDBInstancesResponse</p>
 */
public class AttachDBInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachDBInstancesResponseBody body;

    private AttachDBInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachDBInstancesResponse create() {
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
    public AttachDBInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachDBInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachDBInstancesResponseBody body);

        @Override
        AttachDBInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachDBInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachDBInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachDBInstancesResponse response) {
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
        public Builder body(AttachDBInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachDBInstancesResponse build() {
            return new AttachDBInstancesResponse(this);
        } 

    } 

}
