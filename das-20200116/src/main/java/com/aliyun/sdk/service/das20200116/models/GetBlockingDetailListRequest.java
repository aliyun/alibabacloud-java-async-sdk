// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBlockingDetailListRequest} extends {@link RequestModel}
 *
 * <p>GetBlockingDetailListRequest</p>
 */
public class GetBlockingDetailListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbNameList")
    private String dbNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryHash")
    private String queryHash;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private GetBlockingDetailListRequest(Builder builder) {
        super(builder);
        this.dbNameList = builder.dbNameList;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.queryHash = builder.queryHash;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBlockingDetailListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbNameList
     */
    public String getDbNameList() {
        return this.dbNameList;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryHash
     */
    public String getQueryHash() {
        return this.queryHash;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetBlockingDetailListRequest, Builder> {
        private String dbNameList; 
        private String endTime; 
        private String instanceId; 
        private String pageNo; 
        private String pageSize; 
        private String queryHash; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetBlockingDetailListRequest request) {
            super(request);
            this.dbNameList = request.dbNameList;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.queryHash = request.queryHash;
            this.startTime = request.startTime;
        } 

        /**
         * The database name list.
         * <p>
         * 
         * *   Separate multiple database names with commas (,).
         */
        public Builder dbNameList(String dbNameList) {
            this.putQueryParameter("DbNameList", dbNameList);
            this.dbNameList = dbNameList;
            return this;
        }

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The database instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The page number. The value must be an integer that is greater than 0. Default value: 1.
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page. The value must be an integer that is greater than 0. Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The hash value of the SQL statement.
         */
        public Builder queryHash(String queryHash) {
            this.putQueryParameter("QueryHash", queryHash);
            this.queryHash = queryHash;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetBlockingDetailListRequest build() {
            return new GetBlockingDetailListRequest(this);
        } 

    } 

}
