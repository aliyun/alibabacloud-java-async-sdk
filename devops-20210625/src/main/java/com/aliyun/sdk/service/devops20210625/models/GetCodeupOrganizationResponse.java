// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCodeupOrganizationResponse} extends {@link TeaModel}
 *
 * <p>GetCodeupOrganizationResponse</p>
 */
public class GetCodeupOrganizationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetCodeupOrganizationResponseBody body;

    private GetCodeupOrganizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetCodeupOrganizationResponse create() {
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
    public GetCodeupOrganizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCodeupOrganizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetCodeupOrganizationResponseBody body);

        @Override
        GetCodeupOrganizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCodeupOrganizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetCodeupOrganizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCodeupOrganizationResponse response) {
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
        public Builder body(GetCodeupOrganizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCodeupOrganizationResponse build() {
            return new GetCodeupOrganizationResponse(this);
        } 

    } 

}
