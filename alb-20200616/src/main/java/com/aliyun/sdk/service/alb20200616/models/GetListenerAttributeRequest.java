// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetListenerAttributeRequest</p>
 */
public class GetListenerAttributeRequest extends Request {
    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    private GetListenerAttributeRequest(Builder builder) {
        super(builder);
        this.listenerId = builder.listenerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListenerAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    public static final class Builder extends Request.Builder<GetListenerAttributeRequest, Builder> {
        private String listenerId; 

        private Builder() {
            super();
        } 

        private Builder(GetListenerAttributeRequest response) {
            super(response);
            this.listenerId = response.listenerId;
        } 

        /**
         * 监听标识
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        @Override
        public GetListenerAttributeRequest build() {
            return new GetListenerAttributeRequest(this);
        } 

    } 

}
