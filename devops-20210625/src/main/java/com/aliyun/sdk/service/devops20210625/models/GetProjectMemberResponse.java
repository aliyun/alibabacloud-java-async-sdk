// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectMemberResponse} extends {@link TeaModel}
 *
 * <p>GetProjectMemberResponse</p>
 */
public class GetProjectMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProjectMemberResponseBody body;

    private GetProjectMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProjectMemberResponse create() {
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
    public GetProjectMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProjectMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProjectMemberResponseBody body);

        @Override
        GetProjectMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProjectMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProjectMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProjectMemberResponse response) {
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
        public Builder body(GetProjectMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProjectMemberResponse build() {
            return new GetProjectMemberResponse(this);
        } 

    } 

}
