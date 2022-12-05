// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamsNotifyRecordsResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsNotifyRecordsResponse</p>
 */
public class DescribeLiveStreamsNotifyRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveStreamsNotifyRecordsResponseBody body;

    private DescribeLiveStreamsNotifyRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveStreamsNotifyRecordsResponse create() {
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
    public DescribeLiveStreamsNotifyRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveStreamsNotifyRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveStreamsNotifyRecordsResponseBody body);

        @Override
        DescribeLiveStreamsNotifyRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveStreamsNotifyRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveStreamsNotifyRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveStreamsNotifyRecordsResponse response) {
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
        public Builder body(DescribeLiveStreamsNotifyRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveStreamsNotifyRecordsResponse build() {
            return new DescribeLiveStreamsNotifyRecordsResponse(this);
        } 

    } 

}
