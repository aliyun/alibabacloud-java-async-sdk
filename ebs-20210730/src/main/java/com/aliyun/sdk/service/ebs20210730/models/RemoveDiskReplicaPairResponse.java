// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveDiskReplicaPairResponse} extends {@link TeaModel}
 *
 * <p>RemoveDiskReplicaPairResponse</p>
 */
public class RemoveDiskReplicaPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveDiskReplicaPairResponseBody body;

    private RemoveDiskReplicaPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveDiskReplicaPairResponse create() {
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
    public RemoveDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveDiskReplicaPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveDiskReplicaPairResponseBody body);

        @Override
        RemoveDiskReplicaPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveDiskReplicaPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveDiskReplicaPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveDiskReplicaPairResponse response) {
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
        public Builder body(RemoveDiskReplicaPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveDiskReplicaPairResponse build() {
            return new RemoveDiskReplicaPairResponse(this);
        } 

    } 

}
