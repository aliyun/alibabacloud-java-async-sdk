// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectMembersResponse} extends {@link TeaModel}
 *
 * <p>GetProjectMembersResponse</p>
 */
public class GetProjectMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProjectMembersResponseBody body;

    private GetProjectMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProjectMembersResponse create() {
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
    public GetProjectMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProjectMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProjectMembersResponseBody body);

        @Override
        GetProjectMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProjectMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProjectMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProjectMembersResponse response) {
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
        public Builder body(GetProjectMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProjectMembersResponse build() {
            return new GetProjectMembersResponse(this);
        } 

    } 

}
