// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivateMigrationTargetInstanceResponse} extends {@link TeaModel}
 *
 * <p>ActivateMigrationTargetInstanceResponse</p>
 */
public class ActivateMigrationTargetInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ActivateMigrationTargetInstanceResponseBody body;

    private ActivateMigrationTargetInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ActivateMigrationTargetInstanceResponse create() {
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
    public ActivateMigrationTargetInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ActivateMigrationTargetInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ActivateMigrationTargetInstanceResponseBody body);

        @Override
        ActivateMigrationTargetInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ActivateMigrationTargetInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ActivateMigrationTargetInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ActivateMigrationTargetInstanceResponse response) {
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
        public Builder body(ActivateMigrationTargetInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ActivateMigrationTargetInstanceResponse build() {
            return new ActivateMigrationTargetInstanceResponse(this);
        } 

    } 

}
