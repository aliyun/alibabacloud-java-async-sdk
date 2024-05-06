// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceDeployResponse} extends {@link TeaModel}
 *
 * <p>GetDataSourceDeployResponse</p>
 */
public class GetDataSourceDeployResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDataSourceDeployResponseBody body;

    private GetDataSourceDeployResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDataSourceDeployResponse create() {
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
    public GetDataSourceDeployResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataSourceDeployResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDataSourceDeployResponseBody body);

        @Override
        GetDataSourceDeployResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataSourceDeployResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetDataSourceDeployResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataSourceDeployResponse response) {
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
        public Builder body(GetDataSourceDeployResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataSourceDeployResponse build() {
            return new GetDataSourceDeployResponse(this);
        } 

    } 

}
