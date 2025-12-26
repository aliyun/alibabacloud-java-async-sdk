// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link Toolset} extends {@link TeaModel}
 *
 * <p>Toolset</p>
 */
public class Toolset extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Tools")
    private String tools;

    @com.aliyun.core.annotation.NameInMap("ToolsetConfig")
    private String toolsetConfig;

    @com.aliyun.core.annotation.NameInMap("ToolsetId")
    private String toolsetId;

    @com.aliyun.core.annotation.NameInMap("ToolsetName")
    private String toolsetName;

    @com.aliyun.core.annotation.NameInMap("ToolsetType")
    private String toolsetType;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private Toolset(Builder builder) {
        this.accessibility = builder.accessibility;
        this.creator = builder.creator;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.tools = builder.tools;
        this.toolsetConfig = builder.toolsetConfig;
        this.toolsetId = builder.toolsetId;
        this.toolsetName = builder.toolsetName;
        this.toolsetType = builder.toolsetType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Toolset create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return creator
     */
    public String getCreator() {
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
     * @return tools
     */
    public String getTools() {
        return this.tools;
    }

    /**
     * @return toolsetConfig
     */
    public String getToolsetConfig() {
        return this.toolsetConfig;
    }

    /**
     * @return toolsetId
     */
    public String getToolsetId() {
        return this.toolsetId;
    }

    /**
     * @return toolsetName
     */
    public String getToolsetName() {
        return this.toolsetName;
    }

    /**
     * @return toolsetType
     */
    public String getToolsetType() {
        return this.toolsetType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private String creator; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String tools; 
        private String toolsetConfig; 
        private String toolsetId; 
        private String toolsetName; 
        private String toolsetType; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Toolset model) {
            this.accessibility = model.accessibility;
            this.creator = model.creator;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.tools = model.tools;
            this.toolsetConfig = model.toolsetConfig;
            this.toolsetId = model.toolsetId;
            this.toolsetName = model.toolsetName;
            this.toolsetType = model.toolsetType;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
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
         * Tools.
         */
        public Builder tools(String tools) {
            this.tools = tools;
            return this;
        }

        /**
         * ToolsetConfig.
         */
        public Builder toolsetConfig(String toolsetConfig) {
            this.toolsetConfig = toolsetConfig;
            return this;
        }

        /**
         * ToolsetId.
         */
        public Builder toolsetId(String toolsetId) {
            this.toolsetId = toolsetId;
            return this;
        }

        /**
         * ToolsetName.
         */
        public Builder toolsetName(String toolsetName) {
            this.toolsetName = toolsetName;
            return this;
        }

        /**
         * ToolsetType.
         */
        public Builder toolsetType(String toolsetType) {
            this.toolsetType = toolsetType;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Toolset build() {
            return new Toolset(this);
        } 

    } 

}
