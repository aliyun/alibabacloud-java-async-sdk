// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosisTasksRequest</p>
 */
public class DescribeDiagnosisTasksRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("Host")
    private String host;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProcessId")
    @Validation(required = true)
    private String processId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StageId")
    @Validation(required = true)
    private String stageId;

    @Query
    @NameInMap("State")
    private String state;

    private DescribeDiagnosisTasksRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.host = builder.host;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.processId = builder.processId;
        this.regionId = builder.regionId;
        this.stageId = builder.stageId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stageId
     */
    public String getStageId() {
        return this.stageId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosisTasksRequest, Builder> {
        private String DBClusterId; 
        private String host; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String processId; 
        private String regionId; 
        private String stageId; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosisTasksRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.host = request.host;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.processId = request.processId;
            this.regionId = request.regionId;
            this.stageId = request.stageId;
            this.state = request.state;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The IP address from which the query was initiated.
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * The order in which to sort the tasks by field. Specify the value in the JSON format. Example: `[{"Field":"CreateTime", "Type":"desc"}]`.
         * <p>
         * 
         * > 
         * 
         * *   `Field` indicates the field that is used to sort the tasks. Valid values of Field: `State`, `CreateTime`, `DBName`, `ProcessID`, `UpdateTime`, `JobName`, and `ProcessRows`.
         * 
         * *   `Type` indicates the sort type. Valid values of Type: `Desc` and `Asc`. The values are case-insensitive.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   30 (default)
         * *   50
         * *   100
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The query ID.
         * <p>
         * 
         * > You can call the [DescribeProcessList](~~190092~~) operation to query the IDs of queries that are being executed.
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * The region ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of a stage in the query that is specified by the `ProcessId` parameter.
         */
        public Builder stageId(String stageId) {
            this.putQueryParameter("StageId", stageId);
            this.stageId = stageId;
            return this;
        }

        /**
         * The state of the asynchronous import or export task to be queried. Valid values:
         * <p>
         * 
         * *   **RUNNING**
         * *   **FINISHED**
         * *   **FAILED**
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public DescribeDiagnosisTasksRequest build() {
            return new DescribeDiagnosisTasksRequest(this);
        } 

    } 

}
