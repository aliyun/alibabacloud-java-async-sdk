// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePendingMaintenanceActionResponse} extends {@link TeaModel}
 *
 * <p>DescribePendingMaintenanceActionResponse</p>
 */
public class DescribePendingMaintenanceActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePendingMaintenanceActionResponseBody body;

    private DescribePendingMaintenanceActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePendingMaintenanceActionResponse create() {
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
    public DescribePendingMaintenanceActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePendingMaintenanceActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePendingMaintenanceActionResponseBody body);

        @Override
        DescribePendingMaintenanceActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePendingMaintenanceActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePendingMaintenanceActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePendingMaintenanceActionResponse response) {
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
        public Builder body(DescribePendingMaintenanceActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePendingMaintenanceActionResponse build() {
            return new DescribePendingMaintenanceActionResponse(this);
        } 

    } 

}
