// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecordingsResponse} extends {@link TeaModel}
 *
 * <p>ListRecordingsResponse</p>
 */
public class ListRecordingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRecordingsResponseBody body;

    private ListRecordingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRecordingsResponse create() {
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
    public ListRecordingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRecordingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRecordingsResponseBody body);

        @Override
        ListRecordingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRecordingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRecordingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRecordingsResponse response) {
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
        public Builder body(ListRecordingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRecordingsResponse build() {
            return new ListRecordingsResponse(this);
        } 

    } 

}
