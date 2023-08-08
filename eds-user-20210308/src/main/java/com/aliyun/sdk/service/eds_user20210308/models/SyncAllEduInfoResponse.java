// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncAllEduInfoResponse} extends {@link TeaModel}
 *
 * <p>SyncAllEduInfoResponse</p>
 */
public class SyncAllEduInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SyncAllEduInfoResponseBody body;

    private SyncAllEduInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SyncAllEduInfoResponse create() {
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
    public SyncAllEduInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SyncAllEduInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SyncAllEduInfoResponseBody body);

        @Override
        SyncAllEduInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SyncAllEduInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SyncAllEduInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SyncAllEduInfoResponse response) {
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
        public Builder body(SyncAllEduInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SyncAllEduInfoResponse build() {
            return new SyncAllEduInfoResponse(this);
        } 

    } 

}
