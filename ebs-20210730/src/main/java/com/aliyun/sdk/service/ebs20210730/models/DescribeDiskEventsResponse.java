// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskEventsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiskEventsResponse</p>
 */
public class DescribeDiskEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiskEventsResponseBody body;

    private DescribeDiskEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiskEventsResponse create() {
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
    public DescribeDiskEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiskEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiskEventsResponseBody body);

        @Override
        DescribeDiskEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiskEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiskEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiskEventsResponse response) {
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
        public Builder body(DescribeDiskEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiskEventsResponse build() {
            return new DescribeDiskEventsResponse(this);
        } 

    } 

}
