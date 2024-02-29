// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListManualDagInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListManualDagInstancesRequest</p>
 */
public class ListManualDagInstancesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DagId")
    @Validation(required = true)
    private String dagId;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    private ListManualDagInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.projectEnv = builder.projectEnv;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListManualDagInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dagId
     */
    public String getDagId() {
        return this.dagId;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<ListManualDagInstancesRequest, Builder> {
        private String regionId; 
        private String dagId; 
        private String projectEnv; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(ListManualDagInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.projectEnv = request.projectEnv;
            this.projectName = request.projectName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the directed acyclic graph (DAG) for the manually triggered workflow. You can call the [RunManualDagNodes](~~212830~~) operation to obtain the ID.
         */
        public Builder dagId(String dagId) {
            this.putBodyParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The environment of the workspace. Valid values: PROD and DEV. A value of PROD indicates the production environment. A value of DEV indicates the development environment.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * The name of the workspace to which the manually triggered workflow belongs. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to view the name.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public ListManualDagInstancesRequest build() {
            return new ListManualDagInstancesRequest(this);
        } 

    } 

}
