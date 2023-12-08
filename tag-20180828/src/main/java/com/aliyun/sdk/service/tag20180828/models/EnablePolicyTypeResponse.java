// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnablePolicyTypeResponse} extends {@link TeaModel}
 *
 * <p>EnablePolicyTypeResponse</p>
 */
public class EnablePolicyTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnablePolicyTypeResponseBody body;

    private EnablePolicyTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnablePolicyTypeResponse create() {
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
    public EnablePolicyTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnablePolicyTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnablePolicyTypeResponseBody body);

        @Override
        EnablePolicyTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnablePolicyTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnablePolicyTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnablePolicyTypeResponse response) {
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
        public Builder body(EnablePolicyTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnablePolicyTypeResponse build() {
            return new EnablePolicyTypeResponse(this);
        } 

    } 

}
