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
         * The ID of the instance whose basic information and specifications you want to update.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The new name of the instance.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The new network information about the instance.
         */
        public Builder networkInfo(NetworkInfo networkInfo) {
            this.putBodyParameter("networkInfo", networkInfo);
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * The extended configurations of the instance.
         */
        public Builder productInfo(ProductInfo productInfo) {
            this.putBodyParameter("productInfo", productInfo);
            this.productInfo = productInfo;
            return this;
        }

        /**
         * The new remarks on the instance.
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
             * The IP address whitelist that allows access to the instance over the Internet.
             * <p>
             * 
             * *   If you do not configure an IP address whitelist, all IP addresses are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.
             * *   If you configure an IP address whitelist, only IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.
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
             * The Internet information about the instance. This parameter takes effect only when the Internet access feature is enabled for the instance.
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

        @NameInMap("traceOn")
        private Boolean traceOn;

        private ProductInfo(Builder builder) {
            this.autoScaling = builder.autoScaling;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.sendReceiveRatio = builder.sendReceiveRatio;
            this.traceOn = builder.traceOn;
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

        /**
         * @return traceOn
         */
        public Boolean getTraceOn() {
            return this.traceOn;
        }

        public static final class Builder {
            private Boolean autoScaling; 
            private Integer messageRetentionTime; 
            private Float sendReceiveRatio; 
            private Boolean traceOn; 

            /**
             * Specifies whether to enable burst scaling for the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * *   false
             * 
             * After you enable burst scaling, the system allows the actual messaging transactions per second (TPS) of the ApsaraMQ for RocketMQ instance to exceed the upper limit of the basic computing specification. You are charged for the extra TPS. For more information, see [Computing fee](~~427237~~).
             * 
             * > Only specific types of instances support burst scaling. For more information, see [Instance specifications](~~444715~~).
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
                return this;
            }

            /**
             * The retention period of messages. Unit: hours.
             * <p>
             * 
             * For more information about the valid values, see the "Limits on resource quotas" section of the [Usage limits](~~440347~~) topic.
             * 
             * The storage of ApsaraMQ for RocketMQ messages is in serverless scaling mode. You are charged based on the actual used storage. You can adjust the storage retention period to reduce storage usage and costs. For more information, see [Storage fees](~~427238~~).
             */
            public Builder messageRetentionTime(Integer messageRetentionTime) {
                this.messageRetentionTime = messageRetentionTime;
                return this;
            }

            /**
             * The ratio of the number of messages that you can send to the number of messages that you can receive in the instance.
             * <p>
             * 
             * Value values: 0.25 to 1.
             */
            public Builder sendReceiveRatio(Float sendReceiveRatio) {
                this.sendReceiveRatio = sendReceiveRatio;
                return this;
            }

            /**
             * traceOn.
             */
            public Builder traceOn(Boolean traceOn) {
                this.traceOn = traceOn;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
}
