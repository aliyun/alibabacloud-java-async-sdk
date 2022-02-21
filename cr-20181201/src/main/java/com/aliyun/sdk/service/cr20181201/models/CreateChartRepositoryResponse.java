// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChartRepositoryResponse} extends {@link TeaModel}
 *
 * <p>CreateChartRepositoryResponse</p>
 */
public class CreateChartRepositoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateChartRepositoryResponseBody body;

    private CreateChartRepositoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateChartRepositoryResponse create() {
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
    public CreateChartRepositoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateChartRepositoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateChartRepositoryResponseBody body);

        @Override
        CreateChartRepositoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateChartRepositoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateChartRepositoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateChartRepositoryResponse response) {
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
        public Builder body(CreateChartRepositoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateChartRepositoryResponse build() {
            return new CreateChartRepositoryResponse(this);
        } 

    } 

}
