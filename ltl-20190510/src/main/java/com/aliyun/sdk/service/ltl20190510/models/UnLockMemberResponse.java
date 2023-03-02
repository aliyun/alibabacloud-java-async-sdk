// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnLockMemberResponse} extends {@link TeaModel}
 *
 * <p>UnLockMemberResponse</p>
 */
public class UnLockMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnLockMemberResponseBody body;

    private UnLockMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnLockMemberResponse create() {
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
    public UnLockMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnLockMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnLockMemberResponseBody body);

        @Override
        UnLockMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnLockMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnLockMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnLockMemberResponse response) {
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
        public Builder body(UnLockMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnLockMemberResponse build() {
            return new UnLockMemberResponse(this);
        } 

    } 

}
