// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlarmMachineCountResponse} extends {@link TeaModel}
 *
 * <p>GetAlarmMachineCountResponse</p>
 */
public class GetAlarmMachineCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAlarmMachineCountResponseBody body;

    private GetAlarmMachineCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAlarmMachineCountResponse create() {
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
    public GetAlarmMachineCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAlarmMachineCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAlarmMachineCountResponseBody body);

        @Override
        GetAlarmMachineCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAlarmMachineCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAlarmMachineCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAlarmMachineCountResponse response) {
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
        public Builder body(GetAlarmMachineCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAlarmMachineCountResponse build() {
            return new GetAlarmMachineCountResponse(this);
        } 

    } 

}
