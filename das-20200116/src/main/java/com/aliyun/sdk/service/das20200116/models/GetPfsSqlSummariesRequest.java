// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetPfsSqlSummariesRequest} extends {@link RequestModel}
 *
 * <p>GetPfsSqlSummariesRequest</p>
 */
public class GetPfsSqlSummariesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Asc")
    private Boolean asc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keywords")
    private String keywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SqlId")
    private String sqlId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>Specifies whether to sort the returned entries in ascending order. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder asc(Boolean asc) {
            this.putBodyParameter("Asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time. You can view the data of up to seven days within the last month.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1679297005999</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf61swc4cru0b****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The keywords of the SQL template. Separate multiple keywords with spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>select update</p>
         */
        public Builder keywords(String keywords) {
            this.putBodyParameter("Keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> This parameter is required if the database instance is an ApsaraDB RDS for MySQL Cluster Edition instance or a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-****-db-0</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The field by which to sort the returned entries. Default value: <strong>count</strong>.</p>
         * <ul>
         * <li><strong>count</strong>: the number of executions.</li>
         * <li><strong>avgRt</strong>: the average execution duration.</li>
         * <li><strong>rtRate</strong>: the execution duration percentage.</li>
         * <li><strong>rowsExamined</strong>: the total number of scanned rows.</li>
         * <li><strong>avgRowsExamined</strong>: the average number of scanned rows.</li>
         * <li><strong>avgRowsReturned</strong>: the average number of returned rows.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The SQL ID.</p>
         * <blockquote>
         * <p> If this parameter is specified, the full request statistics of the specified SQL query are collected. If this parameter is left empty, the full request statistics of the entire database instance are collected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>651b56fe9418d48edb8fdf0980ec****</p>
         */
        public Builder sqlId(String sqlId) {
            this.putBodyParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1675833788056</p>
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
