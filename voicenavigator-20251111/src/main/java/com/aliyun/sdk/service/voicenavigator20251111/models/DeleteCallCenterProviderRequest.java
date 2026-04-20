// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteCallCenterProviderRequest} extends {@link RequestModel}
 *
 * <p>DeleteCallCenterProviderRequest</p>
 */
public class DeleteCallCenterProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderId")
    private String providerId;

    private DeleteCallCenterProviderRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.providerId = builder.providerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCallCenterProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return providerId
     */
    public String getProviderId() {
        return this.providerId;
    }

    public static final class Builder extends Request.Builder<DeleteCallCenterProviderRequest, Builder> {
        private String instanceId; 
        private String providerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCallCenterProviderRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.providerId = request.providerId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ProviderId.
         */
        public Builder providerId(String providerId) {
            this.putBodyParameter("ProviderId", providerId);
            this.providerId = providerId;
            return this;
        }

        @Override
        public DeleteCallCenterProviderRequest build() {
            return new DeleteCallCenterProviderRequest(this);
        } 

    } 

}
