// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectMemberResponse} extends {@link TeaModel}
 *
 * <p>CreateProjectMemberResponse</p>
 */
public class CreateProjectMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProjectMemberResponseBody body;

    private CreateProjectMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProjectMemberResponse create() {
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
    public CreateProjectMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProjectMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProjectMemberResponseBody body);

        @Override
        CreateProjectMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProjectMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProjectMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProjectMemberResponse response) {
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
        public Builder body(CreateProjectMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProjectMemberResponse build() {
            return new CreateProjectMemberResponse(this);
        } 

    } 

}
