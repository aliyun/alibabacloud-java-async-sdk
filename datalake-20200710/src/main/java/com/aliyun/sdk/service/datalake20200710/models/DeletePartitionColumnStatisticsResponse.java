// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePartitionColumnStatisticsResponse} extends {@link TeaModel}
 *
 * <p>DeletePartitionColumnStatisticsResponse</p>
 */
public class DeletePartitionColumnStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePartitionColumnStatisticsResponseBody body;

    private DeletePartitionColumnStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePartitionColumnStatisticsResponse create() {
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
    public DeletePartitionColumnStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePartitionColumnStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePartitionColumnStatisticsResponseBody body);

        @Override
        DeletePartitionColumnStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePartitionColumnStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePartitionColumnStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePartitionColumnStatisticsResponse response) {
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
        public Builder body(DeletePartitionColumnStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePartitionColumnStatisticsResponse build() {
            return new DeletePartitionColumnStatisticsResponse(this);
        } 

    } 

}
