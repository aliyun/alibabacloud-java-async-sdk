// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePartitionColumnStatisticsResponse} extends {@link TeaModel}
 *
 * <p>UpdatePartitionColumnStatisticsResponse</p>
 */
public class UpdatePartitionColumnStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePartitionColumnStatisticsResponseBody body;

    private UpdatePartitionColumnStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePartitionColumnStatisticsResponse create() {
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
    public UpdatePartitionColumnStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePartitionColumnStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePartitionColumnStatisticsResponseBody body);

        @Override
        UpdatePartitionColumnStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePartitionColumnStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePartitionColumnStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePartitionColumnStatisticsResponse response) {
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
        public Builder body(UpdatePartitionColumnStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePartitionColumnStatisticsResponse build() {
            return new UpdatePartitionColumnStatisticsResponse(this);
        } 

    } 

}
