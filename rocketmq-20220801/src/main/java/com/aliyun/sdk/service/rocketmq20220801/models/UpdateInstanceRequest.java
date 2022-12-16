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
    @NameInMap("instanceName")
    private String instanceName;

    @Body
    @NameInMap("networkInfo")
    private NetworkInfo networkInfo;

    @Body
    @NameInMap("productInfo")
    private ProductInfo productInfo;

    @Body
    @NameInMap("remark")
    private String remark;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.networkInfo = builder.networkInfo;
        this.productInfo = builder.productInfo;
        this.remark = builder.remark;
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
     * @return productInfo
     */
    public ProductInfo getProductInfo() {
        return this.productInfo;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String instanceId; 
        private String instanceName; 
        private NetworkInfo networkInfo; 
        private ProductInfo productInfo; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.networkInfo = request.networkInfo;
            this.productInfo = request.productInfo;
            this.remark = request.remark;
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
         * 扩展配置
         */
        public Builder productInfo(ProductInfo productInfo) {
            this.putBodyParameter("productInfo", productInfo);
            this.productInfo = productInfo;
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

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

    public static class InternetInfo extends TeaModel {
        @NameInMap("ipWhitelist")
        private java.util.List < String > ipWhitelist;

        private InternetInfo(Builder builder) {
            this.ipWhitelist = builder.ipWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternetInfo create() {
            return builder().build();
        }

        /**
         * @return ipWhitelist
         */
        public java.util.List < String > getIpWhitelist() {
            return this.ipWhitelist;
        }

        public static final class Builder {
            private java.util.List < String > ipWhitelist; 

            /**
             * 公网IP白名单列表
             */
            public Builder ipWhitelist(java.util.List < String > ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            public InternetInfo build() {
                return new InternetInfo(this);
            } 

        } 

    }
    public static class NetworkInfo extends TeaModel {
        @NameInMap("internetInfo")
        private InternetInfo internetInfo;

        private NetworkInfo(Builder builder) {
            this.internetInfo = builder.internetInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInfo create() {
            return builder().build();
        }

        /**
         * @return internetInfo
         */
        public InternetInfo getInternetInfo() {
            return this.internetInfo;
        }

        public static final class Builder {
            private InternetInfo internetInfo; 

            /**
             * 公网信息
             */
            public Builder internetInfo(InternetInfo internetInfo) {
                this.internetInfo = internetInfo;
                return this;
            }

            public NetworkInfo build() {
                return new NetworkInfo(this);
            } 

        } 

    }
    public static class ProductInfo extends TeaModel {
        @NameInMap("autoScaling")
        private Boolean autoScaling;

        @NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        private ProductInfo(Builder builder) {
            this.autoScaling = builder.autoScaling;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.sendReceiveRatio = builder.sendReceiveRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
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

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
}
