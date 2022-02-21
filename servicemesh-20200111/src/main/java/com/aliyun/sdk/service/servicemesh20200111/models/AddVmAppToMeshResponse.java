// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVmAppToMeshResponse} extends {@link TeaModel}
 *
 * <p>AddVmAppToMeshResponse</p>
 */
public class AddVmAppToMeshResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddVmAppToMeshResponseBody body;

    private AddVmAppToMeshResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddVmAppToMeshResponse create() {
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
    public AddVmAppToMeshResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddVmAppToMeshResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddVmAppToMeshResponseBody body);

        @Override
        AddVmAppToMeshResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddVmAppToMeshResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddVmAppToMeshResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddVmAppToMeshResponse response) {
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
        public Builder body(AddVmAppToMeshResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddVmAppToMeshResponse build() {
            return new AddVmAppToMeshResponse(this);
        } 

    } 

}
