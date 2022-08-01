// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetAppliedMachineGroupsRequest} extends {@link RequestModel}
 *
 * <p>GetAppliedMachineGroupsRequest</p>
 */
public class GetAppliedMachineGroupsRequest extends Request {
    @Path
    @NameInMap("configName")
    @Validation(required = true)
    private String configName;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private GetAppliedMachineGroupsRequest(Builder builder) {
        super(builder);
        this.configName = builder.configName;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppliedMachineGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<GetAppliedMachineGroupsRequest, Builder> {
        private String configName; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetAppliedMachineGroupsRequest request) {
            super(request);
            this.configName = request.configName;
            this.project = request.project;
        } 

        /**
         * logtail 配置名称。
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
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
        public GetAppliedMachineGroupsRequest build() {
            return new GetAppliedMachineGroupsRequest(this);
        } 

    } 

}
