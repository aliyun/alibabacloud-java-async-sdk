// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProvisionedProductPlanApproversResponse} extends {@link TeaModel}
 *
 * <p>ListProvisionedProductPlanApproversResponse</p>
 */
public class ListProvisionedProductPlanApproversResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListProvisionedProductPlanApproversResponseBody body;

    private ListProvisionedProductPlanApproversResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListProvisionedProductPlanApproversResponse create() {
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
    public ListProvisionedProductPlanApproversResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProvisionedProductPlanApproversResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListProvisionedProductPlanApproversResponseBody body);

        @Override
        ListProvisionedProductPlanApproversResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProvisionedProductPlanApproversResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListProvisionedProductPlanApproversResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProvisionedProductPlanApproversResponse response) {
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
        public Builder body(ListProvisionedProductPlanApproversResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProvisionedProductPlanApproversResponse build() {
            return new ListProvisionedProductPlanApproversResponse(this);
        } 

    } 

}
