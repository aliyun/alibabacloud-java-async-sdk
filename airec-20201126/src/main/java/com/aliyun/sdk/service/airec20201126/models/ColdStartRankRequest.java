// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ColdStartRankRequest} extends {@link RequestModel}
 *
 * <p>ColdStartRankRequest</p>
 */
public class ColdStartRankRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("features")
    private String features;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("imei")
    private String imei;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("items")
    private String items;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private ColdStartRankRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.features = builder.features;
        this.imei = builder.imei;
        this.items = builder.items;
        this.sceneId = builder.sceneId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColdStartRankRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return features
     */
    public String getFeatures() {
        return this.features;
    }

    /**
     * @return imei
     */
    public String getImei() {
        return this.imei;
    }

    /**
     * @return items
     */
    public String getItems() {
        return this.items;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ColdStartRankRequest, Builder> {
        private String instanceId; 
        private String features; 
        private String imei; 
        private String items; 
        private String sceneId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ColdStartRankRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.features = request.features;
            this.imei = request.imei;
            this.items = request.items;
            this.sceneId = request.sceneId;
            this.userId = request.userId;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * features.
         */
        public Builder features(String features) {
            this.putQueryParameter("features", features);
            this.features = features;
            return this;
        }

        /**
         * imei.
         */
        public Builder imei(String imei) {
            this.putQueryParameter("imei", imei);
            this.imei = imei;
            return this;
        }

        /**
         * items.
         */
        public Builder items(String items) {
            this.putQueryParameter("items", items);
            this.items = items;
            return this;
        }

        /**
         * sceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ColdStartRankRequest build() {
            return new ColdStartRankRequest(this);
        } 

    } 

}
