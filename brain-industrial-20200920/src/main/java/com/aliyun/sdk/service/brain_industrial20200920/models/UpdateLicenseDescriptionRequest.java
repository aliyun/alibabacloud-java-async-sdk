// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920.models;

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
 * {@link UpdateLicenseDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateLicenseDescriptionRequest</p>
 */
public class UpdateLicenseDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private UpdateLicenseDescriptionRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLicenseDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateLicenseDescriptionRequest, Builder> {
        private String description; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLicenseDescriptionRequest request) {
            super(request);
            this.description = request.description;
            this.instanceId = request.instanceId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateLicenseDescriptionRequest build() {
            return new UpdateLicenseDescriptionRequest(this);
        } 

    } 

}
