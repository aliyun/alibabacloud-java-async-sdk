// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningDetailResponse</p>
 */
public class DescribeCheckWarningDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCheckWarningDetailResponseBody body;

    private DescribeCheckWarningDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCheckWarningDetailResponse create() {
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
    public DescribeCheckWarningDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCheckWarningDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCheckWarningDetailResponseBody body);

        @Override
        DescribeCheckWarningDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCheckWarningDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCheckWarningDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCheckWarningDetailResponse response) {
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
        public Builder body(DescribeCheckWarningDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCheckWarningDetailResponse build() {
            return new DescribeCheckWarningDetailResponse(this);
        } 

    } 

}
