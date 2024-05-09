// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemLogResponseBody</p>
 */
public class DescribeSystemLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemLog")
    private java.util.List < SystemLog> systemLog;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeSystemLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.systemLog = builder.systemLog;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemLog
     */
    public java.util.List < SystemLog> getSystemLog() {
        return this.systemLog;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SystemLog> systemLog; 
        private Long total; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of details of the billing logs for the burstable clean bandwidth.
         */
        public Builder systemLog(java.util.List < SystemLog> systemLog) {
            this.systemLog = systemLog;
            return this;
        }

        /**
         * The total number of billing logs for the burstable clean bandwidth.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeSystemLogResponseBody build() {
            return new DescribeSystemLogResponseBody(this);
        } 

    } 

    public static class SystemLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityObject")
        private String entityObject;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private Integer entityType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("OpAccount")
        private String opAccount;

        @com.aliyun.core.annotation.NameInMap("OpAction")
        private Integer opAction;

        @com.aliyun.core.annotation.NameInMap("OpDesc")
        private String opDesc;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private SystemLog(Builder builder) {
            this.entityObject = builder.entityObject;
            this.entityType = builder.entityType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.opAccount = builder.opAccount;
            this.opAction = builder.opAction;
            this.opDesc = builder.opDesc;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemLog create() {
            return builder().build();
        }

        /**
         * @return entityObject
         */
        public String getEntityObject() {
            return this.entityObject;
        }

        /**
         * @return entityType
         */
        public Integer getEntityType() {
            return this.entityType;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return opAccount
         */
        public String getOpAccount() {
            return this.opAccount;
        }

        /**
         * @return opAction
         */
        public Integer getOpAction() {
            return this.opAction;
        }

        /**
         * @return opDesc
         */
        public String getOpDesc() {
            return this.opDesc;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String entityObject; 
            private Integer entityType; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String opAccount; 
            private Integer opAction; 
            private String opDesc; 
            private Integer status; 

            /**
             * The IP address of the instance.
             */
            public Builder entityObject(String entityObject) {
                this.entityObject = entityObject;
                return this;
            }

            /**
             * The type of the system log. The value is fixed as **20**, which indicates the billing logs for burstable clean bandwidth.
             */
            public Builder entityType(Integer entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * The time when the bill was generated. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the bill was last modified. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the bill belongs.
             */
            public Builder opAccount(String opAccount) {
                this.opAccount = opAccount;
                return this;
            }

            /**
             * The operation type. The value is fixed as **100**, which indicates the billing logs for the burstable clean bandwidth that you increased.
             */
            public Builder opAction(Integer opAction) {
                this.opAction = opAction;
                return this;
            }

            /**
             * The details of the bill. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:
             * <p>
             * 
             * *   **newEntity**: the bill record, which contains the following fields. Data type: object.
             * 
             *     *   **billValue**: the usage of the burstable clean bandwidth within a month. Unit: Mbit/s. Data type: integer.
             *     *   **instanceId**: the ID of the instance. Data type: string.
             *     *   **ip**: the IP address of the instance. Data type: string.
             *     *   **maxBw**: the peak service traffic (monthly 95th percentile bandwidth) within a month. Unit: Mbit/s. Data type: string.
             *     *   **month**: the month in which the bill of the previous calendar month is issued. This value is a UNIX timestamp. Unit: milliseconds. Data type: long.
             *     *   **overBandwidth**: the peak service traffic minus the clean bandwidth of the instance. Unit: Mbit/s. Data type: integer.
             *     *   **peakTime**: the time in point of the peak service traffic that is measured for billing. This value is a UNIX timestamp. Unit: seconds. Data type: long.
             *     *   **startTimestamp**: the beginning of the time range for the peak service traffic range. This value is a UNIX timestamp. Unit: seconds. Data type: long.
             */
            public Builder opDesc(String opDesc) {
                this.opDesc = opDesc;
                return this;
            }

            /**
             * The status of the bill. Valid values:
             * <p>
             * 
             * *   **0**: to be billed
             * *   **1**: billed
             * *   **2**: terminated
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public SystemLog build() {
                return new SystemLog(this);
            } 

        } 

    }
}
