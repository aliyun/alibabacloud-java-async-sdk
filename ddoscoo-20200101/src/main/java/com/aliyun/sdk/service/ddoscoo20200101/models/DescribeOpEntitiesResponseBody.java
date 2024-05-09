// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOpEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpEntitiesResponseBody</p>
 */
public class DescribeOpEntitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpEntities")
    private java.util.List < OpEntities> opEntities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeOpEntitiesResponseBody(Builder builder) {
        this.opEntities = builder.opEntities;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpEntitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return opEntities
     */
    public java.util.List < OpEntities> getOpEntities() {
        return this.opEntities;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < OpEntities> opEntities; 
        private String requestId; 
        private Long totalCount; 

        /**
         * An array that consists of the details of the operation log.
         */
        public Builder opEntities(java.util.List < OpEntities> opEntities) {
            this.opEntities = opEntities;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned operation records.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOpEntitiesResponseBody build() {
            return new DescribeOpEntitiesResponseBody(this);
        } 

    } 

    public static class OpEntities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityObject")
        private String entityObject;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private Integer entityType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("OpAccount")
        private String opAccount;

        @com.aliyun.core.annotation.NameInMap("OpAction")
        private Integer opAction;

        @com.aliyun.core.annotation.NameInMap("OpDesc")
        private String opDesc;

        private OpEntities(Builder builder) {
            this.entityObject = builder.entityObject;
            this.entityType = builder.entityType;
            this.gmtCreate = builder.gmtCreate;
            this.opAccount = builder.opAccount;
            this.opAction = builder.opAction;
            this.opDesc = builder.opDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpEntities create() {
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

        public static final class Builder {
            private String entityObject; 
            private Integer entityType; 
            private Long gmtCreate; 
            private String opAccount; 
            private Integer opAction; 
            private String opDesc; 

            /**
             * The operation object.
             */
            public Builder entityObject(String entityObject) {
                this.entityObject = entityObject;
                return this;
            }

            /**
             * The type of the operation object. Valid values:
             * <p>
             * 
             * *   **1**: the IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance
             * *   **2**: Anti-DDoS plans
             * *   **3**: ECS instances
             * *   **4**: all logs
             */
            public Builder entityType(Integer entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * The time when the operation was performed. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to call the API operation.
             */
            public Builder opAccount(String opAccount) {
                this.opAccount = opAccount;
                return this;
            }

            /**
             * The type of the operation. Valid values:
             * <p>
             * 
             * *   **1**: configuring burstable protection bandwidth.
             * *   **5**: using Anti-DDoS plans.
             * *   **8**: changing IP addresses of ECS instances.
             * *   **9**: deactivating blackhole filtering.
             * *   **10**: configuring the Diversion from Origin Server policy.
             * *   **11**: clearing all logs.
             * *   **12**: downgrading the specifications of instances. If the instance expires or the account has overdue payments, this operation is performed to downgrade the burstable protection bandwidth.
             * *   **13**: restoring the specifications of instances. If the instance is renewed or you have paid the overdue payments within your account, this operation is performed to restore the burstable protection bandwidth.
             */
            public Builder opAction(Integer opAction) {
                this.opAction = opAction;
                return this;
            }

            /**
             * The details of the operation. This parameter is a JSON string. The string contains the following fields:
             * <p>
             * 
             * *   **newEntity**: the values of the parameters after the operation. This field must be of the STRING type.
             * *   **oldEntity**: the values of the parameters before the operation. This field must be of the STRING type.
             * 
             * Both **newEntity** and **oldEntity** are JSON strings. The returned parameters vary with **OpAtion**.
             * 
             * If **OpAction** is **1**, **12**, or **13**, the following parameter is returned:
             * 
             * *   **elasticBandwidth**: the burstable protection bandwidth. The value is of the INTEGER type.
             * 
             *     For example: `{"newEntity":{"elasticBandwidth":300},"oldEntity":{"elasticBandwidth":300}}`
             * 
             * If **OpAction** is **5**, the following parameters are returned:
             * 
             * *   **bandwidth**: the burstable protection bandwidth. The value is of the INTEGER type. Unit: Gbit/s.
             * 
             * *   **count**: the number of Anti-DDoS plans. The value is of the INTEGER type.
             * 
             * *   **deductCount**: the number of used Anti-DDoS plans. The value is of the INTEGER type.
             * 
             * *   **expireTime**: the expiration time of the Anti-DDoS plans. The value is of the LONG type. The value is a UNIX timestamp. Unit: milliseconds.
             * 
             * *   **instanceId**: the ID of the instance. The value is of the STRING type.
             * 
             * *   **peakFlow**: the peak throughput on the instance. The value is of the INTEGER type. Unit: bit/s.
             * 
             *     For example: `{"newEntity":{"bandwidth":100,"count":4,"deductCount":1,"expireTime":1616299196000,"instanceId":"ddoscoo-cn-v641kpmq****","peakFlow":751427000}}`
             * 
             * If **OpAction** is **8**, the following parameter is returned:
             * 
             * *   **instanceId**: the ID of the ECS instance whose IP address is changed. The value is of the STRING type.
             * 
             *     For example: `{"newEntity":{"instanceId":"i-wz9h6nc313zptbqn****"}}`
             * 
             * If **OpAction** is **9**, the following parameter is returned:
             * 
             * *   **actionMethod**: the operation method. The value is of the STRING type. Valid value: **undo**, which indicates that you deactivated blackhole filtering.
             * 
             *     For example: `{"newEntity":{"actionMethod":"undo"}}`
             * 
             * If **OpAction** is **10**, the following parameters are returned:
             * 
             * *   **actionMethod**: the operation method. The value is of the STRING type. Valid values:
             * 
             *     *   **do**: The Diversion from Origin Server policy is enabled.
             *     *   **undo**: The Diversion from Origin Server policy is disabled.
             * 
             * *   **lines**: The Internet service provider (ISP) line from which the traffic is blocked. Valid values:
             * 
             *     *   **ct**: China Telecom (International)
             *     *   **cut**: China Unicom (International)
             * 
             *     For example: `{"newEntity":{"actionMethod":"undo","lines":["ct"]}}`
             * 
             * If **OpAction** is **11**, no parameter is returned, and the description is empty.
             */
            public Builder opDesc(String opDesc) {
                this.opDesc = opDesc;
                return this;
            }

            public OpEntities build() {
                return new OpEntities(this);
            } 

        } 

    }
}
