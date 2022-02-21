// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopOrRollbackOptimizeTaskRequest} extends {@link RequestModel}
 *
 * <p>StopOrRollbackOptimizeTaskRequest</p>
 */
public class StopOrRollbackOptimizeTaskRequest extends Request {
    @Query
    @NameInMap("AccessKey")
    private String accessKey;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Signature")
    private String signature;

    @Query
    @NameInMap("StopOrRollback")
    private String stopOrRollback;

    @Query
    @NameInMap("TaskType")
    private String taskType;

    @Query
    @NameInMap("TaskUuid")
    private String taskUuid;

    @Query
    @NameInMap("Uid")
    private String uid;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("__context")
    private String context;

    private StopOrRollbackOptimizeTaskRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.instanceId = builder.instanceId;
        this.signature = builder.signature;
        this.stopOrRollback = builder.stopOrRollback;
        this.taskType = builder.taskType;
        this.taskUuid = builder.taskUuid;
        this.uid = builder.uid;
        this.userId = builder.userId;
        this.context = builder.context;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopOrRollbackOptimizeTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return stopOrRollback
     */
    public String getStopOrRollback() {
        return this.stopOrRollback;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return taskUuid
     */
    public String getTaskUuid() {
        return this.taskUuid;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    public static final class Builder extends Request.Builder<StopOrRollbackOptimizeTaskRequest, Builder> {
        private String accessKey; 
        private String instanceId; 
        private String signature; 
        private String stopOrRollback; 
        private String taskType; 
        private String taskUuid; 
        private String uid; 
        private String userId; 
        private String context; 

        private Builder() {
            super();
        } 

        private Builder(StopOrRollbackOptimizeTaskRequest response) {
            super(response);
            this.accessKey = response.accessKey;
            this.instanceId = response.instanceId;
            this.signature = response.signature;
            this.stopOrRollback = response.stopOrRollback;
            this.taskType = response.taskType;
            this.taskUuid = response.taskUuid;
            this.uid = response.uid;
            this.userId = response.userId;
            this.context = response.context;
        } 

        /**
         * AccessKey.
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Signature.
         */
        public Builder signature(String signature) {
            this.putQueryParameter("Signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * StopOrRollback.
         */
        public Builder stopOrRollback(String stopOrRollback) {
            this.putQueryParameter("StopOrRollback", stopOrRollback);
            this.stopOrRollback = stopOrRollback;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * TaskUuid.
         */
        public Builder taskUuid(String taskUuid) {
            this.putQueryParameter("TaskUuid", taskUuid);
            this.taskUuid = taskUuid;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * __context.
         */
        public Builder context(String context) {
            this.putQueryParameter("__context", context);
            this.context = context;
            return this;
        }

        @Override
        public StopOrRollbackOptimizeTaskRequest build() {
            return new StopOrRollbackOptimizeTaskRequest(this);
        } 

    } 

}
