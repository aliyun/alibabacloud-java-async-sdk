// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportOnlineResizeDiskResponse} extends {@link TeaModel}
 *
 * <p>DescribeSupportOnlineResizeDiskResponse</p>
 */
public class DescribeSupportOnlineResizeDiskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSupportOnlineResizeDiskResponseBody body;

    private DescribeSupportOnlineResizeDiskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSupportOnlineResizeDiskResponse create() {
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
    public DescribeSupportOnlineResizeDiskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSupportOnlineResizeDiskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSupportOnlineResizeDiskResponseBody body);

        @Override
        DescribeSupportOnlineResizeDiskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSupportOnlineResizeDiskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSupportOnlineResizeDiskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSupportOnlineResizeDiskResponse response) {
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
        public Builder body(DescribeSupportOnlineResizeDiskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSupportOnlineResizeDiskResponse build() {
            return new DescribeSupportOnlineResizeDiskResponse(this);
        } 

    } 

}
