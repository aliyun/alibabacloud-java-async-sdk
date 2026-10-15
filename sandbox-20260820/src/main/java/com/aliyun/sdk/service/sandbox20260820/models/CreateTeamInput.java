// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link CreateTeamInput} extends {@link TeaModel}
 *
 * <p>CreateTeamInput</p>
 */
public class CreateTeamInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("plan")
    private String plan;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    private CreateTeamInput(Builder builder) {
        this.description = builder.description;
        this.plan = builder.plan;
        this.resourceGroupID = builder.resourceGroupID;
        this.teamName = builder.teamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTeamInput create() {
        return builder().build();
    }

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
     * @return plan
     */
    public String getPlan() {
        return this.plan;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return teamName
     */
    public String getTeamName() {
        return this.teamName;
    }

    public static final class Builder {
        private String description; 
        private String plan; 
        private String resourceGroupID; 
        private String teamName; 

        private Builder() {
        } 

        private Builder(CreateTeamInput model) {
            this.description = model.description;
            this.plan = model.plan;
            this.resourceGroupID = model.resourceGroupID;
            this.teamName = model.teamName;
        } 

        /**
         * <p>The description of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>Sandbox environment for the algorithm team</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The plan specification of the team. Valid values: eco (economy), std (standard), pro (professional), ent (enterprise).</p>
         * 
         * <strong>example:</strong>
         * <p>std</p>
         */
        public Builder plan(String plan) {
            this.plan = plan;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group to which the team belongs. If this parameter is not specified, the default resource group of the account is used.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-****</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The name of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>sandbox-dev</p>
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        public CreateTeamInput build() {
            return new CreateTeamInput(this);
        } 

    } 

}
