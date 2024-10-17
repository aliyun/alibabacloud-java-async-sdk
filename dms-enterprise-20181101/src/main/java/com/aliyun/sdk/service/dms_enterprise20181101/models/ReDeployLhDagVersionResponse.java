// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReDeployLhDagVersionResponse} extends {@link TeaModel}
 *
 * <p>ReDeployLhDagVersionResponse</p>
 */
public class ReDeployLhDagVersionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReDeployLhDagVersionResponseBody body;

    private ReDeployLhDagVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReDeployLhDagVersionResponse create() {
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
    public ReDeployLhDagVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReDeployLhDagVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReDeployLhDagVersionResponseBody body);

        @Override
        ReDeployLhDagVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReDeployLhDagVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ReDeployLhDagVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReDeployLhDagVersionResponse response) {
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
        public Builder body(ReDeployLhDagVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReDeployLhDagVersionResponse build() {
            return new ReDeployLhDagVersionResponse(this);
        } 

    } 

}
