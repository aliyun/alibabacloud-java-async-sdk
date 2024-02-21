// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ChangeResourceGroupRequest</p>
 */
public class ChangeResourceGroupRequest extends Request {
    @Body
    @NameInMap("instanceId")
    private String instanceId;

    @Body
    @NameInMap("newResourceGroupId")
    private String newResourceGroupId;

    private ChangeResourceGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.newResourceGroupId = builder.newResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeResourceGroupRequest create() {
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
     * @return newResourceGroupId
     */
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public static final class Builder extends Request.Builder<ChangeResourceGroupRequest, Builder> {
        private String instanceId; 
        private String newResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeResourceGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.newResourceGroupId = request.newResourceGroupId;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * newResourceGroupId.
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.putBodyParameter("newResourceGroupId", newResourceGroupId);
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        @Override
        public ChangeResourceGroupRequest build() {
            return new ChangeResourceGroupRequest(this);
        } 

    } 

}
