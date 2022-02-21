// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMasterSlaveServerGroupAttributeResponse} extends {@link TeaModel}
 *
 * <p>DescribeMasterSlaveServerGroupAttributeResponse</p>
 */
public class DescribeMasterSlaveServerGroupAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMasterSlaveServerGroupAttributeResponseBody body;

    private DescribeMasterSlaveServerGroupAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMasterSlaveServerGroupAttributeResponse create() {
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
    public DescribeMasterSlaveServerGroupAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMasterSlaveServerGroupAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMasterSlaveServerGroupAttributeResponseBody body);

        @Override
        DescribeMasterSlaveServerGroupAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMasterSlaveServerGroupAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMasterSlaveServerGroupAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMasterSlaveServerGroupAttributeResponse response) {
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
        public Builder body(DescribeMasterSlaveServerGroupAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMasterSlaveServerGroupAttributeResponse build() {
            return new DescribeMasterSlaveServerGroupAttributeResponse(this);
        } 

    } 

}
