// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrafficMirrorFilterAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateTrafficMirrorFilterAttributeResponse</p>
 */
public class UpdateTrafficMirrorFilterAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTrafficMirrorFilterAttributeResponseBody body;

    private UpdateTrafficMirrorFilterAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTrafficMirrorFilterAttributeResponse create() {
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
    public UpdateTrafficMirrorFilterAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTrafficMirrorFilterAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTrafficMirrorFilterAttributeResponseBody body);

        @Override
        UpdateTrafficMirrorFilterAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTrafficMirrorFilterAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTrafficMirrorFilterAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTrafficMirrorFilterAttributeResponse response) {
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
        public Builder body(UpdateTrafficMirrorFilterAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTrafficMirrorFilterAttributeResponse build() {
            return new UpdateTrafficMirrorFilterAttributeResponse(this);
        } 

    } 

}
