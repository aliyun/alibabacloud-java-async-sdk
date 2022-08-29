// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableInstanceAccessControlRequest} extends {@link RequestModel}
 *
 * <p>DisableInstanceAccessControlRequest</p>
 */
public class DisableInstanceAccessControlRequest extends Request {
    @Query
    @NameInMap("AclId")
    @Validation(required = true)
    private String aclId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DisableInstanceAccessControlRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableInstanceAccessControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DisableInstanceAccessControlRequest, Builder> {
        private String aclId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DisableInstanceAccessControlRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.instanceId = request.instanceId;
        } 

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DisableInstanceAccessControlRequest build() {
            return new DisableInstanceAccessControlRequest(this);
        } 

    } 

}
