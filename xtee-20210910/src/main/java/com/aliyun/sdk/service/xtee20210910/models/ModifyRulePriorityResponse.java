// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRulePriorityResponse} extends {@link TeaModel}
 *
 * <p>ModifyRulePriorityResponse</p>
 */
public class ModifyRulePriorityResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyRulePriorityResponseBody body;

    private ModifyRulePriorityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyRulePriorityResponse create() {
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
    public ModifyRulePriorityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRulePriorityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyRulePriorityResponseBody body);

        @Override
        ModifyRulePriorityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRulePriorityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyRulePriorityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRulePriorityResponse response) {
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
        public Builder body(ModifyRulePriorityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRulePriorityResponse build() {
            return new ModifyRulePriorityResponse(this);
        } 

    } 

}
