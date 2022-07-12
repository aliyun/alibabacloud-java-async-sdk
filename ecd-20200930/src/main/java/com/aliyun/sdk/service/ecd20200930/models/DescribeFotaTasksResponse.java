// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFotaTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeFotaTasksResponse</p>
 */
public class DescribeFotaTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFotaTasksResponseBody body;

    private DescribeFotaTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFotaTasksResponse create() {
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
    public DescribeFotaTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFotaTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFotaTasksResponseBody body);

        @Override
        DescribeFotaTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFotaTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFotaTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFotaTasksResponse response) {
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
        public Builder body(DescribeFotaTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFotaTasksResponse build() {
            return new DescribeFotaTasksResponse(this);
        } 

    } 

}
