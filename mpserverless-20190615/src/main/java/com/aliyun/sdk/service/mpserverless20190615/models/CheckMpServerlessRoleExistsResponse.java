// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMpServerlessRoleExistsResponse} extends {@link TeaModel}
 *
 * <p>CheckMpServerlessRoleExistsResponse</p>
 */
public class CheckMpServerlessRoleExistsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckMpServerlessRoleExistsResponseBody body;

    private CheckMpServerlessRoleExistsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckMpServerlessRoleExistsResponse create() {
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
    public CheckMpServerlessRoleExistsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckMpServerlessRoleExistsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckMpServerlessRoleExistsResponseBody body);

        @Override
        CheckMpServerlessRoleExistsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckMpServerlessRoleExistsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckMpServerlessRoleExistsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckMpServerlessRoleExistsResponse response) {
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
        public Builder body(CheckMpServerlessRoleExistsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckMpServerlessRoleExistsResponse build() {
            return new CheckMpServerlessRoleExistsResponse(this);
        } 

    } 

}
