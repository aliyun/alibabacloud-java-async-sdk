// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskOpsActivityResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiskOpsActivityResponse</p>
 */
public class DescribeDiskOpsActivityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiskOpsActivityResponseBody body;

    private DescribeDiskOpsActivityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiskOpsActivityResponse create() {
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
    public DescribeDiskOpsActivityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiskOpsActivityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiskOpsActivityResponseBody body);

        @Override
        DescribeDiskOpsActivityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiskOpsActivityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiskOpsActivityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiskOpsActivityResponse response) {
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
        public Builder body(DescribeDiskOpsActivityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiskOpsActivityResponse build() {
            return new DescribeDiskOpsActivityResponse(this);
        } 

    } 

}
