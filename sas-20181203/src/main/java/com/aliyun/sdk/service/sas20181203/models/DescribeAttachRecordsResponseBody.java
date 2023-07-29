// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttachRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttachRecordsResponseBody</p>
 */
public class DescribeAttachRecordsResponseBody extends TeaModel {
    @NameInMap("AccessList")
    private java.util.List < AccessList> accessList;

    @NameInMap("RequestId")
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
         * AccessList.
         */
        public Builder accessList(java.util.List < AccessList> accessList) {
            this.accessList = accessList;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AttachState")
        private Long attachState;

        @NameInMap("AttachSwitch")
        private String attachSwitch;

        @NameInMap("EcsUUID")
        private String ecsUUID;

        @NameInMap("InstallMsg")
        private String installMsg;

        @NameInMap("InstallState")
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
             * AttachState.
             */
            public Builder attachState(Long attachState) {
                this.attachState = attachState;
                return this;
            }

            /**
             * AttachSwitch.
             */
            public Builder attachSwitch(String attachSwitch) {
                this.attachSwitch = attachSwitch;
                return this;
            }

            /**
             * EcsUUID.
             */
            public Builder ecsUUID(String ecsUUID) {
                this.ecsUUID = ecsUUID;
                return this;
            }

            /**
             * InstallMsg.
             */
            public Builder installMsg(String installMsg) {
                this.installMsg = installMsg;
                return this;
            }

            /**
             * InstallState.
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
