// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserGroupsByUserIdResponse} extends {@link TeaModel}
 *
 * <p>ListUserGroupsByUserIdResponse</p>
 */
public class ListUserGroupsByUserIdResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListUserGroupsByUserIdResponseBody body;

    private ListUserGroupsByUserIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListUserGroupsByUserIdResponse create() {
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
    public ListUserGroupsByUserIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserGroupsByUserIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListUserGroupsByUserIdResponseBody body);

        @Override
        ListUserGroupsByUserIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserGroupsByUserIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListUserGroupsByUserIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserGroupsByUserIdResponse response) {
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
        public Builder body(ListUserGroupsByUserIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserGroupsByUserIdResponse build() {
            return new ListUserGroupsByUserIdResponse(this);
        } 

    } 

}
