// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAntChainWithKeyAutoCreationResponse} extends {@link TeaModel}
 *
 * <p>ApplyAntChainWithKeyAutoCreationResponse</p>
 */
public class ApplyAntChainWithKeyAutoCreationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyAntChainWithKeyAutoCreationResponseBody body;

    private ApplyAntChainWithKeyAutoCreationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ApplyAntChainWithKeyAutoCreationResponse create() {
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
    public ApplyAntChainWithKeyAutoCreationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyAntChainWithKeyAutoCreationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ApplyAntChainWithKeyAutoCreationResponseBody body);

        @Override
        ApplyAntChainWithKeyAutoCreationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyAntChainWithKeyAutoCreationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ApplyAntChainWithKeyAutoCreationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyAntChainWithKeyAutoCreationResponse response) {
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
        public Builder body(ApplyAntChainWithKeyAutoCreationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyAntChainWithKeyAutoCreationResponse build() {
            return new ApplyAntChainWithKeyAutoCreationResponse(this);
        } 

    } 

}
