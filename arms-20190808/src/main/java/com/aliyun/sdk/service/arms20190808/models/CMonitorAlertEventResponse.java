// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CMonitorAlertEventResponse} extends {@link TeaModel}
 *
 * <p>CMonitorAlertEventResponse</p>
 */
public class CMonitorAlertEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CMonitorAlertEventResponseBody body;

    private CMonitorAlertEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CMonitorAlertEventResponse create() {
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
    public CMonitorAlertEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CMonitorAlertEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CMonitorAlertEventResponseBody body);

        @Override
        CMonitorAlertEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CMonitorAlertEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CMonitorAlertEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CMonitorAlertEventResponse response) {
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
        public Builder body(CMonitorAlertEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CMonitorAlertEventResponse build() {
            return new CMonitorAlertEventResponse(this);
        } 

    } 

}
