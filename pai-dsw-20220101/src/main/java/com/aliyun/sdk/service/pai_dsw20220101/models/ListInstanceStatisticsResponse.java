// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceStatisticsResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceStatisticsResponse</p>
 */
public class ListInstanceStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceStatisticsResponseBody body;

    private ListInstanceStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceStatisticsResponse create() {
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
    public ListInstanceStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceStatisticsResponseBody body);

        @Override
        ListInstanceStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceStatisticsResponse response) {
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
        public Builder body(ListInstanceStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceStatisticsResponse build() {
            return new ListInstanceStatisticsResponse(this);
        } 

    } 

}
