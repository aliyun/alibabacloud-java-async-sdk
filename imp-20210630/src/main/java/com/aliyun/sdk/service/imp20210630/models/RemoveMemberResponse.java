// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveMemberResponse} extends {@link TeaModel}
 *
 * <p>RemoveMemberResponse</p>
 */
public class RemoveMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveMemberResponseBody body;

    private RemoveMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveMemberResponse create() {
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
    public RemoveMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveMemberResponseBody body);

        @Override
        RemoveMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveMemberResponse response) {
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
        public Builder body(RemoveMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveMemberResponse build() {
            return new RemoveMemberResponse(this);
        } 

    } 

}
