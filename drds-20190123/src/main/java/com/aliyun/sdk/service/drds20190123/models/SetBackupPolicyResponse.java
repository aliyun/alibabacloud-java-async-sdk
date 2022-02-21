// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetBackupPolicyResponse} extends {@link TeaModel}
 *
 * <p>SetBackupPolicyResponse</p>
 */
public class SetBackupPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetBackupPolicyResponseBody body;

    private SetBackupPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetBackupPolicyResponse create() {
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
    public SetBackupPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetBackupPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetBackupPolicyResponseBody body);

        @Override
        SetBackupPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetBackupPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetBackupPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetBackupPolicyResponse response) {
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
        public Builder body(SetBackupPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetBackupPolicyResponse build() {
            return new SetBackupPolicyResponse(this);
        } 

    } 

}
