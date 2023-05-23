// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadCredentialsResponse} extends {@link TeaModel}
 *
 * <p>GetUploadCredentialsResponse</p>
 */
public class GetUploadCredentialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUploadCredentialsResponseBody body;

    private GetUploadCredentialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUploadCredentialsResponse create() {
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
    public GetUploadCredentialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUploadCredentialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUploadCredentialsResponseBody body);

        @Override
        GetUploadCredentialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUploadCredentialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUploadCredentialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUploadCredentialsResponse response) {
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
        public Builder body(GetUploadCredentialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUploadCredentialsResponse build() {
            return new GetUploadCredentialsResponse(this);
        } 

    } 

}
