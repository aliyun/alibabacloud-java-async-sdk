// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListProjectMembersRequest} extends {@link RequestModel}
 *
 * <p>ListProjectMembersRequest</p>
 */
public class ListProjectMembersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleCodes")
    private java.util.List < String > roleCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private java.util.List < String > userIds;

    private ListProjectMembersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.roleCodes = builder.roleCodes;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectMembersRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return roleCodes
     */
    public java.util.List < String > getRoleCodes() {
        return this.roleCodes;
    }

    /**
     * @return userIds
     */
    public java.util.List < String > getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<ListProjectMembersRequest, Builder> {
        private String regionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private java.util.List < String > roleCodes; 
        private java.util.List < String > userIds; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectMembersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.roleCodes = request.roleCodes;
            this.userIds = request.userIds;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>62136</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RoleCodes.
         */
        public Builder roleCodes(java.util.List < String > roleCodes) {
            String roleCodesShrink = shrink(roleCodes, "RoleCodes", "json");
            this.putBodyParameter("RoleCodes", roleCodesShrink);
            this.roleCodes = roleCodes;
            return this;
        }

        /**
         * UserIds.
         */
        public Builder userIds(java.util.List < String > userIds) {
            String userIdsShrink = shrink(userIds, "UserIds", "json");
            this.putBodyParameter("UserIds", userIdsShrink);
            this.userIds = userIds;
            return this;
        }

        @Override
        public ListProjectMembersRequest build() {
            return new ListProjectMembersRequest(this);
        } 

    } 

}
