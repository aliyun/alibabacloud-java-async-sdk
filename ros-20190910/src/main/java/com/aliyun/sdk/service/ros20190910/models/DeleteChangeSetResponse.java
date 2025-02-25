// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteChangeSetResponse} extends {@link TeaModel}
 *
 * <p>DeleteChangeSetResponse</p>
 */
public class DeleteChangeSetResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteChangeSetResponseBody body;

    private DeleteChangeSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteChangeSetResponse create() {
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
    public DeleteChangeSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteChangeSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteChangeSetResponseBody body);

        @Override
        DeleteChangeSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteChangeSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteChangeSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteChangeSetResponse response) {
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
        public Builder body(DeleteChangeSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteChangeSetResponse build() {
            return new DeleteChangeSetResponse(this);
        } 

    } 

}
