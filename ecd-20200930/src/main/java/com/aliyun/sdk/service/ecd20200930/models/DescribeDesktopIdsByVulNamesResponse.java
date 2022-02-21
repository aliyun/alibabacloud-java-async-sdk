// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopIdsByVulNamesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDesktopIdsByVulNamesResponse</p>
 */
public class DescribeDesktopIdsByVulNamesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDesktopIdsByVulNamesResponseBody body;

    private DescribeDesktopIdsByVulNamesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDesktopIdsByVulNamesResponse create() {
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
    public DescribeDesktopIdsByVulNamesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDesktopIdsByVulNamesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDesktopIdsByVulNamesResponseBody body);

        @Override
        DescribeDesktopIdsByVulNamesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDesktopIdsByVulNamesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDesktopIdsByVulNamesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDesktopIdsByVulNamesResponse response) {
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
        public Builder body(DescribeDesktopIdsByVulNamesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDesktopIdsByVulNamesResponse build() {
            return new DescribeDesktopIdsByVulNamesResponse(this);
        } 

    } 

}
