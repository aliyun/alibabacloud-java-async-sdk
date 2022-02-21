// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBoardSnapshotResponse} extends {@link TeaModel}
 *
 * <p>DescribeBoardSnapshotResponse</p>
 */
public class DescribeBoardSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBoardSnapshotResponseBody body;

    private DescribeBoardSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBoardSnapshotResponse create() {
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
    public DescribeBoardSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBoardSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBoardSnapshotResponseBody body);

        @Override
        DescribeBoardSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBoardSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBoardSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBoardSnapshotResponse response) {
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
        public Builder body(DescribeBoardSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBoardSnapshotResponse build() {
            return new DescribeBoardSnapshotResponse(this);
        } 

    } 

}
