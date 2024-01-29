// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceComplianceByPackResponse} extends {@link TeaModel}
 *
 * <p>GetResourceComplianceByPackResponse</p>
 */
public class GetResourceComplianceByPackResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetResourceComplianceByPackResponseBody body;

    private GetResourceComplianceByPackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetResourceComplianceByPackResponse create() {
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
    public GetResourceComplianceByPackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceComplianceByPackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetResourceComplianceByPackResponseBody body);

        @Override
        GetResourceComplianceByPackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceComplianceByPackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetResourceComplianceByPackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceComplianceByPackResponse response) {
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
        public Builder body(GetResourceComplianceByPackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceComplianceByPackResponse build() {
            return new GetResourceComplianceByPackResponse(this);
        } 

    } 

}
