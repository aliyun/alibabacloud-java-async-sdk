// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateBackupPolicyResponse</p>
 */
public class CreateBackupPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBackupPolicyResponseBody body;

    private CreateBackupPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBackupPolicyResponse create() {
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
    public CreateBackupPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBackupPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBackupPolicyResponseBody body);

        @Override
        CreateBackupPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBackupPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBackupPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBackupPolicyResponse response) {
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
        public Builder body(CreateBackupPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBackupPolicyResponse build() {
            return new CreateBackupPolicyResponse(this);
        } 

    } 

}
