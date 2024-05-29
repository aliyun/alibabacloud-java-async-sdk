// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeApplicationFromGroupsResponse} extends {@link TeaModel}
 *
 * <p>RevokeApplicationFromGroupsResponse</p>
 */
public class RevokeApplicationFromGroupsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RevokeApplicationFromGroupsResponseBody body;

    private RevokeApplicationFromGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RevokeApplicationFromGroupsResponse create() {
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
    public RevokeApplicationFromGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeApplicationFromGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RevokeApplicationFromGroupsResponseBody body);

        @Override
        RevokeApplicationFromGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeApplicationFromGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RevokeApplicationFromGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeApplicationFromGroupsResponse response) {
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
        public Builder body(RevokeApplicationFromGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeApplicationFromGroupsResponse build() {
            return new RevokeApplicationFromGroupsResponse(this);
        } 

    } 

}
