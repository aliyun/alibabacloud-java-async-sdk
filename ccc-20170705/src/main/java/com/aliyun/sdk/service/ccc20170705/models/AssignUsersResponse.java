// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignUsersResponse} extends {@link TeaModel}
 *
 * <p>AssignUsersResponse</p>
 */
public class AssignUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssignUsersResponseBody body;

    private AssignUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssignUsersResponse create() {
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
    public AssignUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssignUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssignUsersResponseBody body);

        @Override
        AssignUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssignUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssignUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssignUsersResponse response) {
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
        public Builder body(AssignUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssignUsersResponse build() {
            return new AssignUsersResponse(this);
        } 

    } 

}
