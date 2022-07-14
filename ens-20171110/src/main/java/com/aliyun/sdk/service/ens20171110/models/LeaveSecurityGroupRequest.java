// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LeaveSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>LeaveSecurityGroupRequest</p>
 */
public class LeaveSecurityGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private LeaveSecurityGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.securityGroupId = builder.securityGroupId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LeaveSecurityGroupRequest create() {
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<LeaveSecurityGroupRequest, Builder> {
        private String instanceId; 
        private String securityGroupId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(LeaveSecurityGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.securityGroupId = request.securityGroupId;
            this.version = request.version;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public LeaveSecurityGroupRequest build() {
            return new LeaveSecurityGroupRequest(this);
        } 

    } 

}
