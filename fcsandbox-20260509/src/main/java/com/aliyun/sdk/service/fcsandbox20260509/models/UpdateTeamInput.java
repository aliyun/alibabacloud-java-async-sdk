// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link UpdateTeamInput} extends {@link TeaModel}
 *
 * <p>UpdateTeamInput</p>
 */
public class UpdateTeamInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("plan")
    private String plan;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    private UpdateTeamInput(Builder builder) {
        this.description = builder.description;
        this.plan = builder.plan;
        this.resourceGroupID = builder.resourceGroupID;
        this.teamName = builder.teamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTeamInput create() {
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

        private Builder(UpdateTeamInput model) {
            this.description = model.description;
            this.plan = model.plan;
            this.resourceGroupID = model.resourceGroupID;
            this.teamName = model.teamName;
        } 

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Development team</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * plan.
         */
        public Builder plan(String plan) {
            this.plan = plan;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwxqyrgwabcd</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The team name.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        public UpdateTeamInput build() {
            return new UpdateTeamInput(this);
        } 

    } 

}
