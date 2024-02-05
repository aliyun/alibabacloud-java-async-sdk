// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTodoTaskExecutorStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateTodoTaskExecutorStatusResponse</p>
 */
public class UpdateTodoTaskExecutorStatusResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateTodoTaskExecutorStatusResponseBody body;

    private UpdateTodoTaskExecutorStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateTodoTaskExecutorStatusResponse create() {
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
    public UpdateTodoTaskExecutorStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTodoTaskExecutorStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateTodoTaskExecutorStatusResponseBody body);

        @Override
        UpdateTodoTaskExecutorStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTodoTaskExecutorStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateTodoTaskExecutorStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTodoTaskExecutorStatusResponse response) {
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
        public Builder body(UpdateTodoTaskExecutorStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTodoTaskExecutorStatusResponse build() {
            return new UpdateTodoTaskExecutorStatusResponse(this);
        } 

    } 

}
