// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventCenterRecordResponse} extends {@link TeaModel}
 *
 * <p>ListEventCenterRecordResponse</p>
 */
public class ListEventCenterRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEventCenterRecordResponseBody body;

    private ListEventCenterRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEventCenterRecordResponse create() {
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
    public ListEventCenterRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEventCenterRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEventCenterRecordResponseBody body);

        @Override
        ListEventCenterRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEventCenterRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEventCenterRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEventCenterRecordResponse response) {
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
        public Builder body(ListEventCenterRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEventCenterRecordResponse build() {
            return new ListEventCenterRecordResponse(this);
        } 

    } 

}
