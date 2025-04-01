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
         * <p>Specifies whether to sort the results in ascending order. By default, the results are not sorted in ascending order.</p>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder asc(Boolean asc) {
            this.putQueryParameter("Asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>dbtest01</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time. The interval cannot exceed one day.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1645668213000</p>
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The keywords that are used for query.</p>
         * 
         * <strong>example:</strong>
         * <p>dbtest01</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> You must specify the node ID if your database instance is a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-bp12v7243x012****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The field by which to sort the returned entries. Default value: <strong>count</strong>. Valid values:</p>
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
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The IP address of the client that executes the SQL statement.</p>
         * <blockquote>
         * <p> This parameter is optional. If this parameter is specified, the full request statistics of the specified IP address are collected. If this parameter is left empty, the full request statistics of the entire database instance are collected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.26.XX.XXX</p>
         */
        public Builder originHost(String originHost) {
            this.putQueryParameter("OriginHost", originHost);
            this.originHost = originHost;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The role of the node in the PolarDB-X 2.0 instance. Valid values:</p>
         * <ul>
         * <li><strong>polarx_cn</strong>: compute node.</li>
         * <li><strong>polarx_dn</strong>: data node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polarx_cn</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>The SQL ID.</p>
         * <blockquote>
         * <p> If this parameter is specified, the full request statistics of the specified SQL query are collected. If this parameter is left empty, the full request statistics of the entire database instance are collected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d71f82be1eef72bd105128204d2e****</p>
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * <p>The type of the SQL statement. Valid values: <strong>SELECT</strong>, <strong>INSERT</strong>, <strong>UPDATE</strong>, <strong>DELETE</strong>, <strong>LOGIN</strong>, <strong>LOGOUT</strong>, <strong>MERGE</strong>, <strong>ALTER</strong>, <strong>CREATEINDEX</strong>, <strong>DROPINDEX</strong>, <strong>CREATE</strong>, <strong>DROP</strong>, <strong>SET</strong>, <strong>DESC</strong>, <strong>REPLACE</strong>, <strong>CALL</strong>, <strong>BEGIN</strong>, <strong>DESCRIBE</strong>, <strong>ROLLBACK</strong>, <strong>FLUSH</strong>, <strong>USE</strong>, <strong>SHOW</strong>, <strong>START</strong>, <strong>COMMIT</strong>, and <strong>RENAME</strong>.</p>
         * <blockquote>
         * <p> If your database instance is an ApsaraDB RDS for MySQL instance, a PolarDB for MySQL cluster, or a PolarDB-X 2.0 instance, the statistics can be collected based on the SQL statement type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> The start time can be up to 90 days earlier than the current time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1645581813000</p>
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that was used to create the database instance.</p>
         * <blockquote>
         * <p> This parameter is optional. The system can automatically obtain the Alibaba Cloud account ID based on the value of InstanceId when you call the GetFullRequestOriginStatByInstanceId operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>196278346919****</p>
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
