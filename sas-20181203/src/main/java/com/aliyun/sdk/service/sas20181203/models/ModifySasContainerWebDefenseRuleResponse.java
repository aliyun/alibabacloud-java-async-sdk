// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySasContainerWebDefenseRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifySasContainerWebDefenseRuleResponse</p>
 */
public class ModifySasContainerWebDefenseRuleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifySasContainerWebDefenseRuleResponseBody body;

    private ModifySasContainerWebDefenseRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifySasContainerWebDefenseRuleResponse create() {
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
    public ModifySasContainerWebDefenseRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySasContainerWebDefenseRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifySasContainerWebDefenseRuleResponseBody body);

        @Override
        ModifySasContainerWebDefenseRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySasContainerWebDefenseRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifySasContainerWebDefenseRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySasContainerWebDefenseRuleResponse response) {
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
        public Builder body(ModifySasContainerWebDefenseRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySasContainerWebDefenseRuleResponse build() {
            return new ModifySasContainerWebDefenseRuleResponse(this);
        } 

    } 

}
