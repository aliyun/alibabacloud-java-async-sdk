// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitionVSwitchesResponse} extends {@link TeaModel}
 *
 * <p>DescribeTransitionVSwitchesResponse</p>
 */
public class DescribeTransitionVSwitchesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTransitionVSwitchesResponseBody body;

    private DescribeTransitionVSwitchesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTransitionVSwitchesResponse create() {
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
    public DescribeTransitionVSwitchesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTransitionVSwitchesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTransitionVSwitchesResponseBody body);

        @Override
        DescribeTransitionVSwitchesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTransitionVSwitchesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTransitionVSwitchesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTransitionVSwitchesResponse response) {
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
        public Builder body(DescribeTransitionVSwitchesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTransitionVSwitchesResponse build() {
            return new DescribeTransitionVSwitchesResponse(this);
        } 

    } 

}
