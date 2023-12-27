// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAppTopologyRequest} extends {@link RequestModel}
 *
 * <p>QueryAppTopologyRequest</p>
 */
public class QueryAppTopologyRequest extends Request {
    @Query
    @NameInMap("AppType")
    private String appType;

    @Query
    @NameInMap("Db")
    private String db;

    @Query
    @NameInMap("DbName")
    private String dbName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Filters")
    private java.util.Map < String, String > filters;

    @Query
    @NameInMap("Pid")
    private String pid;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Rpc")
    private String rpc;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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
    public java.util.Map < String, String > getFilters() {
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
        private java.util.Map < String, String > filters; 
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
         * The application type
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * The database domain name.
         */
        public Builder db(String db) {
            this.putQueryParameter("Db", db);
            this.db = db;
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
         * The end of the time range to query. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The filter conditions.
         */
        public Builder filters(java.util.Map < String, String > filters) {
            String filtersShrink = shrink(filters, "Filters", "json");
            this.putQueryParameter("Filters", filtersShrink);
            this.filters = filters;
            return this;
        }

        /**
         * The ID of the application.
         * <p>
         * 
         * Log on to the **ARMS console**. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is eb4zdose6v%409781be0f44d\*\*\*\*, you must replace %40 with an at sign (@) to obtain eb4zdose6v@9781be0f44d\*\*\*\*.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RPC interface name.
         */
        public Builder rpc(String rpc) {
            this.putQueryParameter("Rpc", rpc);
            this.rpc = rpc;
            return this;
        }

        /**
         * The start of the time range to query. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The type kind of topology.
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
