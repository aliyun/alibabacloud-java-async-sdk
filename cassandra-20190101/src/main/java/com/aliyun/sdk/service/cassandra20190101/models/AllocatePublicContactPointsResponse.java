// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocatePublicContactPointsResponse} extends {@link TeaModel}
 *
 * <p>AllocatePublicContactPointsResponse</p>
 */
public class AllocatePublicContactPointsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocatePublicContactPointsResponseBody body;

    private AllocatePublicContactPointsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocatePublicContactPointsResponse create() {
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
    public AllocatePublicContactPointsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocatePublicContactPointsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocatePublicContactPointsResponseBody body);

        @Override
        AllocatePublicContactPointsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocatePublicContactPointsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocatePublicContactPointsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocatePublicContactPointsResponse response) {
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
        public Builder body(AllocatePublicContactPointsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocatePublicContactPointsResponse build() {
            return new AllocatePublicContactPointsResponse(this);
        } 

    } 

}
