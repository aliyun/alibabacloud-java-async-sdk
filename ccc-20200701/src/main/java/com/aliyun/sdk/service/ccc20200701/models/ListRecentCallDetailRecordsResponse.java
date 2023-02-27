// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecentCallDetailRecordsResponse} extends {@link TeaModel}
 *
 * <p>ListRecentCallDetailRecordsResponse</p>
 */
public class ListRecentCallDetailRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRecentCallDetailRecordsResponseBody body;

    private ListRecentCallDetailRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRecentCallDetailRecordsResponse create() {
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
    public ListRecentCallDetailRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRecentCallDetailRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRecentCallDetailRecordsResponseBody body);

        @Override
        ListRecentCallDetailRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRecentCallDetailRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRecentCallDetailRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRecentCallDetailRecordsResponse response) {
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
        public Builder body(ListRecentCallDetailRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRecentCallDetailRecordsResponse build() {
            return new ListRecentCallDetailRecordsResponse(this);
        } 

    } 

}
