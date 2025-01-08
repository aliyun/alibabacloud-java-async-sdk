// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link DeleteMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteMachineGroupRequest</p>
 */
public class DeleteMachineGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("machineGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String machineGroup;

    private DeleteMachineGroupRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.machineGroup = builder.machineGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMachineGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMachineGroupRequest, Builder> {
        private String project; 
        private String machineGroup; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMachineGroupRequest request) {
            super(request);
            this.project = request.project;
            this.machineGroup = request.machineGroup;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the machine group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-machine-group-4</p>
         */
        public Builder machineGroup(String machineGroup) {
            this.putPathParameter("machineGroup", machineGroup);
            this.machineGroup = machineGroup;
            return this;
        }

        @Override
        public DeleteMachineGroupRequest build() {
            return new DeleteMachineGroupRequest(this);
        } 

    } 

}
