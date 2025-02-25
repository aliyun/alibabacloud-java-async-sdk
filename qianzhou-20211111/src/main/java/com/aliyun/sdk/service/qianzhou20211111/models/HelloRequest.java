// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HelloRequest} extends {@link RequestModel}
 *
 * <p>HelloRequest</p>
 */
public class HelloRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user")
    private String user;

    private HelloRequest(Builder builder) {
        super(builder);
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HelloRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<HelloRequest, Builder> {
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(HelloRequest request) {
            super(request);
            this.user = request.user;
        } 

        /**
         * user.
         */
        public Builder user(String user) {
            this.putQueryParameter("user", user);
            this.user = user;
            return this;
        }

        @Override
        public HelloRequest build() {
            return new HelloRequest(this);
        } 

    } 

}
