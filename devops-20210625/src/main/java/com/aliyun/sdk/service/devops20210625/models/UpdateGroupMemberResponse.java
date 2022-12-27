// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGroupMemberResponse} extends {@link TeaModel}
 *
 * <p>UpdateGroupMemberResponse</p>
 */
public class UpdateGroupMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGroupMemberResponseBody body;

    private UpdateGroupMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGroupMemberResponse create() {
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
    public UpdateGroupMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGroupMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGroupMemberResponseBody body);

        @Override
        UpdateGroupMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGroupMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGroupMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGroupMemberResponse response) {
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
        public Builder body(UpdateGroupMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGroupMemberResponse build() {
            return new UpdateGroupMemberResponse(this);
        } 

    } 

}
