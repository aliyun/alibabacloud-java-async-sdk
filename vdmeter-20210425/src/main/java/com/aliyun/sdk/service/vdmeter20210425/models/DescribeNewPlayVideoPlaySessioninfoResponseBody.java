// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNewPlayVideoPlaySessioninfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNewPlayVideoPlaySessioninfoResponseBody</p>
 */
public class DescribeNewPlayVideoPlaySessioninfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNewPlayVideoPlaySessioninfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNewPlayVideoPlaySessioninfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNewPlayVideoPlaySessioninfoResponseBody build() {
            return new DescribeNewPlayVideoPlaySessioninfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("DeviceBrand")
        private String deviceBrand;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("OS")
        private String os;

        @NameInMap("OV")
        private String ov;

        @NameInMap("TerminalType")
        private String terminalType;

        @NameInMap("VPS")
        private String VPS;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.deviceBrand = builder.deviceBrand;
            this.deviceModel = builder.deviceModel;
            this.os = builder.os;
            this.ov = builder.ov;
            this.terminalType = builder.terminalType;
            this.VPS = builder.VPS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return deviceBrand
         */
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return ov
         */
        public String getOv() {
            return this.ov;
        }

        /**
         * @return terminalType
         */
        public String getTerminalType() {
            return this.terminalType;
        }

        /**
         * @return VPS
         */
        public String getVPS() {
            return this.VPS;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appVersion; 
            private String deviceBrand; 
            private String deviceModel; 
            private String os; 
            private String ov; 
            private String terminalType; 
            private String VPS; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * DeviceBrand.
             */
            public Builder deviceBrand(String deviceBrand) {
                this.deviceBrand = deviceBrand;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * OS.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * OV.
             */
            public Builder ov(String ov) {
                this.ov = ov;
                return this;
            }

            /**
             * TerminalType.
             */
            public Builder terminalType(String terminalType) {
                this.terminalType = terminalType;
                return this;
            }

            /**
             * VPS.
             */
            public Builder VPS(String VPS) {
                this.VPS = VPS;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
