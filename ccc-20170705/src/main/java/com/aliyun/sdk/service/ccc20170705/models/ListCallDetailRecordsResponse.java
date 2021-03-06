// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallDetailRecordsResponse} extends {@link TeaModel}
 *
 * <p>ListCallDetailRecordsResponse</p>
 */
public class ListCallDetailRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCallDetailRecordsResponseBody body;

    private ListCallDetailRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCallDetailRecordsResponse create() {
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
    public ListCallDetailRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCallDetailRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCallDetailRecordsResponseBody body);

        @Override
        ListCallDetailRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCallDetailRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCallDetailRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCallDetailRecordsResponse response) {
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
        public Builder body(ListCallDetailRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCallDetailRecordsResponse build() {
            return new ListCallDetailRecordsResponse(this);
        } 

    } 

}
