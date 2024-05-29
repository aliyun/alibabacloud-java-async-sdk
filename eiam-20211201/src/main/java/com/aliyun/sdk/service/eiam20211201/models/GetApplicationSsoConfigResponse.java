// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationSsoConfigResponse} extends {@link TeaModel}
 *
 * <p>GetApplicationSsoConfigResponse</p>
 */
public class GetApplicationSsoConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetApplicationSsoConfigResponseBody body;

    private GetApplicationSsoConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetApplicationSsoConfigResponse create() {
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
    public GetApplicationSsoConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApplicationSsoConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetApplicationSsoConfigResponseBody body);

        @Override
        GetApplicationSsoConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApplicationSsoConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetApplicationSsoConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApplicationSsoConfigResponse response) {
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
        public Builder body(GetApplicationSsoConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApplicationSsoConfigResponse build() {
            return new GetApplicationSsoConfigResponse(this);
        } 

    } 

}
