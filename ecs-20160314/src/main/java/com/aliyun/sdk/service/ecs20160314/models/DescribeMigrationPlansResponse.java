// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrationPlansResponse} extends {@link TeaModel}
 *
 * <p>DescribeMigrationPlansResponse</p>
 */
public class DescribeMigrationPlansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMigrationPlansResponseBody body;

    private DescribeMigrationPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMigrationPlansResponse create() {
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
    public DescribeMigrationPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMigrationPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMigrationPlansResponseBody body);

        @Override
        DescribeMigrationPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMigrationPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMigrationPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMigrationPlansResponse response) {
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
        public Builder body(DescribeMigrationPlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMigrationPlansResponse build() {
            return new DescribeMigrationPlansResponse(this);
        } 

    } 

}
