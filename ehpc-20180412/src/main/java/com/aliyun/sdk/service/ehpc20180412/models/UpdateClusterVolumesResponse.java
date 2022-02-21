// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClusterVolumesResponse} extends {@link TeaModel}
 *
 * <p>UpdateClusterVolumesResponse</p>
 */
public class UpdateClusterVolumesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateClusterVolumesResponseBody body;

    private UpdateClusterVolumesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateClusterVolumesResponse create() {
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
    public UpdateClusterVolumesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateClusterVolumesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateClusterVolumesResponseBody body);

        @Override
        UpdateClusterVolumesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateClusterVolumesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateClusterVolumesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateClusterVolumesResponse response) {
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
        public Builder body(UpdateClusterVolumesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateClusterVolumesResponse build() {
            return new UpdateClusterVolumesResponse(this);
        } 

    } 

}
