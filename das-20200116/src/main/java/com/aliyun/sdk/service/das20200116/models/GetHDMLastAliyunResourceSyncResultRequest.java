// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetHDMLastAliyunResourceSyncResultRequest} extends {@link RequestModel}
 *
 * <p>GetHDMLastAliyunResourceSyncResultRequest</p>
 */
public class GetHDMLastAliyunResourceSyncResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("__context")
    private String context;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessKey")
    private String accessKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("signature")
    private String signature;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("skipAuth")
    private String skipAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timestamp")
    private String timestamp;

    private GetHDMLastAliyunResourceSyncResultRequest(Builder builder) {
        super(builder);
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

    public static GetHDMLastAliyunResourceSyncResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetHDMLastAliyunResourceSyncResultRequest, Builder> {
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

        private Builder(GetHDMLastAliyunResourceSyncResultRequest request) {
            super(request);
            this.uid = request.uid;
            this.userId = request.userId;
            this.context = request.context;
            this.accessKey = request.accessKey;
            this.signature = request.signature;
            this.skipAuth = request.skipAuth;
            this.timestamp = request.timestamp;
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
        public GetHDMLastAliyunResourceSyncResultRequest build() {
            return new GetHDMLastAliyunResourceSyncResultRequest(this);
        } 

    } 

}
