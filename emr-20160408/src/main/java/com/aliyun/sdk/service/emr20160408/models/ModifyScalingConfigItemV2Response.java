// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingConfigItemV2Response} extends {@link TeaModel}
 *
 * <p>ModifyScalingConfigItemV2Response</p>
 */
public class ModifyScalingConfigItemV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyScalingConfigItemV2ResponseBody body;

    private ModifyScalingConfigItemV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyScalingConfigItemV2Response create() {
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
    public ModifyScalingConfigItemV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyScalingConfigItemV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyScalingConfigItemV2ResponseBody body);

        @Override
        ModifyScalingConfigItemV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyScalingConfigItemV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyScalingConfigItemV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyScalingConfigItemV2Response response) {
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
        public Builder body(ModifyScalingConfigItemV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyScalingConfigItemV2Response build() {
            return new ModifyScalingConfigItemV2Response(this);
        } 

    } 

}
