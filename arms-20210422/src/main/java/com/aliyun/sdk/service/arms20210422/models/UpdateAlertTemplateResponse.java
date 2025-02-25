// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertTemplateResponse} extends {@link TeaModel}
 *
 * <p>UpdateAlertTemplateResponse</p>
 */
public class UpdateAlertTemplateResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateAlertTemplateResponseBody body;

    private UpdateAlertTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateAlertTemplateResponse create() {
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
    public UpdateAlertTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAlertTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateAlertTemplateResponseBody body);

        @Override
        UpdateAlertTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAlertTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateAlertTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAlertTemplateResponse response) {
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
        public Builder body(UpdateAlertTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAlertTemplateResponse build() {
            return new UpdateAlertTemplateResponse(this);
        } 

    } 

}
