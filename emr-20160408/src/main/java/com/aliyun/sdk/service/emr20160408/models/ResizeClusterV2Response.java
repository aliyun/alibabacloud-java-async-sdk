// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeClusterV2Response} extends {@link TeaModel}
 *
 * <p>ResizeClusterV2Response</p>
 */
public class ResizeClusterV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResizeClusterV2ResponseBody body;

    private ResizeClusterV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResizeClusterV2Response create() {
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
    public ResizeClusterV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResizeClusterV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResizeClusterV2ResponseBody body);

        @Override
        ResizeClusterV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResizeClusterV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResizeClusterV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResizeClusterV2Response response) {
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
        public Builder body(ResizeClusterV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResizeClusterV2Response build() {
            return new ResizeClusterV2Response(this);
        } 

    } 

}
