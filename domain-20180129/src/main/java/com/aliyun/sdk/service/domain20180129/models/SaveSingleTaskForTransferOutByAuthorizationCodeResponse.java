// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveSingleTaskForTransferOutByAuthorizationCodeResponse} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForTransferOutByAuthorizationCodeResponse</p>
 */
public class SaveSingleTaskForTransferOutByAuthorizationCodeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody body;

    private SaveSingleTaskForTransferOutByAuthorizationCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveSingleTaskForTransferOutByAuthorizationCodeResponse create() {
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
    public SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSingleTaskForTransferOutByAuthorizationCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody body);

        @Override
        SaveSingleTaskForTransferOutByAuthorizationCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSingleTaskForTransferOutByAuthorizationCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSingleTaskForTransferOutByAuthorizationCodeResponse response) {
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
        public Builder body(SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSingleTaskForTransferOutByAuthorizationCodeResponse build() {
            return new SaveSingleTaskForTransferOutByAuthorizationCodeResponse(this);
        } 

    } 

}
