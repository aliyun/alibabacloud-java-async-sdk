// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSmartHandleJobResponse} extends {@link TeaModel}
 *
 * <p>GetSmartHandleJobResponse</p>
 */
public class GetSmartHandleJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetSmartHandleJobResponseBody body;

    private GetSmartHandleJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetSmartHandleJobResponse create() {
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
    public GetSmartHandleJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSmartHandleJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetSmartHandleJobResponseBody body);

        @Override
        GetSmartHandleJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSmartHandleJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetSmartHandleJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSmartHandleJobResponse response) {
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
        public Builder body(GetSmartHandleJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSmartHandleJobResponse build() {
            return new GetSmartHandleJobResponse(this);
        } 

    } 

}
