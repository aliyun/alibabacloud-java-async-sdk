// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ApplyConfigToMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>ApplyConfigToMachineGroupRequest</p>
 */
public class ApplyConfigToMachineGroupRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("machineGroup")
    @Validation(required = true)
    private String machineGroup;

    @Path
    @NameInMap("configName")
    @Validation(required = true)
    private String configName;

    private ApplyConfigToMachineGroupRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.machineGroup = builder.machineGroup;
        this.configName = builder.configName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyConfigToMachineGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return machineGroup
     */
    public String getMachineGroup() {
        return this.machineGroup;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    public static final class Builder extends Request.Builder<ApplyConfigToMachineGroupRequest, Builder> {
        private String project; 
        private String machineGroup; 
        private String configName; 

        private Builder() {
            super();
        } 

        private Builder(ApplyConfigToMachineGroupRequest request) {
            super(request);
            this.project = request.project;
            this.machineGroup = request.machineGroup;
            this.configName = request.configName;
        } 

        /**
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the machine group.
         */
        public Builder machineGroup(String machineGroup) {
            this.putPathParameter("machineGroup", machineGroup);
            this.machineGroup = machineGroup;
            return this;
        }

        /**
         * The name of the Logtail configuration.
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        @Override
        public ApplyConfigToMachineGroupRequest build() {
            return new ApplyConfigToMachineGroupRequest(this);
        } 

    } 

}
