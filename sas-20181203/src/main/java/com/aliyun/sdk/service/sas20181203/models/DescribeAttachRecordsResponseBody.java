// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttachRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttachRecordsResponseBody</p>
 */
public class DescribeAttachRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessList")
    private java.util.List < AccessList> accessList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAttachRecordsResponseBody(Builder builder) {
        this.accessList = builder.accessList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttachRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessList
     */
    public java.util.List < AccessList> getAccessList() {
        return this.accessList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AccessList> accessList; 
        private String requestId; 

        /**
         * The results of automatically connecting applications on the ECS instance to the application protection feature.
         */
        public Builder accessList(java.util.List < AccessList> accessList) {
            this.accessList = accessList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAttachRecordsResponseBody build() {
            return new DescribeAttachRecordsResponseBody(this);
        } 

    } 

    public static class AccessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachState")
        private Long attachState;

        @com.aliyun.core.annotation.NameInMap("AttachSwitch")
        private String attachSwitch;

        @com.aliyun.core.annotation.NameInMap("EcsUUID")
        private String ecsUUID;

        @com.aliyun.core.annotation.NameInMap("InstallMsg")
        private String installMsg;

        @com.aliyun.core.annotation.NameInMap("InstallState")
        private Long installState;

        private AccessList(Builder builder) {
            this.attachState = builder.attachState;
            this.attachSwitch = builder.attachSwitch;
            this.ecsUUID = builder.ecsUUID;
            this.installMsg = builder.installMsg;
            this.installState = builder.installState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessList create() {
            return builder().build();
        }

        /**
         * @return attachState
         */
        public Long getAttachState() {
            return this.attachState;
        }

        /**
         * @return attachSwitch
         */
        public String getAttachSwitch() {
            return this.attachSwitch;
        }

        /**
         * @return ecsUUID
         */
        public String getEcsUUID() {
            return this.ecsUUID;
        }

        /**
         * @return installMsg
         */
        public String getInstallMsg() {
            return this.installMsg;
        }

        /**
         * @return installState
         */
        public Long getInstallState() {
            return this.installState;
        }

        public static final class Builder {
            private Long attachState; 
            private String attachSwitch; 
            private String ecsUUID; 
            private String installMsg; 
            private Long installState; 

            /**
             * The status of connecting applications on the ECS instance to the application protection feature. Valid values:
             * <p>
             * 
             * *   **0**: All applications are connected to the application protection feature.
             * *   **1**: Partial applications are connected to the application protection feature.
             * *   **2**: Applications failed to be connected to the application protection feature.
             * *   **3**: Applications are being connected to the application protection feature.
             * *   **4**: Applications are not connected to the application protection feature.
             */
            public Builder attachState(Long attachState) {
                this.attachState = attachState;
                return this;
            }

            /**
             * Indicates whether automatic protection is enabled for the applications on the ECS instance. Valid values:
             * <p>
             * 
             * *   **ON**: Automatic protection is enabled for the applications on the ECS instance.
             * *   **OFF**: Automatic protection is disabled for the applications on the ECS instance.
             */
            public Builder attachSwitch(String attachSwitch) {
                this.attachSwitch = attachSwitch;
                return this;
            }

            /**
             * The UUID of the ECS instance.
             */
            public Builder ecsUUID(String ecsUUID) {
                this.ecsUUID = ecsUUID;
                return this;
            }

            /**
             * The message that shows the results of installing the RASP agent on the ECS instance.
             */
            public Builder installMsg(String installMsg) {
                this.installMsg = installMsg;
                return this;
            }

            /**
             * The status of installing the RASP agent on the ECS instance to enable automatic application connection. Valid values:
             * <p>
             * 
             * *   **0**: installed
             * *   **1**: installing
             * *   **2**: installation failed
             * *   **3**: installation timeout
             * *   **4**: uninstalled
             * *   **5**: uninstalling
             * *   **6**: uninstallation failed
             * *   **7**: uninstallation timeout
             */
            public Builder installState(Long installState) {
                this.installState = installState;
                return this;
            }

            public AccessList build() {
                return new AccessList(this);
            } 

        } 

    }
}
