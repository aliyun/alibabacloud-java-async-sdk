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
 * {@link CreateTeamInput} extends {@link TeaModel}
 *
 * <p>CreateTeamInput</p>
 */
public class CreateTeamInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    private CreateTeamInput(Builder builder) {
        this.description = builder.description;
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
        private String resourceGroupID; 
        private String teamName; 

        private Builder() {
        } 

        private Builder(CreateTeamInput model) {
            this.description = model.description;
            this.resourceGroupID = model.resourceGroupID;
            this.teamName = model.teamName;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * resourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * teamName.
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
