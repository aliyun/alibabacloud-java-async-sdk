// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ConsoleApiProxyRequest} extends {@link RequestModel}
 *
 * <p>ConsoleApiProxyRequest</p>
 */
public class ConsoleApiProxyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ConsoleBody body;

    private ConsoleApiProxyRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsoleApiProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ConsoleBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ConsoleApiProxyRequest, Builder> {
        private ConsoleBody body; 

        private Builder() {
            super();
        } 

        private Builder(ConsoleApiProxyRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ConsoleBody body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ConsoleApiProxyRequest build() {
            return new ConsoleApiProxyRequest(this);
        } 

    } 

}
