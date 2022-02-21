// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMergeFaceGroupsJobResponse} extends {@link TeaModel}
 *
 * <p>CreateMergeFaceGroupsJobResponse</p>
 */
public class CreateMergeFaceGroupsJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMergeFaceGroupsJobResponseBody body;

    private CreateMergeFaceGroupsJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMergeFaceGroupsJobResponse create() {
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
    public CreateMergeFaceGroupsJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMergeFaceGroupsJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMergeFaceGroupsJobResponseBody body);

        @Override
        CreateMergeFaceGroupsJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMergeFaceGroupsJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMergeFaceGroupsJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMergeFaceGroupsJobResponse response) {
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
        public Builder body(CreateMergeFaceGroupsJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMergeFaceGroupsJobResponse build() {
            return new CreateMergeFaceGroupsJobResponse(this);
        } 

    } 

}
