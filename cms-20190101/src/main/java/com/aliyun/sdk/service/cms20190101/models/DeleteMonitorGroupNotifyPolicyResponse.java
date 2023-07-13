// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitorGroupNotifyPolicyResponse} extends {@link TeaModel}
 *
 * <p>DeleteMonitorGroupNotifyPolicyResponse</p>
 */
public class DeleteMonitorGroupNotifyPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMonitorGroupNotifyPolicyResponseBody body;

    private DeleteMonitorGroupNotifyPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMonitorGroupNotifyPolicyResponse create() {
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
    public DeleteMonitorGroupNotifyPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMonitorGroupNotifyPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMonitorGroupNotifyPolicyResponseBody body);

        @Override
        DeleteMonitorGroupNotifyPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMonitorGroupNotifyPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMonitorGroupNotifyPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMonitorGroupNotifyPolicyResponse response) {
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
        public Builder body(DeleteMonitorGroupNotifyPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMonitorGroupNotifyPolicyResponse build() {
            return new DeleteMonitorGroupNotifyPolicyResponse(this);
        } 

    } 

}
