// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOtsTableSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOtsTableSnapshotsRequest</p>
 */
public class DescribeOtsTableSnapshotsRequest extends Request {
    @Query
    @NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @Query
    @NameInMap("CrossAccountType")
    private String crossAccountType;

    @Query
    @NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("Limit")
    private Integer limit;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("OtsInstances")
    private java.util.List < OtsInstances> otsInstances;

    @Body
    @NameInMap("SnapshotIds")
    private java.util.List < String > snapshotIds;

    @Body
    @NameInMap("StartTime")
    private Long startTime;

    private DescribeOtsTableSnapshotsRequest(Builder builder) {
        super(builder);
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.otsInstances = builder.otsInstances;
        this.snapshotIds = builder.snapshotIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOtsTableSnapshotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountType
     */
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return otsInstances
     */
    public java.util.List < OtsInstances> getOtsInstances() {
        return this.otsInstances;
    }

    /**
     * @return snapshotIds
     */
    public java.util.List < String > getSnapshotIds() {
        return this.snapshotIds;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeOtsTableSnapshotsRequest, Builder> {
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 
        private Long endTime; 
        private Integer limit; 
        private String nextToken; 
        private java.util.List < OtsInstances> otsInstances; 
        private java.util.List < String > snapshotIds; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOtsTableSnapshotsRequest request) {
            super(request);
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
            this.endTime = request.endTime;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.otsInstances = request.otsInstances;
            this.snapshotIds = request.snapshotIds;
            this.startTime = request.startTime;
        } 

        /**
         * The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * Specifies whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:
         * <p>
         * 
         * *   SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.
         * *   CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * The UID of the source account used for cross-account backup.
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * The end time of the backup. The value must be a UNIX timestamp. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The maximum number of rows that you want the current query to return.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The token that is required to obtain the next page of backup snapshots.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The Tablestore instances that are backed up.
         */
        public Builder otsInstances(java.util.List < OtsInstances> otsInstances) {
            this.putBodyParameter("OtsInstances", otsInstances);
            this.otsInstances = otsInstances;
            return this;
        }

        /**
         * The snapshot IDs.
         */
        public Builder snapshotIds(java.util.List < String > snapshotIds) {
            this.putBodyParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * The start time of the backup. The value must be a UNIX timestamp. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeOtsTableSnapshotsRequest build() {
            return new DescribeOtsTableSnapshotsRequest(this);
        } 

    } 

    public static class OtsInstances extends TeaModel {
        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("TableNames")
        private java.util.List < String > tableNames;

        private OtsInstances(Builder builder) {
            this.instanceName = builder.instanceName;
            this.tableNames = builder.tableNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtsInstances create() {
            return builder().build();
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return tableNames
         */
        public java.util.List < String > getTableNames() {
            return this.tableNames;
        }

        public static final class Builder {
            private String instanceName; 
            private java.util.List < String > tableNames; 

            /**
             * The name of the Tablestore instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The names of the tables in the Tablestore instance.
             */
            public Builder tableNames(java.util.List < String > tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            public OtsInstances build() {
                return new OtsInstances(this);
            } 

        } 

    }
}
