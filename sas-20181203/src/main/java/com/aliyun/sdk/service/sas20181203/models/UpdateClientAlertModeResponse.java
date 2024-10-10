// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateClientAlertModeResponse} extends {@link TeaModel}
 *
 * <p>UpdateClientAlertModeResponse</p>
 */
public class UpdateClientAlertModeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateClientAlertModeResponseBody body;

    private UpdateClientAlertModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateClientAlertModeResponse create() {
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
    public UpdateClientAlertModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateClientAlertModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateClientAlertModeResponseBody body);

        @Override
        UpdateClientAlertModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateClientAlertModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateClientAlertModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateClientAlertModeResponse response) {
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
        public Builder body(UpdateClientAlertModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateClientAlertModeResponse build() {
            return new UpdateClientAlertModeResponse(this);
        } 

    } 

}
