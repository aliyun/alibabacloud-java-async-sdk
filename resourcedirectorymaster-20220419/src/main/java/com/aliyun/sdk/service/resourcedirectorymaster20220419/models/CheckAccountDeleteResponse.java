// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAccountDeleteResponse} extends {@link TeaModel}
 *
 * <p>CheckAccountDeleteResponse</p>
 */
public class CheckAccountDeleteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckAccountDeleteResponseBody body;

    private CheckAccountDeleteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckAccountDeleteResponse create() {
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
    public CheckAccountDeleteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckAccountDeleteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckAccountDeleteResponseBody body);

        @Override
        CheckAccountDeleteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckAccountDeleteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckAccountDeleteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckAccountDeleteResponse response) {
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
        public Builder body(CheckAccountDeleteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckAccountDeleteResponse build() {
            return new CheckAccountDeleteResponse(this);
        } 

    } 

}
