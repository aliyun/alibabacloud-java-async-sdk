// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopTypesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDesktopTypesResponse</p>
 */
public class DescribeDesktopTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDesktopTypesResponseBody body;

    private DescribeDesktopTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDesktopTypesResponse create() {
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
    public DescribeDesktopTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDesktopTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDesktopTypesResponseBody body);

        @Override
        DescribeDesktopTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDesktopTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDesktopTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDesktopTypesResponse response) {
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
        public Builder body(DescribeDesktopTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDesktopTypesResponse build() {
            return new DescribeDesktopTypesResponse(this);
        } 

    } 

}
