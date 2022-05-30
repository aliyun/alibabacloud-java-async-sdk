// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoryMemberWithInheritedResponse} extends {@link TeaModel}
 *
 * <p>ListRepositoryMemberWithInheritedResponse</p>
 */
public class ListRepositoryMemberWithInheritedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepositoryMemberWithInheritedResponseBody body;

    private ListRepositoryMemberWithInheritedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepositoryMemberWithInheritedResponse create() {
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
    public ListRepositoryMemberWithInheritedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepositoryMemberWithInheritedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepositoryMemberWithInheritedResponseBody body);

        @Override
        ListRepositoryMemberWithInheritedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepositoryMemberWithInheritedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepositoryMemberWithInheritedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepositoryMemberWithInheritedResponse response) {
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
        public Builder body(ListRepositoryMemberWithInheritedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepositoryMemberWithInheritedResponse build() {
            return new ListRepositoryMemberWithInheritedResponse(this);
        } 

    } 

}
