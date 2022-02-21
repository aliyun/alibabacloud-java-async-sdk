// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>CreateBackupPlanResponse</p>
 */
public class CreateBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBackupPlanResponseBody body;

    private CreateBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBackupPlanResponse create() {
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
    public CreateBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBackupPlanResponseBody body);

        @Override
        CreateBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBackupPlanResponse response) {
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
        public Builder body(CreateBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBackupPlanResponse build() {
            return new CreateBackupPlanResponse(this);
        } 

    } 

}
