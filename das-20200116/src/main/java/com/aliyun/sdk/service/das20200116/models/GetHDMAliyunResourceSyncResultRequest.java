// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHDMAliyunResourceSyncResultRequest} extends {@link RequestModel}
 *
 * <p>GetHDMAliyunResourceSyncResultRequest</p>
 */
public class GetHDMAliyunResourceSyncResultRequest extends Request {
    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("Uid")
    private String uid;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("__context")
    private String context;

    @Query
    @NameInMap("accessKey")
    private String accessKey;

    @Query
    @NameInMap("signature")
    private String signature;

    @Query
    @NameInMap("skipAuth")
    private String skipAuth;

    @Query
    @NameInMap("timestamp")
    private String timestamp;

    private GetHDMAliyunResourceSyncResultRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.uid = builder.uid;
        this.userId = builder.userId;
        this.context = builder.context;
        this.accessKey = builder.accessKey;
        this.signature = builder.signature;
        this.skipAuth = builder.skipAuth;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHDMAliyunResourceSyncResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
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

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return skipAuth
     */
    public String getSkipAuth() {
        return this.skipAuth;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder extends Request.Builder<GetHDMAliyunResourceSyncResultRequest, Builder> {
        private String taskId; 
        private String uid; 
        private String userId; 
        private String context; 
        private String accessKey; 
        private String signature; 
        private String skipAuth; 
        private String timestamp; 

        private Builder() {
            super();
        } 

        private Builder(GetHDMAliyunResourceSyncResultRequest response) {
            super(response);
            this.taskId = response.taskId;
            this.uid = response.uid;
            this.userId = response.userId;
            this.context = response.context;
            this.accessKey = response.accessKey;
            this.signature = response.signature;
            this.skipAuth = response.skipAuth;
            this.timestamp = response.timestamp;
        } 

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
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

        /**
         * accessKey.
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("accessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * signature.
         */
        public Builder signature(String signature) {
            this.putQueryParameter("signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * skipAuth.
         */
        public Builder skipAuth(String skipAuth) {
            this.putQueryParameter("skipAuth", skipAuth);
            this.skipAuth = skipAuth;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.putQueryParameter("timestamp", timestamp);
            this.timestamp = timestamp;
            return this;
        }

        @Override
        public GetHDMAliyunResourceSyncResultRequest build() {
            return new GetHDMAliyunResourceSyncResultRequest(this);
        } 

    } 

}
