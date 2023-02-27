// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLegacyAppraiseLogsResponse} extends {@link TeaModel}
 *
 * <p>ListLegacyAppraiseLogsResponse</p>
 */
public class ListLegacyAppraiseLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLegacyAppraiseLogsResponseBody body;

    private ListLegacyAppraiseLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLegacyAppraiseLogsResponse create() {
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
    public ListLegacyAppraiseLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLegacyAppraiseLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLegacyAppraiseLogsResponseBody body);

        @Override
        ListLegacyAppraiseLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLegacyAppraiseLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLegacyAppraiseLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLegacyAppraiseLogsResponse response) {
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
        public Builder body(ListLegacyAppraiseLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLegacyAppraiseLogsResponse build() {
            return new ListLegacyAppraiseLogsResponse(this);
        } 

    } 

}
