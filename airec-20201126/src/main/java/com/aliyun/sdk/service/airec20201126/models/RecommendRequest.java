// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecommendRequest} extends {@link RequestModel}
 *
 * <p>RecommendRequest</p>
 */
public class RecommendRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("imei")
    private String imei;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("items")
    private String items;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rankOpen")
    private Boolean rankOpen;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("recType")
    private String recType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("returnCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer returnCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("strategy")
    private String strategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userInfo")
    private String userInfo;

    private RecommendRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.filter = builder.filter;
        this.imei = builder.imei;
        this.ip = builder.ip;
        this.items = builder.items;
        this.rankOpen = builder.rankOpen;
        this.recType = builder.recType;
        this.returnCount = builder.returnCount;
        this.sceneId = builder.sceneId;
        this.serviceType = builder.serviceType;
        this.strategy = builder.strategy;
        this.userId = builder.userId;
        this.userInfo = builder.userInfo;
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
     * @return filter
     */
    public String getFilter() {
        return this.filter;
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
     * @return rankOpen
     */
    public Boolean getRankOpen() {
        return this.rankOpen;
    }

    /**
     * @return recType
     */
    public String getRecType() {
        return this.recType;
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
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userInfo
     */
    public String getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<RecommendRequest, Builder> {
        private String instanceId; 
        private String filter; 
        private String imei; 
        private String ip; 
        private String items; 
        private Boolean rankOpen; 
        private String recType; 
        private Integer returnCount; 
        private String sceneId; 
        private String serviceType; 
        private String strategy; 
        private String userId; 
        private String userInfo; 

        private Builder() {
            super();
        } 

        private Builder(RecommendRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.filter = request.filter;
            this.imei = request.imei;
            this.ip = request.ip;
            this.items = request.items;
            this.rankOpen = request.rankOpen;
            this.recType = request.recType;
            this.returnCount = request.returnCount;
            this.sceneId = request.sceneId;
            this.serviceType = request.serviceType;
            this.strategy = request.strategy;
            this.userId = request.userId;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test001</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The status of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJqb2luIjoiYW5kIiwiZmlsdGVycyI6W3siY29uZCI6ImNvbnRhaW4iLCJmaWVsZCI6InRhZ3MiLCJ2YWx1ZSI6IuWPjOS6uiJ9XX0.</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The ID of the scene in which the item is to be recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>06e1565409c9fc4887036b974421****</p>
         */
        public Builder imei(String imei) {
            this.putQueryParameter("imei", imei);
            this.imei = imei;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The information about event tracking. The value of this parameter varies based on different items and needs to be uploaded together with the corresponding behavior data.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder items(String items) {
            this.putQueryParameter("items", items);
            this.items = items;
            return this;
        }

        /**
         * <p>N/A</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder rankOpen(Boolean rankOpen) {
            this.putQueryParameter("rankOpen", rankOpen);
            this.rankOpen = rankOpen;
            return this;
        }

        /**
         * <p>The type of the recommended item.</p>
         * 
         * <strong>example:</strong>
         * <p>gul</p>
         */
        public Builder recType(String recType) {
            this.putQueryParameter("recType", recType);
            this.recType = recType;
            return this;
        }

        /**
         * <p>The returned results.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder returnCount(Integer returnCount) {
            this.putQueryParameter("returnCount", returnCount);
            this.returnCount = returnCount;
            return this;
        }

        /**
         * <p>The number of result entries to return. Valid values: 0 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The position at which the recommended item is displayed. The position number starts from 0. The return results are ranked by position. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("serviceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>如果需要使用坑位策略，请求参数内新增strategy=&quot;fixedSlot&quot;，此时系统将按照坑位配置返回推荐结果</p>
         * 
         * <strong>example:</strong>
         * <p>fixedSlot</p>
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * <p>The items used for related recommendations in specified scenes.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userInfo(String userInfo) {
            this.putQueryParameter("userInfo", userInfo);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public RecommendRequest build() {
            return new RecommendRequest(this);
        } 

    } 

}
