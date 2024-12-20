// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link QueryAppTopologyRequest} extends {@link RequestModel}
 *
 * <p>QueryAppTopologyRequest</p>
 */
public class QueryAppTopologyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Db")
    private String db;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.Map<String, String> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rpc")
    private String rpc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private QueryAppTopologyRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
        this.db = builder.db;
        this.dbName = builder.dbName;
        this.endTime = builder.endTime;
        this.filters = builder.filters;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.rpc = builder.rpc;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppTopologyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return db
     */
    public String getDb() {
        return this.db;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return filters
     */
    public java.util.Map<String, String> getFilters() {
        return this.filters;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rpc
     */
    public String getRpc() {
        return this.rpc;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QueryAppTopologyRequest, Builder> {
        private String appType; 
        private String db; 
        private String dbName; 
        private Long endTime; 
        private java.util.Map<String, String> filters; 
        private String pid; 
        private String regionId; 
        private String rpc; 
        private Long startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(QueryAppTopologyRequest request) {
            super(request);
            this.appType = request.appType;
            this.db = request.db;
            this.dbName = request.dbName;
            this.endTime = request.endTime;
            this.filters = request.filters;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.rpc = request.rpc;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * <p>The application type</p>
         * 
         * <strong>example:</strong>
         * <p>TRACE</p>
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>The database domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-xxx.mysql.rds.aliyuncs.com:3306</p>
         */
        public Builder db(String db) {
            this.putQueryParameter("Db", db);
            this.db = db;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1671952708499</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The filter conditions.</p>
         */
        public Builder filters(java.util.Map<String, String> filters) {
            String filtersShrink = shrink(filters, "Filters", "json");
            this.putQueryParameter("Filters", filtersShrink);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * <p>Log on to the <strong>ARMS console</strong>. In the left-side navigation pane, choose <strong>Browser Monitoring</strong> &gt; <strong>Browser Monitoring</strong>. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is eb4zdose6v%409781be0f44d****, you must replace %40 with an at sign (@) to obtain eb4zdose6v@9781be0f44d****.</p>
         * 
         * <strong>example:</strong>
         * <p>atc889zkcf@d8deedfa9bf****</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>RPC interface name.</p>
         * 
         * <strong>example:</strong>
         * <p>/eventCenter</p>
         */
        public Builder rpc(String rpc) {
            this.putQueryParameter("Rpc", rpc);
            this.rpc = rpc;
            return this;
        }

        /**
         * <p>The start of the time range to query. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1595568910000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The type kind of topology.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apm_apps_v2</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QueryAppTopologyRequest build() {
            return new QueryAppTopologyRequest(this);
        } 

    } 

}
