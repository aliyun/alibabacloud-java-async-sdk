// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowCooperatorsResponse} extends {@link TeaModel}
 *
 * <p>ListTaskFlowCooperatorsResponse</p>
 */
public class ListTaskFlowCooperatorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListTaskFlowCooperatorsResponseBody body;

    private ListTaskFlowCooperatorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListTaskFlowCooperatorsResponse create() {
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
    public ListTaskFlowCooperatorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTaskFlowCooperatorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListTaskFlowCooperatorsResponseBody body);

        @Override
        ListTaskFlowCooperatorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTaskFlowCooperatorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListTaskFlowCooperatorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTaskFlowCooperatorsResponse response) {
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
        public Builder body(ListTaskFlowCooperatorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTaskFlowCooperatorsResponse build() {
            return new ListTaskFlowCooperatorsResponse(this);
        } 

    } 

}
