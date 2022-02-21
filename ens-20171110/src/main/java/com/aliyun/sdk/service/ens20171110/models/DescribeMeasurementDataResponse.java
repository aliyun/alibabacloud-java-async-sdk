// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeasurementDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeMeasurementDataResponse</p>
 */
public class DescribeMeasurementDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMeasurementDataResponseBody body;

    private DescribeMeasurementDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMeasurementDataResponse create() {
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
    public DescribeMeasurementDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMeasurementDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMeasurementDataResponseBody body);

        @Override
        DescribeMeasurementDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMeasurementDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMeasurementDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMeasurementDataResponse response) {
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
        public Builder body(DescribeMeasurementDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMeasurementDataResponse build() {
            return new DescribeMeasurementDataResponse(this);
        } 

    } 

}
