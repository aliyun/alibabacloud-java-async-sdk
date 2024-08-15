// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntegrationConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListIntegrationConfigsResponse</p>
 */
public class ListIntegrationConfigsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListIntegrationConfigsResponseBody body;

    private ListIntegrationConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListIntegrationConfigsResponse create() {
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
    public ListIntegrationConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIntegrationConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListIntegrationConfigsResponseBody body);

        @Override
        ListIntegrationConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIntegrationConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListIntegrationConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIntegrationConfigsResponse response) {
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
        public Builder body(ListIntegrationConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIntegrationConfigsResponse build() {
            return new ListIntegrationConfigsResponse(this);
        } 

    } 

}
