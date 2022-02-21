// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBandWidthDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserBandWidthDataResponse</p>
 */
public class DescribeUserBandWidthDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserBandWidthDataResponseBody body;

    private DescribeUserBandWidthDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserBandWidthDataResponse create() {
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
    public DescribeUserBandWidthDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserBandWidthDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserBandWidthDataResponseBody body);

        @Override
        DescribeUserBandWidthDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserBandWidthDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserBandWidthDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserBandWidthDataResponse response) {
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
        public Builder body(DescribeUserBandWidthDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserBandWidthDataResponse build() {
            return new DescribeUserBandWidthDataResponse(this);
        } 

    } 

}
