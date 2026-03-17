// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSAGDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSAGDeviceInfoResponseBody</p>
 */
public class DescribeSAGDeviceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ControllerState")
    private String controllerState;

    @com.aliyun.core.annotation.NameInMap("LastConnectedControllerTime")
    private String lastConnectedControllerTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResettableStatus")
    private String resettableStatus;

    @com.aliyun.core.annotation.NameInMap("ServiceIP")
    private String serviceIP;

    @com.aliyun.core.annotation.NameInMap("SmartAGType")
    private String smartAGType;

    @com.aliyun.core.annotation.NameInMap("StartupTime")
    private String startupTime;

    @com.aliyun.core.annotation.NameInMap("SynStatus")
    private String synStatus;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("VpnState")
    private String vpnState;

    private DescribeSAGDeviceInfoResponseBody(Builder builder) {
        this.controllerState = builder.controllerState;
        this.lastConnectedControllerTime = builder.lastConnectedControllerTime;
        this.requestId = builder.requestId;
        this.resettableStatus = builder.resettableStatus;
        this.serviceIP = builder.serviceIP;
        this.smartAGType = builder.smartAGType;
        this.startupTime = builder.startupTime;
        this.synStatus = builder.synStatus;
        this.version = builder.version;
        this.vpnState = builder.vpnState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSAGDeviceInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return controllerState
     */
    public String getControllerState() {
        return this.controllerState;
    }

    /**
     * @return lastConnectedControllerTime
     */
    public String getLastConnectedControllerTime() {
        return this.lastConnectedControllerTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resettableStatus
     */
    public String getResettableStatus() {
        return this.resettableStatus;
    }

    /**
     * @return serviceIP
     */
    public String getServiceIP() {
        return this.serviceIP;
    }

    /**
     * @return smartAGType
     */
    public String getSmartAGType() {
        return this.smartAGType;
    }

    /**
     * @return startupTime
     */
    public String getStartupTime() {
        return this.startupTime;
    }

    /**
     * @return synStatus
     */
    public String getSynStatus() {
        return this.synStatus;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return vpnState
     */
    public String getVpnState() {
        return this.vpnState;
    }

    public static final class Builder {
        private String controllerState; 
        private String lastConnectedControllerTime; 
        private String requestId; 
        private String resettableStatus; 
        private String serviceIP; 
        private String smartAGType; 
        private String startupTime; 
        private String synStatus; 
        private String version; 
        private String vpnState; 

        private Builder() {
        } 

        private Builder(DescribeSAGDeviceInfoResponseBody model) {
            this.controllerState = model.controllerState;
            this.lastConnectedControllerTime = model.lastConnectedControllerTime;
            this.requestId = model.requestId;
            this.resettableStatus = model.resettableStatus;
            this.serviceIP = model.serviceIP;
            this.smartAGType = model.smartAGType;
            this.startupTime = model.startupTime;
            this.synStatus = model.synStatus;
            this.version = model.version;
            this.vpnState = model.vpnState;
        } 

        /**
         * <p>The control status of the SAG device. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal</li>
         * <li><strong>Abnormal</strong>: abnormal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder controllerState(String controllerState) {
            this.controllerState = controllerState;
            return this;
        }

        /**
         * <p>The last time when the SAG device was connected to Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-14 00:27:48</p>
         */
        public Builder lastConnectedControllerTime(String lastConnectedControllerTime) {
            this.lastConnectedControllerTime = lastConnectedControllerTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B6A991F4-F533-1627-8144-B64E01C5EE85</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the reset button of the SAG device is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled</li>
         * <li><strong>Disabled</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder resettableStatus(String resettableStatus) {
            this.resettableStatus = resettableStatus;
            return this;
        }

        /**
         * <p>The IP address of the SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>42.XX.XX.151</p>
         */
        public Builder serviceIP(String serviceIP) {
            this.serviceIP = serviceIP;
            return this;
        }

        /**
         * <p>The model of the SAG device. Valid values:</p>
         * <ul>
         * <li><strong>sag-100wm</strong></li>
         * <li><strong>sag-1000</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sag-100wm</p>
         */
        public Builder smartAGType(String smartAGType) {
            this.smartAGType = smartAGType;
            return this;
        }

        /**
         * <p>The time when the SAG device was started.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-15 17:33:43</p>
         */
        public Builder startupTime(String startupTime) {
            this.startupTime = startupTime;
            return this;
        }

        /**
         * <p>Indicates whether the settings of the SAG device are synchronized to Alibaba Cloud. Valid values:</p>
         * <ul>
         * <li><strong>Synchronized</strong>: synchronized</li>
         * <li><strong>Unsynchronized</strong>: unsynchronized</li>
         * <li><strong>Synchronizing</strong>: being synchronized</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unsynchronized</p>
         */
        public Builder synStatus(String synStatus) {
            this.synStatus = synStatus;
            return this;
        }

        /**
         * <p>The version of the SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>2.3.1.1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The VPN connection status of the SAG device. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal</li>
         * <li><strong>Abnormal</strong>: abnormal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Abnormal</p>
         */
        public Builder vpnState(String vpnState) {
            this.vpnState = vpnState;
            return this;
        }

        public DescribeSAGDeviceInfoResponseBody build() {
            return new DescribeSAGDeviceInfoResponseBody(this);
        } 

    } 

}
