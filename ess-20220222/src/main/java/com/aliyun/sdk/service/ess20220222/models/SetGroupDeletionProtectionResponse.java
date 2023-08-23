// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGroupDeletionProtectionResponse} extends {@link TeaModel}
 *
 * <p>SetGroupDeletionProtectionResponse</p>
 */
public class SetGroupDeletionProtectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetGroupDeletionProtectionResponseBody body;

    private SetGroupDeletionProtectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetGroupDeletionProtectionResponse create() {
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
    public SetGroupDeletionProtectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetGroupDeletionProtectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetGroupDeletionProtectionResponseBody body);

        @Override
        SetGroupDeletionProtectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetGroupDeletionProtectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetGroupDeletionProtectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetGroupDeletionProtectionResponse response) {
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
        public Builder body(SetGroupDeletionProtectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetGroupDeletionProtectionResponse build() {
            return new SetGroupDeletionProtectionResponse(this);
        } 

    } 

}
