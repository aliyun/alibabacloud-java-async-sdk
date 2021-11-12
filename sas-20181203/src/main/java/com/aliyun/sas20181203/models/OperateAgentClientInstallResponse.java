// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link OperateAgentClientInstallResponse} extends {@link TeaModel}
 *
 * <p>OperateAgentClientInstallResponse</p>
 */
public class OperateAgentClientInstallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateAgentClientInstallResponseBody body;


    private OperateAgentClientInstallResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAgentClientInstallResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public OperateAgentClientInstallResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private OperateAgentClientInstallResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(OperateAgentClientInstallResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(OperateAgentClientInstallResponseBody body) {
            this.body = body;
            return this;
        }

        public OperateAgentClientInstallResponse build() {
            return new OperateAgentClientInstallResponse(this);
        } 

    } 

}
