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
        private Long endTime; 
        private Integer limit; 
        private String nextToken; 
        private java.util.List < OtsInstances> otsInstances; 
        private java.util.List < String > snapshotIds; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOtsTableSnapshotsRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.limit = response.limit;
            this.nextToken = response.nextToken;
            this.otsInstances = response.otsInstances;
            this.snapshotIds = response.snapshotIds;
            this.startTime = response.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OtsInstances.
         */
        public Builder otsInstances(java.util.List < OtsInstances> otsInstances) {
            this.putBodyParameter("OtsInstances", otsInstances);
            this.otsInstances = otsInstances;
            return this;
        }

        /**
         * SnapshotIds.
         */
        public Builder snapshotIds(java.util.List < String > snapshotIds) {
            this.putBodyParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * StartTime.
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * TableNames.
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
