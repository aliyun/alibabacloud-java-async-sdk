// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoResourceOptimizeConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAutoResourceOptimizeConfigRequest</p>
 */
public class GetAutoResourceOptimizeConfigRequest extends Request {
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
    @NameInMap("Uid")
    private String uid;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("__context")
    private String context;

    private GetAutoResourceOptimizeConfigRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.instanceId = builder.instanceId;
        this.signature = builder.signature;
        this.uid = builder.uid;
        this.userId = builder.userId;
        this.context = builder.context;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoResourceOptimizeConfigRequest create() {
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

    public static final class Builder extends Request.Builder<GetAutoResourceOptimizeConfigRequest, Builder> {
        private String accessKey; 
        private String instanceId; 
        private String signature; 
        private String uid; 
        private String userId; 
        private String context; 

        private Builder() {
            super();
        } 

        private Builder(GetAutoResourceOptimizeConfigRequest response) {
            super(response);
            this.accessKey = response.accessKey;
            this.instanceId = response.instanceId;
            this.signature = response.signature;
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
        public GetAutoResourceOptimizeConfigRequest build() {
            return new GetAutoResourceOptimizeConfigRequest(this);
        } 

    } 

}
