// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMachineCanRebootResponse} extends {@link TeaModel}
 *
 * <p>DescribeMachineCanRebootResponse</p>
 */
public class DescribeMachineCanRebootResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMachineCanRebootResponseBody body;

    private DescribeMachineCanRebootResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMachineCanRebootResponse create() {
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
    public DescribeMachineCanRebootResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMachineCanRebootResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMachineCanRebootResponseBody body);

        @Override
        DescribeMachineCanRebootResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMachineCanRebootResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMachineCanRebootResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMachineCanRebootResponse response) {
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
        public Builder body(DescribeMachineCanRebootResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMachineCanRebootResponse build() {
            return new DescribeMachineCanRebootResponse(this);
        } 

    } 

}
