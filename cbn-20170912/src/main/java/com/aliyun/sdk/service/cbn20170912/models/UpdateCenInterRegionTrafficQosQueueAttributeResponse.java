// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCenInterRegionTrafficQosQueueAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateCenInterRegionTrafficQosQueueAttributeResponse</p>
 */
public class UpdateCenInterRegionTrafficQosQueueAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCenInterRegionTrafficQosQueueAttributeResponseBody body;

    private UpdateCenInterRegionTrafficQosQueueAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCenInterRegionTrafficQosQueueAttributeResponse create() {
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
    public UpdateCenInterRegionTrafficQosQueueAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCenInterRegionTrafficQosQueueAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCenInterRegionTrafficQosQueueAttributeResponseBody body);

        @Override
        UpdateCenInterRegionTrafficQosQueueAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCenInterRegionTrafficQosQueueAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCenInterRegionTrafficQosQueueAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCenInterRegionTrafficQosQueueAttributeResponse response) {
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
        public Builder body(UpdateCenInterRegionTrafficQosQueueAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCenInterRegionTrafficQosQueueAttributeResponse build() {
            return new UpdateCenInterRegionTrafficQosQueueAttributeResponse(this);
        } 

    } 

}
