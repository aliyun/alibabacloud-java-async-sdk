// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionRiskyTasksResponse} extends {@link TeaModel}
 *
 * <p>ListExecutionRiskyTasksResponse</p>
 */
public class ListExecutionRiskyTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExecutionRiskyTasksResponseBody body;

    private ListExecutionRiskyTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExecutionRiskyTasksResponse create() {
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
    public ListExecutionRiskyTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExecutionRiskyTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExecutionRiskyTasksResponseBody body);

        @Override
        ListExecutionRiskyTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExecutionRiskyTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExecutionRiskyTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExecutionRiskyTasksResponse response) {
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
        public Builder body(ListExecutionRiskyTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExecutionRiskyTasksResponse build() {
            return new ListExecutionRiskyTasksResponse(this);
        } 

    } 

}
