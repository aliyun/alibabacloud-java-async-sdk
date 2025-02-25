// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionLogResponse} extends {@link TeaModel}
 *
 * <p>ListFunctionLogResponse</p>
 */
public class ListFunctionLogResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListFunctionLogResponseBody body;

    private ListFunctionLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListFunctionLogResponse create() {
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
    public ListFunctionLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFunctionLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListFunctionLogResponseBody body);

        @Override
        ListFunctionLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFunctionLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListFunctionLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFunctionLogResponse response) {
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
        public Builder body(ListFunctionLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFunctionLogResponse build() {
            return new ListFunctionLogResponse(this);
        } 

    } 

}
