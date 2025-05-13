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
 * {@link IncidentPlanStruct} extends {@link TeaModel}
 *
 * <p>IncidentPlanStruct</p>
 */
public class IncidentPlanStruct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoRecoverSeconds")
    private Integer autoRecoverSeconds;

    @com.aliyun.core.annotation.NameInMap("closeExpire")
    private Long closeExpire;

    @com.aliyun.core.annotation.NameInMap("corporation")
    private java.util.List<IncidentPlanCorporationStruct> corporation;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("escalationId")
    private java.util.List<String> escalationId;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("groupBy")
    private java.util.List<IncidentPlanFieldPath> groupBy;

    @com.aliyun.core.annotation.NameInMap("incidentPlanId")
    private String incidentPlanId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resourceFiled")
    private java.util.List<IncidentPlanFieldPath> resourceFiled;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private IncidentPlanStruct(Builder builder) {
        this.autoRecoverSeconds = builder.autoRecoverSeconds;
        this.closeExpire = builder.closeExpire;
        this.corporation = builder.corporation;
        this.description = builder.description;
        this.escalationId = builder.escalationId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.groupBy = builder.groupBy;
        this.incidentPlanId = builder.incidentPlanId;
        this.name = builder.name;
        this.resourceFiled = builder.resourceFiled;
        this.status = builder.status;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentPlanStruct create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRecoverSeconds
     */
    public Integer getAutoRecoverSeconds() {
        return this.autoRecoverSeconds;
    }

    /**
     * @return closeExpire
     */
    public Long getCloseExpire() {
        return this.closeExpire;
    }

    /**
     * @return corporation
     */
    public java.util.List<IncidentPlanCorporationStruct> getCorporation() {
        return this.corporation;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return escalationId
     */
    public java.util.List<String> getEscalationId() {
        return this.escalationId;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return groupBy
     */
    public java.util.List<IncidentPlanFieldPath> getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return incidentPlanId
     */
    public String getIncidentPlanId() {
        return this.incidentPlanId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceFiled
     */
    public java.util.List<IncidentPlanFieldPath> getResourceFiled() {
        return this.resourceFiled;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private Integer autoRecoverSeconds; 
        private Long closeExpire; 
        private java.util.List<IncidentPlanCorporationStruct> corporation; 
        private String description; 
        private java.util.List<String> escalationId; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private java.util.List<IncidentPlanFieldPath> groupBy; 
        private String incidentPlanId; 
        private String name; 
        private java.util.List<IncidentPlanFieldPath> resourceFiled; 
        private String status; 
        private Long userId; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(IncidentPlanStruct model) {
            this.autoRecoverSeconds = model.autoRecoverSeconds;
            this.closeExpire = model.closeExpire;
            this.corporation = model.corporation;
            this.description = model.description;
            this.escalationId = model.escalationId;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.groupBy = model.groupBy;
            this.incidentPlanId = model.incidentPlanId;
            this.name = model.name;
            this.resourceFiled = model.resourceFiled;
            this.status = model.status;
            this.userId = model.userId;
            this.workspace = model.workspace;
        } 

        /**
         * autoRecoverSeconds.
         */
        public Builder autoRecoverSeconds(Integer autoRecoverSeconds) {
            this.autoRecoverSeconds = autoRecoverSeconds;
            return this;
        }

        /**
         * closeExpire.
         */
        public Builder closeExpire(Long closeExpire) {
            this.closeExpire = closeExpire;
            return this;
        }

        /**
         * corporation.
         */
        public Builder corporation(java.util.List<IncidentPlanCorporationStruct> corporation) {
            this.corporation = corporation;
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
         * escalationId.
         */
        public Builder escalationId(java.util.List<String> escalationId) {
            this.escalationId = escalationId;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * groupBy.
         */
        public Builder groupBy(java.util.List<IncidentPlanFieldPath> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * incidentPlanId.
         */
        public Builder incidentPlanId(String incidentPlanId) {
            this.incidentPlanId = incidentPlanId;
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
         * resourceFiled.
         */
        public Builder resourceFiled(java.util.List<IncidentPlanFieldPath> resourceFiled) {
            this.resourceFiled = resourceFiled;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public IncidentPlanStruct build() {
            return new IncidentPlanStruct(this);
        } 

    } 

}
