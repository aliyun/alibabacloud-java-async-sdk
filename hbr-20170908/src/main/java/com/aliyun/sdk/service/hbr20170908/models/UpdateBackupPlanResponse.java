// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>UpdateBackupPlanResponse</p>
 */
public class UpdateBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBackupPlanResponseBody body;

    private UpdateBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBackupPlanResponse create() {
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
    public UpdateBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBackupPlanResponseBody body);

        @Override
        UpdateBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBackupPlanResponse response) {
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
        public Builder body(UpdateBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBackupPlanResponse build() {
            return new UpdateBackupPlanResponse(this);
        } 

    } 

}
