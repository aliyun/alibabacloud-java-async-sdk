// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateDeviceDistributeJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceDistributeJobRequest</p>
 */
public class CreateDeviceDistributeJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Strategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer strategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetAliyunId")
    private String targetAliyunId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetInstanceConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TargetInstanceConfig> targetInstanceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetUid")
    private String targetUid;

    private CreateDeviceDistributeJobRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.productKey = builder.productKey;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.strategy = builder.strategy;
        this.targetAliyunId = builder.targetAliyunId;
        this.targetInstanceConfig = builder.targetInstanceConfig;
        this.targetUid = builder.targetUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceDistributeJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return strategy
     */
    public Integer getStrategy() {
        return this.strategy;
    }

    /**
     * @return targetAliyunId
     */
    public String getTargetAliyunId() {
        return this.targetAliyunId;
    }

    /**
     * @return targetInstanceConfig
     */
    public java.util.List<TargetInstanceConfig> getTargetInstanceConfig() {
        return this.targetInstanceConfig;
    }

    /**
     * @return targetUid
     */
    public String getTargetUid() {
        return this.targetUid;
    }

    public static final class Builder extends Request.Builder<CreateDeviceDistributeJobRequest, Builder> {
        private java.util.List<String> deviceName; 
        private String productKey; 
        private String sourceInstanceId; 
        private Integer strategy; 
        private String targetAliyunId; 
        private java.util.List<TargetInstanceConfig> targetInstanceConfig; 
        private String targetUid; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceDistributeJobRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.productKey = request.productKey;
            this.sourceInstanceId = request.sourceInstanceId;
            this.strategy = request.strategy;
            this.targetAliyunId = request.targetAliyunId;
            this.targetInstanceConfig = request.targetInstanceConfig;
            this.targetUid = request.targetUid;
        } 

        /**
         * <p>The names of the devices to be distributed. You can specify a maximum of 10,000 device names.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RepeatList</p>
         */
        public Builder deviceName(java.util.List<String> deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The ID of the source instance to which the device belongs.</p>
         * <ul>
         * <li><p>The IDs of public instances in different regions:</p>
         * <ul>
         * <li>China (Shanghai): iotx-oxssharez200.</li>
         * <li>Japan (Tokyo): iotx-oxssharez300.</li>
         * <li>Singapore (Singapore): iotx-oxssharez400.</li>
         * <li>US (Silicon Valley): iotx-oxssharez500.</li>
         * <li>US (Virginia): iotx-oxssharez600.</li>
         * <li>Germany (Frankfurt): iotx-oxssharez700.</li>
         * </ul>
         * </li>
         * <li><p>The IDs of Enterprise Edition instances:</p>
         * <p>1. Log on to the IoT Platform console. Select a region from the drop-down list in the upper-left corner of the top navigation bar.</p>
         * <p>2. On the <strong>Overview</strong> page, click the instance name. On the <strong>Instance Details</strong> page, view the instance ID in the <strong>Basic Information</strong> section.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-060***</p>
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putBodyParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * <p>The distribution policy. Default value: 0.</p>
         * <ul>
         * <li><strong>0</strong>: distributes devices to instances in a specified region.</li>
         * <li><strong>1</strong>: configures instance IDs in multiple regions and distributes devices to the nearest regions based on the IP addresses of the devices.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder strategy(Integer strategy) {
            this.putBodyParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account to which the device belongs. You can log on to the IoT Platform console, click the profile picture, and then view the account ID on the <strong>Security Settings</strong> page.</p>
         * <p>The <strong>TargetUid</strong> and <strong>TargetAliyunId</strong> parameters cannot be left empty at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>io****@example.com</p>
         */
        public Builder targetAliyunId(String targetAliyunId) {
            this.putBodyParameter("TargetAliyunId", targetAliyunId);
            this.targetAliyunId = targetAliyunId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder targetInstanceConfig(java.util.List<TargetInstanceConfig> targetInstanceConfig) {
            this.putBodyParameter("TargetInstanceConfig", targetInstanceConfig);
            this.targetInstanceConfig = targetInstanceConfig;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the device belongs. You can log on to the IoT Platform console, click the profile picture, and then view the account ID on the <strong>Security Settings</strong> page.</p>
         * <p>The <strong>TargetUid</strong> and <strong>TargetAliyunId</strong> parameters cannot be left empty at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>198***</p>
         */
        public Builder targetUid(String targetUid) {
            this.putBodyParameter("TargetUid", targetUid);
            this.targetUid = targetUid;
            return this;
        }

        @Override
        public CreateDeviceDistributeJobRequest build() {
            return new CreateDeviceDistributeJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDeviceDistributeJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDeviceDistributeJobRequest</p>
     */
    public static class TargetInstanceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetInstanceId;

        private TargetInstanceConfig(Builder builder) {
            this.targetInstanceId = builder.targetInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetInstanceConfig create() {
            return builder().build();
        }

        /**
         * @return targetInstanceId
         */
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public static final class Builder {
            private String targetInstanceId; 

            private Builder() {
            } 

            private Builder(TargetInstanceConfig model) {
                this.targetInstanceId = model.targetInstanceId;
            } 

            /**
             * <p>The configurations of the destination instance to which the device is distributed. For more information about instance IDs, see the description of the <strong>SourceInstanceId</strong> parameter.</p>
             * <ul>
             * <li>If the value of the <strong>Strategy</strong> parameter is <strong>1</strong>, you can specify multiple instance IDs.</li>
             * <li>If the value of the <strong>Strategy</strong> parameter is <strong>0</strong>, you can specify only one instance ID.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>iot-cn-6ja***</p>
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            public TargetInstanceConfig build() {
                return new TargetInstanceConfig(this);
            } 

        } 

    }
}
