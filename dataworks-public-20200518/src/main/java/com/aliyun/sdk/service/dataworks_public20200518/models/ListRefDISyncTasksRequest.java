// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRefDISyncTasksRequest} extends {@link RequestModel}
 *
 * <p>ListRefDISyncTasksRequest</p>
 */
public class ListRefDISyncTasksRequest extends Request {
    @Query
    @NameInMap("DatasourceName")
    @Validation(required = true)
    private String datasourceName;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100000, minimum = 1)
    private Long pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @Query
    @NameInMap("RefType")
    @Validation(required = true)
    private String refType;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    private ListRefDISyncTasksRequest(Builder builder) {
        super(builder);
        this.datasourceName = builder.datasourceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.refType = builder.refType;
        this.regionId = builder.regionId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRefDISyncTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasourceName
     */
    public String getDatasourceName() {
        return this.datasourceName;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return refType
     */
    public String getRefType() {
        return this.refType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<ListRefDISyncTasksRequest, Builder> {
        private String datasourceName; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long projectId; 
        private String refType; 
        private String regionId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(ListRefDISyncTasksRequest request) {
            super(request);
            this.datasourceName = request.datasourceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.refType = request.refType;
            this.regionId = request.regionId;
            this.taskType = request.taskType;
        } 

        /**
         * DatasourceName.
         */
        public Builder datasourceName(String datasourceName) {
            this.putQueryParameter("DatasourceName", datasourceName);
            this.datasourceName = datasourceName;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RefType.
         */
        public Builder refType(String refType) {
            this.putQueryParameter("RefType", refType);
            this.refType = refType;
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

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public ListRefDISyncTasksRequest build() {
            return new ListRefDISyncTasksRequest(this);
        } 

    } 

}
