// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link CreateTairKVCacheVNodeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTairKVCacheVNodeResponseBody</p>
 */
public class CreateTairKVCacheVNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VClusterId")
    private String vClusterId;

    @com.aliyun.core.annotation.NameInMap("VkName")
    private String vkName;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateTairKVCacheVNodeResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.orderId = builder.orderId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.vClusterId = builder.vClusterId;
        this.vkName = builder.vkName;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTairKVCacheVNodeResponseBody create() {
        return builder().build();
    }

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
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vClusterId
     */
    public String getVClusterId() {
        return this.vClusterId;
    }

    /**
     * @return vkName
     */
    public String getVkName() {
        return this.vkName;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String instanceId; 
        private String nodeId; 
        private Long orderId; 
        private String regionId; 
        private String requestId; 
        private String vClusterId; 
        private String vkName; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(CreateTairKVCacheVNodeResponseBody model) {
            this.instanceId = model.instanceId;
            this.nodeId = model.nodeId;
            this.orderId = model.orderId;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.vClusterId = model.vClusterId;
            this.vkName = model.vkName;
            this.zoneId = model.zoneId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VClusterId.
         */
        public Builder vClusterId(String vClusterId) {
            this.vClusterId = vClusterId;
            return this;
        }

        /**
         * VkName.
         */
        public Builder vkName(String vkName) {
            this.vkName = vkName;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public CreateTairKVCacheVNodeResponseBody build() {
            return new CreateTairKVCacheVNodeResponseBody(this);
        } 

    } 

}
