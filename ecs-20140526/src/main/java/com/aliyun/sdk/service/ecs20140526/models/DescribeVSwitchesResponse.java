// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVSwitchesResponse} extends {@link TeaModel}
 *
 * <p>DescribeVSwitchesResponse</p>
 */
public class DescribeVSwitchesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVSwitchesResponseBody body;

    private DescribeVSwitchesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVSwitchesResponse create() {
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
    public DescribeVSwitchesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVSwitchesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVSwitchesResponseBody body);

        @Override
        DescribeVSwitchesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVSwitchesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVSwitchesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVSwitchesResponse response) {
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
        public Builder body(DescribeVSwitchesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVSwitchesResponse build() {
            return new DescribeVSwitchesResponse(this);
        } 

    } 

}
