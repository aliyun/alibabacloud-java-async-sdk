// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeApsMigrationWorkloadsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsMigrationWorkloadsResponseBody</p>
 */
public class DescribeApsMigrationWorkloadsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MigrationWorkloads")
    private java.util.List<MigrationWorkloads> migrationWorkloads;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApsMigrationWorkloadsResponseBody(Builder builder) {
        this.migrationWorkloads = builder.migrationWorkloads;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsMigrationWorkloadsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return migrationWorkloads
     */
    public java.util.List<MigrationWorkloads> getMigrationWorkloads() {
        return this.migrationWorkloads;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<MigrationWorkloads> migrationWorkloads; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeApsMigrationWorkloadsResponseBody model) {
            this.migrationWorkloads = model.migrationWorkloads;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried migration workloads.</p>
         */
        public Builder migrationWorkloads(java.util.List<MigrationWorkloads> migrationWorkloads) {
            this.migrationWorkloads = migrationWorkloads;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>-3EEC-57F0-9F06-</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApsMigrationWorkloadsResponseBody build() {
            return new DescribeApsMigrationWorkloadsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApsMigrationWorkloadsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsMigrationWorkloadsResponseBody</p>
     */
    public static class MigrationWorkloads extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcuCount")
        private Integer acuCount;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FailedMsg")
        private String failedMsg;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MaxRT")
        private String maxRT;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OssLocation")
        private String ossLocation;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("WorkloadSubType")
        private String workloadSubType;

        private MigrationWorkloads(Builder builder) {
            this.acuCount = builder.acuCount;
            this.createTime = builder.createTime;
            this.failedMsg = builder.failedMsg;
            this.id = builder.id;
            this.maxRT = builder.maxRT;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.ossLocation = builder.ossLocation;
            this.state = builder.state;
            this.targetType = builder.targetType;
            this.workloadSubType = builder.workloadSubType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationWorkloads create() {
            return builder().build();
        }

        /**
         * @return acuCount
         */
        public Integer getAcuCount() {
            return this.acuCount;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return failedMsg
         */
        public String getFailedMsg() {
            return this.failedMsg;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return maxRT
         */
        public String getMaxRT() {
            return this.maxRT;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossLocation
         */
        public String getOssLocation() {
            return this.ossLocation;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return workloadSubType
         */
        public String getWorkloadSubType() {
            return this.workloadSubType;
        }

        public static final class Builder {
            private Integer acuCount; 
            private String createTime; 
            private String failedMsg; 
            private String id; 
            private String maxRT; 
            private String modifyTime; 
            private String name; 
            private String ossLocation; 
            private String state; 
            private String targetType; 
            private String workloadSubType; 

            private Builder() {
            } 

            private Builder(MigrationWorkloads model) {
                this.acuCount = model.acuCount;
                this.createTime = model.createTime;
                this.failedMsg = model.failedMsg;
                this.id = model.id;
                this.maxRT = model.maxRT;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.ossLocation = model.ossLocation;
                this.state = model.state;
                this.targetType = model.targetType;
                this.workloadSubType = model.workloadSubType;
            } 

            /**
             * <p>The number of AnalyticDB compute units (ACUs).</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder acuCount(Integer acuCount) {
                this.acuCount = acuCount;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-21T02:15:16Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder failedMsg(String failedMsg) {
                this.failedMsg = failedMsg;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The maximum response time.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxRT(String maxRT) {
                this.maxRT = maxRT;
                return this;
            }

            /**
             * <p>The time when the migration job was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-21T02:15:16Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the workload.</p>
             * 
             * <strong>example:</strong>
             * <p>TEST-001</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The OSS URL.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://******</p>
             */
            public Builder ossLocation(String ossLocation) {
                this.ossLocation = ossLocation;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The destination type.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The sub-type of the workload.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadSubType(String workloadSubType) {
                this.workloadSubType = workloadSubType;
                return this;
            }

            public MigrationWorkloads build() {
                return new MigrationWorkloads(this);
            } 

        } 

    }
}
