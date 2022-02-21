// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingGroupV2Response} extends {@link TeaModel}
 *
 * <p>ModifyScalingGroupV2Response</p>
 */
public class ModifyScalingGroupV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyScalingGroupV2ResponseBody body;

    private ModifyScalingGroupV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyScalingGroupV2Response create() {
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
    public ModifyScalingGroupV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyScalingGroupV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyScalingGroupV2ResponseBody body);

        @Override
        ModifyScalingGroupV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyScalingGroupV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyScalingGroupV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyScalingGroupV2Response response) {
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
        public Builder body(ModifyScalingGroupV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyScalingGroupV2Response build() {
            return new ModifyScalingGroupV2Response(this);
        } 

    } 

}
