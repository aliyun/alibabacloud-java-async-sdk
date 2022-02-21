// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrganizationMemberResponse} extends {@link TeaModel}
 *
 * <p>GetOrganizationMemberResponse</p>
 */
public class GetOrganizationMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOrganizationMemberResponseBody body;

    private GetOrganizationMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOrganizationMemberResponse create() {
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
    public GetOrganizationMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOrganizationMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOrganizationMemberResponseBody body);

        @Override
        GetOrganizationMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOrganizationMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOrganizationMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOrganizationMemberResponse response) {
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
        public Builder body(GetOrganizationMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOrganizationMemberResponse build() {
            return new GetOrganizationMemberResponse(this);
        } 

    } 

}
