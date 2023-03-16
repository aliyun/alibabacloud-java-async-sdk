// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSnapshotLinkResponse} extends {@link TeaModel}
 *
 * <p>GetSnapshotLinkResponse</p>
 */
public class GetSnapshotLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSnapshotLinkResponseBody body;

    private GetSnapshotLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSnapshotLinkResponse create() {
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
    public GetSnapshotLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSnapshotLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSnapshotLinkResponseBody body);

        @Override
        GetSnapshotLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSnapshotLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSnapshotLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSnapshotLinkResponse response) {
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
        public Builder body(GetSnapshotLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSnapshotLinkResponse build() {
            return new GetSnapshotLinkResponse(this);
        } 

    } 

}
