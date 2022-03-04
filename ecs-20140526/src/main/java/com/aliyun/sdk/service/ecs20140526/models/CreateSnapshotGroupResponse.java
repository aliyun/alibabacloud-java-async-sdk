// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnapshotGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateSnapshotGroupResponse</p>
 */
public class CreateSnapshotGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSnapshotGroupResponseBody body;

    private CreateSnapshotGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSnapshotGroupResponse create() {
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
    public CreateSnapshotGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSnapshotGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSnapshotGroupResponseBody body);

        @Override
        CreateSnapshotGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSnapshotGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSnapshotGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSnapshotGroupResponse response) {
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
        public Builder body(CreateSnapshotGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSnapshotGroupResponse build() {
            return new CreateSnapshotGroupResponse(this);
        } 

    } 

}
