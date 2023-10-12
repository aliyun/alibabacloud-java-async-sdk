// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDevicePropertyResponse} extends {@link TeaModel}
 *
 * <p>UpdateDevicePropertyResponse</p>
 */
public class UpdateDevicePropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDevicePropertyResponseBody body;

    private UpdateDevicePropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateDevicePropertyResponse create() {
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
    public UpdateDevicePropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDevicePropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateDevicePropertyResponseBody body);

        @Override
        UpdateDevicePropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDevicePropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateDevicePropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDevicePropertyResponse response) {
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
        public Builder body(UpdateDevicePropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDevicePropertyResponse build() {
            return new UpdateDevicePropertyResponse(this);
        } 

    } 

}
