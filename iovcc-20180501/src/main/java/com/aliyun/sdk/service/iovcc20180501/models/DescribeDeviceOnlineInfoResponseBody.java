// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceOnlineInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceOnlineInfoResponseBody</p>
 */
public class DescribeDeviceOnlineInfoResponseBody extends TeaModel {
    @NameInMap("Devices")
    private java.util.List < Devices> devices;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDeviceOnlineInfoResponseBody(Builder builder) {
        this.devices = builder.devices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceOnlineInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Devices> devices; 
        private String requestId; 

        /**
         * Devices.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDeviceOnlineInfoResponseBody build() {
            return new DescribeDeviceOnlineInfoResponseBody(this);
        } 

    } 

    public static class Devices extends TeaModel {
        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("IasId")
        private String iasId;

        @NameInMap("LoginTime")
        private Long loginTime;

        @NameInMap("Online")
        private Integer online;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("SystemVersion")
        private String systemVersion;

        @NameInMap("Terminal")
        private String terminal;

        private Devices(Builder builder) {
            this.clientVersion = builder.clientVersion;
            this.deviceId = builder.deviceId;
            this.iasId = builder.iasId;
            this.loginTime = builder.loginTime;
            this.online = builder.online;
            this.projectId = builder.projectId;
            this.systemVersion = builder.systemVersion;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return iasId
         */
        public String getIasId() {
            return this.iasId;
        }

        /**
         * @return loginTime
         */
        public Long getLoginTime() {
            return this.loginTime;
        }

        /**
         * @return online
         */
        public Integer getOnline() {
            return this.online;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return systemVersion
         */
        public String getSystemVersion() {
            return this.systemVersion;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String clientVersion; 
            private String deviceId; 
            private String iasId; 
            private Long loginTime; 
            private Integer online; 
            private String projectId; 
            private String systemVersion; 
            private String terminal; 

            /**
             * ClientVersion.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * IasId.
             */
            public Builder iasId(String iasId) {
                this.iasId = iasId;
                return this;
            }

            /**
             * LoginTime.
             */
            public Builder loginTime(Long loginTime) {
                this.loginTime = loginTime;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(Integer online) {
                this.online = online;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SystemVersion.
             */
            public Builder systemVersion(String systemVersion) {
                this.systemVersion = systemVersion;
                return this;
            }

            /**
             * Terminal.
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
