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
 * {@link PublicTemplate} extends {@link TeaModel}
 *
 * <p>PublicTemplate</p>
 */
public class PublicTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("runtimeConfig")
    private PublicTemplateRuntimeConfig runtimeConfig;

    @com.aliyun.core.annotation.NameInMap("status")
    private PublicTemplateStatus status;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    private PublicTemplate(Builder builder) {
        this.createdTime = builder.createdTime;
        this.name = builder.name;
        this.resourceGroupID = builder.resourceGroupID;
        this.runtimeConfig = builder.runtimeConfig;
        this.status = builder.status;
        this.teamID = builder.teamID;
        this.teamName = builder.teamName;
        this.templateID = builder.templateID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicTemplate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return runtimeConfig
     */
    public PublicTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    /**
     * @return status
     */
    public PublicTemplateStatus getStatus() {
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
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    public static final class Builder {
        private String createdTime; 
        private String name; 
        private String resourceGroupID; 
        private PublicTemplateRuntimeConfig runtimeConfig; 
        private PublicTemplateStatus status; 
        private String teamID; 
        private String teamName; 
        private String templateID; 

        private Builder() {
        } 

        private Builder(PublicTemplate model) {
            this.createdTime = model.createdTime;
            this.name = model.name;
            this.resourceGroupID = model.resourceGroupID;
            this.runtimeConfig = model.runtimeConfig;
            this.status = model.status;
            this.teamID = model.teamID;
            this.teamName = model.teamName;
            this.templateID = model.templateID;
        } 

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * runtimeConfig.
         */
        public Builder runtimeConfig(PublicTemplateRuntimeConfig runtimeConfig) {
            this.runtimeConfig = runtimeConfig;
            return this;
        }

        /**
         * status.
         */
        public Builder status(PublicTemplateStatus status) {
            this.status = status;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * teamName.
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * templateID.
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        public PublicTemplate build() {
            return new PublicTemplate(this);
        } 

    } 

}
