// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuthScenePageListResponse} extends {@link TeaModel}
 *
 * <p>DescribeAuthScenePageListResponse</p>
 */
public class DescribeAuthScenePageListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAuthScenePageListResponseBody body;

    private DescribeAuthScenePageListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAuthScenePageListResponse create() {
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
    public DescribeAuthScenePageListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAuthScenePageListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAuthScenePageListResponseBody body);

        @Override
        DescribeAuthScenePageListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAuthScenePageListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeAuthScenePageListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAuthScenePageListResponse response) {
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
        public Builder body(DescribeAuthScenePageListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAuthScenePageListResponse build() {
            return new DescribeAuthScenePageListResponse(this);
        } 

    } 

}
