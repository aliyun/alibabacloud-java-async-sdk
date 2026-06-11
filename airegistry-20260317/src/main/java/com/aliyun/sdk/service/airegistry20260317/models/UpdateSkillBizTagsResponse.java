// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link UpdateSkillBizTagsResponse} extends {@link TeaModel}
 *
 * <p>UpdateSkillBizTagsResponse</p>
 */
public class UpdateSkillBizTagsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateSkillBizTagsResponseBody body;

    private UpdateSkillBizTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateSkillBizTagsResponse create() {
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
    public UpdateSkillBizTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSkillBizTagsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateSkillBizTagsResponseBody body);

        @Override
        UpdateSkillBizTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSkillBizTagsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateSkillBizTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSkillBizTagsResponse response) {
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
        public Builder body(UpdateSkillBizTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSkillBizTagsResponse build() {
            return new UpdateSkillBizTagsResponse(this);
        } 

    } 

}
