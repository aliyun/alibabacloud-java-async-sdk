// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link RemoveConfigFromMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveConfigFromMachineGroupRequest</p>
 */
public class RemoveConfigFromMachineGroupRequest extends Request {
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

    private RemoveConfigFromMachineGroupRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.machineGroup = builder.machineGroup;
        this.configName = builder.configName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveConfigFromMachineGroupRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveConfigFromMachineGroupRequest, Builder> {
        private String project; 
        private String machineGroup; 
        private String configName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveConfigFromMachineGroupRequest request) {
            super(request);
            this.project = request.project;
            this.machineGroup = request.machineGroup;
            this.configName = request.configName;
        } 

        /**
         * project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * 机器组名称。
         */
        public Builder machineGroup(String machineGroup) {
            this.putPathParameter("machineGroup", machineGroup);
            this.machineGroup = machineGroup;
            return this;
        }

        /**
         * logtail 配置名称。
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        @Override
        public RemoveConfigFromMachineGroupRequest build() {
            return new RemoveConfigFromMachineGroupRequest(this);
        } 

    } 

}
