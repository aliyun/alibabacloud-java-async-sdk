// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddClusterServiceResponse} extends {@link TeaModel}
 *
 * <p>AddClusterServiceResponse</p>
 */
public class AddClusterServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddClusterServiceResponseBody body;

    private AddClusterServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddClusterServiceResponse create() {
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
    public AddClusterServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddClusterServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddClusterServiceResponseBody body);

        @Override
        AddClusterServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddClusterServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddClusterServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddClusterServiceResponse response) {
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
        public Builder body(AddClusterServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddClusterServiceResponse build() {
            return new AddClusterServiceResponse(this);
        } 

    } 

}
