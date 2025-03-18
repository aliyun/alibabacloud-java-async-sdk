// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeDiagnosisMonitorPerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosisMonitorPerformanceRequest</p>
 */
public class DescribeDiagnosisMonitorPerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryCondition")
    private String queryCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private DescribeDiagnosisMonitorPerformanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.database = builder.database;
        this.endTime = builder.endTime;
        this.queryCondition = builder.queryCondition;
        this.startTime = builder.startTime;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisMonitorPerformanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return queryCondition
     */
    public String getQueryCondition() {
        return this.queryCondition;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosisMonitorPerformanceRequest, Builder> {
        private String DBInstanceId; 
        private String database; 
        private String endTime; 
        private String queryCondition; 
        private String startTime; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosisMonitorPerformanceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.database = request.database;
            this.endTime = request.endTime;
            this.queryCondition = request.queryCondition;
            this.startTime = request.startTime;
            this.user = request.user;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adbtest</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC. The end time must be later than the start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-07T07:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The filter condition on queries. Specify the value in the JSON format. Valid values:</p>
         * <ul>
         * <li><p><code>{&quot;Type&quot;:&quot;maxCost&quot;, &quot;Value&quot;:&quot;100&quot;}</code>: filters the top 100 queries that are the most time-consuming.</p>
         * </li>
         * <li><p><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: filters completed queries.</p>
         * </li>
         * <li><p><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;running&quot;}</code>: filters running queries.</p>
         * </li>
         * <li><p><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;30&quot;,&quot;Max&quot;:&quot;50&quot;}</code>: filters the queries that consume 30 milliseconds or more and less than 50 milliseconds. You can customize a filter condition by setting <strong>Min</strong> and <strong>Max</strong>.</p>
         * <ul>
         * <li>If only <strong>Min</strong> is specified, the queries that consume a period of time that is greater than or equal to the Min value are filtered.</li>
         * <li>If only <strong>Max</strong> is specified, the queries that consume a period of time that is less than the Max value are filtered.</li>
         * <li>If both <strong>Min</strong> and <strong>Max</strong> are specified, the queries that consume a period of time that is greater than or equal to the <strong>Min</strong> value and less than the <strong>Max</strong> value are filtered.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;:&quot;maxCost&quot;, &quot;Value&quot;:&quot;100&quot;}</p>
         */
        public Builder queryCondition(String queryCondition) {
            this.putQueryParameter("QueryCondition", queryCondition);
            this.queryCondition = queryCondition;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-07T06:59Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpguser</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public DescribeDiagnosisMonitorPerformanceRequest build() {
            return new DescribeDiagnosisMonitorPerformanceRequest(this);
        } 

    } 

}
