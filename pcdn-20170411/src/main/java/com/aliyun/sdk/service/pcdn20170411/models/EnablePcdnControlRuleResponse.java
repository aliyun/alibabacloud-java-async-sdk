// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnablePcdnControlRuleResponse} extends {@link TeaModel}
 *
 * <p>EnablePcdnControlRuleResponse</p>
 */
public class EnablePcdnControlRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnablePcdnControlRuleResponseBody body;

    private EnablePcdnControlRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnablePcdnControlRuleResponse create() {
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
     * @return body
     */
    public EnablePcdnControlRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnablePcdnControlRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnablePcdnControlRuleResponseBody body);

        @Override
        EnablePcdnControlRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnablePcdnControlRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnablePcdnControlRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnablePcdnControlRuleResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(EnablePcdnControlRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnablePcdnControlRuleResponse build() {
            return new EnablePcdnControlRuleResponse(this);
        } 

    } 

}
