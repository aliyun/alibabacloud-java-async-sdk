// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyConsumptionTimestampResponse} extends {@link TeaModel}
 *
 * <p>ModifyConsumptionTimestampResponse</p>
 */
public class ModifyConsumptionTimestampResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyConsumptionTimestampResponseBody body;

    private ModifyConsumptionTimestampResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyConsumptionTimestampResponse create() {
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
    public ModifyConsumptionTimestampResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyConsumptionTimestampResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyConsumptionTimestampResponseBody body);

        @Override
        ModifyConsumptionTimestampResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyConsumptionTimestampResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyConsumptionTimestampResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyConsumptionTimestampResponse response) {
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
        public Builder body(ModifyConsumptionTimestampResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyConsumptionTimestampResponse build() {
            return new ModifyConsumptionTimestampResponse(this);
        } 

    } 

}
