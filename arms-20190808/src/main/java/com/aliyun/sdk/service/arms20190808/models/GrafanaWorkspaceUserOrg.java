// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceUserOrg} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceUserOrg</p>
 */
public class GrafanaWorkspaceUserOrg extends TeaModel {
    @NameInMap("orgId")
    private Long orgId;

    @NameInMap("orgName")
    private String orgName;

    @NameInMap("role")
    private String role;

    private GrafanaWorkspaceUserOrg(Builder builder) {
        this.orgId = builder.orgId;
        this.orgName = builder.orgName;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceUserOrg create() {
        return builder().build();
    }

    /**
     * @return orgId
     */
    public Long getOrgId() {
        return this.orgId;
    }

    /**
     * @return orgName
     */
    public String getOrgName() {
        return this.orgName;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder {
        private Long orgId; 
        private String orgName; 
        private String role; 

        /**
         * orgId.
         */
        public Builder orgId(Long orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
         * orgName.
         */
        public Builder orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        /**
         * role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public GrafanaWorkspaceUserOrg build() {
            return new GrafanaWorkspaceUserOrg(this);
        } 

    } 

}
