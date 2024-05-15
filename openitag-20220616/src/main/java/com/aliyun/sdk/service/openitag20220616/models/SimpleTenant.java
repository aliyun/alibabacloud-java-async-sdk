// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SimpleTenant} extends {@link TeaModel}
 *
 * <p>SimpleTenant</p>
 */
public class SimpleTenant extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Creator")
    private SimpleUser creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Modifier")
    private SimpleUser modifier;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("TenantName")
    private String tenantName;

    @com.aliyun.core.annotation.NameInMap("UUID")
    private String UUID;

    private SimpleTenant(Builder builder) {
        this.creator = builder.creator;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.modifier = builder.modifier;
        this.role = builder.role;
        this.tenantId = builder.tenantId;
        this.tenantName = builder.tenantName;
        this.UUID = builder.UUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimpleTenant create() {
        return builder().build();
    }

    /**
     * @return creator
     */
    public SimpleUser getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return modifier
     */
    public SimpleUser getModifier() {
        return this.modifier;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    /**
     * @return UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    public static final class Builder {
        private SimpleUser creator; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private SimpleUser modifier; 
        private String role; 
        private String tenantId; 
        private String tenantName; 
        private String UUID; 

        /**
         * Creator.
         */
        public Builder creator(SimpleUser creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Modifier.
         */
        public Builder modifier(SimpleUser modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TenantName.
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }

        /**
         * UUID.
         */
        public Builder UUID(String UUID) {
            this.UUID = UUID;
            return this;
        }

        public SimpleTenant build() {
            return new SimpleTenant(this);
        } 

    } 

}
