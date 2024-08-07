// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutomateResponseConfigStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateAutomateResponseConfigStatusResponse</p>
 */
public class UpdateAutomateResponseConfigStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateAutomateResponseConfigStatusResponseBody body;

    private UpdateAutomateResponseConfigStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateAutomateResponseConfigStatusResponse create() {
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
    public UpdateAutomateResponseConfigStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAutomateResponseConfigStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateAutomateResponseConfigStatusResponseBody body);

        @Override
        UpdateAutomateResponseConfigStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAutomateResponseConfigStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateAutomateResponseConfigStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAutomateResponseConfigStatusResponse response) {
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
        public Builder body(UpdateAutomateResponseConfigStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAutomateResponseConfigStatusResponse build() {
            return new UpdateAutomateResponseConfigStatusResponse(this);
        } 

    } 

}
