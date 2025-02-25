// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRefund4DistributionResponse} extends {@link TeaModel}
 *
 * <p>ModifyRefund4DistributionResponse</p>
 */
public class ModifyRefund4DistributionResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ModifyRefund4DistributionResponseBody body;

    private ModifyRefund4DistributionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyRefund4DistributionResponse create() {
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
    public ModifyRefund4DistributionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRefund4DistributionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyRefund4DistributionResponseBody body);

        @Override
        ModifyRefund4DistributionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRefund4DistributionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyRefund4DistributionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRefund4DistributionResponse response) {
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
        public Builder body(ModifyRefund4DistributionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRefund4DistributionResponse build() {
            return new ModifyRefund4DistributionResponse(this);
        } 

    } 

}
