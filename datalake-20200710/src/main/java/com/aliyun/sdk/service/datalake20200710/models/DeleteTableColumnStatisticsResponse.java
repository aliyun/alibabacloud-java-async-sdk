// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTableColumnStatisticsResponse} extends {@link TeaModel}
 *
 * <p>DeleteTableColumnStatisticsResponse</p>
 */
public class DeleteTableColumnStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTableColumnStatisticsResponseBody body;

    private DeleteTableColumnStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTableColumnStatisticsResponse create() {
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
    public DeleteTableColumnStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTableColumnStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTableColumnStatisticsResponseBody body);

        @Override
        DeleteTableColumnStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTableColumnStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTableColumnStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTableColumnStatisticsResponse response) {
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
        public Builder body(DeleteTableColumnStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTableColumnStatisticsResponse build() {
            return new DeleteTableColumnStatisticsResponse(this);
        } 

    } 

}
