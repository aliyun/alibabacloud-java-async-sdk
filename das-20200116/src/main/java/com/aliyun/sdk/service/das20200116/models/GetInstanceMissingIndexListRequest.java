// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInstanceMissingIndexListRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceMissingIndexListRequest</p>
 */
public class GetInstanceMissingIndexListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvgTotalUserCost")
    private String avgTotalUserCost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvgUserImpact")
    private String avgUserImpact;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexCount")
    private String indexCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectName")
    private String objectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedPages")
    private String reservedPages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedSize")
    private String reservedSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RowCount")
    private String rowCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueCompiles")
    private String uniqueCompiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserScans")
    private String userScans;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSeeks")
    private String userSeeks;

    private GetInstanceMissingIndexListRequest(Builder builder) {
        super(builder);
        this.avgTotalUserCost = builder.avgTotalUserCost;
        this.avgUserImpact = builder.avgUserImpact;
        this.endTime = builder.endTime;
        this.indexCount = builder.indexCount;
        this.instanceId = builder.instanceId;
        this.objectName = builder.objectName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.reservedPages = builder.reservedPages;
        this.reservedSize = builder.reservedSize;
        this.rowCount = builder.rowCount;
        this.startTime = builder.startTime;
        this.uniqueCompiles = builder.uniqueCompiles;
        this.userScans = builder.userScans;
        this.userSeeks = builder.userSeeks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceMissingIndexListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avgTotalUserCost
     */
    public String getAvgTotalUserCost() {
        return this.avgTotalUserCost;
    }

    /**
     * @return avgUserImpact
     */
    public String getAvgUserImpact() {
        return this.avgUserImpact;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return indexCount
     */
    public String getIndexCount() {
        return this.indexCount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
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
     * @return reservedPages
     */
    public String getReservedPages() {
        return this.reservedPages;
    }

    /**
     * @return reservedSize
     */
    public String getReservedSize() {
        return this.reservedSize;
    }

    /**
     * @return rowCount
     */
    public String getRowCount() {
        return this.rowCount;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return uniqueCompiles
     */
    public String getUniqueCompiles() {
        return this.uniqueCompiles;
    }

    /**
     * @return userScans
     */
    public String getUserScans() {
        return this.userScans;
    }

    /**
     * @return userSeeks
     */
    public String getUserSeeks() {
        return this.userSeeks;
    }

    public static final class Builder extends Request.Builder<GetInstanceMissingIndexListRequest, Builder> {
        private String avgTotalUserCost; 
        private String avgUserImpact; 
        private String endTime; 
        private String indexCount; 
        private String instanceId; 
        private String objectName; 
        private String pageNo; 
        private String pageSize; 
        private String reservedPages; 
        private String reservedSize; 
        private String rowCount; 
        private String startTime; 
        private String uniqueCompiles; 
        private String userScans; 
        private String userSeeks; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceMissingIndexListRequest request) {
            super(request);
            this.avgTotalUserCost = request.avgTotalUserCost;
            this.avgUserImpact = request.avgUserImpact;
            this.endTime = request.endTime;
            this.indexCount = request.indexCount;
            this.instanceId = request.instanceId;
            this.objectName = request.objectName;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.reservedPages = request.reservedPages;
            this.reservedSize = request.reservedSize;
            this.rowCount = request.rowCount;
            this.startTime = request.startTime;
            this.uniqueCompiles = request.uniqueCompiles;
            this.userScans = request.userScans;
            this.userSeeks = request.userSeeks;
        } 

        /**
         * <p>The query condition based on the average cost savings.</p>
         * 
         * <strong>example:</strong>
         * <p>&lt;=|8</p>
         */
        public Builder avgTotalUserCost(String avgTotalUserCost) {
            this.putQueryParameter("AvgTotalUserCost", avgTotalUserCost);
            this.avgTotalUserCost = avgTotalUserCost;
            return this;
        }

        /**
         * <p>The query condition based on the performance improvement.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>|10000</p>
         * </blockquote>
         */
        public Builder avgUserImpact(String avgUserImpact) {
            this.putQueryParameter("AvgUserImpact", avgUserImpact);
            this.avgUserImpact = avgUserImpact;
            return this;
        }

        /**
         * <p>The end time of the last seek.</p>
         * 
         * <strong>example:</strong>
         * <p>1681869544000</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The query condition based on the number of indexes.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=|8</p>
         * </blockquote>
         */
        public Builder indexCount(String indexCount) {
            this.putQueryParameter("IndexCount", indexCount);
            this.indexCount = indexCount;
            return this;
        }

        /**
         * <p>The database instance ID.</p>
         * <blockquote>
         * <p> Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-************</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The object name.</p>
         * 
         * <strong>example:</strong>
         * <p>bas_customer</p>
         */
        public Builder objectName(String objectName) {
            this.putQueryParameter("ObjectName", objectName);
            this.objectName = objectName;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The query condition based on the total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=|100</p>
         * </blockquote>
         */
        public Builder reservedPages(String reservedPages) {
            this.putQueryParameter("ReservedPages", reservedPages);
            this.reservedPages = reservedPages;
            return this;
        }

        /**
         * <p>The query condition based on the table size.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=|100</p>
         * </blockquote>
         */
        public Builder reservedSize(String reservedSize) {
            this.putQueryParameter("ReservedSize", reservedSize);
            this.reservedSize = reservedSize;
            return this;
        }

        /**
         * <p>The query condition based on the number of table rows.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=|100000</p>
         * </blockquote>
         */
        public Builder rowCount(String rowCount) {
            this.putQueryParameter("RowCount", rowCount);
            this.rowCount = rowCount;
            return this;
        }

        /**
         * <p>The start time of the last seek.</p>
         * 
         * <strong>example:</strong>
         * <p>1679414400000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The query condition based on the number of compilations.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=|10000</p>
         * </blockquote>
         */
        public Builder uniqueCompiles(String uniqueCompiles) {
            this.putQueryParameter("UniqueCompiles", uniqueCompiles);
            this.uniqueCompiles = uniqueCompiles;
            return this;
        }

        /**
         * <p>The query condition based on the number of scans.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=|10000</p>
         * </blockquote>
         */
        public Builder userScans(String userScans) {
            this.putQueryParameter("UserScans", userScans);
            this.userScans = userScans;
            return this;
        }

        /**
         * <p>The query condition based on the number of seeks.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=|1000</p>
         * </blockquote>
         */
        public Builder userSeeks(String userSeeks) {
            this.putQueryParameter("UserSeeks", userSeeks);
            this.userSeeks = userSeeks;
            return this;
        }

        @Override
        public GetInstanceMissingIndexListRequest build() {
            return new GetInstanceMissingIndexListRequest(this);
        } 

    } 

}
