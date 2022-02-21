// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaPairsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaPairsResponse</p>
 */
public class DescribeDiskReplicaPairsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiskReplicaPairsResponseBody body;

    private DescribeDiskReplicaPairsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiskReplicaPairsResponse create() {
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
    public DescribeDiskReplicaPairsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiskReplicaPairsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiskReplicaPairsResponseBody body);

        @Override
        DescribeDiskReplicaPairsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiskReplicaPairsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiskReplicaPairsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiskReplicaPairsResponse response) {
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
        public Builder body(DescribeDiskReplicaPairsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiskReplicaPairsResponse build() {
            return new DescribeDiskReplicaPairsResponse(this);
        } 

    } 

}
