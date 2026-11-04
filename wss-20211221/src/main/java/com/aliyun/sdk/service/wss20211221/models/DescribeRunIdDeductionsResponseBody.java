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
         * <p>The deduction details.</p>
         */
        public Builder deductions(java.util.List<Deductions> deductions) {
            this.deductions = deductions;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, use the nextToken value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The Settings for the number of entries per page during paging in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>68BD3312-53D8-123E-BB32-1A9F25E07A03</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of core-hour package deduction details returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total usage duration. Unit: seconds. Do not use this field in AI scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder totalUsedTime(Long totalUsedTime) {
            this.totalUsedTime = totalUsedTime;
            return this;
        }

        /**
         * <p>The total used credits that meet the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1.23</p>
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

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

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
            this.model = builder.model;
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
         * @return model
         */
        public String getModel() {
            return this.model;
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
            private String model; 
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
                this.model = model.model;
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
             * <p>The agent type. Valid values: CREDIT_PACKAGE, JVS_CLAW, OPEN_CLAW, and JVS_COPILOT.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenClaw</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The end time of the period. The time is in ISO 8601 format and displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-31T03:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The grouped resource type to which the deduction record belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>GROUP_CREDIT_PACKAGE</p>
             */
            public Builder groupResourceType(String groupResourceType) {
                this.groupResourceType = groupResourceType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>jvs-xxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The identifier of the called large language model. This field is used to distinguish the consumption of each model when grouping by model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-3.7</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The ID of the credit or package.</p>
             * 
             * <strong>example:</strong>
             * <p>crp-xxx</p>
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sunwyic.com</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>CreditPackage、BusinessCreditPackage</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The unique ID of the run.</p>
             * 
             * <strong>example:</strong>
             * <p>run-szwB1fYHCTocjGkFAIf6V8A</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The start time. The time is in ISO 8601 format and displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-16T02:10:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The summary of the large language model call.</p>
             * 
             * <strong>example:</strong>
             * <p>How is the weather today?</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The usage duration. Unit: seconds. Do not use this field in AI scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>360000000</p>
             */
            public Builder usedTime(Long usedTime) {
                this.usedTime = usedTime;
                return this;
            }

            /**
             * <p>The used credits.</p>
             * 
             * <strong>example:</strong>
             * <p>1.23</p>
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
