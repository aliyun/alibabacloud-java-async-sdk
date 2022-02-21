// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSyncEcsHostTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeSyncEcsHostTaskResponse</p>
 */
public class DescribeSyncEcsHostTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSyncEcsHostTaskResponseBody body;

    private DescribeSyncEcsHostTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSyncEcsHostTaskResponse create() {
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
    public DescribeSyncEcsHostTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSyncEcsHostTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSyncEcsHostTaskResponseBody body);

        @Override
        DescribeSyncEcsHostTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSyncEcsHostTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSyncEcsHostTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSyncEcsHostTaskResponse response) {
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
        public Builder body(DescribeSyncEcsHostTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSyncEcsHostTaskResponse build() {
            return new DescribeSyncEcsHostTaskResponse(this);
        } 

    } 

}
