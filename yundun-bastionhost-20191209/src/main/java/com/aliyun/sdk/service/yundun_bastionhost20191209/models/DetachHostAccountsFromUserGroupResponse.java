// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetachHostAccountsFromUserGroupResponse} extends {@link TeaModel}
 *
 * <p>DetachHostAccountsFromUserGroupResponse</p>
 */
public class DetachHostAccountsFromUserGroupResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DetachHostAccountsFromUserGroupResponseBody body;

    private DetachHostAccountsFromUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DetachHostAccountsFromUserGroupResponse create() {
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
    public DetachHostAccountsFromUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachHostAccountsFromUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DetachHostAccountsFromUserGroupResponseBody body);

        @Override
        DetachHostAccountsFromUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachHostAccountsFromUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DetachHostAccountsFromUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachHostAccountsFromUserGroupResponse response) {
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
        public Builder body(DetachHostAccountsFromUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachHostAccountsFromUserGroupResponse build() {
            return new DetachHostAccountsFromUserGroupResponse(this);
        } 

    } 

}
