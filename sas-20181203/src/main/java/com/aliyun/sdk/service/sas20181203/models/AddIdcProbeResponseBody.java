// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIdcProbeResponseBody} extends {@link TeaModel}
 *
 * <p>AddIdcProbeResponseBody</p>
 */
public class AddIdcProbeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddIdcProbeFailedList")
    private java.util.List < AddIdcProbeFailedList> addIdcProbeFailedList;

    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddIdcProbeResponseBody(Builder builder) {
        this.addIdcProbeFailedList = builder.addIdcProbeFailedList;
        this.count = builder.count;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIdcProbeResponseBody create() {
        return builder().build();
    }

    /**
     * @return addIdcProbeFailedList
     */
    public java.util.List < AddIdcProbeFailedList> getAddIdcProbeFailedList() {
        return this.addIdcProbeFailedList;
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AddIdcProbeFailedList> addIdcProbeFailedList; 
        private String count; 
        private String requestId; 

        /**
         * The records of failure.
         */
        public Builder addIdcProbeFailedList(java.util.List < AddIdcProbeFailedList> addIdcProbeFailedList) {
            this.addIdcProbeFailedList = addIdcProbeFailedList;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddIdcProbeResponseBody build() {
            return new AddIdcProbeResponseBody(this);
        } 

    } 

    public static class AddIdcProbeFailedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("IdcName")
        private String idcName;

        @com.aliyun.core.annotation.NameInMap("IdcRegion")
        private String idcRegion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("IpSegments")
        private String ipSegments;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private AddIdcProbeFailedList(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.idcName = builder.idcName;
            this.idcRegion = builder.idcRegion;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ipSegments = builder.ipSegments;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddIdcProbeFailedList create() {
            return builder().build();
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return idcName
         */
        public String getIdcName() {
            return this.idcName;
        }

        /**
         * @return idcRegion
         */
        public String getIdcRegion() {
            return this.idcRegion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return ipSegments
         */
        public String getIpSegments() {
            return this.ipSegments;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String errorMsg; 
            private String idcName; 
            private String idcRegion; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ipSegments; 
            private String uuid; 

            /**
             * The error message that is returned.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The name of the data center.
             */
            public Builder idcName(String idcName) {
                this.idcName = idcName;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder idcRegion(String idcRegion) {
                this.idcRegion = idcRegion;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The settings of the CIDR block.
             */
            public Builder ipSegments(String ipSegments) {
                this.ipSegments = ipSegments;
                return this;
            }

            /**
             * The UUID of the server. Multiple UUIDs are separated by commas (,).
             * <p>
             * 
             * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUID.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public AddIdcProbeFailedList build() {
                return new AddIdcProbeFailedList(this);
            } 

        } 

    }
}
