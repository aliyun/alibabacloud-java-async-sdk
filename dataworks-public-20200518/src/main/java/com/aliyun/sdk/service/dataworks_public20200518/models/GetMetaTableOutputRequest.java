// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableOutputRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTableOutputRequest</p>
 */
public class GetMetaTableOutputRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    @Query
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private GetMetaTableOutputRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endDate = builder.endDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.tableGuid = builder.tableGuid;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableOutputRequest create() {
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
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetMetaTableOutputRequest, Builder> {
        private String regionId; 
        private String endDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startDate; 
        private String tableGuid; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTableOutputRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endDate = request.endDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
            this.tableGuid = request.tableGuid;
            this.taskId = request.taskId;
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
         * The end date of the time range to query. The end date must be within the previous 30 days.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * The number of the page to return. The value must be a positive integer.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. The value must be a positive integer. We recommend that you do not set this parameter to a value greater than 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The start date of the time range to query. The start date must be within the previous 30 days.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * The Globally Unique Identifier (GUID) of the MaxCompute metatable.
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        /**
         * The ID of the node.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetMetaTableOutputRequest build() {
            return new GetMetaTableOutputRequest(this);
        } 

    } 

}
