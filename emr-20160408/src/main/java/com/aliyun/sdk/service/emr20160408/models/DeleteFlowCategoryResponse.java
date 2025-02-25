// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowCategoryResponse} extends {@link TeaModel}
 *
 * <p>DeleteFlowCategoryResponse</p>
 */
public class DeleteFlowCategoryResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DeleteFlowCategoryResponseBody body;

    private DeleteFlowCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteFlowCategoryResponse create() {
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
    public DeleteFlowCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFlowCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteFlowCategoryResponseBody body);

        @Override
        DeleteFlowCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFlowCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteFlowCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFlowCategoryResponse response) {
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
        public Builder body(DeleteFlowCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFlowCategoryResponse build() {
            return new DeleteFlowCategoryResponse(this);
        } 

    } 

}
