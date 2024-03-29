// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthenticatorsResponse} extends {@link TeaModel}
 *
 * <p>ListAuthenticatorsResponse</p>
 */
public class ListAuthenticatorsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListAuthenticatorsResponseBody body;

    private ListAuthenticatorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAuthenticatorsResponse create() {
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
    public ListAuthenticatorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAuthenticatorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAuthenticatorsResponseBody body);

        @Override
        ListAuthenticatorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAuthenticatorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAuthenticatorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAuthenticatorsResponse response) {
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
        public Builder body(ListAuthenticatorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAuthenticatorsResponse build() {
            return new ListAuthenticatorsResponse(this);
        } 

    } 

}
