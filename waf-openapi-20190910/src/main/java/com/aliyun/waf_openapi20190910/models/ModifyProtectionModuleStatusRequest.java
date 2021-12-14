// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyProtectionModuleStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyProtectionModuleStatusRequest</p>
 */
public class ModifyProtectionModuleStatusRequest extends Request {
    @Query
    @NameInMap("DefenseType")
    private String defenseType;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ModuleStatus")
    private Integer moduleStatus;


    private ModifyProtectionModuleStatusRequest(Builder builder) {
        super(builder);
        this.defenseType = builder.defenseType;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.moduleStatus = builder.moduleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProtectionModuleStatusRequest create() {
        return builder().build();
    }

    /**
     * @return defenseType
     */
    public String getDefenseType() {
        return this.defenseType;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return moduleStatus
     */
    public Integer getModuleStatus() {
        return this.moduleStatus;
    }

    public static final class Builder extends Request.Builder {
        private String defenseType; 
        private String domain; 
        private String instanceId; 
        private Integer moduleStatus; 

        /**
         * <p>DefenseType.</p>
         */
        public Builder defenseType(String defenseType) {
            this.putQueryParameter("DefenseType", defenseType);
            this.defenseType = defenseType;
            return this;
        }

        /**
         * <p>Domain.</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>ModuleStatus.</p>
         */
        public Builder moduleStatus(Integer moduleStatus) {
            this.putQueryParameter("ModuleStatus", moduleStatus);
            this.moduleStatus = moduleStatus;
            return this;
        }

        public ModifyProtectionModuleStatusRequest build() {
            return new ModifyProtectionModuleStatusRequest(this);
        } 

    } 

}
