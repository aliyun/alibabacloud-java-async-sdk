// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsOperateLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribePdnsOperateLogsResponse</p>
 */
public class DescribePdnsOperateLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePdnsOperateLogsResponseBody body;

    private DescribePdnsOperateLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePdnsOperateLogsResponse create() {
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
    public DescribePdnsOperateLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePdnsOperateLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePdnsOperateLogsResponseBody body);

        @Override
        DescribePdnsOperateLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePdnsOperateLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePdnsOperateLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePdnsOperateLogsResponse response) {
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
        public Builder body(DescribePdnsOperateLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePdnsOperateLogsResponse build() {
            return new DescribePdnsOperateLogsResponse(this);
        } 

    } 

}
