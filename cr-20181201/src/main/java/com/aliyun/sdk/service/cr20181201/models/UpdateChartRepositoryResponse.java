// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateChartRepositoryResponse} extends {@link TeaModel}
 *
 * <p>UpdateChartRepositoryResponse</p>
 */
public class UpdateChartRepositoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateChartRepositoryResponseBody body;

    private UpdateChartRepositoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateChartRepositoryResponse create() {
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
    public UpdateChartRepositoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateChartRepositoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateChartRepositoryResponseBody body);

        @Override
        UpdateChartRepositoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateChartRepositoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateChartRepositoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateChartRepositoryResponse response) {
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
        public Builder body(UpdateChartRepositoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateChartRepositoryResponse build() {
            return new UpdateChartRepositoryResponse(this);
        } 

    } 

}
