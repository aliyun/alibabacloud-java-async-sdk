// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOtsTableSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOtsTableSnapshotsRequest</p>
 */
public class DescribeOtsTableSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OtsInstances")
    private java.util.List < OtsInstances> otsInstances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SnapshotIds")
    private java.util.List < String > snapshotIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupRole</p>
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * <p>Specifies whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li>SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</li>
         * <li>CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CROSS_ACCOUNT</p>
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * <p>The UID of the source account used for cross-account backup.</p>
         * 
         * <strong>example:</strong>
         * <p>144015xxxxx98732</p>
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * <p>The end time of the backup. The value must be a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652068250881</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The maximum number of rows that you want the current query to return.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The token that is required to obtain the next page of backup snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The Tablestore instances that are backed up.</p>
         */
        public Builder otsInstances(java.util.List < OtsInstances> otsInstances) {
            this.putBodyParameter("OtsInstances", otsInstances);
            this.otsInstances = otsInstances;
            return this;
        }

        /**
         * <p>The snapshot IDs.</p>
         */
        public Builder snapshotIds(java.util.List < String > snapshotIds) {
            this.putBodyParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * <p>The start time of the backup. The value must be a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1611109271630</p>
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

    /**
     * 
     * {@link DescribeOtsTableSnapshotsRequest} extends {@link TeaModel}
     *
     * <p>DescribeOtsTableSnapshotsRequest</p>
     */
    public static class OtsInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("TableNames")
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
             * <p>The name of the Tablestore instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instancename</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The names of the tables in the Tablestore instance.</p>
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
