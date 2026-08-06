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
 * {@link E2BListedSandbox} extends {@link TeaModel}
 *
 * <p>E2BListedSandbox</p>
 */
public class E2BListedSandbox extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.NameInMap("diskSizeMB")
    private Integer diskSizeMB;

    @com.aliyun.core.annotation.NameInMap("endAt")
    private String endAt;

    @com.aliyun.core.annotation.NameInMap("memoryMB")
    private Integer memoryMB;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, String> metadata;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("sandboxID")
    private String sandboxID;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    @com.aliyun.core.annotation.NameInMap("teamPlan")
    private String teamPlan;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    private E2BListedSandbox(Builder builder) {
        this.cpuCount = builder.cpuCount;
        this.diskSizeMB = builder.diskSizeMB;
        this.endAt = builder.endAt;
        this.memoryMB = builder.memoryMB;
        this.metadata = builder.metadata;
        this.resourceGroupID = builder.resourceGroupID;
        this.sandboxID = builder.sandboxID;
        this.startedAt = builder.startedAt;
        this.state = builder.state;
        this.teamID = builder.teamID;
        this.teamName = builder.teamName;
        this.teamPlan = builder.teamPlan;
        this.templateID = builder.templateID;
        this.templateName = builder.templateName;
        this.userID = builder.userID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BListedSandbox create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return diskSizeMB
     */
    public Integer getDiskSizeMB() {
        return this.diskSizeMB;
    }

    /**
     * @return endAt
     */
    public String getEndAt() {
        return this.endAt;
    }

    /**
     * @return memoryMB
     */
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return sandboxID
     */
    public String getSandboxID() {
        return this.sandboxID;
    }

    /**
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
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
     * @return teamPlan
     */
    public String getTeamPlan() {
        return this.teamPlan;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    public static final class Builder {
        private Integer cpuCount; 
        private Integer diskSizeMB; 
        private String endAt; 
        private Integer memoryMB; 
        private java.util.Map<String, String> metadata; 
        private String resourceGroupID; 
        private String sandboxID; 
        private String startedAt; 
        private String state; 
        private String teamID; 
        private String teamName; 
        private String teamPlan; 
        private String templateID; 
        private String templateName; 
        private String userID; 

        private Builder() {
        } 

        private Builder(E2BListedSandbox model) {
            this.cpuCount = model.cpuCount;
            this.diskSizeMB = model.diskSizeMB;
            this.endAt = model.endAt;
            this.memoryMB = model.memoryMB;
            this.metadata = model.metadata;
            this.resourceGroupID = model.resourceGroupID;
            this.sandboxID = model.sandboxID;
            this.startedAt = model.startedAt;
            this.state = model.state;
            this.teamID = model.teamID;
            this.teamName = model.teamName;
            this.teamPlan = model.teamPlan;
            this.templateID = model.templateID;
            this.templateName = model.templateName;
            this.userID = model.userID;
        } 

        /**
         * cpuCount.
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * diskSizeMB.
         */
        public Builder diskSizeMB(Integer diskSizeMB) {
            this.diskSizeMB = diskSizeMB;
            return this;
        }

        /**
         * endAt.
         */
        public Builder endAt(String endAt) {
            this.endAt = endAt;
            return this;
        }

        /**
         * memoryMB.
         */
        public Builder memoryMB(Integer memoryMB) {
            this.memoryMB = memoryMB;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
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
         * sandboxID.
         */
        public Builder sandboxID(String sandboxID) {
            this.sandboxID = sandboxID;
            return this;
        }

        /**
         * startedAt.
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
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
         * teamPlan.
         */
        public Builder teamPlan(String teamPlan) {
            this.teamPlan = teamPlan;
            return this;
        }

        /**
         * templateID.
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * userID.
         */
        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        public E2BListedSandbox build() {
            return new E2BListedSandbox(this);
        } 

    } 

}
