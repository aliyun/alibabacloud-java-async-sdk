// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceMeshSlbResponse} extends {@link TeaModel}
 *
 * <p>GetServiceMeshSlbResponse</p>
 */
public class GetServiceMeshSlbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceMeshSlbResponseBody body;

    private GetServiceMeshSlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceMeshSlbResponse create() {
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
    public GetServiceMeshSlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceMeshSlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceMeshSlbResponseBody body);

        @Override
        GetServiceMeshSlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceMeshSlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceMeshSlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceMeshSlbResponse response) {
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
        public Builder body(GetServiceMeshSlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceMeshSlbResponse build() {
            return new GetServiceMeshSlbResponse(this);
        } 

    } 

}
