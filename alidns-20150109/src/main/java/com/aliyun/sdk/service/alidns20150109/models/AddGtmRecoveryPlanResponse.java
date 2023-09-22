// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmRecoveryPlanResponse} extends {@link TeaModel}
 *
 * <p>AddGtmRecoveryPlanResponse</p>
 */
public class AddGtmRecoveryPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private AddGtmRecoveryPlanResponseBody body;

    private AddGtmRecoveryPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddGtmRecoveryPlanResponse create() {
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
    public AddGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddGtmRecoveryPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddGtmRecoveryPlanResponseBody body);

        @Override
        AddGtmRecoveryPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddGtmRecoveryPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddGtmRecoveryPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddGtmRecoveryPlanResponse response) {
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
        public Builder body(AddGtmRecoveryPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddGtmRecoveryPlanResponse build() {
            return new AddGtmRecoveryPlanResponse(this);
        } 

    } 

}
