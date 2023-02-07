// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHotlineNumberRequest} extends {@link RequestModel}
 *
 * <p>QueryHotlineNumberRequest</p>
 */
public class QueryHotlineNumberRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("DepartmentId")
    private Long departmentId;

    @Query
    @NameInMap("GroupIds")
    private java.util.List < Long > groupIds;

    @Query
    @NameInMap("HotlineNumber")
    private String hotlineNumber;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 20, minimum = 1)
    private Integer pageSize;

    private QueryHotlineNumberRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.departmentId = builder.departmentId;
        this.groupIds = builder.groupIds;
        this.hotlineNumber = builder.hotlineNumber;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHotlineNumberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return departmentId
     */
    public Long getDepartmentId() {
        return this.departmentId;
    }

    /**
     * @return groupIds
     */
    public java.util.List < Long > getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return hotlineNumber
     */
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryHotlineNumberRequest, Builder> {
        private Integer currentPage; 
        private Long departmentId; 
        private java.util.List < Long > groupIds; 
        private String hotlineNumber; 
        private String instanceId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryHotlineNumberRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.departmentId = request.departmentId;
            this.groupIds = request.groupIds;
            this.hotlineNumber = request.hotlineNumber;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
        } 

        /**
         * 当前页码
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * 部门id（技能组分组）
         */
        public Builder departmentId(Long departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * 技能组列表
         */
        public Builder groupIds(java.util.List < Long > groupIds) {
            String groupIdsShrink = shrink(groupIds, "GroupIds", "json");
            this.putQueryParameter("GroupIds", groupIdsShrink);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * 号码（支持模糊查询）
         */
        public Builder hotlineNumber(String hotlineNumber) {
            this.putQueryParameter("HotlineNumber", hotlineNumber);
            this.hotlineNumber = hotlineNumber;
            return this;
        }

        /**
         * 实例id
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 每页大小
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryHotlineNumberRequest build() {
            return new QueryHotlineNumberRequest(this);
        } 

    } 

}
