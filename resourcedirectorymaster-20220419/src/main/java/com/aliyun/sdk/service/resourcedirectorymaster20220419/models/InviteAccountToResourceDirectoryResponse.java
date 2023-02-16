// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteAccountToResourceDirectoryResponse} extends {@link TeaModel}
 *
 * <p>InviteAccountToResourceDirectoryResponse</p>
 */
public class InviteAccountToResourceDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InviteAccountToResourceDirectoryResponseBody body;

    private InviteAccountToResourceDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InviteAccountToResourceDirectoryResponse create() {
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
    public InviteAccountToResourceDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InviteAccountToResourceDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InviteAccountToResourceDirectoryResponseBody body);

        @Override
        InviteAccountToResourceDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InviteAccountToResourceDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InviteAccountToResourceDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InviteAccountToResourceDirectoryResponse response) {
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
        public Builder body(InviteAccountToResourceDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InviteAccountToResourceDirectoryResponse build() {
            return new InviteAccountToResourceDirectoryResponse(this);
        } 

    } 

}
