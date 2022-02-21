// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaPairStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaPairStatusResponse</p>
 */
public class DescribeDiskReplicaPairStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiskReplicaPairStatusResponseBody body;

    private DescribeDiskReplicaPairStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiskReplicaPairStatusResponse create() {
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
    public DescribeDiskReplicaPairStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiskReplicaPairStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiskReplicaPairStatusResponseBody body);

        @Override
        DescribeDiskReplicaPairStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiskReplicaPairStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiskReplicaPairStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiskReplicaPairStatusResponse response) {
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
        public Builder body(DescribeDiskReplicaPairStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiskReplicaPairStatusResponse build() {
            return new DescribeDiskReplicaPairStatusResponse(this);
        } 

    } 

}
