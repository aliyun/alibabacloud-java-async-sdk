// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEffectiveOrdersResponse} extends {@link TeaModel}
 *
 * <p>ListEffectiveOrdersResponse</p>
 */
public class ListEffectiveOrdersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListEffectiveOrdersResponseBody body;

    private ListEffectiveOrdersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListEffectiveOrdersResponse create() {
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
    public ListEffectiveOrdersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEffectiveOrdersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListEffectiveOrdersResponseBody body);

        @Override
        ListEffectiveOrdersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEffectiveOrdersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListEffectiveOrdersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEffectiveOrdersResponse response) {
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
        public Builder body(ListEffectiveOrdersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEffectiveOrdersResponse build() {
            return new ListEffectiveOrdersResponse(this);
        } 

    } 

}
