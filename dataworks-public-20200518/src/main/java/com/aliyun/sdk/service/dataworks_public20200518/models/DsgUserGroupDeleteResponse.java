// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DsgUserGroupDeleteResponse} extends {@link TeaModel}
 *
 * <p>DsgUserGroupDeleteResponse</p>
 */
public class DsgUserGroupDeleteResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DsgUserGroupDeleteResponseBody body;

    private DsgUserGroupDeleteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DsgUserGroupDeleteResponse create() {
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
    public DsgUserGroupDeleteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DsgUserGroupDeleteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DsgUserGroupDeleteResponseBody body);

        @Override
        DsgUserGroupDeleteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DsgUserGroupDeleteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DsgUserGroupDeleteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DsgUserGroupDeleteResponse response) {
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
        public Builder body(DsgUserGroupDeleteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DsgUserGroupDeleteResponse build() {
            return new DsgUserGroupDeleteResponse(this);
        } 

    } 

}
