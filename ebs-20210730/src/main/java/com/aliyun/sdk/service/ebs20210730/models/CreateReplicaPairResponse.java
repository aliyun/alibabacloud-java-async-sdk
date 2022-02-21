// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReplicaPairResponse} extends {@link TeaModel}
 *
 * <p>CreateReplicaPairResponse</p>
 */
public class CreateReplicaPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateReplicaPairResponseBody body;

    private CreateReplicaPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateReplicaPairResponse create() {
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
    public CreateReplicaPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateReplicaPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateReplicaPairResponseBody body);

        @Override
        CreateReplicaPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateReplicaPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateReplicaPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateReplicaPairResponse response) {
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
        public Builder body(CreateReplicaPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateReplicaPairResponse build() {
            return new CreateReplicaPairResponse(this);
        } 

    } 

}
