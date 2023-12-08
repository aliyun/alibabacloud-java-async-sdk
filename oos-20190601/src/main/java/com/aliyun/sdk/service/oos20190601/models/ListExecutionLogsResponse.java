// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionLogsResponse} extends {@link TeaModel}
 *
 * <p>ListExecutionLogsResponse</p>
 */
public class ListExecutionLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExecutionLogsResponseBody body;

    private ListExecutionLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExecutionLogsResponse create() {
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
    public ListExecutionLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExecutionLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExecutionLogsResponseBody body);

        @Override
        ListExecutionLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExecutionLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExecutionLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExecutionLogsResponse response) {
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
        public Builder body(ListExecutionLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExecutionLogsResponse build() {
            return new ListExecutionLogsResponse(this);
        } 

    } 

}
