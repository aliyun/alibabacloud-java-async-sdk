// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ProcessGroup} extends {@link TeaModel}
 *
 * <p>ProcessGroup</p>
 */
public class ProcessGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ProcessGroupId")
    private String processGroupId;

    @com.aliyun.core.annotation.NameInMap("Processes")
    private java.util.List<ProcessItem> processes;

    private ProcessGroup(Builder builder) {
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.name = builder.name;
        this.processGroupId = builder.processGroupId;
        this.processes = builder.processes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProcessGroup create() {
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
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return processGroupId
     */
    public String getProcessGroupId() {
        return this.processGroupId;
    }

    /**
     * @return processes
     */
    public java.util.List<ProcessItem> getProcesses() {
        return this.processes;
    }

    public static final class Builder {
        private String description; 
        private String gmtCreate; 
        private String gmtModified; 
        private String name; 
        private String processGroupId; 
        private java.util.List<ProcessItem> processes; 

        private Builder() {
        } 

        private Builder(ProcessGroup model) {
            this.description = model.description;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.name = model.name;
            this.processGroupId = model.processGroupId;
            this.processes = model.processes;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ProcessGroupId.
         */
        public Builder processGroupId(String processGroupId) {
            this.processGroupId = processGroupId;
            return this;
        }

        /**
         * Processes.
         */
        public Builder processes(java.util.List<ProcessItem> processes) {
            this.processes = processes;
            return this;
        }

        public ProcessGroup build() {
            return new ProcessGroup(this);
        } 

    } 

}
