// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelLifecycleRetrieveJobResponse} extends {@link TeaModel}
 *
 * <p>CancelLifecycleRetrieveJobResponse</p>
 */
public class CancelLifecycleRetrieveJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelLifecycleRetrieveJobResponseBody body;

    private CancelLifecycleRetrieveJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelLifecycleRetrieveJobResponse create() {
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
    public CancelLifecycleRetrieveJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelLifecycleRetrieveJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelLifecycleRetrieveJobResponseBody body);

        @Override
        CancelLifecycleRetrieveJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelLifecycleRetrieveJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelLifecycleRetrieveJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelLifecycleRetrieveJobResponse response) {
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
        public Builder body(CancelLifecycleRetrieveJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelLifecycleRetrieveJobResponse build() {
            return new CancelLifecycleRetrieveJobResponse(this);
        } 

    } 

}
