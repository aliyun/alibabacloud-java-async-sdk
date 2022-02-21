// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CalculateDBInstanceWeightResponse} extends {@link TeaModel}
 *
 * <p>CalculateDBInstanceWeightResponse</p>
 */
public class CalculateDBInstanceWeightResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CalculateDBInstanceWeightResponseBody body;

    private CalculateDBInstanceWeightResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CalculateDBInstanceWeightResponse create() {
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
    public CalculateDBInstanceWeightResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CalculateDBInstanceWeightResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CalculateDBInstanceWeightResponseBody body);

        @Override
        CalculateDBInstanceWeightResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CalculateDBInstanceWeightResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CalculateDBInstanceWeightResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CalculateDBInstanceWeightResponse response) {
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
        public Builder body(CalculateDBInstanceWeightResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CalculateDBInstanceWeightResponse build() {
            return new CalculateDBInstanceWeightResponse(this);
        } 

    } 

}
