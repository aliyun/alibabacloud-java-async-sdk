// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetProjectMemberRequest} extends {@link RequestModel}
 *
 * <p>GetProjectMemberRequest</p>
 */
public class GetProjectMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private GetProjectMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectMemberRequest create() {
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetProjectMemberRequest, Builder> {
        private String regionId; 
        private Long projectId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.userId = request.userId;
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
         * <p>The ID of the DataWorks Workspace. You can sign in to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks Console</a> and go to the Workspace Management page to obtain the Workspace ID.</p>
         * <p>This parameter is used to identify the DataWorks workspace that you want to access.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>88757</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The ID of the user. To find the ID, sign in to the <a href="https://dataworks.console.aliyun.com/product/ms_menu">DataWorks Console</a>, go to the Management Center, select the target Workspace, and open the Tenant Members and Roles page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123422****</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetProjectMemberRequest build() {
            return new GetProjectMemberRequest(this);
        } 

    } 

}
