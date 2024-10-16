// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetListenerAttributeRequest</p>
 */
public class GetListenerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetListenerAttributeRequest request) {
            super(request);
            this.listenerId = request.listenerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-brx2y3hqdinciz****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putBodyParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        @Override
        public GetListenerAttributeRequest build() {
            return new GetListenerAttributeRequest(this);
        } 

    } 

}
