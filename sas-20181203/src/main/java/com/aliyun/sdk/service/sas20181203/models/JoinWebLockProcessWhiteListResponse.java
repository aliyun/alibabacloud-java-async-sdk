// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinWebLockProcessWhiteListResponse} extends {@link TeaModel}
 *
 * <p>JoinWebLockProcessWhiteListResponse</p>
 */
public class JoinWebLockProcessWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinWebLockProcessWhiteListResponseBody body;

    private JoinWebLockProcessWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinWebLockProcessWhiteListResponse create() {
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
    public JoinWebLockProcessWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinWebLockProcessWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinWebLockProcessWhiteListResponseBody body);

        @Override
        JoinWebLockProcessWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinWebLockProcessWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinWebLockProcessWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinWebLockProcessWhiteListResponse response) {
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
        public Builder body(JoinWebLockProcessWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinWebLockProcessWhiteListResponse build() {
            return new JoinWebLockProcessWhiteListResponse(this);
        } 

    } 

}
