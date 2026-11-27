// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link RefreshAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshAssetsResponseBody</p>
 */
public class RefreshAssetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accepted")
    private Boolean accepted;

    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ExecutionStatus")
    private String executionStatus;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Reused")
    private Boolean reused;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Task")
    private Task task;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TimeCost")
    private Long timeCost;

    private RefreshAssetsResponseBody(Builder builder) {
        this.accepted = builder.accepted;
        this.clientToken = builder.clientToken;
        this.code = builder.code;
        this.executionStatus = builder.executionStatus;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.reused = builder.reused;
        this.success = builder.success;
        this.task = builder.task;
        this.taskId = builder.taskId;
        this.timeCost = builder.timeCost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAssetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accepted
     */
    public Boolean getAccepted() {
        return this.accepted;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return executionStatus
     */
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reused
     */
    public Boolean getReused() {
        return this.reused;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return timeCost
     */
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static final class Builder {
        private Boolean accepted; 
        private String clientToken; 
        private String code; 
        private String executionStatus; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean reused; 
        private Boolean success; 
        private Task task; 
        private String taskId; 
        private Long timeCost; 

        private Builder() {
        } 

        private Builder(RefreshAssetsResponseBody model) {
            this.accepted = model.accepted;
            this.clientToken = model.clientToken;
            this.code = model.code;
            this.executionStatus = model.executionStatus;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.reused = model.reused;
            this.success = model.success;
            this.task = model.task;
            this.taskId = model.taskId;
            this.timeCost = model.timeCost;
        } 

        /**
         * <p>Indicates whether the cloud_k8s task has been persistently accepted. This does not indicate that the task has been completed.</p>
         */
        public Builder accepted(Boolean accepted) {
            this.accepted = accepted;
            return this;
        }

        /**
         * <p>The idempotency key for the cloud_k8s synchronization request, which is the same as the ClientToken in the request. If the acceptance result is uncertain, you can use the original value to query the task and avoid generating a new key for repeated submissions.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-k8s-sync-example-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The business result code of the request. A value of 200 indicates that the request was successful. If the request fails, a business error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The status of the cloud_k8s asynchronous task. The status is typically ACCEPTED when the task is accepted.</p>
         * 
         * <strong>example:</strong>
         * <p>ACCEPTED</p>
         */
        public Builder executionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend. If the request is successful, the value is 200. If the request fails, a corresponding status code is returned. This status code does not indicate the status of an asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The business result message of the request. If the request is successful, the value is successful. If the request fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request, which is generated by Alibaba Cloud and can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>340D7FC4-D575-1661-8ACD-CFA7BE57B795</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the idempotency key for the cloud_k8s task was reused for the same task.</p>
         */
        public Builder reused(Boolean reused) {
            this.reused = reused;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. A value of true indicates that the request was successful. A value of false indicates that the request failed. For asynchronous synchronization tasks, a value of true does not indicate that the task has been completed.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The details of the multi-cloud cluster synchronization task.</p>
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        /**
         * <p>The ID of the cloud_k8s task. For compatibility, you can query the task by using the ClientToken.</p>
         * 
         * <strong>example:</strong>
         * <p>mkt-00000000-0000-4000-8000-000000000001</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The time taken to process the request, recorded by the backend. Whether this field is returned depends on the backend tracing path. It does not represent the total execution duration for an asynchronous synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public RefreshAssetsResponseBody build() {
            return new RefreshAssetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RefreshAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>RefreshAssetsResponseBody</p>
     */
    public static class Shards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutionAttempt")
        private Integer executionAttempt;

        @com.aliyun.core.annotation.NameInMap("FailureCode")
        private String failureCode;

        @com.aliyun.core.annotation.NameInMap("FailureMessage")
        private String failureMessage;

        @com.aliyun.core.annotation.NameInMap("ProviderAccountId")
        private String providerAccountId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ShardId")
        private String shardId;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Shards(Builder builder) {
            this.executionAttempt = builder.executionAttempt;
            this.failureCode = builder.failureCode;
            this.failureMessage = builder.failureMessage;
            this.providerAccountId = builder.providerAccountId;
            this.regionId = builder.regionId;
            this.shardId = builder.shardId;
            this.stage = builder.stage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Shards create() {
            return builder().build();
        }

        /**
         * @return executionAttempt
         */
        public Integer getExecutionAttempt() {
            return this.executionAttempt;
        }

        /**
         * @return failureCode
         */
        public String getFailureCode() {
            return this.failureCode;
        }

        /**
         * @return failureMessage
         */
        public String getFailureMessage() {
            return this.failureMessage;
        }

        /**
         * @return providerAccountId
         */
        public String getProviderAccountId() {
            return this.providerAccountId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return shardId
         */
        public String getShardId() {
            return this.shardId;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer executionAttempt; 
            private String failureCode; 
            private String failureMessage; 
            private String providerAccountId; 
            private String regionId; 
            private String shardId; 
            private String stage; 
            private String status; 

            private Builder() {
            } 

            private Builder(Shards model) {
                this.executionAttempt = model.executionAttempt;
                this.failureCode = model.failureCode;
                this.failureMessage = model.failureMessage;
                this.providerAccountId = model.providerAccountId;
                this.regionId = model.regionId;
                this.shardId = model.shardId;
                this.stage = model.stage;
                this.status = model.status;
            } 

            /**
             * <p>The number of execution attempts for the shard.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executionAttempt(Integer executionAttempt) {
                this.executionAttempt = executionAttempt;
                return this;
            }

            /**
             * <p>The error code for failure classification. For Tencent Cloud throttling errors, the value is TKE_RATE_LIMITED.</p>
             * 
             * <strong>example:</strong>
             * <p>TKE_RATE_LIMITED</p>
             */
            public Builder failureCode(String failureCode) {
                this.failureCode = failureCode;
                return this;
            }

            /**
             * <p>The failure message, which does not contain credentials or raw sensitive responses.</p>
             * 
             * <strong>example:</strong>
             * <p>Tencent rate limited the request</p>
             */
            public Builder failureMessage(String failureMessage) {
                this.failureMessage = failureMessage;
                return this;
            }

            /**
             * <p>The verified account identifier of the cloud provider.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000000**</p>
             */
            public Builder providerAccountId(String providerAccountId) {
                this.providerAccountId = providerAccountId;
                return this;
            }

            /**
             * <p>The region identifier of the cloud provider.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-guangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The opaque identifier of the shard.</p>
             * 
             * <strong>example:</strong>
             * <p>region-0000000000000000000000000000000000000001</p>
             */
            public Builder shardId(String shardId) {
                this.shardId = shardId;
                return this;
            }

            /**
             * <p>The stage of the shard. Valid values:</p>
             * <ul>
             * <li><strong>REGION_DISCOVERY</strong>: Region discovery</li>
             * <li><strong>ASSET_DISCOVERY</strong>: Asset synchronization within the region</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASSET_DISCOVERY</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>The execution status of the shard.</p>
             * 
             * <strong>example:</strong>
             * <p>FAILED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Shards build() {
                return new Shards(this);
            } 

        } 

    }
    /**
     * 
     * {@link RefreshAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>RefreshAssetsResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientToken")
        private String clientToken;

        @com.aliyun.core.annotation.NameInMap("ExecutionAttempt")
        private Long executionAttempt;

        @com.aliyun.core.annotation.NameInMap("ScopeDigest")
        private String scopeDigest;

        @com.aliyun.core.annotation.NameInMap("Shards")
        private java.util.List<Shards> shards;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private Task(Builder builder) {
            this.clientToken = builder.clientToken;
            this.executionAttempt = builder.executionAttempt;
            this.scopeDigest = builder.scopeDigest;
            this.shards = builder.shards;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return clientToken
         */
        public String getClientToken() {
            return this.clientToken;
        }

        /**
         * @return executionAttempt
         */
        public Long getExecutionAttempt() {
            return this.executionAttempt;
        }

        /**
         * @return scopeDigest
         */
        public String getScopeDigest() {
            return this.scopeDigest;
        }

        /**
         * @return shards
         */
        public java.util.List<Shards> getShards() {
            return this.shards;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String clientToken; 
            private Long executionAttempt; 
            private String scopeDigest; 
            private java.util.List<Shards> shards; 
            private String status; 
            private String taskId; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.clientToken = model.clientToken;
                this.executionAttempt = model.executionAttempt;
                this.scopeDigest = model.scopeDigest;
                this.shards = model.shards;
                this.status = model.status;
                this.taskId = model.taskId;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The original idempotency key used for acceptance.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud-k8s-sync-example-001</p>
             */
            public Builder clientToken(String clientToken) {
                this.clientToken = clientToken;
                return this;
            }

            /**
             * <p>The number of execution attempts for the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executionAttempt(Long executionAttempt) {
                this.executionAttempt = executionAttempt;
                return this;
            }

            /**
             * <p>The normalized scope digest generated by the server. Do not parse it as a business identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
             */
            public Builder scopeDigest(String scopeDigest) {
                this.scopeDigest = scopeDigest;
                return this;
            }

            /**
             * <p>The list of execution shards.</p>
             */
            public Builder shards(java.util.List<Shards> shards) {
                this.shards = shards;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>ACCEPTED</strong>: Accepted</li>
             * <li><strong>RUNNING</strong>: Running</li>
             * <li><strong>SUCCEEDED</strong>: Succeeded</li>
             * <li><strong>PARTIAL_FAILED</strong>: Partially failed</li>
             * <li><strong>FAILED</strong>: Failed</li>
             * <li><strong>CANCELLED</strong>: Cancelled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PARTIAL_FAILED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The opaque identifier of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>mkt-00000000-0000-4000-8000-000000000001</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The cloud provider. Valid values:</p>
             * <ul>
             * <li><strong>3</strong>: Tencent Cloud</li>
             * <li><strong>5</strong>: Azure</li>
             * <li><strong>7</strong>: AWS</li>
             * <li><strong>14</strong>: Volcengine</li>
             * <li><strong>16</strong>: GCP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
