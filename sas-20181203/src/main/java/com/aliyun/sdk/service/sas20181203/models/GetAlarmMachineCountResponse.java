// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlarmMachineCountResponse} extends {@link TeaModel}
 *
 * <p>GetAlarmMachineCountResponse</p>
 */
public class GetAlarmMachineCountResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAlarmMachineCountResponseBody body;

    private GetAlarmMachineCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetAlarmMachineCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAlarmMachineCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAlarmMachineCountResponseBody body);

        @Override
        GetAlarmMachineCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAlarmMachineCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetAlarmMachineCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAlarmMachineCountResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
