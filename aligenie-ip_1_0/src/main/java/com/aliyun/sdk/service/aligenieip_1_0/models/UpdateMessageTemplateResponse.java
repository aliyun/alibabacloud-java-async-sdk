// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageTemplateResponse} extends {@link TeaModel}
 *
 * <p>UpdateMessageTemplateResponse</p>
 */
public class UpdateMessageTemplateResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateMessageTemplateResponseBody body;

    private UpdateMessageTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateMessageTemplateResponse create() {
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
    public UpdateMessageTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMessageTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateMessageTemplateResponseBody body);

        @Override
        UpdateMessageTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMessageTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateMessageTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMessageTemplateResponse response) {
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
        public Builder body(UpdateMessageTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMessageTemplateResponse build() {
            return new UpdateMessageTemplateResponse(this);
        } 

    } 

}
