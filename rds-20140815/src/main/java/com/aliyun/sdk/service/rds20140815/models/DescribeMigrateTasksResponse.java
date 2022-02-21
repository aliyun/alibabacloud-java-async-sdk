// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrateTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeMigrateTasksResponse</p>
 */
public class DescribeMigrateTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMigrateTasksResponseBody body;

    private DescribeMigrateTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMigrateTasksResponse create() {
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
    public DescribeMigrateTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMigrateTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMigrateTasksResponseBody body);

        @Override
        DescribeMigrateTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMigrateTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMigrateTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMigrateTasksResponse response) {
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
        public Builder body(DescribeMigrateTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMigrateTasksResponse build() {
            return new DescribeMigrateTasksResponse(this);
        } 

    } 

}
