// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelAutoSnapshotPolicyResponse} extends {@link TeaModel}
 *
 * <p>CancelAutoSnapshotPolicyResponse</p>
 */
public class CancelAutoSnapshotPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelAutoSnapshotPolicyResponseBody body;

    private CancelAutoSnapshotPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelAutoSnapshotPolicyResponse create() {
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
    public CancelAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelAutoSnapshotPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelAutoSnapshotPolicyResponseBody body);

        @Override
        CancelAutoSnapshotPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelAutoSnapshotPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelAutoSnapshotPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelAutoSnapshotPolicyResponse response) {
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
        public Builder body(CancelAutoSnapshotPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelAutoSnapshotPolicyResponse build() {
            return new CancelAutoSnapshotPolicyResponse(this);
        } 

    } 

}
