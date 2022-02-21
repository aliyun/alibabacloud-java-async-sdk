// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDiskReplicaPairResponse} extends {@link TeaModel}
 *
 * <p>StopDiskReplicaPairResponse</p>
 */
public class StopDiskReplicaPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDiskReplicaPairResponseBody body;

    private StopDiskReplicaPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDiskReplicaPairResponse create() {
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
    public StopDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDiskReplicaPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDiskReplicaPairResponseBody body);

        @Override
        StopDiskReplicaPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDiskReplicaPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDiskReplicaPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDiskReplicaPairResponse response) {
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
        public Builder body(StopDiskReplicaPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDiskReplicaPairResponse build() {
            return new StopDiskReplicaPairResponse(this);
        } 

    } 

}
