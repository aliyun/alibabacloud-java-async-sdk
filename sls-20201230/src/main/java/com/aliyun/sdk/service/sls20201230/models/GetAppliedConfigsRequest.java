// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetAppliedConfigsRequest} extends {@link RequestModel}
 *
 * <p>GetAppliedConfigsRequest</p>
 */
public class GetAppliedConfigsRequest extends Request {
    @Path
    @NameInMap("machineGroup")
    @Validation(required = true)
    private String machineGroup;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private GetAppliedConfigsRequest(Builder builder) {
        super(builder);
        this.machineGroup = builder.machineGroup;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppliedConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineGroup
     */
    public String getMachineGroup() {
        return this.machineGroup;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<GetAppliedConfigsRequest, Builder> {
        private String machineGroup; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetAppliedConfigsRequest request) {
            super(request);
            this.machineGroup = request.machineGroup;
            this.project = request.project;
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
         * project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public GetAppliedConfigsRequest build() {
            return new GetAppliedConfigsRequest(this);
        } 

    } 

}
