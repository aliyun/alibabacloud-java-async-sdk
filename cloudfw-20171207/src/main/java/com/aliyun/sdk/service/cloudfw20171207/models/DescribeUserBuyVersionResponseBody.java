// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBuyVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBuyVersionResponseBody</p>
 */
public class DescribeUserBuyVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private Long expire;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("IpNumber")
    private Long ipNumber;

    @com.aliyun.core.annotation.NameInMap("LogStatus")
    private Boolean logStatus;

    @com.aliyun.core.annotation.NameInMap("LogStorage")
    private Long logStorage;

    @com.aliyun.core.annotation.NameInMap("MaxOverflow")
    private Long maxOverflow;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private Boolean userStatus;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Integer version;

    @com.aliyun.core.annotation.NameInMap("VpcNumber")
    private Long vpcNumber;

    private DescribeUserBuyVersionResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.expire = builder.expire;
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.ipNumber = builder.ipNumber;
        this.logStatus = builder.logStatus;
        this.logStorage = builder.logStorage;
        this.maxOverflow = builder.maxOverflow;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.userStatus = builder.userStatus;
        this.version = builder.version;
        this.vpcNumber = builder.vpcNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBuyVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return ipNumber
     */
    public Long getIpNumber() {
        return this.ipNumber;
    }

    /**
     * @return logStatus
     */
    public Boolean getLogStatus() {
        return this.logStatus;
    }

    /**
     * @return logStorage
     */
    public Long getLogStorage() {
        return this.logStorage;
    }

    /**
     * @return maxOverflow
     */
    public Long getMaxOverflow() {
        return this.maxOverflow;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return userStatus
     */
    public Boolean getUserStatus() {
        return this.userStatus;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * @return vpcNumber
     */
    public Long getVpcNumber() {
        return this.vpcNumber;
    }

    public static final class Builder {
        private Long aliUid; 
        private Long expire; 
        private String instanceId; 
        private String instanceStatus; 
        private Long ipNumber; 
        private Boolean logStatus; 
        private Long logStorage; 
        private Long maxOverflow; 
        private String requestId; 
        private Long startTime; 
        private Boolean userStatus; 
        private Integer version; 
        private Long vpcNumber; 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * Expire.
         */
        public Builder expire(Long expire) {
            this.expire = expire;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * IpNumber.
         */
        public Builder ipNumber(Long ipNumber) {
            this.ipNumber = ipNumber;
            return this;
        }

        /**
         * LogStatus.
         */
        public Builder logStatus(Boolean logStatus) {
            this.logStatus = logStatus;
            return this;
        }

        /**
         * LogStorage.
         */
        public Builder logStorage(Long logStorage) {
            this.logStorage = logStorage;
            return this;
        }

        /**
         * MaxOverflow.
         */
        public Builder maxOverflow(Long maxOverflow) {
            this.maxOverflow = maxOverflow;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * UserStatus.
         */
        public Builder userStatus(Boolean userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * VpcNumber.
         */
        public Builder vpcNumber(Long vpcNumber) {
            this.vpcNumber = vpcNumber;
            return this;
        }

        public DescribeUserBuyVersionResponseBody build() {
            return new DescribeUserBuyVersionResponseBody(this);
        } 

    } 

}
