// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStatisticLogsResponse} extends {@link TeaModel}
 *
 * <p>ListStatisticLogsResponse</p>
 */
public class ListStatisticLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStatisticLogsResponseBody body;

    private ListStatisticLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListStatisticLogsResponse create() {
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
    public ListStatisticLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListStatisticLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListStatisticLogsResponseBody body);

        @Override
        ListStatisticLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStatisticLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListStatisticLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStatisticLogsResponse response) {
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
        public Builder body(ListStatisticLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListStatisticLogsResponse build() {
            return new ListStatisticLogsResponse(this);
        } 

    } 

}
