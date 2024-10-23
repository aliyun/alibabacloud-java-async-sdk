// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAppSecretIdsResponse} extends {@link TeaModel}
 *
 * <p>ListAppSecretIdsResponse</p>
 */
public class ListAppSecretIdsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAppSecretIdsResponseBody body;

    private ListAppSecretIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAppSecretIdsResponse create() {
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
    public ListAppSecretIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppSecretIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAppSecretIdsResponseBody body);

        @Override
        ListAppSecretIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppSecretIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAppSecretIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppSecretIdsResponse response) {
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
        public Builder body(ListAppSecretIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppSecretIdsResponse build() {
            return new ListAppSecretIdsResponse(this);
        } 

    } 

}
