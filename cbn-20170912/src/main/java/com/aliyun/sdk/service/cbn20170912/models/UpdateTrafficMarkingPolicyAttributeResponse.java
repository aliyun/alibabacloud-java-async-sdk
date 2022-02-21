// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrafficMarkingPolicyAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateTrafficMarkingPolicyAttributeResponse</p>
 */
public class UpdateTrafficMarkingPolicyAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTrafficMarkingPolicyAttributeResponseBody body;

    private UpdateTrafficMarkingPolicyAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTrafficMarkingPolicyAttributeResponse create() {
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
    public UpdateTrafficMarkingPolicyAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTrafficMarkingPolicyAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTrafficMarkingPolicyAttributeResponseBody body);

        @Override
        UpdateTrafficMarkingPolicyAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTrafficMarkingPolicyAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTrafficMarkingPolicyAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTrafficMarkingPolicyAttributeResponse response) {
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
        public Builder body(UpdateTrafficMarkingPolicyAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTrafficMarkingPolicyAttributeResponse build() {
            return new UpdateTrafficMarkingPolicyAttributeResponse(this);
        } 

    } 

}
