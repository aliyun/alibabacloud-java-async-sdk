// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPfsSqlSummariesRequest} extends {@link RequestModel}
 *
 * <p>GetPfsSqlSummariesRequest</p>
 */
public class GetPfsSqlSummariesRequest extends Request {
    @Body
    @NameInMap("Asc")
    private Boolean asc;

    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Keywords")
    private String keywords;

    @Body
    @NameInMap("NodeId")
    private String nodeId;

    @Body
    @NameInMap("OrderBy")
    private String orderBy;

    @Body
    @NameInMap("PageNo")
    private Integer pageNo;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SqlId")
    private String sqlId;

    @Body
    @NameInMap("StartTime")
    private Long startTime;

    private GetPfsSqlSummariesRequest(Builder builder) {
        super(builder);
        this.asc = builder.asc;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.keywords = builder.keywords;
        this.nodeId = builder.nodeId;
        this.orderBy = builder.orderBy;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sqlId = builder.sqlId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPfsSqlSummariesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asc
     */
    public Boolean getAsc() {
        return this.asc;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetPfsSqlSummariesRequest, Builder> {
        private Boolean asc; 
        private Long endTime; 
        private String instanceId; 
        private String keywords; 
        private String nodeId; 
        private String orderBy; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sqlId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetPfsSqlSummariesRequest request) {
            super(request);
            this.asc = request.asc;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.keywords = request.keywords;
            this.nodeId = request.nodeId;
            this.orderBy = request.orderBy;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sqlId = request.sqlId;
            this.startTime = request.startTime;
        } 

        /**
         * Specifies whether to sort the returned entries in ascending order. Default value: **false**. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder asc(Boolean asc) {
            this.putBodyParameter("Asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time. You can view the data of up to seven days within the last month.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The keywords of the SQL template. Separate multiple keywords with spaces.
         */
        public Builder keywords(String keywords) {
            this.putBodyParameter("Keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * The node ID.
         * <p>
         * 
         * >  This parameter must be specified if the database instance is an ApsaraDB RDS for MySQL Cluster Edition instance or a PolarDB for MySQL cluster.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The field by which to sort the returned entries. Default value: **count**.
         * <p>
         * 
         * *   **count**: the number of executions.
         * *   **avgRt**: the average execution duration.
         * *   **rtRate**: the execution duration percentage.
         * *   **rowsExamined**: the total number of scanned rows.
         * *   **avgRowsExamined**: the average number of scanned rows.
         * *   **avgRowsReturned**: the average number of returned rows.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. Valid values: 1 to 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The SQL ID.
         * <p>
         * 
         * >  If this parameter is specified, the full request statistics of the specified SQL query are collected. If this parameter is left empty, the full request statistics of the entire database instance are collected.
         */
        public Builder sqlId(String sqlId) {
            this.putBodyParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetPfsSqlSummariesRequest build() {
            return new GetPfsSqlSummariesRequest(this);
        } 

    } 

}
