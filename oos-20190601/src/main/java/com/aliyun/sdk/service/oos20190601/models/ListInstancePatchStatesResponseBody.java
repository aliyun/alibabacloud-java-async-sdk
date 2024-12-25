// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListInstancePatchStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancePatchStatesResponseBody</p>
 */
public class ListInstancePatchStatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstancePatchStates")
    private java.util.List<InstancePatchStates> instancePatchStates;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstancePatchStatesResponseBody(Builder builder) {
        this.instancePatchStates = builder.instancePatchStates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancePatchStatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instancePatchStates
     */
    public java.util.List<InstancePatchStates> getInstancePatchStates() {
        return this.instancePatchStates;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstancePatchStates> instancePatchStates; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The details of patches of the instance.</p>
         */
        public Builder instancePatchStates(java.util.List<InstancePatchStates> instancePatchStates) {
            this.instancePatchStates = instancePatchStates;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9A47C086-E64D-52EE-8B2C-EFD23877C55E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancePatchStatesResponseBody build() {
            return new ListInstancePatchStatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancePatchStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancePatchStatesResponseBody</p>
     */
    public static class InstancePatchStates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private String baselineId;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private String failedCount;

        @com.aliyun.core.annotation.NameInMap("InstalledCount")
        private String installedCount;

        @com.aliyun.core.annotation.NameInMap("InstalledOtherCount")
        private String installedOtherCount;

        @com.aliyun.core.annotation.NameInMap("InstalledPendingRebootCount")
        private String installedPendingRebootCount;

        @com.aliyun.core.annotation.NameInMap("InstalledRejectedCount")
        private String installedRejectedCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MissingCount")
        private String missingCount;

        @com.aliyun.core.annotation.NameInMap("OperationEndTime")
        private String operationEndTime;

        @com.aliyun.core.annotation.NameInMap("OperationStartTime")
        private String operationStartTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("OwnerInformation")
        private String ownerInformation;

        @com.aliyun.core.annotation.NameInMap("PatchGroup")
        private String patchGroup;

        private InstancePatchStates(Builder builder) {
            this.baselineId = builder.baselineId;
            this.failedCount = builder.failedCount;
            this.installedCount = builder.installedCount;
            this.installedOtherCount = builder.installedOtherCount;
            this.installedPendingRebootCount = builder.installedPendingRebootCount;
            this.installedRejectedCount = builder.installedRejectedCount;
            this.instanceId = builder.instanceId;
            this.missingCount = builder.missingCount;
            this.operationEndTime = builder.operationEndTime;
            this.operationStartTime = builder.operationStartTime;
            this.operationType = builder.operationType;
            this.ownerInformation = builder.ownerInformation;
            this.patchGroup = builder.patchGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePatchStates create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public String getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return failedCount
         */
        public String getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return installedCount
         */
        public String getInstalledCount() {
            return this.installedCount;
        }

        /**
         * @return installedOtherCount
         */
        public String getInstalledOtherCount() {
            return this.installedOtherCount;
        }

        /**
         * @return installedPendingRebootCount
         */
        public String getInstalledPendingRebootCount() {
            return this.installedPendingRebootCount;
        }

        /**
         * @return installedRejectedCount
         */
        public String getInstalledRejectedCount() {
            return this.installedRejectedCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return missingCount
         */
        public String getMissingCount() {
            return this.missingCount;
        }

        /**
         * @return operationEndTime
         */
        public String getOperationEndTime() {
            return this.operationEndTime;
        }

        /**
         * @return operationStartTime
         */
        public String getOperationStartTime() {
            return this.operationStartTime;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return ownerInformation
         */
        public String getOwnerInformation() {
            return this.ownerInformation;
        }

        /**
         * @return patchGroup
         */
        public String getPatchGroup() {
            return this.patchGroup;
        }

        public static final class Builder {
            private String baselineId; 
            private String failedCount; 
            private String installedCount; 
            private String installedOtherCount; 
            private String installedPendingRebootCount; 
            private String installedRejectedCount; 
            private String instanceId; 
            private String missingCount; 
            private String operationEndTime; 
            private String operationStartTime; 
            private String operationType; 
            private String ownerInformation; 
            private String patchGroup; 

            /**
             * <p>The ID of the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>pb-f9393021b7a049e1b34e</p>
             */
            public Builder baselineId(String baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The number of patches that failed to be installed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedCount(String failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The number of installed patches.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder installedCount(String installedCount) {
                this.installedCount = installedCount;
                return this;
            }

            /**
             * <p>The number of patches that do not meet the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder installedOtherCount(String installedOtherCount) {
                this.installedOtherCount = installedOtherCount;
                return this;
            }

            /**
             * <p>The number of patches that have been installed but require a restart to take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder installedPendingRebootCount(String installedPendingRebootCount) {
                this.installedPendingRebootCount = installedPendingRebootCount;
                return this;
            }

            /**
             * <p>The number of patches that are rejected by the user.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder installedRejectedCount(String installedRejectedCount) {
                this.installedRejectedCount = installedRejectedCount;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1jaxa2bs4bps7*****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The number of patches that are not installed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder missingCount(String missingCount) {
                this.missingCount = missingCount;
                return this;
            }

            /**
             * <p>The time when the operation ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-10T11:42:22Z</p>
             */
            public Builder operationEndTime(String operationEndTime) {
                this.operationEndTime = operationEndTime;
                return this;
            }

            /**
             * <p>The time when the operation was initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-10T11:42:22Z</p>
             */
            public Builder operationStartTime(String operationStartTime) {
                this.operationStartTime = operationStartTime;
                return this;
            }

            /**
             * <p>The operation type.</p>
             * 
             * <strong>example:</strong>
             * <p>scan</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The information about the user.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder ownerInformation(String ownerInformation) {
                this.ownerInformation = ownerInformation;
                return this;
            }

            /**
             * <p>The patch group.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder patchGroup(String patchGroup) {
                this.patchGroup = patchGroup;
                return this;
            }

            public InstancePatchStates build() {
                return new InstancePatchStates(this);
            } 

        } 

    }
}
