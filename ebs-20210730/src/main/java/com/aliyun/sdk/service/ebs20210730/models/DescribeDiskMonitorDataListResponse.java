// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskMonitorDataListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiskMonitorDataListResponse</p>
 */
public class DescribeDiskMonitorDataListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiskMonitorDataListResponseBody body;

    private DescribeDiskMonitorDataListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiskMonitorDataListResponse create() {
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
    public DescribeDiskMonitorDataListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiskMonitorDataListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiskMonitorDataListResponseBody body);

        @Override
        DescribeDiskMonitorDataListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiskMonitorDataListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiskMonitorDataListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiskMonitorDataListResponse response) {
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
        public Builder body(DescribeDiskMonitorDataListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiskMonitorDataListResponse build() {
            return new DescribeDiskMonitorDataListResponse(this);
        } 

    } 

}
