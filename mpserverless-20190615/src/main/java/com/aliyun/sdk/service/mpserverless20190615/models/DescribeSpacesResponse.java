// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpacesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSpacesResponse</p>
 */
public class DescribeSpacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSpacesResponseBody body;

    private DescribeSpacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSpacesResponse create() {
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
    public DescribeSpacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSpacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSpacesResponseBody body);

        @Override
        DescribeSpacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSpacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSpacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSpacesResponse response) {
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
        public Builder body(DescribeSpacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSpacesResponse build() {
            return new DescribeSpacesResponse(this);
        } 

    } 

}
