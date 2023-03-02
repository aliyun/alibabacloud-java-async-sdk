// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMemberResponse} extends {@link TeaModel}
 *
 * <p>CreateMemberResponse</p>
 */
public class CreateMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMemberResponseBody body;

    private CreateMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMemberResponse create() {
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
    public CreateMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMemberResponseBody body);

        @Override
        CreateMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMemberResponse response) {
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
        public Builder body(CreateMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMemberResponse build() {
            return new CreateMemberResponse(this);
        } 

    } 

}
