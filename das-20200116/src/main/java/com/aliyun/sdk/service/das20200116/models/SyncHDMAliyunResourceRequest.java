// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncHDMAliyunResourceRequest} extends {@link RequestModel}
 *
 * <p>SyncHDMAliyunResourceRequest</p>
 */
public class SyncHDMAliyunResourceRequest extends Request {
    @Query
    @NameInMap("Async")
    private String async;

    @Query
    @NameInMap("ResourceTypes")
    private String resourceTypes;

    @Query
    @NameInMap("Uid")
    private String uid;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("WaitForModifySecurityIps")
    private String waitForModifySecurityIps;

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

    private SyncHDMAliyunResourceRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.resourceTypes = builder.resourceTypes;
        this.uid = builder.uid;
        this.userId = builder.userId;
        this.waitForModifySecurityIps = builder.waitForModifySecurityIps;
        this.context = builder.context;
        this.accessKey = builder.accessKey;
        this.signature = builder.signature;
        this.skipAuth = builder.skipAuth;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncHDMAliyunResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public String getAsync() {
        return this.async;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
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
     * @return waitForModifySecurityIps
     */
    public String getWaitForModifySecurityIps() {
        return this.waitForModifySecurityIps;
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

    public static final class Builder extends Request.Builder<SyncHDMAliyunResourceRequest, Builder> {
        private String async; 
        private String resourceTypes; 
        private String uid; 
        private String userId; 
        private String waitForModifySecurityIps; 
        private String context; 
        private String accessKey; 
        private String signature; 
        private String skipAuth; 
        private String timestamp; 

        private Builder() {
            super();
        } 

        private Builder(SyncHDMAliyunResourceRequest request) {
            super(request);
            this.async = request.async;
            this.resourceTypes = request.resourceTypes;
            this.uid = request.uid;
            this.userId = request.userId;
            this.waitForModifySecurityIps = request.waitForModifySecurityIps;
            this.context = request.context;
            this.accessKey = request.accessKey;
            this.signature = request.signature;
            this.skipAuth = request.skipAuth;
            this.timestamp = request.timestamp;
        } 

        /**
         * Async.
         */
        public Builder async(String async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * ResourceTypes.
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
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
         * WaitForModifySecurityIps.
         */
        public Builder waitForModifySecurityIps(String waitForModifySecurityIps) {
            this.putQueryParameter("WaitForModifySecurityIps", waitForModifySecurityIps);
            this.waitForModifySecurityIps = waitForModifySecurityIps;
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
        public SyncHDMAliyunResourceRequest build() {
            return new SyncHDMAliyunResourceRequest(this);
        } 

    } 

}
