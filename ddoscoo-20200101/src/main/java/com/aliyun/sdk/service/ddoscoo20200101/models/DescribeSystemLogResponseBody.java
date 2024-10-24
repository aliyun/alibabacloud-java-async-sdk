// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8BC3A33A-F832-58DB-952F-7682A25AD14C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of details of the billing logs for the burstable clean bandwidth.</p>
         */
        public Builder systemLog(java.util.List < SystemLog> systemLog) {
            this.systemLog = systemLog;
            return this;
        }

        /**
         * <p>The total number of billing logs for the burstable clean bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeSystemLogResponseBody build() {
            return new DescribeSystemLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSystemLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemLogResponseBody</p>
     */
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
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.107.XX.XX</p>
             */
            public Builder entityObject(String entityObject) {
                this.entityObject = entityObject;
                return this;
            }

            /**
             * <p>The type of the system log. The value is fixed as <strong>20</strong>, which indicates the billing logs for burstable clean bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder entityType(Integer entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The time when the bill was generated. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1631793531000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the bill was last modified. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1635425407000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the bill belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>171986973287****</p>
             */
            public Builder opAccount(String opAccount) {
                this.opAccount = opAccount;
                return this;
            }

            /**
             * <p>The operation type. The value is fixed as <strong>100</strong>, which indicates the billing logs for the burstable clean bandwidth that you increased.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder opAction(Integer opAction) {
                this.opAction = opAction;
                return this;
            }

            /**
             * <p>The details of the bill. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
             * <ul>
             * <li><p><strong>newEntity</strong>: the bill record, which contains the following fields. Data type: object.</p>
             * <ul>
             * <li><strong>billValue</strong>: the usage of the burstable clean bandwidth within a month. Unit: Mbit/s. Data type: integer.</li>
             * <li><strong>instanceId</strong>: the ID of the instance. Data type: string.</li>
             * <li><strong>ip</strong>: the IP address of the instance. Data type: string.</li>
             * <li><strong>maxBw</strong>: the peak service traffic (monthly 95th percentile bandwidth) within a month. Unit: Mbit/s. Data type: string.</li>
             * <li><strong>month</strong>: the month in which the bill of the previous calendar month is issued. This value is a UNIX timestamp. Unit: milliseconds. Data type: long.</li>
             * <li><strong>overBandwidth</strong>: the peak service traffic minus the clean bandwidth of the instance. Unit: Mbit/s. Data type: integer.</li>
             * <li><strong>peakTime</strong>: the time in point of the peak service traffic that is measured for billing. This value is a UNIX timestamp. Unit: seconds. Data type: long.</li>
             * <li><strong>startTimestamp</strong>: the beginning of the time range for the peak service traffic range. This value is a UNIX timestamp. Unit: seconds. Data type: long.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;newEntity&quot;:{&quot;billValue&quot;:&quot;60&quot;,&quot;instanceId&quot;:&quot;ddoscoo-cn-zz121ogz****&quot;,&quot;ip&quot;:&quot;203.107.XX.XX&quot;,&quot;maxBw&quot;:&quot;300&quot;,&quot;month&quot;:1627747200000,&quot;overBandwidth&quot;:&quot;120&quot;,&quot;peakTime&quot;:1629871200,&quot;startTimestamp&quot;:1629871200}}</p>
             */
            public Builder opDesc(String opDesc) {
                this.opDesc = opDesc;
                return this;
            }

            /**
             * <p>The status of the bill. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: to be billed</li>
             * <li><strong>1</strong>: billed</li>
             * <li><strong>2</strong>: terminated</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
