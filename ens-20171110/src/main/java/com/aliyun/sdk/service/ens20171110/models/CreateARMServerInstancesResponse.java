// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateARMServerInstancesResponse} extends {@link TeaModel}
 *
 * <p>CreateARMServerInstancesResponse</p>
 */
public class CreateARMServerInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateARMServerInstancesResponseBody body;

    private CreateARMServerInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateARMServerInstancesResponse create() {
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
    public CreateARMServerInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateARMServerInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateARMServerInstancesResponseBody body);

        @Override
        CreateARMServerInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateARMServerInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateARMServerInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateARMServerInstancesResponse response) {
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
        public Builder body(CreateARMServerInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateARMServerInstancesResponse build() {
            return new CreateARMServerInstancesResponse(this);
        } 

    } 

}
