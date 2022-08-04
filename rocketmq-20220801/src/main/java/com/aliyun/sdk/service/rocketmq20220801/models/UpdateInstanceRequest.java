// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("extConfig")
    private ExtConfig extConfig;

    @Body
    @NameInMap("instanceName")
    private String instanceName;

    @Body
    @NameInMap("networkInfo")
    private NetworkInfo networkInfo;

    @Body
    @NameInMap("remark")
    private String remark;

    @Body
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.extConfig = builder.extConfig;
        this.instanceName = builder.instanceName;
        this.networkInfo = builder.networkInfo;
        this.remark = builder.remark;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
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
     * @return extConfig
     */
    public ExtConfig getExtConfig() {
        return this.extConfig;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return networkInfo
     */
    public NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String instanceId; 
        private ExtConfig extConfig; 
        private String instanceName; 
        private NetworkInfo networkInfo; 
        private String remark; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.extConfig = request.extConfig;
            this.instanceName = request.instanceName;
            this.networkInfo = request.networkInfo;
            this.remark = request.remark;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 扩展配置
         */
        public Builder extConfig(ExtConfig extConfig) {
            this.putBodyParameter("extConfig", extConfig);
            this.extConfig = extConfig;
            return this;
        }

        /**
         * 实例名称
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * 网络信息
         */
        public Builder networkInfo(NetworkInfo networkInfo) {
            this.putBodyParameter("networkInfo", networkInfo);
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * 实例备注
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * 资源组ID
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

    public static class ExtConfig extends TeaModel {
        @NameInMap("autoScaling")
        private Boolean autoScaling;

        @NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        private ExtConfig(Builder builder) {
            this.autoScaling = builder.autoScaling;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.sendReceiveRatio = builder.sendReceiveRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtConfig create() {
            return builder().build();
        }

        /**
         * @return autoScaling
         */
        public Boolean getAutoScaling() {
            return this.autoScaling;
        }

        /**
         * @return messageRetentionTime
         */
        public Integer getMessageRetentionTime() {
            return this.messageRetentionTime;
        }

        /**
         * @return sendReceiveRatio
         */
        public Float getSendReceiveRatio() {
            return this.sendReceiveRatio;
        }

        public static final class Builder {
            private Boolean autoScaling; 
            private Integer messageRetentionTime; 
            private Float sendReceiveRatio; 

            /**
             * 自适应弹性伸缩
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
                return this;
            }

            /**
             * 消息保留时长
             */
            public Builder messageRetentionTime(Integer messageRetentionTime) {
                this.messageRetentionTime = messageRetentionTime;
                return this;
            }

            /**
             * 消息收发比例
             */
            public Builder sendReceiveRatio(Float sendReceiveRatio) {
                this.sendReceiveRatio = sendReceiveRatio;
                return this;
            }

            public ExtConfig build() {
                return new ExtConfig(this);
            } 

        } 

    }
    public static class Endpoints extends TeaModel {
        @NameInMap("endpointType")
        private String endpointType;

        @NameInMap("ipWhitelist")
        private String ipWhitelist;

        private Endpoints(Builder builder) {
            this.endpointType = builder.endpointType;
            this.ipWhitelist = builder.ipWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return ipWhitelist
         */
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        public static final class Builder {
            private String endpointType; 
            private String ipWhitelist; 

            /**
             * 接入点类型
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * IP白名单
             */
            public Builder ipWhitelist(String ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    public static class NetworkInfo extends TeaModel {
        @NameInMap("endpoints")
        private java.util.List < Endpoints> endpoints;

        private NetworkInfo(Builder builder) {
            this.endpoints = builder.endpoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInfo create() {
            return builder().build();
        }

        /**
         * @return endpoints
         */
        public java.util.List < Endpoints> getEndpoints() {
            return this.endpoints;
        }

        public static final class Builder {
            private java.util.List < Endpoints> endpoints; 

            /**
             * 接入点列表
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            public NetworkInfo build() {
                return new NetworkInfo(this);
            } 

        } 

    }
}
