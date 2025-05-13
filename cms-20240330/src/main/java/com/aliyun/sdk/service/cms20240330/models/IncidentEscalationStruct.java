// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentEscalationStruct} extends {@link TeaModel}
 *
 * <p>IncidentEscalationStruct</p>
 */
public class IncidentEscalationStruct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("incidentEscalationId")
    private String incidentEscalationId;

    @com.aliyun.core.annotation.NameInMap("modifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("stage")
    private java.util.List<IncidentEscalationStageStruct> stage;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private IncidentEscalationStruct(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.incidentEscalationId = builder.incidentEscalationId;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.stage = builder.stage;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentEscalationStruct create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return incidentEscalationId
     */
    public String getIncidentEscalationId() {
        return this.incidentEscalationId;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stage
     */
    public java.util.List<IncidentEscalationStageStruct> getStage() {
        return this.stage;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private Long createTime; 
        private String description; 
        private String incidentEscalationId; 
        private Long modifyTime; 
        private String name; 
        private String regionId; 
        private java.util.List<IncidentEscalationStageStruct> stage; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(IncidentEscalationStruct model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.incidentEscalationId = model.incidentEscalationId;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.regionId = model.regionId;
            this.stage = model.stage;
            this.workspace = model.workspace;
        } 

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * incidentEscalationId.
         */
        public Builder incidentEscalationId(String incidentEscalationId) {
            this.incidentEscalationId = incidentEscalationId;
            return this;
        }

        /**
         * modifyTime.
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
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
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * stage.
         */
        public Builder stage(java.util.List<IncidentEscalationStageStruct> stage) {
            this.stage = stage;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public IncidentEscalationStruct build() {
            return new IncidentEscalationStruct(this);
        } 

    } 

}
