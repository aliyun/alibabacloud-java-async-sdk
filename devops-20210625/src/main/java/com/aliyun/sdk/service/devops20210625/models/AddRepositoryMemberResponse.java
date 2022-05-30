// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRepositoryMemberResponse} extends {@link TeaModel}
 *
 * <p>AddRepositoryMemberResponse</p>
 */
public class AddRepositoryMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRepositoryMemberResponseBody body;

    private AddRepositoryMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRepositoryMemberResponse create() {
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
    public AddRepositoryMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRepositoryMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRepositoryMemberResponseBody body);

        @Override
        AddRepositoryMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRepositoryMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRepositoryMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRepositoryMemberResponse response) {
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
        public Builder body(AddRepositoryMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRepositoryMemberResponse build() {
            return new AddRepositoryMemberResponse(this);
        } 

    } 

}
