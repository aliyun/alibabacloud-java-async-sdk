// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHostAvailabilityListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHostAvailabilityListRequest</p>
 */
public class DescribeHostAvailabilityListRequest extends Request {
    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Ids")
    private String ids;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    private DescribeHostAvailabilityListRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.ids = builder.ids;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHostAvailabilityListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
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
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<DescribeHostAvailabilityListRequest, Builder> {
        private Long groupId; 
        private Long id; 
        private String ids; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHostAvailabilityListRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.id = request.id;
            this.ids = request.ids;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.taskName = request.taskName;
        } 

        /**
         * The ID of the application group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the availability monitoring task.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The IDs of the availability monitoring tasks. Separate multiple IDs with commas (,).
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Minimum value: 1. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the availability monitoring task.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public DescribeHostAvailabilityListRequest build() {
            return new DescribeHostAvailabilityListRequest(this);
        } 

    } 

}
