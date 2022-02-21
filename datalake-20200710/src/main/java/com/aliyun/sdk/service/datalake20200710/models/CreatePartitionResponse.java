// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePartitionResponse} extends {@link TeaModel}
 *
 * <p>CreatePartitionResponse</p>
 */
public class CreatePartitionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePartitionResponseBody body;

    private CreatePartitionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePartitionResponse create() {
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
    public CreatePartitionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePartitionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePartitionResponseBody body);

        @Override
        CreatePartitionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePartitionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePartitionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePartitionResponse response) {
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
        public Builder body(CreatePartitionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePartitionResponse build() {
            return new CreatePartitionResponse(this);
        } 

    } 

}
