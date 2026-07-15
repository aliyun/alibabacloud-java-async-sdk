// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateAiModelProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateAiModelProviderRequest</p>
 */
public class UpdateAiModelProviderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelProviderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelProviderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceIds")
    private java.util.List<String> serviceIds;

    private UpdateAiModelProviderRequest(Builder builder) {
        super(builder);
        this.modelProviderId = builder.modelProviderId;
        this.displayName = builder.displayName;
        this.serviceIds = builder.serviceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAiModelProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelProviderId
     */
    public String getModelProviderId() {
        return this.modelProviderId;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return serviceIds
     */
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    public static final class Builder extends Request.Builder<UpdateAiModelProviderRequest, Builder> {
        private String modelProviderId; 
        private String displayName; 
        private java.util.List<String> serviceIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAiModelProviderRequest request) {
            super(request);
            this.modelProviderId = request.modelProviderId;
            this.displayName = request.displayName;
            this.serviceIds = request.serviceIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mp-8c13d2b4f8a1</p>
         */
        public Builder modelProviderId(String modelProviderId) {
            this.putPathParameter("modelProviderId", modelProviderId);
            this.modelProviderId = modelProviderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * serviceIds.
         */
        public Builder serviceIds(java.util.List<String> serviceIds) {
            this.putBodyParameter("serviceIds", serviceIds);
            this.serviceIds = serviceIds;
            return this;
        }

        @Override
        public UpdateAiModelProviderRequest build() {
            return new UpdateAiModelProviderRequest(this);
        } 

    } 

}
