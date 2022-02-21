// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecommendRequest} extends {@link RequestModel}
 *
 * <p>RecommendRequest</p>
 */
public class RecommendRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Imei")
    private String imei;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("Items")
    private String items;

    @Header
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ReturnCount")
    @Validation(required = true)
    private Integer returnCount;

    @Query
    @NameInMap("SceneId")
    private String sceneId;

    @Query
    @NameInMap("UserId")
    private String userId;

    private RecommendRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.imei = builder.imei;
        this.ip = builder.ip;
        this.items = builder.items;
        this.regionId = builder.regionId;
        this.returnCount = builder.returnCount;
        this.sceneId = builder.sceneId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecommendRequest create() {
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
     * @return imei
     */
    public String getImei() {
        return this.imei;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return items
     */
    public String getItems() {
        return this.items;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return returnCount
     */
    public Integer getReturnCount() {
        return this.returnCount;
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

    public static final class Builder extends Request.Builder<RecommendRequest, Builder> {
        private String instanceId; 
        private String imei; 
        private String ip; 
        private String items; 
        private String regionId; 
        private Integer returnCount; 
        private String sceneId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RecommendRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.imei = response.imei;
            this.ip = response.ip;
            this.items = response.items;
            this.regionId = response.regionId;
            this.returnCount = response.returnCount;
            this.sceneId = response.sceneId;
            this.userId = response.userId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Imei.
         */
        public Builder imei(String imei) {
            this.putQueryParameter("Imei", imei);
            this.imei = imei;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(String items) {
            this.putQueryParameter("Items", items);
            this.items = items;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHeaderParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReturnCount.
         */
        public Builder returnCount(Integer returnCount) {
            this.putQueryParameter("ReturnCount", returnCount);
            this.returnCount = returnCount;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
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

        @Override
        public RecommendRequest build() {
            return new RecommendRequest(this);
        } 

    } 

}
