// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUploadedFunctionFileInfoResponse} extends {@link TeaModel}
 *
 * <p>AddUploadedFunctionFileInfoResponse</p>
 */
public class AddUploadedFunctionFileInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUploadedFunctionFileInfoResponseBody body;

    private AddUploadedFunctionFileInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUploadedFunctionFileInfoResponse create() {
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
     * @return body
     */
    public AddUploadedFunctionFileInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUploadedFunctionFileInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUploadedFunctionFileInfoResponseBody body);

        @Override
        AddUploadedFunctionFileInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUploadedFunctionFileInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUploadedFunctionFileInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUploadedFunctionFileInfoResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(AddUploadedFunctionFileInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUploadedFunctionFileInfoResponse build() {
            return new AddUploadedFunctionFileInfoResponse(this);
        } 

    } 

}
