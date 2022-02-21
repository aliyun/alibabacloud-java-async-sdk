// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserToSecurityCenterWhiteListResponse} extends {@link TeaModel}
 *
 * <p>AddUserToSecurityCenterWhiteListResponse</p>
 */
public class AddUserToSecurityCenterWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUserToSecurityCenterWhiteListResponseBody body;

    private AddUserToSecurityCenterWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUserToSecurityCenterWhiteListResponse create() {
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
    public AddUserToSecurityCenterWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUserToSecurityCenterWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUserToSecurityCenterWhiteListResponseBody body);

        @Override
        AddUserToSecurityCenterWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUserToSecurityCenterWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUserToSecurityCenterWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUserToSecurityCenterWhiteListResponse response) {
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
        public Builder body(AddUserToSecurityCenterWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUserToSecurityCenterWhiteListResponse build() {
            return new AddUserToSecurityCenterWhiteListResponse(this);
        } 

    } 

}
