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
 * {@link DsgUserGroupGetOdpsRoleGroupsRequest} extends {@link RequestModel}
 *
 * <p>DsgUserGroupGetOdpsRoleGroupsRequest</p>
 */
public class DsgUserGroupGetOdpsRoleGroupsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private DsgUserGroupGetOdpsRoleGroupsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgUserGroupGetOdpsRoleGroupsRequest create() {
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<DsgUserGroupGetOdpsRoleGroupsRequest, Builder> {
        private String regionId; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(DsgUserGroupGetOdpsRoleGroupsRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * <p>The name of the MaxCompute project. You can call the <a href="https://help.aliyun.com/document_detail/2786303.html">DsgPlatformQueryProjectsAndSchemaFromMeta</a> operation to query a list of MaxCompute projects.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public DsgUserGroupGetOdpsRoleGroupsRequest build() {
            return new DsgUserGroupGetOdpsRoleGroupsRequest(this);
        } 

    } 

}
