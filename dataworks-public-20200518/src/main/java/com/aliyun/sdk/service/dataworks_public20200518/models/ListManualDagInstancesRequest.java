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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListManualDagInstancesRequest(Builder builder) {
        super(builder);
        this.dagId = builder.dagId;
        this.projectEnv = builder.projectEnv;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListManualDagInstancesRequest, Builder> {
        private String dagId; 
        private String projectEnv; 
        private String projectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListManualDagInstancesRequest request) {
            super(request);
            this.dagId = request.dagId;
            this.projectEnv = request.projectEnv;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
        } 

        /**
         * DagId.
         */
        public Builder dagId(String dagId) {
            this.putBodyParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListManualDagInstancesRequest build() {
            return new ListManualDagInstancesRequest(this);
        } 

    } 

}
