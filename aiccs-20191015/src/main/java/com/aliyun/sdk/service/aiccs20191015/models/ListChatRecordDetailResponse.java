// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChatRecordDetailResponse} extends {@link TeaModel}
 *
 * <p>ListChatRecordDetailResponse</p>
 */
public class ListChatRecordDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListChatRecordDetailResponseBody body;

    private ListChatRecordDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListChatRecordDetailResponse create() {
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
    public ListChatRecordDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListChatRecordDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListChatRecordDetailResponseBody body);

        @Override
        ListChatRecordDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListChatRecordDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListChatRecordDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListChatRecordDetailResponse response) {
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
        public Builder body(ListChatRecordDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListChatRecordDetailResponse build() {
            return new ListChatRecordDetailResponse(this);
        } 

    } 

}
