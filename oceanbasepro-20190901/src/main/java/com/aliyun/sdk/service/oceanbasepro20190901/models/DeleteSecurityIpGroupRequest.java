// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecurityIpGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecurityIpGroupRequest</p>
 */
public class DeleteSecurityIpGroupRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SecurityIpGroupName")
    @Validation(required = true)
    private String securityIpGroupName;

    private DeleteSecurityIpGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.securityIpGroupName = builder.securityIpGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityIpGroupRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityIpGroupName
     */
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    public static final class Builder extends Request.Builder<DeleteSecurityIpGroupRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String securityIpGroupName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecurityIpGroupRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.securityIpGroupName = response.securityIpGroupName;
        } 

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * IP安全白名单组的组名。 由小写英文字符开头，由小写英文字符或者数字结尾，只能包含小写英文字符，数字和下划线，长度在 2-32 个字符之间。
         */
        public Builder securityIpGroupName(String securityIpGroupName) {
            this.putBodyParameter("SecurityIpGroupName", securityIpGroupName);
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }

        @Override
        public DeleteSecurityIpGroupRequest build() {
            return new DeleteSecurityIpGroupRequest(this);
        } 

    } 

}
