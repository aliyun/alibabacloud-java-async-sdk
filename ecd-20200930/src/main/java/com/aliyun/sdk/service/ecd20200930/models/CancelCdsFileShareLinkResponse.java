// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCdsFileShareLinkResponse} extends {@link TeaModel}
 *
 * <p>CancelCdsFileShareLinkResponse</p>
 */
public class CancelCdsFileShareLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private CancelCdsFileShareLinkResponseBody body;

    private CancelCdsFileShareLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CancelCdsFileShareLinkResponse create() {
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
    public CancelCdsFileShareLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelCdsFileShareLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CancelCdsFileShareLinkResponseBody body);

        @Override
        CancelCdsFileShareLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelCdsFileShareLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CancelCdsFileShareLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelCdsFileShareLinkResponse response) {
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
        public Builder body(CancelCdsFileShareLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelCdsFileShareLinkResponse build() {
            return new CancelCdsFileShareLinkResponse(this);
        } 

    } 

}
