// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListManualDagInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListManualDagInstancesRequest</p>
 */
public class ListManualDagInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dagId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the directed acyclic graph (DAG) for the manually triggered workflow. You can call the <a href="https://help.aliyun.com/document_detail/212830.html">RunManualDagNodes</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000001231241</p>
         */
        public Builder dagId(String dagId) {
            this.putBodyParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * <p>The environment of Operation Center. Valid values: PROD and DEV.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RPOD</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * <p>The name of the workspace to which the manually triggered workflow belongs. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_workspace</p>
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
