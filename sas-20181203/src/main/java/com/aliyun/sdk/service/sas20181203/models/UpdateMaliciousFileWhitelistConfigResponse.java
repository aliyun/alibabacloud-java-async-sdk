// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateMaliciousFileWhitelistConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateMaliciousFileWhitelistConfigResponse</p>
 */
public class UpdateMaliciousFileWhitelistConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateMaliciousFileWhitelistConfigResponseBody body;

    private UpdateMaliciousFileWhitelistConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateMaliciousFileWhitelistConfigResponse create() {
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
    public UpdateMaliciousFileWhitelistConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMaliciousFileWhitelistConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateMaliciousFileWhitelistConfigResponseBody body);

        @Override
        UpdateMaliciousFileWhitelistConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMaliciousFileWhitelistConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateMaliciousFileWhitelistConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMaliciousFileWhitelistConfigResponse response) {
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
        public Builder body(UpdateMaliciousFileWhitelistConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMaliciousFileWhitelistConfigResponse build() {
            return new UpdateMaliciousFileWhitelistConfigResponse(this);
        } 

    } 

}
