// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
    private Integer totalCount;

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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < OpEntities> opEntities; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details of the operation log.
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
         * The total number of operation logs.
         */
        public Builder totalCount(Integer totalCount) {
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
             * The operation object, which is the ID of the instance.
             */
            public Builder entityObject(String entityObject) {
                this.entityObject = entityObject;
                return this;
            }

            /**
             * The type of the operation object. The value is fixed as **1**, which indicates Anti-DDoS Origin instances.
             */
            public Builder entityType(Integer entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * The time when the log was generated. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that performs the operation.
             * <p>
             * 
             * > If the value is **system**, the operation is performed by Anti-DDoS Origin.
             */
            public Builder opAccount(String opAccount) {
                this.opAccount = opAccount;
                return this;
            }

            /**
             * The type of operation. Valid values:
             * <p>
             * 
             * *   **3**: indicates an operation to add an IP address to the Anti-DDoS Origin instance for protection.
             * *   **4**: indicates an operation to remove a protected IP address from the Anti-DDoS Origin instance.
             * *   **5**: indicates an operation to downgrade the Anti-DDoS Origin instance.
             * *   **6**: indicates an operation to deactivate blackhole filtering for an IP address.
             * *   **7**: indicates an operation to reset the number of times that you can deactivate blackhole filtering.
             * *   **8**: indicates an operation to enable burstable protection.
             */
            public Builder opAction(Integer opAction) {
                this.opAction = opAction;
                return this;
            }

            /**
             * The details of the operation. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:
             * <p>
             * 
             * *   **entity**: the operation object. Data type: object. The fields that are included in the value of the **entity** parameter vary based on the value of the **OpAction** parameter. Valid values:
             * 
             *     *   If the value of the **OpAction** parameter is **3**, the value of the **entity** parameter consists of the following field:
             * 
             *         *   **ips**: the public IP addresses that are protected by the Anti-DDoS Origin instance. Data type: array
             * 
             *     *   If the value of the **OpAction** parameter is **4**, the value of the **entity** parameter consists of the following field:
             * 
             *         *   **ips**: the public IP addresses that are no longer protected by the Anti-DDoS Origin instance. Data type: array.
             * 
             *     *   If the value of the **OpAction** parameter is **5**, the value of the **entity** parameter consists of the following fields:
             * 
             *         *   **baseBandwidth**: the basic protection bandwidth. Unit: Gbit/s. Data type: integer.
             *         *   **elasticBandwidth**: the burstable protection bandwidth. Unit: Gbit/s. Data type: integer.
             *         *   **opSource**: the source of the operation. The value is fixed as **1**, indicating that the operation is performed by Anti-DDoS Origin. Data type: integer.
             * 
             *     *   If the value of the **OpAction** parameter is **6**, the value of the **entity** parameter consists of the following field:
             * 
             *         *   **ips**: the public IP addresses for which to deactivate blackhole filtering. Data type: array.
             * 
             *     *   If the value of the **OpAction** parameter is **7**, the **entity** parameter is not returned.
             * 
             *     *   If the value of the **OpAction** parameter is **8**, the value of the **entity** parameter consists of the following fields:
             * 
             *         *   **baseBandwidth**: the basic protection bandwidth. Unit: Gbit/s. Data type: integer.
             *         *   **elasticBandwidth**: the burstable protection bandwidth. Unit: Gbit/s. Data type: integer.
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
