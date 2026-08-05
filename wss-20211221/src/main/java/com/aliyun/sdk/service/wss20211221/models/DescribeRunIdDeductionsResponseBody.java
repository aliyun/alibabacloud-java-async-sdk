// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeRunIdDeductionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRunIdDeductionsResponseBody</p>
 */
public class DescribeRunIdDeductionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Deductions")
    private java.util.List<Deductions> deductions;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalUsedTime")
    private Long totalUsedTime;

    @com.aliyun.core.annotation.NameInMap("TotalUsedTimeDecimal")
    private String totalUsedTimeDecimal;

    private DescribeRunIdDeductionsResponseBody(Builder builder) {
        this.deductions = builder.deductions;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalUsedTime = builder.totalUsedTime;
        this.totalUsedTimeDecimal = builder.totalUsedTimeDecimal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRunIdDeductionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deductions
     */
    public java.util.List<Deductions> getDeductions() {
        return this.deductions;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalUsedTime
     */
    public Long getTotalUsedTime() {
        return this.totalUsedTime;
    }

    /**
     * @return totalUsedTimeDecimal
     */
    public String getTotalUsedTimeDecimal() {
        return this.totalUsedTimeDecimal;
    }

    public static final class Builder {
        private java.util.List<Deductions> deductions; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 
        private Long totalUsedTime; 
        private String totalUsedTimeDecimal; 

        private Builder() {
        } 

        private Builder(DescribeRunIdDeductionsResponseBody model) {
            this.deductions = model.deductions;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalUsedTime = model.totalUsedTime;
            this.totalUsedTimeDecimal = model.totalUsedTimeDecimal;
        } 

        /**
         * Deductions.
         */
        public Builder deductions(java.util.List<Deductions> deductions) {
            this.deductions = deductions;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>68BD3312-53D8-123E-BB32-1A9F25E07A03</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalUsedTime.
         */
        public Builder totalUsedTime(Long totalUsedTime) {
            this.totalUsedTime = totalUsedTime;
            return this;
        }

        /**
         * TotalUsedTimeDecimal.
         */
        public Builder totalUsedTimeDecimal(String totalUsedTimeDecimal) {
            this.totalUsedTimeDecimal = totalUsedTimeDecimal;
            return this;
        }

        public DescribeRunIdDeductionsResponseBody build() {
            return new DescribeRunIdDeductionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRunIdDeductionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRunIdDeductionsResponseBody</p>
     */
    public static class Deductions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("GroupResourceType")
        private String groupResourceType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("UsedTime")
        private Long usedTime;

        @com.aliyun.core.annotation.NameInMap("UsedTimeDecimal")
        private String usedTimeDecimal;

        private Deductions(Builder builder) {
            this.agentType = builder.agentType;
            this.endTime = builder.endTime;
            this.groupResourceType = builder.groupResourceType;
            this.instanceId = builder.instanceId;
            this.packageId = builder.packageId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.runId = builder.runId;
            this.startTime = builder.startTime;
            this.summary = builder.summary;
            this.usedTime = builder.usedTime;
            this.usedTimeDecimal = builder.usedTimeDecimal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deductions create() {
            return builder().build();
        }

        /**
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return groupResourceType
         */
        public String getGroupResourceType() {
            return this.groupResourceType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return usedTime
         */
        public Long getUsedTime() {
            return this.usedTime;
        }

        /**
         * @return usedTimeDecimal
         */
        public String getUsedTimeDecimal() {
            return this.usedTimeDecimal;
        }

        public static final class Builder {
            private String agentType; 
            private String endTime; 
            private String groupResourceType; 
            private String instanceId; 
            private String packageId; 
            private String resourceId; 
            private String resourceType; 
            private String runId; 
            private String startTime; 
            private String summary; 
            private Long usedTime; 
            private String usedTimeDecimal; 

            private Builder() {
            } 

            private Builder(Deductions model) {
                this.agentType = model.agentType;
                this.endTime = model.endTime;
                this.groupResourceType = model.groupResourceType;
                this.instanceId = model.instanceId;
                this.packageId = model.packageId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.runId = model.runId;
                this.startTime = model.startTime;
                this.summary = model.summary;
                this.usedTime = model.usedTime;
                this.usedTimeDecimal = model.usedTimeDecimal;
            } 

            /**
             * AgentType.
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * GroupResourceType.
             */
            public Builder groupResourceType(String groupResourceType) {
                this.groupResourceType = groupResourceType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * RunId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * UsedTime.
             */
            public Builder usedTime(Long usedTime) {
                this.usedTime = usedTime;
                return this;
            }

            /**
             * UsedTimeDecimal.
             */
            public Builder usedTimeDecimal(String usedTimeDecimal) {
                this.usedTimeDecimal = usedTimeDecimal;
                return this;
            }

            public Deductions build() {
                return new Deductions(this);
            } 

        } 

    }
}
