// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecentCallRecordsResponse} extends {@link TeaModel}
 *
 * <p>ListRecentCallRecordsResponse</p>
 */
public class ListRecentCallRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRecentCallRecordsResponseBody body;

    private ListRecentCallRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRecentCallRecordsResponse create() {
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
    public ListRecentCallRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRecentCallRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRecentCallRecordsResponseBody body);

        @Override
        ListRecentCallRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRecentCallRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRecentCallRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRecentCallRecordsResponse response) {
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
        public Builder body(ListRecentCallRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRecentCallRecordsResponse build() {
            return new ListRecentCallRecordsResponse(this);
        } 

    } 

}
