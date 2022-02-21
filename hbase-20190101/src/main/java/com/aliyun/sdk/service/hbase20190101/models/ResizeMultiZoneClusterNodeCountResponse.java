// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeMultiZoneClusterNodeCountResponse} extends {@link TeaModel}
 *
 * <p>ResizeMultiZoneClusterNodeCountResponse</p>
 */
public class ResizeMultiZoneClusterNodeCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResizeMultiZoneClusterNodeCountResponseBody body;

    private ResizeMultiZoneClusterNodeCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResizeMultiZoneClusterNodeCountResponse create() {
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
    public ResizeMultiZoneClusterNodeCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResizeMultiZoneClusterNodeCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResizeMultiZoneClusterNodeCountResponseBody body);

        @Override
        ResizeMultiZoneClusterNodeCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResizeMultiZoneClusterNodeCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResizeMultiZoneClusterNodeCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResizeMultiZoneClusterNodeCountResponse response) {
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
        public Builder body(ResizeMultiZoneClusterNodeCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResizeMultiZoneClusterNodeCountResponse build() {
            return new ResizeMultiZoneClusterNodeCountResponse(this);
        } 

    } 

}
