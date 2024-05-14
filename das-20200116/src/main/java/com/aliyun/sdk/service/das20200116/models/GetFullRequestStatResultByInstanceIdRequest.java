// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFullRequestStatResultByInstanceIdRequest} extends {@link RequestModel}
 *
 * <p>GetFullRequestStatResultByInstanceIdRequest</p>
 */
public class GetFullRequestStatResultByInstanceIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Asc")
    private Boolean asc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("End")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long end;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginHost")
    private String originHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlId")
    private String sqlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlType")
    private String sqlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long start;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetFullRequestStatResultByInstanceIdRequest(Builder builder) {
        super(builder);
        this.asc = builder.asc;
        this.dbName = builder.dbName;
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.keyword = builder.keyword;
        this.nodeId = builder.nodeId;
        this.orderBy = builder.orderBy;
        this.originHost = builder.originHost;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.role = builder.role;
        this.sqlId = builder.sqlId;
        this.sqlType = builder.sqlType;
        this.start = builder.start;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFullRequestStatResultByInstanceIdRequest create() {
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
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return originHost
     */
    public String getOriginHost() {
        return this.originHost;
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
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return sqlType
     */
    public String getSqlType() {
        return this.sqlType;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetFullRequestStatResultByInstanceIdRequest, Builder> {
        private Boolean asc; 
        private String dbName; 
        private Long end; 
        private String instanceId; 
        private String keyword; 
        private String nodeId; 
        private String orderBy; 
        private String originHost; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String role; 
        private String sqlId; 
        private String sqlType; 
        private Long start; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetFullRequestStatResultByInstanceIdRequest request) {
            super(request);
            this.asc = request.asc;
            this.dbName = request.dbName;
            this.end = request.end;
            this.instanceId = request.instanceId;
            this.keyword = request.keyword;
            this.nodeId = request.nodeId;
            this.orderBy = request.orderBy;
            this.originHost = request.originHost;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.role = request.role;
            this.sqlId = request.sqlId;
            this.sqlType = request.sqlType;
            this.start = request.start;
            this.userId = request.userId;
        } 

        /**
         * Specifies whether to sort the results in ascending order. By default, the results are not sorted in ascending order.
         */
        public Builder asc(Boolean asc) {
            this.putQueryParameter("Asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time. The interval cannot exceed one day.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The keywords that are used for query.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The node ID.
         * <p>
         * 
         * >  You must specify the node ID if your database instance is a PolarDB for MySQL cluster.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The field by which to sort the returned entries. Default value: **count**. Valid values:
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
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The IP address of the client that executes the SQL statement.
         * <p>
         * 
         * >  This parameter is optional. If this parameter is specified, the full request statistics of the specified IP address are collected. If this parameter is left empty, the full request statistics of the entire database instance are collected.
         */
        public Builder originHost(String originHost) {
            this.putQueryParameter("OriginHost", originHost);
            this.originHost = originHost;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The role of the node in the PolarDB-X 2.0 instance. Valid values:
         * <p>
         * 
         * *   **polarx_cn**: compute node.
         * *   **polarx_dn**: data node.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * The SQL ID.
         * <p>
         * 
         * >  If this parameter is specified, the full request statistics of the specified SQL query are collected. If this parameter is left empty, the full request statistics of the entire database instance are collected.
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * The type of the SQL statement. Valid values: **SELECT**, **INSERT**, **UPDATE**, **DELETE**, **LOGIN**, **LOGOUT**, **MERGE**, **ALTER**, **CREATEINDEX**, **DROPINDEX**, **CREATE**, **DROP**, **SET**, **DESC**, **REPLACE**, **CALL**, **BEGIN**, **DESCRIBE**, **ROLLBACK**, **FLUSH**, **USE**, **SHOW**, **START**, **COMMIT**, and **RENAME**.
         * <p>
         * 
         * >  If your database instance is an ApsaraDB RDS for MySQL instance, a PolarDB for MySQL cluster, or a PolarDB-X 2.0 instance, the statistics can be collected based on the SQL statement type.
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The start time can be up to 90 days earlier than the current time.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account that was used to create the database instance.
         * <p>
         * 
         * >  This parameter is optional. The system can automatically obtain the Alibaba Cloud account ID based on the value of InstanceId when you call the GetFullRequestOriginStatByInstanceId operation.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetFullRequestStatResultByInstanceIdRequest build() {
            return new GetFullRequestStatResultByInstanceIdRequest(this);
        } 

    } 

}
