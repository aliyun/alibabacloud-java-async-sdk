// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAclResponse} extends {@link TeaModel}
 *
 * <p>UpdateAclResponse</p>
 */
public class UpdateAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAclResponseBody body;

    private UpdateAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAclResponse create() {
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
    public UpdateAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAclResponseBody body);

        @Override
        UpdateAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAclResponse response) {
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
        public Builder body(UpdateAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAclResponse build() {
            return new UpdateAclResponse(this);
        } 

    } 

}
