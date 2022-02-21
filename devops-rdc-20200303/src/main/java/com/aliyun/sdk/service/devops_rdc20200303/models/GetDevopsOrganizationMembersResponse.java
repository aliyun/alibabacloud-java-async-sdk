// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevopsOrganizationMembersResponse} extends {@link TeaModel}
 *
 * <p>GetDevopsOrganizationMembersResponse</p>
 */
public class GetDevopsOrganizationMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDevopsOrganizationMembersResponseBody body;

    private GetDevopsOrganizationMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDevopsOrganizationMembersResponse create() {
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
    public GetDevopsOrganizationMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDevopsOrganizationMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDevopsOrganizationMembersResponseBody body);

        @Override
        GetDevopsOrganizationMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDevopsOrganizationMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDevopsOrganizationMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDevopsOrganizationMembersResponse response) {
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
        public Builder body(GetDevopsOrganizationMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDevopsOrganizationMembersResponse build() {
            return new GetDevopsOrganizationMembersResponse(this);
        } 

    } 

}
