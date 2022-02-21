// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMeshTagToEcsResponse} extends {@link TeaModel}
 *
 * <p>AddMeshTagToEcsResponse</p>
 */
public class AddMeshTagToEcsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMeshTagToEcsResponseBody body;

    private AddMeshTagToEcsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMeshTagToEcsResponse create() {
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
    public AddMeshTagToEcsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMeshTagToEcsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMeshTagToEcsResponseBody body);

        @Override
        AddMeshTagToEcsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMeshTagToEcsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMeshTagToEcsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMeshTagToEcsResponse response) {
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
        public Builder body(AddMeshTagToEcsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMeshTagToEcsResponse build() {
            return new AddMeshTagToEcsResponse(this);
        } 

    } 

}
