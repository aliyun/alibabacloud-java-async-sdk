// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateMembersResponse} extends {@link TeaModel}
 *
 * <p>AssociateMembersResponse</p>
 */
public class AssociateMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateMembersResponseBody body;

    private AssociateMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateMembersResponse create() {
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
    public AssociateMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateMembersResponseBody body);

        @Override
        AssociateMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateMembersResponse response) {
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
        public Builder body(AssociateMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateMembersResponse build() {
            return new AssociateMembersResponse(this);
        } 

    } 

}
