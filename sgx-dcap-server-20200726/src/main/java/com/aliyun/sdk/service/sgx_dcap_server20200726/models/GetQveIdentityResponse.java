// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQveIdentityResponse} extends {@link TeaModel}
 *
 * <p>GetQveIdentityResponse</p>
 */
public class GetQveIdentityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private String body;

    private GetQveIdentityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetQveIdentityResponse create() {
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
    public String getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQveIdentityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(String body);

        @Override
        GetQveIdentityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQveIdentityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private String body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQveIdentityResponse response) {
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
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQveIdentityResponse build() {
            return new GetQveIdentityResponse(this);
        } 

    } 

}
