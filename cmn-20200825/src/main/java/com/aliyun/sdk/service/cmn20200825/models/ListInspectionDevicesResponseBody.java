// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInspectionDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInspectionDevicesResponseBody</p>
 */
public class ListInspectionDevicesResponseBody extends TeaModel {
    @NameInMap("InspectionScripts")
    private java.util.List < InspectionScripts> inspectionScripts;

    @NameInMap("RequestId")
    private String requestId;

    private ListInspectionDevicesResponseBody(Builder builder) {
        this.inspectionScripts = builder.inspectionScripts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInspectionDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return inspectionScripts
     */
    public java.util.List < InspectionScripts> getInspectionScripts() {
        return this.inspectionScripts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InspectionScripts> inspectionScripts; 
        private String requestId; 

        /**
         * content
         */
        public Builder inspectionScripts(java.util.List < InspectionScripts> inspectionScripts) {
            this.inspectionScripts = inspectionScripts;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInspectionDevicesResponseBody build() {
            return new ListInspectionDevicesResponseBody(this);
        } 

    } 

    public static class InspectionScripts extends TeaModel {
        @NameInMap("AppState")
        private String appState;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceState")
        private String deviceState;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("ManageIp")
        private String manageIp;

        @NameInMap("Model")
        private String model;

        @NameInMap("Role")
        private String role;

        @NameInMap("Space")
        private String space;

        @NameInMap("Vendor")
        private String vendor;

        private InspectionScripts(Builder builder) {
            this.appState = builder.appState;
            this.deviceId = builder.deviceId;
            this.deviceState = builder.deviceState;
            this.hostName = builder.hostName;
            this.manageIp = builder.manageIp;
            this.model = builder.model;
            this.role = builder.role;
            this.space = builder.space;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionScripts create() {
            return builder().build();
        }

        /**
         * @return appState
         */
        public String getAppState() {
            return this.appState;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceState
         */
        public String getDeviceState() {
            return this.deviceState;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return manageIp
         */
        public String getManageIp() {
            return this.manageIp;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return space
         */
        public String getSpace() {
            return this.space;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String appState; 
            private String deviceId; 
            private String deviceState; 
            private String hostName; 
            private String manageIp; 
            private String model; 
            private String role; 
            private String space; 
            private String vendor; 

            /**
             * AppState.
             */
            public Builder appState(String appState) {
                this.appState = appState;
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
             * DeviceState.
             */
            public Builder deviceState(String deviceState) {
                this.deviceState = deviceState;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * ManageIp.
             */
            public Builder manageIp(String manageIp) {
                this.manageIp = manageIp;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Space.
             */
            public Builder space(String space) {
                this.space = space;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public InspectionScripts build() {
                return new InspectionScripts(this);
            } 

        } 

    }
}
