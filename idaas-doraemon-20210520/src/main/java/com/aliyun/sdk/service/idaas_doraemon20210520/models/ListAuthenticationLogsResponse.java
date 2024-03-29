// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthenticationLogsResponse} extends {@link TeaModel}
 *
 * <p>ListAuthenticationLogsResponse</p>
 */
public class ListAuthenticationLogsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListAuthenticationLogsResponseBody body;

    private ListAuthenticationLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAuthenticationLogsResponse create() {
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
    public ListAuthenticationLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAuthenticationLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAuthenticationLogsResponseBody body);

        @Override
        ListAuthenticationLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAuthenticationLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAuthenticationLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAuthenticationLogsResponse response) {
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
        public Builder body(ListAuthenticationLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAuthenticationLogsResponse build() {
            return new ListAuthenticationLogsResponse(this);
        } 

    } 

}
