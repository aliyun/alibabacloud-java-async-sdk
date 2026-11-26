// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ResultValue} extends {@link TeaModel}
 *
 * <p>ResultValue</p>
 */
public class ResultValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceOpenId")
    private String deviceOpenId;

    @com.aliyun.core.annotation.NameInMap("DeviceUnionIds")
    private java.util.List<DeviceUnionIds> deviceUnionIds;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("FirmwareVersion")
    private String firmwareVersion;

    @com.aliyun.core.annotation.NameInMap("Mac")
    private String mac;

    @com.aliyun.core.annotation.NameInMap("Sn")
    private String sn;

    private ResultValue(Builder builder) {
        this.deviceOpenId = builder.deviceOpenId;
        this.deviceUnionIds = builder.deviceUnionIds;
        this.name = builder.name;
        this.firmwareVersion = builder.firmwareVersion;
        this.mac = builder.mac;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResultValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceOpenId
     */
    public String getDeviceOpenId() {
        return this.deviceOpenId;
    }

    /**
     * @return deviceUnionIds
     */
    public java.util.List<DeviceUnionIds> getDeviceUnionIds() {
        return this.deviceUnionIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return firmwareVersion
     */
    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    public static final class Builder {
        private String deviceOpenId; 
        private java.util.List<DeviceUnionIds> deviceUnionIds; 
        private String name; 
        private String firmwareVersion; 
        private String mac; 
        private String sn; 

        private Builder() {
        } 

        private Builder(ResultValue model) {
            this.deviceOpenId = model.deviceOpenId;
            this.deviceUnionIds = model.deviceUnionIds;
            this.name = model.name;
            this.firmwareVersion = model.firmwareVersion;
            this.mac = model.mac;
            this.sn = model.sn;
        } 

        /**
         * <p>The openId corresponding to the device.</p>
         * 
         * <strong>example:</strong>
         * <p>A963*0158</p>
         */
        public Builder deviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }

        /**
         * <p>The organization ID and UnionId information corresponding to the device.</p>
         */
        public Builder deviceUnionIds(java.util.List<DeviceUnionIds> deviceUnionIds) {
            this.deviceUnionIds = deviceUnionIds;
            return this;
        }

        /**
         * <p>The name of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>我的设备</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The firmware version of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.3</p>
         */
        public Builder firmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }

        /**
         * <p>The MAC address of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>b4:xx:xx:xx:65:2b</p>
         */
        public Builder mac(String mac) {
            this.mac = mac;
            return this;
        }

        /**
         * <p>The SN information of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>1200xx048</p>
         */
        public Builder sn(String sn) {
            this.sn = sn;
            return this;
        }

        public ResultValue build() {
            return new ResultValue(this);
        } 

    } 

    /**
     * 
     * {@link ResultValue} extends {@link TeaModel}
     *
     * <p>ResultValue</p>
     */
    public static class DeviceUnionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("DeviceUnionId")
        private String deviceUnionId;

        private DeviceUnionIds(Builder builder) {
            this.organizationId = builder.organizationId;
            this.deviceUnionId = builder.deviceUnionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceUnionIds create() {
            return builder().build();
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return deviceUnionId
         */
        public String getDeviceUnionId() {
            return this.deviceUnionId;
        }

        public static final class Builder {
            private String organizationId; 
            private String deviceUnionId; 

            private Builder() {
            } 

            private Builder(DeviceUnionIds model) {
                this.organizationId = model.organizationId;
                this.deviceUnionId = model.deviceUnionId;
            } 

            /**
             * <p>The organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1**2</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * <p>The UnionId of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>1553*B0C3</p>
             */
            public Builder deviceUnionId(String deviceUnionId) {
                this.deviceUnionId = deviceUnionId;
                return this;
            }

            public DeviceUnionIds build() {
                return new DeviceUnionIds(this);
            } 

        } 

    }
}
