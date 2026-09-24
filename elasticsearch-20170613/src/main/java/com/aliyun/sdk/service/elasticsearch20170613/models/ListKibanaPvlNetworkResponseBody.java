// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListKibanaPvlNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>ListKibanaPvlNetworkResponseBody</p>
 */
public class ListKibanaPvlNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListKibanaPvlNetworkResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of result objects.</p>
         */
        public Builder result(java.util.List<Result> result) {
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

            private Builder() {
            } 

            private Builder(VSwitchIdsZone model) {
                this.vswitchId = model.vswitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xdefafns***</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-e</p>
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

        @com.aliyun.core.annotation.NameInMap("managedSecurityGroup")
        private Boolean managedSecurityGroup;

        @com.aliyun.core.annotation.NameInMap("pvlId")
        private String pvlId;

        @com.aliyun.core.annotation.NameInMap("securityGroups")
        private java.util.List<String> securityGroups;

        @com.aliyun.core.annotation.NameInMap("vSwitchIdsZone")
        private java.util.List<VSwitchIdsZone> vSwitchIdsZone;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.endpointId = builder.endpointId;
            this.endpointName = builder.endpointName;
            this.endpointStatus = builder.endpointStatus;
            this.managedSecurityGroup = builder.managedSecurityGroup;
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
         * @return managedSecurityGroup
         */
        public Boolean getManagedSecurityGroup() {
            return this.managedSecurityGroup;
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
        public java.util.List<String> getSecurityGroups() {
            return this.securityGroups;
        }

        /**
         * @return vSwitchIdsZone
         */
        public java.util.List<VSwitchIdsZone> getVSwitchIdsZone() {
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
            private Boolean managedSecurityGroup; 
            private String pvlId; 
            private java.util.List<String> securityGroups; 
            private java.util.List<VSwitchIdsZone> vSwitchIdsZone; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.endpointId = model.endpointId;
                this.endpointName = model.endpointName;
                this.endpointStatus = model.endpointStatus;
                this.managedSecurityGroup = model.managedSecurityGroup;
                this.pvlId = model.pvlId;
                this.securityGroups = model.securityGroups;
                this.vSwitchIdsZone = model.vSwitchIdsZone;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The time when the Kibana private network connection was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-07T06:26:28Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-bp1tah7zbrwmkjef****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The endpoint name.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-xxdjfia****-kibana</p>
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * <p>The endpoint status. Valid values:</p>
             * <ul>
             * <li>Disconnected: disconnected</li>
             * <li>Connected: connected</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
             */
            public Builder endpointStatus(String endpointStatus) {
                this.endpointStatus = endpointStatus;
                return this;
            }

            /**
             * managedSecurityGroup.
             */
            public Builder managedSecurityGroup(Boolean managedSecurityGroup) {
                this.managedSecurityGroup = managedSecurityGroup;
                return this;
            }

            /**
             * <p>The Kibana private network connection ID.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-27a3mul6l***-kibana-internal</p>
             */
            public Builder pvlId(String pvlId) {
                this.pvlId = pvlId;
                return this;
            }

            /**
             * <p>The list of security groups.</p>
             */
            public Builder securityGroups(java.util.List<String> securityGroups) {
                this.securityGroups = securityGroups;
                return this;
            }

            /**
             * <p>The vSwitch and zone information.</p>
             */
            public Builder vSwitchIdsZone(java.util.List<VSwitchIdsZone> vSwitchIdsZone) {
                this.vSwitchIdsZone = vSwitchIdsZone;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp16k1dvzxtma*****</p>
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
