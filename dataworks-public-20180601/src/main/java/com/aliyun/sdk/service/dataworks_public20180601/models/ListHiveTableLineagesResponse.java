// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHiveTableLineagesResponse} extends {@link TeaModel}
 *
 * <p>ListHiveTableLineagesResponse</p>
 */
public class ListHiveTableLineagesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListHiveTableLineagesResponseBody body;

    private ListHiveTableLineagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListHiveTableLineagesResponse create() {
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
    public ListHiveTableLineagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHiveTableLineagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListHiveTableLineagesResponseBody body);

        @Override
        ListHiveTableLineagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHiveTableLineagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListHiveTableLineagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHiveTableLineagesResponse response) {
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
        public Builder body(ListHiveTableLineagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHiveTableLineagesResponse build() {
            return new ListHiveTableLineagesResponse(this);
        } 

    } 

}
