// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRefDISyncTasksRequest} extends {@link RequestModel}
 *
 * <p>ListRefDISyncTasksRequest</p>
 */
public class ListRefDISyncTasksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100000, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String refType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private ListRefDISyncTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasourceName = builder.datasourceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.refType = builder.refType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<ListRefDISyncTasksRequest, Builder> {
        private String regionId; 
        private String datasourceName; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long projectId; 
        private String refType; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(ListRefDISyncTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasourceName = request.datasourceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.refType = request.refType;
            this.taskType = request.taskType;
        } 

        /**
         * The ID of the region in which the DataWorks workspace resides. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the data source. You can call the [ListDataSources](~~211431~~) operation to query the name of the data source.
         */
        public Builder datasourceName(String datasourceName) {
            this.putQueryParameter("DatasourceName", datasourceName);
            this.datasourceName = datasourceName;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The condition used to filter sync nodes. Valid values:
         * <p>
         * 
         * *   from: queries the sync nodes that use the data source as the source data source.
         * *   to: queries the sync nodes that use the data source as the destination data source.
         */
        public Builder refType(String refType) {
            this.putQueryParameter("RefType", refType);
            this.refType = refType;
            return this;
        }

        /**
         * The type of the sync node that you want to query. Valid values:
         * <p>
         * 
         * *   DI_OFFLINE: batch sync node
         * *   DI_REALTIME: real-time sync node
         * 
         * You can specify only one type. The sync solution type is not supported.
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
