// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVariableSceneListResponse} extends {@link TeaModel}
 *
 * <p>DescribeVariableSceneListResponse</p>
 */
public class DescribeVariableSceneListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeVariableSceneListResponseBody body;

    private DescribeVariableSceneListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeVariableSceneListResponse create() {
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
    public DescribeVariableSceneListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVariableSceneListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeVariableSceneListResponseBody body);

        @Override
        DescribeVariableSceneListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVariableSceneListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeVariableSceneListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVariableSceneListResponse response) {
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
        public Builder body(DescribeVariableSceneListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVariableSceneListResponse build() {
            return new DescribeVariableSceneListResponse(this);
        } 

    } 

}
