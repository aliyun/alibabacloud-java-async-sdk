// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeGtmRecoveryPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmRecoveryPlanResponseBody</p>
 */
public class DescribeGtmRecoveryPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("FaultAddrPoolNum")
    private Integer faultAddrPoolNum;

    @com.aliyun.core.annotation.NameInMap("FaultAddrPools")
    private FaultAddrPools faultAddrPools;

    @com.aliyun.core.annotation.NameInMap("LastExecuteTime")
    private String lastExecuteTime;

    @com.aliyun.core.annotation.NameInMap("LastExecuteTimestamp")
    private Long lastExecuteTimestamp;

    @com.aliyun.core.annotation.NameInMap("LastRollbackTime")
    private String lastRollbackTime;

    @com.aliyun.core.annotation.NameInMap("LastRollbackTimestamp")
    private Long lastRollbackTimestamp;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RecoveryPlanId")
    private Long recoveryPlanId;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeGtmRecoveryPlanResponseBody model) {
            this.createTime = model.createTime;
            this.createTimestamp = model.createTimestamp;
            this.faultAddrPoolNum = model.faultAddrPoolNum;
            this.faultAddrPools = model.faultAddrPools;
            this.lastExecuteTime = model.lastExecuteTime;
            this.lastExecuteTimestamp = model.lastExecuteTimestamp;
            this.lastRollbackTime = model.lastRollbackTime;
            this.lastRollbackTimestamp = model.lastRollbackTimestamp;
            this.name = model.name;
            this.recoveryPlanId = model.recoveryPlanId;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.status = model.status;
            this.updateTime = model.updateTime;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * <p>The time when the disaster recovery plan was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-11T05:04Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the disaster recovery plan was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1565499867000</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The number of faulty address pools.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder faultAddrPoolNum(Integer faultAddrPoolNum) {
            this.faultAddrPoolNum = faultAddrPoolNum;
            return this;
        }

        /**
         * <p>The faulty address pools.</p>
         */
        public Builder faultAddrPools(FaultAddrPools faultAddrPools) {
            this.faultAddrPools = faultAddrPools;
            return this;
        }

        /**
         * <p>The time when the disaster recovery plan was last executed. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-11T05:04Z</p>
         */
        public Builder lastExecuteTime(String lastExecuteTime) {
            this.lastExecuteTime = lastExecuteTime;
            return this;
        }

        /**
         * <p>The time when the disaster recovery plan was last executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1565505898000</p>
         */
        public Builder lastExecuteTimestamp(Long lastExecuteTimestamp) {
            this.lastExecuteTimestamp = lastExecuteTimestamp;
            return this;
        }

        /**
         * <p>The time when the disaster recovery plan was last rolled back. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-11T06:45Z</p>
         */
        public Builder lastRollbackTime(String lastRollbackTime) {
            this.lastRollbackTime = lastRollbackTime;
            return this;
        }

        /**
         * <p>The time when the disaster recovery plan was last rolled back. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1565505919000</p>
         */
        public Builder lastRollbackTimestamp(Long lastRollbackTimestamp) {
            this.lastRollbackTimestamp = lastRollbackTimestamp;
            return this;
        }

        /**
         * <p>The name of the disaster recovery plan.</p>
         * 
         * <strong>example:</strong>
         * <p>name-example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the disaster recovery plan.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        public Builder recoveryPlanId(Long recoveryPlanId) {
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }

        /**
         * <p>The description of the disaster recovery plan.</p>
         * 
         * <strong>example:</strong>
         * <p>remark-example</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A5F4315-D6E8-435E-82DF-24F4C97D6999</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the disaster recovery plan.</p>
         * 
         * <strong>example:</strong>
         * <p>UNEXECUTED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the disaster recovery plan was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-11T06:45Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The time when the disaster recovery plan was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1565499867000</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeGtmRecoveryPlanResponseBody build() {
            return new DescribeGtmRecoveryPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGtmRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmRecoveryPlanResponseBody</p>
     */
    public static class Addr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Addr model) {
                this.id = model.id;
                this.mode = model.mode;
                this.value = model.value;
            } 

            /**
             * <p>The address ID.</p>
             * 
             * <strong>example:</strong>
             * <p>739</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The address mode.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFLINE</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
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
    /**
     * 
     * {@link DescribeGtmRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmRecoveryPlanResponseBody</p>
     */
    public static class Addrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addr")
        private java.util.List<Addr> addr;

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
        public java.util.List<Addr> getAddr() {
            return this.addr;
        }

        public static final class Builder {
            private java.util.List<Addr> addr; 

            private Builder() {
            } 

            private Builder(Addrs model) {
                this.addr = model.addr;
            } 

            /**
             * Addr.
             */
            public Builder addr(java.util.List<Addr> addr) {
                this.addr = addr;
                return this;
            }

            public Addrs build() {
                return new Addrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGtmRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmRecoveryPlanResponseBody</p>
     */
    public static class FaultAddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrPoolId")
        private String addrPoolId;

        @com.aliyun.core.annotation.NameInMap("AddrPoolName")
        private String addrPoolName;

        @com.aliyun.core.annotation.NameInMap("Addrs")
        private Addrs addrs;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
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

            private Builder() {
            } 

            private Builder(FaultAddrPool model) {
                this.addrPoolId = model.addrPoolId;
                this.addrPoolName = model.addrPoolName;
                this.addrs = model.addrs;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The address pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hra0oq</p>
             */
            public Builder addrPoolId(String addrPoolId) {
                this.addrPoolId = addrPoolId;
                return this;
            }

            /**
             * <p>The address pool name.</p>
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>instance-zwy-38</p>
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
    /**
     * 
     * {@link DescribeGtmRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmRecoveryPlanResponseBody</p>
     */
    public static class FaultAddrPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaultAddrPool")
        private java.util.List<FaultAddrPool> faultAddrPool;

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
        public java.util.List<FaultAddrPool> getFaultAddrPool() {
            return this.faultAddrPool;
        }

        public static final class Builder {
            private java.util.List<FaultAddrPool> faultAddrPool; 

            private Builder() {
            } 

            private Builder(FaultAddrPools model) {
                this.faultAddrPool = model.faultAddrPool;
            } 

            /**
             * FaultAddrPool.
             */
            public Builder faultAddrPool(java.util.List<FaultAddrPool> faultAddrPool) {
                this.faultAddrPool = faultAddrPool;
                return this;
            }

            public FaultAddrPools build() {
                return new FaultAddrPools(this);
            } 

        } 

    }
}
