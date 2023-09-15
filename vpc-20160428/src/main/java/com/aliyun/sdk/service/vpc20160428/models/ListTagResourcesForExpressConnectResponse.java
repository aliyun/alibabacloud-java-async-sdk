// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagResourcesForExpressConnectResponse} extends {@link TeaModel}
 *
 * <p>ListTagResourcesForExpressConnectResponse</p>
 */
public class ListTagResourcesForExpressConnectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListTagResourcesForExpressConnectResponseBody body;

    private ListTagResourcesForExpressConnectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListTagResourcesForExpressConnectResponse create() {
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
    public ListTagResourcesForExpressConnectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTagResourcesForExpressConnectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListTagResourcesForExpressConnectResponseBody body);

        @Override
        ListTagResourcesForExpressConnectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTagResourcesForExpressConnectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListTagResourcesForExpressConnectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTagResourcesForExpressConnectResponse response) {
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
        public Builder body(ListTagResourcesForExpressConnectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTagResourcesForExpressConnectResponse build() {
            return new ListTagResourcesForExpressConnectResponse(this);
        } 

    } 

}
