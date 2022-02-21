// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotlineRecordsResponse} extends {@link TeaModel}
 *
 * <p>ListHotlineRecordsResponse</p>
 */
public class ListHotlineRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotlineRecordsResponseBody body;

    private ListHotlineRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotlineRecordsResponse create() {
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
    public ListHotlineRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotlineRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotlineRecordsResponseBody body);

        @Override
        ListHotlineRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotlineRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotlineRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotlineRecordsResponse response) {
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
        public Builder body(ListHotlineRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotlineRecordsResponse build() {
            return new ListHotlineRecordsResponse(this);
        } 

    } 

}
