// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobAlertResponse} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobAlertResponse</p>
 */
public class DescribeSynchronizationJobAlertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSynchronizationJobAlertResponseBody body;

    private DescribeSynchronizationJobAlertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSynchronizationJobAlertResponse create() {
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
    public DescribeSynchronizationJobAlertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSynchronizationJobAlertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSynchronizationJobAlertResponseBody body);

        @Override
        DescribeSynchronizationJobAlertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSynchronizationJobAlertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSynchronizationJobAlertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSynchronizationJobAlertResponse response) {
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
        public Builder body(DescribeSynchronizationJobAlertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSynchronizationJobAlertResponse build() {
            return new DescribeSynchronizationJobAlertResponse(this);
        } 

    } 

}
