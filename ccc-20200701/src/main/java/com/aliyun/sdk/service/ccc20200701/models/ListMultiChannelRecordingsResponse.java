// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiChannelRecordingsResponse} extends {@link TeaModel}
 *
 * <p>ListMultiChannelRecordingsResponse</p>
 */
public class ListMultiChannelRecordingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMultiChannelRecordingsResponseBody body;

    private ListMultiChannelRecordingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMultiChannelRecordingsResponse create() {
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
    public ListMultiChannelRecordingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMultiChannelRecordingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMultiChannelRecordingsResponseBody body);

        @Override
        ListMultiChannelRecordingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMultiChannelRecordingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMultiChannelRecordingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMultiChannelRecordingsResponse response) {
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
        public Builder body(ListMultiChannelRecordingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMultiChannelRecordingsResponse build() {
            return new ListMultiChannelRecordingsResponse(this);
        } 

    } 

}
