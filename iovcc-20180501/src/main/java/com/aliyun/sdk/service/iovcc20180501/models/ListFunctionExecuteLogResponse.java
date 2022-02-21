// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionExecuteLogResponse} extends {@link TeaModel}
 *
 * <p>ListFunctionExecuteLogResponse</p>
 */
public class ListFunctionExecuteLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFunctionExecuteLogResponseBody body;

    private ListFunctionExecuteLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFunctionExecuteLogResponse create() {
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
     * @return body
     */
    public ListFunctionExecuteLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFunctionExecuteLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFunctionExecuteLogResponseBody body);

        @Override
        ListFunctionExecuteLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFunctionExecuteLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFunctionExecuteLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFunctionExecuteLogResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(ListFunctionExecuteLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFunctionExecuteLogResponse build() {
            return new ListFunctionExecuteLogResponse(this);
        } 

    } 

}
