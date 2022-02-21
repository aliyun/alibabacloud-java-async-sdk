// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmRecoveryPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmRecoveryPlanResponseBody</p>
 */
public class DescribeGtmRecoveryPlanResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @NameInMap("FaultAddrPoolNum")
    private Integer faultAddrPoolNum;

    @NameInMap("FaultAddrPools")
    private FaultAddrPools faultAddrPools;

    @NameInMap("LastExecuteTime")
    private String lastExecuteTime;

    @NameInMap("LastExecuteTimestamp")
    private Long lastExecuteTimestamp;

    @NameInMap("LastRollbackTime")
    private String lastRollbackTime;

    @NameInMap("LastRollbackTimestamp")
    private Long lastRollbackTimestamp;

    @NameInMap("Name")
    private String name;

    @NameInMap("RecoveryPlanId")
    private Long recoveryPlanId;

    @NameInMap("Remark")
    private String remark;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    private DescribeGtmRecoveryPlanResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.faultAddrPoolNum = builder.faultAddrPoolNum;
        this.faultAddrPools = builder.faultAddrPools;
        this.lastExecuteTime = builder.lastExecuteTime;
        this.lastExecuteTimestamp = builder.lastExecuteTimestamp;
        this.lastRollbackTime = builder.lastRollbackTime;
        this.lastRollbackTimestamp = builder.lastRollbackTimestamp;
        this.name = builder.name;
        this.recoveryPlanId = builder.recoveryPlanId;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmRecoveryPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return faultAddrPoolNum
     */
    public Integer getFaultAddrPoolNum() {
        return this.faultAddrPoolNum;
    }

    /**
     * @return faultAddrPools
     */
    public FaultAddrPools getFaultAddrPools() {
        return this.faultAddrPools;
    }

    /**
     * @return lastExecuteTime
     */
    public String getLastExecuteTime() {
        return this.lastExecuteTime;
    }

    /**
     * @return lastExecuteTimestamp
     */
    public Long getLastExecuteTimestamp() {
        return this.lastExecuteTimestamp;
    }

    /**
     * @return lastRollbackTime
     */
    public String getLastRollbackTime() {
        return this.lastRollbackTime;
    }

    /**
     * @return lastRollbackTimestamp
     */
    public Long getLastRollbackTimestamp() {
        return this.lastRollbackTimestamp;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recoveryPlanId
     */
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private String createTime; 
        private Long createTimestamp; 
        private Integer faultAddrPoolNum; 
        private FaultAddrPools faultAddrPools; 
        private String lastExecuteTime; 
        private Long lastExecuteTimestamp; 
        private String lastRollbackTime; 
        private Long lastRollbackTimestamp; 
        private String name; 
        private Long recoveryPlanId; 
        private String remark; 
        private String requestId; 
        private String status; 
        private String updateTime; 
        private Long updateTimestamp; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * FaultAddrPoolNum.
         */
        public Builder faultAddrPoolNum(Integer faultAddrPoolNum) {
            this.faultAddrPoolNum = faultAddrPoolNum;
            return this;
        }

        /**
         * FaultAddrPools.
         */
        public Builder faultAddrPools(FaultAddrPools faultAddrPools) {
            this.faultAddrPools = faultAddrPools;
            return this;
        }

        /**
         * LastExecuteTime.
         */
        public Builder lastExecuteTime(String lastExecuteTime) {
            this.lastExecuteTime = lastExecuteTime;
            return this;
        }

        /**
         * LastExecuteTimestamp.
         */
        public Builder lastExecuteTimestamp(Long lastExecuteTimestamp) {
            this.lastExecuteTimestamp = lastExecuteTimestamp;
            return this;
        }

        /**
         * LastRollbackTime.
         */
        public Builder lastRollbackTime(String lastRollbackTime) {
            this.lastRollbackTime = lastRollbackTime;
            return this;
        }

        /**
         * LastRollbackTimestamp.
         */
        public Builder lastRollbackTimestamp(Long lastRollbackTimestamp) {
            this.lastRollbackTimestamp = lastRollbackTimestamp;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RecoveryPlanId.
         */
        public Builder recoveryPlanId(Long recoveryPlanId) {
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UpdateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeGtmRecoveryPlanResponseBody build() {
            return new DescribeGtmRecoveryPlanResponseBody(this);
        } 

    } 

    public static class Addr extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Value")
        private String value;

        private Addr(Builder builder) {
            this.id = builder.id;
            this.mode = builder.mode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addr create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long id; 
            private String mode; 
            private String value; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Addr build() {
                return new Addr(this);
            } 

        } 

    }
    public static class Addrs extends TeaModel {
        @NameInMap("Addr")
        private java.util.List < Addr> addr;

        private Addrs(Builder builder) {
            this.addr = builder.addr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addrs create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public java.util.List < Addr> getAddr() {
            return this.addr;
        }

        public static final class Builder {
            private java.util.List < Addr> addr; 

            /**
             * Addr.
             */
            public Builder addr(java.util.List < Addr> addr) {
                this.addr = addr;
                return this;
            }

            public Addrs build() {
                return new Addrs(this);
            } 

        } 

    }
    public static class FaultAddrPool extends TeaModel {
        @NameInMap("AddrPoolId")
        private String addrPoolId;

        @NameInMap("AddrPoolName")
        private String addrPoolName;

        @NameInMap("Addrs")
        private Addrs addrs;

        @NameInMap("InstanceId")
        private String instanceId;

        private FaultAddrPool(Builder builder) {
            this.addrPoolId = builder.addrPoolId;
            this.addrPoolName = builder.addrPoolName;
            this.addrs = builder.addrs;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaultAddrPool create() {
            return builder().build();
        }

        /**
         * @return addrPoolId
         */
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        /**
         * @return addrPoolName
         */
        public String getAddrPoolName() {
            return this.addrPoolName;
        }

        /**
         * @return addrs
         */
        public Addrs getAddrs() {
            return this.addrs;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String addrPoolId; 
            private String addrPoolName; 
            private Addrs addrs; 
            private String instanceId; 

            /**
             * AddrPoolId.
             */
            public Builder addrPoolId(String addrPoolId) {
                this.addrPoolId = addrPoolId;
                return this;
            }

            /**
             * AddrPoolName.
             */
            public Builder addrPoolName(String addrPoolName) {
                this.addrPoolName = addrPoolName;
                return this;
            }

            /**
             * Addrs.
             */
            public Builder addrs(Addrs addrs) {
                this.addrs = addrs;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public FaultAddrPool build() {
                return new FaultAddrPool(this);
            } 

        } 

    }
    public static class FaultAddrPools extends TeaModel {
        @NameInMap("FaultAddrPool")
        private java.util.List < FaultAddrPool> faultAddrPool;

        private FaultAddrPools(Builder builder) {
            this.faultAddrPool = builder.faultAddrPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaultAddrPools create() {
            return builder().build();
        }

        /**
         * @return faultAddrPool
         */
        public java.util.List < FaultAddrPool> getFaultAddrPool() {
            return this.faultAddrPool;
        }

        public static final class Builder {
            private java.util.List < FaultAddrPool> faultAddrPool; 

            /**
             * FaultAddrPool.
             */
            public Builder faultAddrPool(java.util.List < FaultAddrPool> faultAddrPool) {
                this.faultAddrPool = faultAddrPool;
                return this;
            }

            public FaultAddrPools build() {
                return new FaultAddrPools(this);
            } 

        } 

    }
}
