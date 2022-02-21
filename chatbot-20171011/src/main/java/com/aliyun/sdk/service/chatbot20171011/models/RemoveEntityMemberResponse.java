// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveEntityMemberResponse} extends {@link TeaModel}
 *
 * <p>RemoveEntityMemberResponse</p>
 */
public class RemoveEntityMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveEntityMemberResponseBody body;

    private RemoveEntityMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveEntityMemberResponse create() {
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
    public RemoveEntityMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveEntityMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveEntityMemberResponseBody body);

        @Override
        RemoveEntityMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveEntityMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveEntityMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveEntityMemberResponse response) {
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
        public Builder body(RemoveEntityMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveEntityMemberResponse build() {
            return new RemoveEntityMemberResponse(this);
        } 

    } 

}
