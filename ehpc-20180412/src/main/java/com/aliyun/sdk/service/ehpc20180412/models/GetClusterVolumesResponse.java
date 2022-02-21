// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterVolumesResponse} extends {@link TeaModel}
 *
 * <p>GetClusterVolumesResponse</p>
 */
public class GetClusterVolumesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClusterVolumesResponseBody body;

    private GetClusterVolumesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClusterVolumesResponse create() {
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
    public GetClusterVolumesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClusterVolumesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClusterVolumesResponseBody body);

        @Override
        GetClusterVolumesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClusterVolumesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClusterVolumesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClusterVolumesResponse response) {
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
        public Builder body(GetClusterVolumesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClusterVolumesResponse build() {
            return new GetClusterVolumesResponse(this);
        } 

    } 

}
