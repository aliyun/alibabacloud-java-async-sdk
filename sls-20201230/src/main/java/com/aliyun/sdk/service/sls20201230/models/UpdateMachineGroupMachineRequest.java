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
 * {@link UpdateMachineGroupMachineRequest} extends {@link RequestModel}
 *
 * <p>UpdateMachineGroupMachineRequest</p>
 */
public class UpdateMachineGroupMachineRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("machineGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String machineGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> body;

    private UpdateMachineGroupMachineRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.machineGroup = builder.machineGroup;
        this.action = builder.action;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMachineGroupMachineRequest create() {
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
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return body
     */
    public java.util.List<String> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateMachineGroupMachineRequest, Builder> {
        private String project; 
        private String machineGroup; 
        private String action; 
        private java.util.List<String> body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMachineGroupMachineRequest request) {
            super(request);
            this.project = request.project;
            this.machineGroup = request.machineGroup;
            this.action = request.action;
            this.body = request.body;
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
         * <p>test-group</p>
         */
        public Builder machineGroup(String machineGroup) {
            this.putPathParameter("machineGroup", machineGroup);
            this.machineGroup = machineGroup;
            return this;
        }

        /**
         * <p>The operation on the machine. Valid values: add and delete. A value of add specifies to add the machine to the machine group. A value of delete specifies to remove the machine from the machine group.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder action(String action) {
            this.putQueryParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>The machines to be added or removed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(java.util.List<String> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateMachineGroupMachineRequest build() {
            return new UpdateMachineGroupMachineRequest(this);
        } 

    } 

}
