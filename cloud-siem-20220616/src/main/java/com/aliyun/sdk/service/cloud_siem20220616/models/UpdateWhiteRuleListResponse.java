// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWhiteRuleListResponse} extends {@link TeaModel}
 *
 * <p>UpdateWhiteRuleListResponse</p>
 */
public class UpdateWhiteRuleListResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateWhiteRuleListResponseBody body;

    private UpdateWhiteRuleListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateWhiteRuleListResponse create() {
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
    public UpdateWhiteRuleListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWhiteRuleListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateWhiteRuleListResponseBody body);

        @Override
        UpdateWhiteRuleListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWhiteRuleListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateWhiteRuleListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWhiteRuleListResponse response) {
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
        public Builder body(UpdateWhiteRuleListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWhiteRuleListResponse build() {
            return new UpdateWhiteRuleListResponse(this);
        } 

    } 

}
