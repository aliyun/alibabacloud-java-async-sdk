// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKmsInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetKmsInstanceResponse</p>
 */
public class GetKmsInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetKmsInstanceResponseBody body;

    private GetKmsInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetKmsInstanceResponse create() {
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
    public GetKmsInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetKmsInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetKmsInstanceResponseBody body);

        @Override
        GetKmsInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetKmsInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetKmsInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetKmsInstanceResponse response) {
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
        public Builder body(GetKmsInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetKmsInstanceResponse build() {
            return new GetKmsInstanceResponse(this);
        } 

    } 

}
