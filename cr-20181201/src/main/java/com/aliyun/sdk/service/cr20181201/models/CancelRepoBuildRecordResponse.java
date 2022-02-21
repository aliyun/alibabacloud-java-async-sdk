// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelRepoBuildRecordResponse} extends {@link TeaModel}
 *
 * <p>CancelRepoBuildRecordResponse</p>
 */
public class CancelRepoBuildRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelRepoBuildRecordResponseBody body;

    private CancelRepoBuildRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelRepoBuildRecordResponse create() {
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
    public CancelRepoBuildRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelRepoBuildRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelRepoBuildRecordResponseBody body);

        @Override
        CancelRepoBuildRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelRepoBuildRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelRepoBuildRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelRepoBuildRecordResponse response) {
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
        public Builder body(CancelRepoBuildRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelRepoBuildRecordResponse build() {
            return new CancelRepoBuildRecordResponse(this);
        } 

    } 

}
