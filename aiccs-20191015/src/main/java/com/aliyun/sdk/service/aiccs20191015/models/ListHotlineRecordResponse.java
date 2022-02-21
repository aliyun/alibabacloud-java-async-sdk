// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotlineRecordResponse} extends {@link TeaModel}
 *
 * <p>ListHotlineRecordResponse</p>
 */
public class ListHotlineRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotlineRecordResponseBody body;

    private ListHotlineRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotlineRecordResponse create() {
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
    public ListHotlineRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotlineRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotlineRecordResponseBody body);

        @Override
        ListHotlineRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotlineRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotlineRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotlineRecordResponse response) {
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
        public Builder body(ListHotlineRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotlineRecordResponse build() {
            return new ListHotlineRecordResponse(this);
        } 

    } 

}
