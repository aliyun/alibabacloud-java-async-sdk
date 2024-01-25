// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNewPlayVideoPlaySessionEventDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeNewPlayVideoPlaySessionEventDetailResponse</p>
 */
public class DescribeNewPlayVideoPlaySessionEventDetailResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeNewPlayVideoPlaySessionEventDetailResponseBody body;

    private DescribeNewPlayVideoPlaySessionEventDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeNewPlayVideoPlaySessionEventDetailResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeNewPlayVideoPlaySessionEventDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNewPlayVideoPlaySessionEventDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeNewPlayVideoPlaySessionEventDetailResponseBody body);

        @Override
        DescribeNewPlayVideoPlaySessionEventDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNewPlayVideoPlaySessionEventDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeNewPlayVideoPlaySessionEventDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNewPlayVideoPlaySessionEventDetailResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeNewPlayVideoPlaySessionEventDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNewPlayVideoPlaySessionEventDetailResponse build() {
            return new DescribeNewPlayVideoPlaySessionEventDetailResponse(this);
        } 

    } 

}
