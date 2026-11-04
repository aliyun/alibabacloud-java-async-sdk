// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePolarClawSkillTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreatePolarClawSkillTemplateResponse</p>
 */
public class CreatePolarClawSkillTemplateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreatePolarClawSkillTemplateResponseBody body;

    private CreatePolarClawSkillTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreatePolarClawSkillTemplateResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public CreatePolarClawSkillTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePolarClawSkillTemplateResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreatePolarClawSkillTemplateResponseBody body);

        @Override
        CreatePolarClawSkillTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePolarClawSkillTemplateResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreatePolarClawSkillTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePolarClawSkillTemplateResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(CreatePolarClawSkillTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePolarClawSkillTemplateResponse build() {
            return new CreatePolarClawSkillTemplateResponse(this);
        } 

    } 

}
