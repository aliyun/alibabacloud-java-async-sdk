// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrafficMirrorFilterRuleAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateTrafficMirrorFilterRuleAttributeResponse</p>
 */
public class UpdateTrafficMirrorFilterRuleAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTrafficMirrorFilterRuleAttributeResponseBody body;

    private UpdateTrafficMirrorFilterRuleAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTrafficMirrorFilterRuleAttributeResponse create() {
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
    public UpdateTrafficMirrorFilterRuleAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTrafficMirrorFilterRuleAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTrafficMirrorFilterRuleAttributeResponseBody body);

        @Override
        UpdateTrafficMirrorFilterRuleAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTrafficMirrorFilterRuleAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTrafficMirrorFilterRuleAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTrafficMirrorFilterRuleAttributeResponse response) {
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
        public Builder body(UpdateTrafficMirrorFilterRuleAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTrafficMirrorFilterRuleAttributeResponse build() {
            return new UpdateTrafficMirrorFilterRuleAttributeResponse(this);
        } 

    } 

}
