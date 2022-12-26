// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUniBackupPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateUniBackupPolicyResponse</p>
 */
public class CreateUniBackupPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUniBackupPolicyResponseBody body;

    private CreateUniBackupPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUniBackupPolicyResponse create() {
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
    public CreateUniBackupPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUniBackupPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUniBackupPolicyResponseBody body);

        @Override
        CreateUniBackupPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUniBackupPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUniBackupPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUniBackupPolicyResponse response) {
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
        public Builder body(CreateUniBackupPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUniBackupPolicyResponse build() {
            return new CreateUniBackupPolicyResponse(this);
        } 

    } 

}
