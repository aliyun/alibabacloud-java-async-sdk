// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaGroupsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaGroupsResponse</p>
 */
public class DescribeDiskReplicaGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiskReplicaGroupsResponseBody body;

    private DescribeDiskReplicaGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiskReplicaGroupsResponse create() {
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
    public DescribeDiskReplicaGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiskReplicaGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiskReplicaGroupsResponseBody body);

        @Override
        DescribeDiskReplicaGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiskReplicaGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiskReplicaGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiskReplicaGroupsResponse response) {
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
        public Builder body(DescribeDiskReplicaGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiskReplicaGroupsResponse build() {
            return new DescribeDiskReplicaGroupsResponse(this);
        } 

    } 

}
