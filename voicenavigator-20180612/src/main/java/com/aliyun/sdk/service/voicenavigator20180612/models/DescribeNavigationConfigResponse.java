// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNavigationConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeNavigationConfigResponse</p>
 */
public class DescribeNavigationConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNavigationConfigResponseBody body;

    private DescribeNavigationConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNavigationConfigResponse create() {
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
    public DescribeNavigationConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNavigationConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNavigationConfigResponseBody body);

        @Override
        DescribeNavigationConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNavigationConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNavigationConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNavigationConfigResponse response) {
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
        public Builder body(DescribeNavigationConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNavigationConfigResponse build() {
            return new DescribeNavigationConfigResponse(this);
        } 

    } 

}
