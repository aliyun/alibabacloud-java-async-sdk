// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotlineRecordDetailResponse} extends {@link TeaModel}
 *
 * <p>ListHotlineRecordDetailResponse</p>
 */
public class ListHotlineRecordDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotlineRecordDetailResponseBody body;

    private ListHotlineRecordDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotlineRecordDetailResponse create() {
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
    public ListHotlineRecordDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotlineRecordDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotlineRecordDetailResponseBody body);

        @Override
        ListHotlineRecordDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotlineRecordDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotlineRecordDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotlineRecordDetailResponse response) {
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
        public Builder body(ListHotlineRecordDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotlineRecordDetailResponse build() {
            return new ListHotlineRecordDetailResponse(this);
        } 

    } 

}
