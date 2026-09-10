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
 * {@link E2BTeam} extends {@link TeaModel}
 *
 * <p>E2BTeam</p>
 */
public class E2BTeam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowUpdateTeamName")
    private Boolean allowUpdateTeamName;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("plan")
    private String plan;

    @com.aliyun.core.annotation.NameInMap("readOnly")
    private Boolean readOnly;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    private E2BTeam(Builder builder) {
        this.allowUpdateTeamName = builder.allowUpdateTeamName;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.plan = builder.plan;
        this.readOnly = builder.readOnly;
        this.resourceGroupID = builder.resourceGroupID;
        this.status = builder.status;
        this.teamID = builder.teamID;
        this.teamName = builder.teamName;
        this.userID = builder.userID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BTeam create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowUpdateTeamName
     */
    public Boolean getAllowUpdateTeamName() {
        return this.allowUpdateTeamName;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
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
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return teamName
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    public static final class Builder {
        private Boolean allowUpdateTeamName; 
        private String createdTime; 
        private String description; 
        private String plan; 
        private Boolean readOnly; 
        private String resourceGroupID; 
        private String status; 
        private String teamID; 
        private String teamName; 
        private String userID; 

        private Builder() {
        } 

        private Builder(E2BTeam model) {
            this.allowUpdateTeamName = model.allowUpdateTeamName;
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.plan = model.plan;
            this.readOnly = model.readOnly;
            this.resourceGroupID = model.resourceGroupID;
            this.status = model.status;
            this.teamID = model.teamID;
            this.teamName = model.teamName;
            this.userID = model.userID;
        } 

        /**
         * <p>Indicates whether the team name can be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowUpdateTeamName(Boolean allowUpdateTeamName) {
            this.allowUpdateTeamName = allowUpdateTeamName;
            return this;
        }

        /**
         * <p>The time when the team was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-23T11:26:25Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Open team</p>
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
         * readOnly.
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
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
         * <p>The status of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The unique identifier of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The name of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * <p>The UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        public E2BTeam build() {
            return new E2BTeam(this);
        } 

    } 

}
