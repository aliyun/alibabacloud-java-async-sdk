// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertProjectMembersResponse} extends {@link TeaModel}
 *
 * <p>InsertProjectMembersResponse</p>
 */
public class InsertProjectMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InsertProjectMembersResponseBody body;

    private InsertProjectMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InsertProjectMembersResponse create() {
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
    public InsertProjectMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InsertProjectMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InsertProjectMembersResponseBody body);

        @Override
        InsertProjectMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InsertProjectMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InsertProjectMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InsertProjectMembersResponse response) {
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
        public Builder body(InsertProjectMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InsertProjectMembersResponse build() {
            return new InsertProjectMembersResponse(this);
        } 

    } 

}
