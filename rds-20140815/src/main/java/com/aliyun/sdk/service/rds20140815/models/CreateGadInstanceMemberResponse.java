// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGadInstanceMemberResponse} extends {@link TeaModel}
 *
 * <p>CreateGadInstanceMemberResponse</p>
 */
public class CreateGadInstanceMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateGadInstanceMemberResponseBody body;

    private CreateGadInstanceMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateGadInstanceMemberResponse create() {
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
    public CreateGadInstanceMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGadInstanceMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateGadInstanceMemberResponseBody body);

        @Override
        CreateGadInstanceMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGadInstanceMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateGadInstanceMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGadInstanceMemberResponse response) {
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
        public Builder body(CreateGadInstanceMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGadInstanceMemberResponse build() {
            return new CreateGadInstanceMemberResponse(this);
        } 

    } 

}
