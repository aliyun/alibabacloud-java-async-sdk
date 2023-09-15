// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOperationOssUploadPolicyResponse} extends {@link TeaModel}
 *
 * <p>GetOperationOssUploadPolicyResponse</p>
 */
public class GetOperationOssUploadPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private GetOperationOssUploadPolicyResponseBody body;

    private GetOperationOssUploadPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetOperationOssUploadPolicyResponse create() {
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
    public GetOperationOssUploadPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOperationOssUploadPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetOperationOssUploadPolicyResponseBody body);

        @Override
        GetOperationOssUploadPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOperationOssUploadPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetOperationOssUploadPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOperationOssUploadPolicyResponse response) {
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
        public Builder body(GetOperationOssUploadPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOperationOssUploadPolicyResponse build() {
            return new GetOperationOssUploadPolicyResponse(this);
        } 

    } 

}
