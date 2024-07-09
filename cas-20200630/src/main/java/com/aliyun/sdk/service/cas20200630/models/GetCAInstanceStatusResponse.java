// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCAInstanceStatusResponse} extends {@link TeaModel}
 *
 * <p>GetCAInstanceStatusResponse</p>
 */
public class GetCAInstanceStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetCAInstanceStatusResponseBody body;

    private GetCAInstanceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetCAInstanceStatusResponse create() {
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
    public GetCAInstanceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCAInstanceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetCAInstanceStatusResponseBody body);

        @Override
        GetCAInstanceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCAInstanceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetCAInstanceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCAInstanceStatusResponse response) {
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
        public Builder body(GetCAInstanceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCAInstanceStatusResponse build() {
            return new GetCAInstanceStatusResponse(this);
        } 

    } 

}
