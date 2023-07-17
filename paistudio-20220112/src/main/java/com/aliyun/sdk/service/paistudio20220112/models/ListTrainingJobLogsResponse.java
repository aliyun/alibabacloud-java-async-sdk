// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrainingJobLogsResponse} extends {@link TeaModel}
 *
 * <p>ListTrainingJobLogsResponse</p>
 */
public class ListTrainingJobLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTrainingJobLogsResponseBody body;

    private ListTrainingJobLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTrainingJobLogsResponse create() {
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
    public ListTrainingJobLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTrainingJobLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTrainingJobLogsResponseBody body);

        @Override
        ListTrainingJobLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTrainingJobLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTrainingJobLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTrainingJobLogsResponse response) {
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
        public Builder body(ListTrainingJobLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTrainingJobLogsResponse build() {
            return new ListTrainingJobLogsResponse(this);
        } 

    } 

}
