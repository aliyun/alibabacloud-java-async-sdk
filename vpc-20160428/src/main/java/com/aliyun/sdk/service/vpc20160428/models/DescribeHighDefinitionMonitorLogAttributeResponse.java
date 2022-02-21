// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHighDefinitionMonitorLogAttributeResponse} extends {@link TeaModel}
 *
 * <p>DescribeHighDefinitionMonitorLogAttributeResponse</p>
 */
public class DescribeHighDefinitionMonitorLogAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHighDefinitionMonitorLogAttributeResponseBody body;

    private DescribeHighDefinitionMonitorLogAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHighDefinitionMonitorLogAttributeResponse create() {
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
    public DescribeHighDefinitionMonitorLogAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHighDefinitionMonitorLogAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHighDefinitionMonitorLogAttributeResponseBody body);

        @Override
        DescribeHighDefinitionMonitorLogAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHighDefinitionMonitorLogAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHighDefinitionMonitorLogAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHighDefinitionMonitorLogAttributeResponse response) {
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
        public Builder body(DescribeHighDefinitionMonitorLogAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHighDefinitionMonitorLogAttributeResponse build() {
            return new DescribeHighDefinitionMonitorLogAttributeResponse(this);
        } 

    } 

}
