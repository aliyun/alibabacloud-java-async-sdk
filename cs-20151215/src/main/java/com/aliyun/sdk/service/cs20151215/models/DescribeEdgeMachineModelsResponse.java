// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachineModelsResponse} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachineModelsResponse</p>
 */
public class DescribeEdgeMachineModelsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeEdgeMachineModelsResponseBody body;

    private DescribeEdgeMachineModelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeEdgeMachineModelsResponse create() {
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
    public DescribeEdgeMachineModelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEdgeMachineModelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeEdgeMachineModelsResponseBody body);

        @Override
        DescribeEdgeMachineModelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEdgeMachineModelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeEdgeMachineModelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEdgeMachineModelsResponse response) {
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
        public Builder body(DescribeEdgeMachineModelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEdgeMachineModelsResponse build() {
            return new DescribeEdgeMachineModelsResponse(this);
        } 

    } 

}
