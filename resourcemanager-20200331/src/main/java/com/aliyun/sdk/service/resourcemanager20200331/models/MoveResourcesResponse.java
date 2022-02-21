// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveResourcesResponse} extends {@link TeaModel}
 *
 * <p>MoveResourcesResponse</p>
 */
public class MoveResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MoveResourcesResponseBody body;

    private MoveResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MoveResourcesResponse create() {
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
    public MoveResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MoveResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MoveResourcesResponseBody body);

        @Override
        MoveResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MoveResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MoveResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MoveResourcesResponse response) {
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
        public Builder body(MoveResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MoveResourcesResponse build() {
            return new MoveResourcesResponse(this);
        } 

    } 

}
