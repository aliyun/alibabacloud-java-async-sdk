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
 * {@link AddDeviceToSharePromotionRequest} extends {@link RequestModel}
 *
 * <p>AddDeviceToSharePromotionRequest</p>
 */
public class AddDeviceToSharePromotionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceSimpleInfoList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DeviceSimpleInfoList> deviceSimpleInfoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SharePromotionActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sharePromotionActivityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareTaskCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareTaskCode;

    private AddDeviceToSharePromotionRequest(Builder builder) {
        super(builder);
        this.deviceSimpleInfoList = builder.deviceSimpleInfoList;
        this.iotInstanceId = builder.iotInstanceId;
        this.sharePromotionActivityId = builder.sharePromotionActivityId;
        this.shareTaskCode = builder.shareTaskCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDeviceToSharePromotionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceSimpleInfoList
     */
    public java.util.List<DeviceSimpleInfoList> getDeviceSimpleInfoList() {
        return this.deviceSimpleInfoList;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return sharePromotionActivityId
     */
    public String getSharePromotionActivityId() {
        return this.sharePromotionActivityId;
    }

    /**
     * @return shareTaskCode
     */
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    public static final class Builder extends Request.Builder<AddDeviceToSharePromotionRequest, Builder> {
        private java.util.List<DeviceSimpleInfoList> deviceSimpleInfoList; 
        private String iotInstanceId; 
        private String sharePromotionActivityId; 
        private String shareTaskCode; 

        private Builder() {
            super();
        } 

        private Builder(AddDeviceToSharePromotionRequest request) {
            super(request);
            this.deviceSimpleInfoList = request.deviceSimpleInfoList;
            this.iotInstanceId = request.iotInstanceId;
            this.sharePromotionActivityId = request.sharePromotionActivityId;
            this.shareTaskCode = request.shareTaskCode;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deviceSimpleInfoList(java.util.List<DeviceSimpleInfoList> deviceSimpleInfoList) {
            this.putBodyParameter("DeviceSimpleInfoList", deviceSimpleInfoList);
            this.deviceSimpleInfoList = deviceSimpleInfoList;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61******_****<em>4901</em><strong><strong>_47</strong></strong>*******</p>
         */
        public Builder sharePromotionActivityId(String sharePromotionActivityId) {
            this.putBodyParameter("SharePromotionActivityId", sharePromotionActivityId);
            this.sharePromotionActivityId = sharePromotionActivityId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>52******_7<strong>e_4</strong>3_9<strong>e_61</strong>********</p>
         */
        public Builder shareTaskCode(String shareTaskCode) {
            this.putBodyParameter("ShareTaskCode", shareTaskCode);
            this.shareTaskCode = shareTaskCode;
            return this;
        }

        @Override
        public AddDeviceToSharePromotionRequest build() {
            return new AddDeviceToSharePromotionRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDeviceToSharePromotionRequest} extends {@link TeaModel}
     *
     * <p>AddDeviceToSharePromotionRequest</p>
     */
    public static class DeviceSimpleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String productKey;

        private DeviceSimpleInfoList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceSimpleInfoList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String deviceName; 
            private String productKey; 

            private Builder() {
            } 

            private Builder(DeviceSimpleInfoList model) {
                this.deviceName = model.deviceName;
                this.productKey = model.productKey;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>device01</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>a2YwD2****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public DeviceSimpleInfoList build() {
                return new DeviceSimpleInfoList(this);
            } 

        } 

    }
}
