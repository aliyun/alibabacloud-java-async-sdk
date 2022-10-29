// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepositoryMemberResponse} extends {@link TeaModel}
 *
 * <p>UpdateRepositoryMemberResponse</p>
 */
public class UpdateRepositoryMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRepositoryMemberResponseBody body;

    private UpdateRepositoryMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRepositoryMemberResponse create() {
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
    public UpdateRepositoryMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRepositoryMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRepositoryMemberResponseBody body);

        @Override
        UpdateRepositoryMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRepositoryMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRepositoryMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRepositoryMemberResponse response) {
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
        public Builder body(UpdateRepositoryMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRepositoryMemberResponse build() {
            return new UpdateRepositoryMemberResponse(this);
        } 

    } 

}
