// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterLogsResponse} extends {@link TeaModel}
 *
 * <p>ListClusterLogsResponse</p>
 */
public class ListClusterLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterLogsResponseBody body;

    private ListClusterLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterLogsResponse create() {
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
    public ListClusterLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterLogsResponseBody body);

        @Override
        ListClusterLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterLogsResponse response) {
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
        public Builder body(ListClusterLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterLogsResponse build() {
            return new ListClusterLogsResponse(this);
        } 

    } 

}
