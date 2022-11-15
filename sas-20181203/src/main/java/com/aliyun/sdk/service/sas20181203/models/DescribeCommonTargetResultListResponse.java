// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonTargetResultListResponse} extends {@link TeaModel}
 *
 * <p>DescribeCommonTargetResultListResponse</p>
 */
public class DescribeCommonTargetResultListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCommonTargetResultListResponseBody body;

    private DescribeCommonTargetResultListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCommonTargetResultListResponse create() {
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
    public DescribeCommonTargetResultListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCommonTargetResultListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCommonTargetResultListResponseBody body);

        @Override
        DescribeCommonTargetResultListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCommonTargetResultListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCommonTargetResultListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCommonTargetResultListResponse response) {
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
        public Builder body(DescribeCommonTargetResultListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCommonTargetResultListResponse build() {
            return new DescribeCommonTargetResultListResponse(this);
        } 

    } 

}
