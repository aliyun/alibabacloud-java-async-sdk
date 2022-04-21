// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHttpTriggerConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeHttpTriggerConfigResponse</p>
 */
public class DescribeHttpTriggerConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHttpTriggerConfigResponseBody body;

    private DescribeHttpTriggerConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHttpTriggerConfigResponse create() {
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
    public DescribeHttpTriggerConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHttpTriggerConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHttpTriggerConfigResponseBody body);

        @Override
        DescribeHttpTriggerConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHttpTriggerConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHttpTriggerConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHttpTriggerConfigResponse response) {
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
        public Builder body(DescribeHttpTriggerConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHttpTriggerConfigResponse build() {
            return new DescribeHttpTriggerConfigResponse(this);
        } 

    } 

}
