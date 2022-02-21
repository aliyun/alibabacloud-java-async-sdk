// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskWarningLineResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiskWarningLineResponse</p>
 */
public class DescribeDiskWarningLineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiskWarningLineResponseBody body;

    private DescribeDiskWarningLineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiskWarningLineResponse create() {
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
    public DescribeDiskWarningLineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiskWarningLineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiskWarningLineResponseBody body);

        @Override
        DescribeDiskWarningLineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiskWarningLineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiskWarningLineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiskWarningLineResponse response) {
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
        public Builder body(DescribeDiskWarningLineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiskWarningLineResponse build() {
            return new DescribeDiskWarningLineResponse(this);
        } 

    } 

}
