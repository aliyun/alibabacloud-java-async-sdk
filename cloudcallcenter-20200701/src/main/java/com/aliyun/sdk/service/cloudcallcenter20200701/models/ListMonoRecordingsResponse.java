// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMonoRecordingsResponse} extends {@link TeaModel}
 *
 * <p>ListMonoRecordingsResponse</p>
 */
public class ListMonoRecordingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMonoRecordingsResponseBody body;

    private ListMonoRecordingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMonoRecordingsResponse create() {
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
    public ListMonoRecordingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMonoRecordingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMonoRecordingsResponseBody body);

        @Override
        ListMonoRecordingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMonoRecordingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMonoRecordingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMonoRecordingsResponse response) {
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
        public Builder body(ListMonoRecordingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMonoRecordingsResponse build() {
            return new ListMonoRecordingsResponse(this);
        } 

    } 

}
