// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReupgradeOTATaskResponse} extends {@link TeaModel}
 *
 * <p>ReupgradeOTATaskResponse</p>
 */
public class ReupgradeOTATaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReupgradeOTATaskResponseBody body;

    private ReupgradeOTATaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReupgradeOTATaskResponse create() {
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
    public ReupgradeOTATaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReupgradeOTATaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReupgradeOTATaskResponseBody body);

        @Override
        ReupgradeOTATaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReupgradeOTATaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReupgradeOTATaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReupgradeOTATaskResponse response) {
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
        public Builder body(ReupgradeOTATaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReupgradeOTATaskResponse build() {
            return new ReupgradeOTATaskResponse(this);
        } 

    } 

}
