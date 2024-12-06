// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListKibanaPvlNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>ListKibanaPvlNetworkResponseBody</p>
 */
public class ListKibanaPvlNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListKibanaPvlNetworkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKibanaPvlNetworkResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>request id</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListKibanaPvlNetworkResponseBody build() {
            return new ListKibanaPvlNetworkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKibanaPvlNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>ListKibanaPvlNetworkResponseBody</p>
     */
    public static class VSwitchIdsZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private VSwitchIdsZone(Builder builder) {
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIdsZone create() {
            return builder().build();
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vswitchId; 
            private String zoneId; 

            /**
             * vswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitchIdsZone build() {
                return new VSwitchIdsZone(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKibanaPvlNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>ListKibanaPvlNetworkResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("endpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("endpointName")
        private String endpointName;

        @com.aliyun.core.annotation.NameInMap("endpointStatus")
        private String endpointStatus;

        @com.aliyun.core.annotation.NameInMap("pvlId")
        private String pvlId;

        @com.aliyun.core.annotation.NameInMap("securityGroups")
        private java.util.List < String > securityGroups;

        @com.aliyun.core.annotation.NameInMap("vSwitchIdsZone")
        private java.util.List < VSwitchIdsZone> vSwitchIdsZone;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.endpointId = builder.endpointId;
            this.endpointName = builder.endpointName;
            this.endpointStatus = builder.endpointStatus;
            this.pvlId = builder.pvlId;
            this.securityGroups = builder.securityGroups;
            this.vSwitchIdsZone = builder.vSwitchIdsZone;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return endpointStatus
         */
        public String getEndpointStatus() {
            return this.endpointStatus;
        }

        /**
         * @return pvlId
         */
        public String getPvlId() {
            return this.pvlId;
        }

        /**
         * @return securityGroups
         */
        public java.util.List < String > getSecurityGroups() {
            return this.securityGroups;
        }

        /**
         * @return vSwitchIdsZone
         */
        public java.util.List < VSwitchIdsZone> getVSwitchIdsZone() {
            return this.vSwitchIdsZone;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String createTime; 
            private String endpointId; 
            private String endpointName; 
            private String endpointStatus; 
            private String pvlId; 
            private java.util.List < String > securityGroups; 
            private java.util.List < VSwitchIdsZone> vSwitchIdsZone; 
            private String vpcId; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * endpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * endpointName.
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * endpointStatus.
             */
            public Builder endpointStatus(String endpointStatus) {
                this.endpointStatus = endpointStatus;
                return this;
            }

            /**
             * pvlId.
             */
            public Builder pvlId(String pvlId) {
                this.pvlId = pvlId;
                return this;
            }

            /**
             * securityGroups.
             */
            public Builder securityGroups(java.util.List < String > securityGroups) {
                this.securityGroups = securityGroups;
                return this;
            }

            /**
             * vSwitchIdsZone.
             */
            public Builder vSwitchIdsZone(java.util.List < VSwitchIdsZone> vSwitchIdsZone) {
                this.vSwitchIdsZone = vSwitchIdsZone;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
