// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateClusterNodePoolResponse} extends {@link TeaModel}
 *
 * <p>CreateClusterNodePoolResponse</p>
 */
public class CreateClusterNodePoolResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateClusterNodePoolResponseBody body;

    private CreateClusterNodePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateClusterNodePoolResponse create() {
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
    public CreateClusterNodePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateClusterNodePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateClusterNodePoolResponseBody body);

        @Override
        CreateClusterNodePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateClusterNodePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateClusterNodePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateClusterNodePoolResponse response) {
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
        public Builder body(CreateClusterNodePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateClusterNodePoolResponse build() {
            return new CreateClusterNodePoolResponse(this);
        } 

    } 

}
