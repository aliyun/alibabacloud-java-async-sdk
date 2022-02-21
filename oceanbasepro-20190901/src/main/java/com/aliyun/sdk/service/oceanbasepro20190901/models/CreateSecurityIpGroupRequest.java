// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityIpGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityIpGroupRequest</p>
 */
public class CreateSecurityIpGroupRequest extends Request {
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

    @Body
    @NameInMap("SecurityIps")
    @Validation(required = true)
    private String securityIps;

    private CreateSecurityIpGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.securityIpGroupName = builder.securityIpGroupName;
        this.securityIps = builder.securityIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityIpGroupRequest create() {
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

    /**
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    public static final class Builder extends Request.Builder<CreateSecurityIpGroupRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String securityIpGroupName; 
        private String securityIps; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityIpGroupRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.securityIpGroupName = response.securityIpGroupName;
            this.securityIps = response.securityIps;
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

        /**
         * IP安全白名单列表。 其为一个Json格式的数组，数组中每个对象为一个IP字符串或者IP段。最多可设置 40 个。
         */
        public Builder securityIps(String securityIps) {
            this.putBodyParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        @Override
        public CreateSecurityIpGroupRequest build() {
            return new CreateSecurityIpGroupRequest(this);
        } 

    } 

}
