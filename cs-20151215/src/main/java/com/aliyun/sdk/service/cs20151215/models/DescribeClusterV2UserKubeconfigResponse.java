// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterV2UserKubeconfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterV2UserKubeconfigResponse</p>
 */
public class DescribeClusterV2UserKubeconfigResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeClusterV2UserKubeconfigResponseBody body;

    private DescribeClusterV2UserKubeconfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeClusterV2UserKubeconfigResponse create() {
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
    public DescribeClusterV2UserKubeconfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterV2UserKubeconfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeClusterV2UserKubeconfigResponseBody body);

        @Override
        DescribeClusterV2UserKubeconfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterV2UserKubeconfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeClusterV2UserKubeconfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterV2UserKubeconfigResponse response) {
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
        public Builder body(DescribeClusterV2UserKubeconfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterV2UserKubeconfigResponse build() {
            return new DescribeClusterV2UserKubeconfigResponse(this);
        } 

    } 

}
