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
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ModifyScalingConfigItemV2ResponseBody body;

    private ModifyScalingConfigItemV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ModifyScalingConfigItemV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyScalingConfigItemV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyScalingConfigItemV2ResponseBody body);

        @Override
        ModifyScalingConfigItemV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyScalingConfigItemV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyScalingConfigItemV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyScalingConfigItemV2Response response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
