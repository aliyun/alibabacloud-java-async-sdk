// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMultiZoneClusterResponse} extends {@link TeaModel}
 *
 * <p>CreateMultiZoneClusterResponse</p>
 */
public class CreateMultiZoneClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMultiZoneClusterResponseBody body;

    private CreateMultiZoneClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMultiZoneClusterResponse create() {
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
    public CreateMultiZoneClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMultiZoneClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMultiZoneClusterResponseBody body);

        @Override
        CreateMultiZoneClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMultiZoneClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMultiZoneClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMultiZoneClusterResponse response) {
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
        public Builder body(CreateMultiZoneClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMultiZoneClusterResponse build() {
            return new CreateMultiZoneClusterResponse(this);
        } 

    } 

}
