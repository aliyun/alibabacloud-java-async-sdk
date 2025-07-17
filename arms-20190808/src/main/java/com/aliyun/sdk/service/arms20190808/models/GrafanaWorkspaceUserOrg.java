// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GrafanaWorkspaceUserOrg} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceUserOrg</p>
 */
public class GrafanaWorkspaceUserOrg extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("orgId")
    private Long orgId;

    @com.aliyun.core.annotation.NameInMap("orgName")
    private String orgName;

    @com.aliyun.core.annotation.NameInMap("role")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GrafanaWorkspaceUserOrg model) {
            this.orgId = model.orgId;
            this.orgName = model.orgName;
            this.role = model.role;
        } 

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
