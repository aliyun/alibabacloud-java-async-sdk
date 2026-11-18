// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link AddProjectMembersRequest} extends {@link RequestModel}
 *
 * <p>AddProjectMembersRequest</p>
 */
public class AddProjectMembersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YikeUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yikeUserIds;

    private AddProjectMembersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
        this.yikeUserIds = builder.yikeUserIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProjectMembersRequest create() {
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
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return yikeUserIds
     */
    public String getYikeUserIds() {
        return this.yikeUserIds;
    }

    public static final class Builder extends Request.Builder<AddProjectMembersRequest, Builder> {
        private String regionId; 
        private String projectId; 
        private String yikeUserIds; 

        private Builder() {
            super();
        } 

        private Builder(AddProjectMembersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.yikeUserIds = request.yikeUserIds;
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
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_061716****</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The Yike user IDs to be added. Separate multiple IDs with commas. The users must belong to the current Alibaba Cloud account. By default, the Edit permission is granted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001,10002</p>
         */
        public Builder yikeUserIds(String yikeUserIds) {
            this.putQueryParameter("YikeUserIds", yikeUserIds);
            this.yikeUserIds = yikeUserIds;
            return this;
        }

        @Override
        public AddProjectMembersRequest build() {
            return new AddProjectMembersRequest(this);
        } 

    } 

}
