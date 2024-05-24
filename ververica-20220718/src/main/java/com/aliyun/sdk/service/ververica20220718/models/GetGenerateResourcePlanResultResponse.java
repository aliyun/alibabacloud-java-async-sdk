// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGenerateResourcePlanResultResponse} extends {@link TeaModel}
 *
 * <p>GetGenerateResourcePlanResultResponse</p>
 */
public class GetGenerateResourcePlanResultResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetGenerateResourcePlanResultResponseBody body;

    private GetGenerateResourcePlanResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetGenerateResourcePlanResultResponse create() {
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
    public GetGenerateResourcePlanResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGenerateResourcePlanResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetGenerateResourcePlanResultResponseBody body);

        @Override
        GetGenerateResourcePlanResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGenerateResourcePlanResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetGenerateResourcePlanResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGenerateResourcePlanResultResponse response) {
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
        public Builder body(GetGenerateResourcePlanResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGenerateResourcePlanResultResponse build() {
            return new GetGenerateResourcePlanResultResponse(this);
        } 

    } 

}
