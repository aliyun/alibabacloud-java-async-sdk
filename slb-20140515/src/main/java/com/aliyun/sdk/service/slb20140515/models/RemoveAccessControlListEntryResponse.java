// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAccessControlListEntryResponse} extends {@link TeaModel}
 *
 * <p>RemoveAccessControlListEntryResponse</p>
 */
public class RemoveAccessControlListEntryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RemoveAccessControlListEntryResponseBody body;

    private RemoveAccessControlListEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RemoveAccessControlListEntryResponse create() {
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
    public RemoveAccessControlListEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveAccessControlListEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RemoveAccessControlListEntryResponseBody body);

        @Override
        RemoveAccessControlListEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveAccessControlListEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RemoveAccessControlListEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveAccessControlListEntryResponse response) {
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
        public Builder body(RemoveAccessControlListEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveAccessControlListEntryResponse build() {
            return new RemoveAccessControlListEntryResponse(this);
        } 

    } 

}
