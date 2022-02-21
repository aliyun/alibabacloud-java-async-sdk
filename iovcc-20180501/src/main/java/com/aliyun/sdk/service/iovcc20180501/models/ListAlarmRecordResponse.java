// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmRecordResponse} extends {@link TeaModel}
 *
 * <p>ListAlarmRecordResponse</p>
 */
public class ListAlarmRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlarmRecordResponseBody body;

    private ListAlarmRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlarmRecordResponse create() {
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
    public ListAlarmRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlarmRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlarmRecordResponseBody body);

        @Override
        ListAlarmRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlarmRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlarmRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlarmRecordResponse response) {
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
        public Builder body(ListAlarmRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlarmRecordResponse build() {
            return new ListAlarmRecordResponse(this);
        } 

    } 

}
