// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The results of automatically connecting applications on the ECS instance to the application protection feature.</p>
         */
        public Builder accessList(java.util.List < AccessList> accessList) {
            this.accessList = accessList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9F4E6157-9600-5588-86B9-38F09067****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAttachRecordsResponseBody build() {
            return new DescribeAttachRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAttachRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAttachRecordsResponseBody</p>
     */
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
             * <p>The status of connecting applications on the ECS instance to the application protection feature. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: All applications are connected to the application protection feature.</li>
             * <li><strong>1</strong>: Partial applications are connected to the application protection feature.</li>
             * <li><strong>2</strong>: Applications failed to be connected to the application protection feature.</li>
             * <li><strong>3</strong>: Applications are being connected to the application protection feature.</li>
             * <li><strong>4</strong>: Applications are not connected to the application protection feature.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attachState(Long attachState) {
                this.attachState = attachState;
                return this;
            }

            /**
             * <p>Indicates whether automatic protection is enabled for the applications on the ECS instance. Valid values:</p>
             * <ul>
             * <li><strong>ON</strong>: Automatic protection is enabled for the applications on the ECS instance.</li>
             * <li><strong>OFF</strong>: Automatic protection is disabled for the applications on the ECS instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder attachSwitch(String attachSwitch) {
                this.attachSwitch = attachSwitch;
                return this;
            }

            /**
             * <p>The UUID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cd405430-c027-4937-8398-10152dac****</p>
             */
            public Builder ecsUUID(String ecsUUID) {
                this.ecsUUID = ecsUUID;
                return this;
            }

            /**
             * <p>The message that shows the results of installing the RASP agent on the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder installMsg(String installMsg) {
                this.installMsg = installMsg;
                return this;
            }

            /**
             * <p>The status of installing the RASP agent on the ECS instance to enable automatic application connection. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: installed</li>
             * <li><strong>1</strong>: installing</li>
             * <li><strong>2</strong>: installation failed</li>
             * <li><strong>3</strong>: installation timeout</li>
             * <li><strong>4</strong>: uninstalled</li>
             * <li><strong>5</strong>: uninstalling</li>
             * <li><strong>6</strong>: uninstallation failed</li>
             * <li><strong>7</strong>: uninstallation timeout</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
