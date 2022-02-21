// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndStartBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>CreateAndStartBackupPlanResponse</p>
 */
public class CreateAndStartBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAndStartBackupPlanResponseBody body;

    private CreateAndStartBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAndStartBackupPlanResponse create() {
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
    public CreateAndStartBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAndStartBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAndStartBackupPlanResponseBody body);

        @Override
        CreateAndStartBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAndStartBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAndStartBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAndStartBackupPlanResponse response) {
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
        public Builder body(CreateAndStartBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAndStartBackupPlanResponse build() {
            return new CreateAndStartBackupPlanResponse(this);
        } 

    } 

}
