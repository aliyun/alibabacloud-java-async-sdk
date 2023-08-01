// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateMachineGroupMachineRequest} extends {@link RequestModel}
 *
 * <p>UpdateMachineGroupMachineRequest</p>
 */
public class UpdateMachineGroupMachineRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("machineGroup")
    @Validation(required = true)
    private String machineGroup;

    @Query
    @NameInMap("action")
    private String action;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < String > body;

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
    public java.util.List < String > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateMachineGroupMachineRequest, Builder> {
        private String project; 
        private String machineGroup; 
        private String action; 
        private java.util.List < String > body; 

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
         * Project名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * machineGroup.
         */
        public Builder machineGroup(String machineGroup) {
            this.putPathParameter("machineGroup", machineGroup);
            this.machineGroup = machineGroup;
            return this;
        }

        /**
         * action.
         */
        public Builder action(String action) {
            this.putQueryParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.List < String > body) {
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
