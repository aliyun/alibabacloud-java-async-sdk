// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrateTaskByIdResponse} extends {@link TeaModel}
 *
 * <p>DescribeMigrateTaskByIdResponse</p>
 */
public class DescribeMigrateTaskByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMigrateTaskByIdResponseBody body;

    private DescribeMigrateTaskByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMigrateTaskByIdResponse create() {
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
    public DescribeMigrateTaskByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMigrateTaskByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMigrateTaskByIdResponseBody body);

        @Override
        DescribeMigrateTaskByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMigrateTaskByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMigrateTaskByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMigrateTaskByIdResponse response) {
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
        public Builder body(DescribeMigrateTaskByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMigrateTaskByIdResponse build() {
            return new DescribeMigrateTaskByIdResponse(this);
        } 

    } 

}
