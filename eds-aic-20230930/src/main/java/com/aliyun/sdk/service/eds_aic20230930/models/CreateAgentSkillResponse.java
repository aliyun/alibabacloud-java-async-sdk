// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateAgentSkillResponse} extends {@link TeaModel}
 *
 * <p>CreateAgentSkillResponse</p>
 */
public class CreateAgentSkillResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateAgentSkillResponseBody body;

    private CreateAgentSkillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateAgentSkillResponse create() {
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
    public CreateAgentSkillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAgentSkillResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateAgentSkillResponseBody body);

        @Override
        CreateAgentSkillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAgentSkillResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateAgentSkillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAgentSkillResponse response) {
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
        public Builder body(CreateAgentSkillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAgentSkillResponse build() {
            return new CreateAgentSkillResponse(this);
        } 

    } 

}
