// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceDistributeJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceDistributeJobRequest</p>
 */
public class CreateDeviceDistributeJobRequest extends Request {
    @Body
    @NameInMap("DeviceName")
    @Validation(required = true)
    private java.util.List < String > deviceName;

    @Body
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Body
    @NameInMap("SourceInstanceId")
    @Validation(required = true)
    private String sourceInstanceId;

    @Body
    @NameInMap("Strategy")
    @Validation(required = true)
    private Integer strategy;

    @Body
    @NameInMap("TargetAliyunId")
    private String targetAliyunId;

    @Body
    @NameInMap("TargetInstanceConfig")
    @Validation(required = true)
    private java.util.List < TargetInstanceConfig> targetInstanceConfig;

    @Body
    @NameInMap("TargetUid")
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
    public java.util.List < String > getDeviceName() {
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
    public java.util.List < TargetInstanceConfig> getTargetInstanceConfig() {
        return this.targetInstanceConfig;
    }

    /**
     * @return targetUid
     */
    public String getTargetUid() {
        return this.targetUid;
    }

    public static final class Builder extends Request.Builder<CreateDeviceDistributeJobRequest, Builder> {
        private java.util.List < String > deviceName; 
        private String productKey; 
        private String sourceInstanceId; 
        private Integer strategy; 
        private String targetAliyunId; 
        private java.util.List < TargetInstanceConfig> targetInstanceConfig; 
        private String targetUid; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceDistributeJobRequest response) {
            super(response);
            this.deviceName = response.deviceName;
            this.productKey = response.productKey;
            this.sourceInstanceId = response.sourceInstanceId;
            this.strategy = response.strategy;
            this.targetAliyunId = response.targetAliyunId;
            this.targetInstanceConfig = response.targetInstanceConfig;
            this.targetUid = response.targetUid;
        } 

        /**
         * DeviceName.
         */
        public Builder deviceName(java.util.List < String > deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * SourceInstanceId.
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putBodyParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * Strategy.
         */
        public Builder strategy(Integer strategy) {
            this.putBodyParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * TargetAliyunId.
         */
        public Builder targetAliyunId(String targetAliyunId) {
            this.putBodyParameter("TargetAliyunId", targetAliyunId);
            this.targetAliyunId = targetAliyunId;
            return this;
        }

        /**
         * TargetInstanceConfig.
         */
        public Builder targetInstanceConfig(java.util.List < TargetInstanceConfig> targetInstanceConfig) {
            this.putBodyParameter("TargetInstanceConfig", targetInstanceConfig);
            this.targetInstanceConfig = targetInstanceConfig;
            return this;
        }

        /**
         * TargetUid.
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

    public static class TargetInstanceConfig extends TeaModel {
        @NameInMap("TargetInstanceId")
        @Validation(required = true)
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

            /**
             * TargetInstanceId.
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
