// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterSyncGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeCasterSyncGroupResponse</p>
 */
public class DescribeCasterSyncGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCasterSyncGroupResponseBody body;

    private DescribeCasterSyncGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCasterSyncGroupResponse create() {
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
    public DescribeCasterSyncGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCasterSyncGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCasterSyncGroupResponseBody body);

        @Override
        DescribeCasterSyncGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCasterSyncGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCasterSyncGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCasterSyncGroupResponse response) {
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
        public Builder body(DescribeCasterSyncGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCasterSyncGroupResponse build() {
            return new DescribeCasterSyncGroupResponse(this);
        } 

    } 

}
