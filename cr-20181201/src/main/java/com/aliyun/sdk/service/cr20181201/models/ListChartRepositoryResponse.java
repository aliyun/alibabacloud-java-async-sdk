// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartRepositoryResponse} extends {@link TeaModel}
 *
 * <p>ListChartRepositoryResponse</p>
 */
public class ListChartRepositoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListChartRepositoryResponseBody body;

    private ListChartRepositoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListChartRepositoryResponse create() {
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
    public ListChartRepositoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListChartRepositoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListChartRepositoryResponseBody body);

        @Override
        ListChartRepositoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListChartRepositoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListChartRepositoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListChartRepositoryResponse response) {
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
        public Builder body(ListChartRepositoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListChartRepositoryResponse build() {
            return new ListChartRepositoryResponse(this);
        } 

    } 

}
