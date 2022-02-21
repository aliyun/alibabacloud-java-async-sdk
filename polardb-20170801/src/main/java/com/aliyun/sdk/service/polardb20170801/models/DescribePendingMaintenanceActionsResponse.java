// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePendingMaintenanceActionsResponse} extends {@link TeaModel}
 *
 * <p>DescribePendingMaintenanceActionsResponse</p>
 */
public class DescribePendingMaintenanceActionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePendingMaintenanceActionsResponseBody body;

    private DescribePendingMaintenanceActionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePendingMaintenanceActionsResponse create() {
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
    public DescribePendingMaintenanceActionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePendingMaintenanceActionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePendingMaintenanceActionsResponseBody body);

        @Override
        DescribePendingMaintenanceActionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePendingMaintenanceActionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePendingMaintenanceActionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePendingMaintenanceActionsResponse response) {
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
        public Builder body(DescribePendingMaintenanceActionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePendingMaintenanceActionsResponse build() {
            return new DescribePendingMaintenanceActionsResponse(this);
        } 

    } 

}
