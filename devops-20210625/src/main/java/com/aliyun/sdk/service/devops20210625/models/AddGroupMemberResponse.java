// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGroupMemberResponse} extends {@link TeaModel}
 *
 * <p>AddGroupMemberResponse</p>
 */
public class AddGroupMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddGroupMemberResponseBody body;

    private AddGroupMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddGroupMemberResponse create() {
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
    public AddGroupMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddGroupMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddGroupMemberResponseBody body);

        @Override
        AddGroupMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddGroupMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddGroupMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddGroupMemberResponse response) {
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
        public Builder body(AddGroupMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddGroupMemberResponse build() {
            return new AddGroupMemberResponse(this);
        } 

    } 

}
