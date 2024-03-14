// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSharesFromExpressSyncResponse} extends {@link TeaModel}
 *
 * <p>RemoveSharesFromExpressSyncResponse</p>
 */
public class RemoveSharesFromExpressSyncResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private RemoveSharesFromExpressSyncResponseBody body;

    private RemoveSharesFromExpressSyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RemoveSharesFromExpressSyncResponse create() {
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
    public RemoveSharesFromExpressSyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveSharesFromExpressSyncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RemoveSharesFromExpressSyncResponseBody body);

        @Override
        RemoveSharesFromExpressSyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveSharesFromExpressSyncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RemoveSharesFromExpressSyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveSharesFromExpressSyncResponse response) {
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
        public Builder body(RemoveSharesFromExpressSyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveSharesFromExpressSyncResponse build() {
            return new RemoveSharesFromExpressSyncResponse(this);
        } 

    } 

}
